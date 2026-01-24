import java.util.*;
import java.util.stream.Collectors;

class TrailUtil {

    private List<Trail> trailList = new ArrayList<>();

    public List<Trail> getTrailList() {
        return trailList;
    }

    public void setTrailList(List<Trail> trailList) {
        this.trailList = trailList;
    }

    // Add Trail
    public void addTrailRecord(Trail trail) {
        trailList.add(trail);
    }

    // Get Trail by ID
    public Trail getTrailById(String trailId) {
        return trailList.stream()
                .filter(t -> t.getTrailId().equals(trailId))
                .findFirst()
                .orElse(null);
    }

    // Most Hiked Trails
    public Set<Trail> getMostHikedTrails() {
        int max = trailList.stream()
                .mapToInt(Trail::getHikeCount)
                .max()
                .orElse(0);

        return trailList.stream()
                .filter(t -> t.getHikeCount() == max)
                .collect(Collectors.toSet());
    }

    // Region-wise Hike Count
    public Map<String, Integer> getHikeCountByRegion() {
        return trailList.stream()
                .collect(Collectors.groupingBy(
                        Trail::getRegion,
                        Collectors.summingInt(Trail::getHikeCount)
                ));
    }

    //Group by Difficulty
    public Map<String, List<Trail>> groupTrailsByDifficulty() {
        return trailList.stream()
                .collect(Collectors.groupingBy(Trail::getDifficulty));
    }

    // Update Hike Count
    public boolean updateHikeCount(String trailId, int additionalHikes) {
        Trail t = getTrailById(trailId);
        if (t != null) {
            t.setHikeCount(t.getHikeCount() + additionalHikes);
            return true;
        }
        return false;
    }

    // Requirement 7: Filter Trails
    public List<Trail> filterTrails(String region, String difficulty) {
        return trailList.stream()
                .filter(t -> t.getRegion().equals(region)
                        && t.getDifficulty().equals(difficulty))
                .collect(Collectors.toList());
    }

    // Requirement 8: Top-N Trails per Region
    public Map<String, List<Trail>> getTopTrailsByRegion(int n) {
        return trailList.stream()
                .collect(Collectors.groupingBy(
                        Trail::getRegion,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted((a, b) -> b.getHikeCount() - a.getHikeCount())
                                        .limit(n)
                                        .collect(Collectors.toList())
                        )
                ));
    }

    //Difficulty Statistics
    public Map<String, String> getDifficultyStats() {
        Map<String, String> result = new HashMap<>();

        Map<String, List<Trail>> grouped = groupTrailsByDifficulty();

        for (Map.Entry<String, List<Trail>> entry : grouped.entrySet()) {
            String difficulty = entry.getKey();
            List<Trail> trails = entry.getValue();

            int count = trails.size();
            int total = trails.stream().mapToInt(Trail::getHikeCount).sum();
            int average = total / count;

            result.put(difficulty,
                    "count=" + count + ", totalHikes=" + total + ", averageHikes=" + average);
        }
        return result;
    }
}
