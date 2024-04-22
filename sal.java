import java.util.Scanner;

public class sal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a salary: ");
        int salary = input.nextInt();
        System.out.println("Salary: " + salary);

        int[] denominations = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            counts[i] = salary / denominations[i];
            salary %= denominations[i];
        }

        for (int i = 0; i < denominations.length; i++) {
            System.out.println("R" + denominations[i] + ": " + counts[i]);
        }
    }
}
