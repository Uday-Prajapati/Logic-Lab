import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student name");
        String name = sc.nextLine();

        System.out.println("Enter Department name");
        String dept = sc.nextLine();

        System.out.println("Enter gender");
        String gender = sc.nextLine();

        System.out.println("Enter category");
        String category = sc.nextLine();   

        System.out.println("Enter College fee");
        double collegeFee = sc.nextDouble();

        Student s;

        if (category.equals("DayScholar")) {

            System.out.println("Enter Bus number");
            int busNo = sc.nextInt();

            System.out.println("Enter the distance");
            float distance = sc.nextFloat();

            s = new DayScholar(id, name, dept, gender,
                    category, collegeFee, busNo, distance);

        } else { // Hosteller

            System.out.println("Enter the room number");
            int roomNo = sc.nextInt();

            System.out.println("Enter the Block name");
            char block = sc.next().charAt(0);

            System.out.println("Enter the room type");
            String roomType = sc.next();

            s = new Hosteller(id, name, dept, gender,
                    category, collegeFee, roomNo, block, roomType);
        }

        System.out.println("Total College fee is " + s.calculateTotalFee());
        sc.close();
    }
}
