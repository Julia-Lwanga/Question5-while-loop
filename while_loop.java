/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_MEMBERS = 5;
        
        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        
        int i = 0;
        while (i < numberOfMembers) {
            System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
            double principal = scanner.nextDouble();
            
            System.out.print("Enter the interest rate (in %): ");
            double interestRate = scanner.nextDouble();
            
            System.out.print("Enter the time period (in years): ");
            int timePeriod = scanner.nextInt();
            
            // Calculate the investment value
            double investmentValue = principal * Math.pow((1 + interestRate / 100), timePeriod);
            
            System.out.println("Investment value for member " + (i + 1) + " after " + timePeriod + " years: " + investmentValue);
            
            i++;
        }
        
        scanner.close();
    }
}
