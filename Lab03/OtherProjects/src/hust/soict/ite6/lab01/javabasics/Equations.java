// Dinh Viet Ha 20215042
// Ex 2.2.6

package hust.soict.ite6.lab01.javabasics;

import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Solve a first-degree equation (linear equation) with one variable");
        System.out.println("2. Solve a system of first-degree equations (linear system) with two variables");
        System.out.println("3. Solve a second-degree equation with one variable");
        System.out.print("--> ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                solveFirstDegreeEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveSecondDegreeEquation();
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
    
    private static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the coefficient of x: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the constant term: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
        
        scanner.close();
    }
    
    private static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the coefficients and constants of the linear system:");
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        
        double determinant = a11 * a22 - a21 * a12;
        
        if (determinant == 0) {
            if (b1 / a11 == b2 / a21) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = (b1 * a22 - b2 * a12) / determinant;
            double y = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("Solution: x = " + x + ", y = " + y);
        }
        
        scanner.close();
    }
    
    private static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the coefficient of x^2: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the constant term: ");
        double c = scanner.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("One real solution: x = " + x);
        } else {
            System.out.println("No real solutions");
        }
        
        scanner.close();
    }
}