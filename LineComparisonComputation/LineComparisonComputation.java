package LineComparisonComputation;

import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the first point
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Read the coordinates of the second point
        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate the length of the line
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of the line = " + length);
    }
}
