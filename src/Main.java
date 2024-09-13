import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double finalCost;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the cost of maintenance in the season of spring.");
        springCost = scan.nextDouble();

        System.out.println("What is the cost of maintenance in the season of summer.");
        summerCost = scan.nextDouble();

        System.out.println("What is the cost of maintenance in the season of fall.");
        fallCost = scan.nextDouble();

        System.out.println("What is the cost of maintenance in the season of winter.");
        winterCost = scan.nextDouble();

        finalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The Yearly cost for maintenance is " + finalCost);

    }
}