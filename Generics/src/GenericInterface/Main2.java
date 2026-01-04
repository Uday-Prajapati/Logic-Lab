package GenericInterface;

public class Main2 {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new PairImpl<>();
        p1.set(1, "One");
        System.out.println(p1.getKey() + " : " + p1.getValue());

        Pair<String, Double> p2 = new PairImpl<>();
        p2.set("Price", 99.5);
        System.out.println(p2.getKey() + " : " + p2.getValue());
    }
}

