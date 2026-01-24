import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrailUtil util = new TrailUtil();

        System.out.println("Enter the number of trails to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter trail details");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] data = input.split(":");

            Trail trail = new Trail(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    Integer.parseInt(data[4])
            );

            util.addTrailRecord(trail);
        }

        // Get trail by ID
        System.out.println("Enter the Trail Id to check hike status");
        String id = sc.nextLine();
        Trail found = util.getTrailById(id);

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Trail Id " + id + " not found");
        }

        // Most hiked trails
        System.out.println("Most hiked trails are");
        util.getMostHikedTrails().forEach(System.out::println);

        // Region-wise hike count
        System.out.println("Region-wise hike counts");
        util.getHikeCountByRegion()
                .forEach((k, v) -> System.out.println(k + ": " + v + " hikes"));

        // Group by difficulty
        System.out.println("Trails grouped by difficulty");
        util.groupTrailsByDifficulty().forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        // Update hike count
        System.out.println("Enter Trail Id to update hikes and additional hikes");
        String updateInput = sc.nextLine();
        String[] upd = updateInput.split(" ");
        boolean updated = util.updateHikeCount(upd[0], Integer.parseInt(upd[1]));

        if (updated) {
            System.out.println("Updated " + upd[0] + " by " + upd[1] + " hikes");
            System.out.println(util.getTrailById(upd[0]));
        }

        // Filter trails
        System.out.println("Filter trails by region and difficulty");
        String[] filter = sc.nextLine().split(" ");
        util.filterTrails(filter[0], filter[1]).forEach(System.out::println);

        // Top-N trails per region
        System.out.println("Enter N for Top-N trails per region");
        int topN = Integer.parseInt(sc.nextLine());

        Map<String, List<Trail>> topMap = util.getTopTrailsByRegion(topN);
        topMap.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        // Difficulty stats
        System.out.println("Difficulty statistics");
        util.getDifficultyStats()
                .forEach((k, v) -> System.out.println(k + ": " + v));

        sc.close();
    }
}
