package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("solving for ax^2 + bx + c: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("determine the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("determine the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("determine the value of c: ");
        double c = scanner.nextDouble();

        double d = b*b-4*a*c;

        if (d < 0)
        {
            System.out.println("no solution");
        }
        else if (d == 0)
            System.out.println("solution is: " + (-b + Math.sqrt(d)) / 2*a);
        else
        {
            System.out.print("solutions are: ");
            System.out.print((-b + Math.sqrt(d)) / 2*a + " and ");
            System.out.print((-b - Math.sqrt(d)) / 2*a);
        }



    }

}
