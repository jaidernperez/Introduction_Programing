package usta.sistemas;

import java.util.Scanner;

/**
 * Description:In the company "smartPeople.inc" all employees work by goals therefore their salaries vary from month
 * to month, this software calculates the employee who earned the most during the year and the sum and total average
 * salary of the employees
 *
 * @author Jaider Pérez
 * @version 26/05/2020
 */
public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static int MONTHS = 12;

    public static void main(String[] args) {
        menu();
        int employees = getEmployees();
        int[][] matrixSalaries = getMatrix(employees);
        printMatrix(matrixSalaries);
        int[] sumSalaries = getSumSalaries(matrixSalaries);
        printSumSalaries(sumSalaries);
        System.out.println("The employee that most win in the year is the employee number "
                + getHigherAnnualSalary(sumSalaries) + "\n");
        sumAndAverageTotal(matrixSalaries);
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Salaries Employees-------------------╣");
        System.out.println("║════════════════════════════════════════════════════════║");
        System.out.println("║  Version: 1.0     Date: 26/05/2020                     ║");
        System.out.println("║════════════════════════════════════════════════════════║");
        System.out.println("║                Created by: Jaider Pérez                ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the total number of employees working in the company
     *
     * @return Integer representing the number of employees
     */
    public static int getEmployees() {
        int employees;
        do {
            System.out.println("Enter the employees number (the value can not negative!): ");
            employees = keyboard.nextInt();
        } while (employees <= 0);
        return employees;
    }

    /**
     * This function obtains the month-to-month wages of each of the employees
     *
     * @param numberEmployees Integer representing the number of employees
     * @return Matrix containing the salary of employees
     */
    public static int[][] getMatrix(int numberEmployees) {
        int[][] matrixSalaries = new int[numberEmployees][MONTHS];
        for (int i = 0; i < numberEmployees; i++) {
            for (int j = 0; j < MONTHS; j++) {
                matrixSalaries[i][j] = (int) Math.floor(Math.random() * (4389015 - 877803 + 1) + 877803);
            }
        }
        return matrixSalaries;
    }

    /**
     * This function prints the matrix containing the employees salary
     *
     * @param matrix Matrix containing the salary of employees
     */
    public static void printMatrix(int[][] matrix) {
        System.out.println(" ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Salaries of employee " + (i + 1) + " = {");
            for (int j = 0; j < MONTHS; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("}");
            System.out.println(" \n");
        }
    }

    /**
     * This function prints the arrangement that contains the annual salary of each of the employees
     *
     * @param sumSalaries Array that contains the annual employee salary
     */
    public static void printSumSalaries(int[] sumSalaries) {
        System.out.println(" ");
        for (int i = 0; i < sumSalaries.length; i++) {
            System.out.print("Annual salary of employee " + (i + 1) + " = {");
            System.out.print(sumSalaries[i]);
            System.out.print("}");
            System.out.println(" \n");
        }
        System.out.println(" ");
    }

    /**
     * This function gets the annual salary of each of the employees and stores them in an array
     *
     * @param matrixSalaries Matrix containing the salary of employees
     * @return Array that contains the annual employee salary
     */
    public static int[] getSumSalaries(int[][] matrixSalaries) {
        int[] sumSalaries = new int[matrixSalaries.length];
        for (int i = 0; i < matrixSalaries.length; i++) {
            int sum = 0;
            for (int j = 0; j < MONTHS; j++) {
                sum += matrixSalaries[i][j];
            }
            sumSalaries[i] = sum;
        }
        return sumSalaries;
    }

    /**
     * This function gets the highest annual salary
     *
     * @param sumSalaries Array that contains the annual employee salary
     * @return Integer representing the number of the employee with the highest annual salary
     */
    public static int getHigherAnnualSalary(int[] sumSalaries) {
        int employeeMostWin = 0, higherAnnualSalary = sumSalaries[0];
        for (int i = 1; i < sumSalaries.length; i++) {
            if (higherAnnualSalary < sumSalaries[i]) {
                higherAnnualSalary = sumSalaries[i];
                employeeMostWin = i;
            }
        }
        return (employeeMostWin + 1);
    }

    /**
     * This function gets the sum total of all salaries and their average
     *
     * @param matrixSalaries Matrix containing the salary of employees
     */
    public static void sumAndAverageTotal(int[][] matrixSalaries) {
        long totalSum = 0;
        double average;

        for (int[] matrixSalary : matrixSalaries) {
            for (int j = 0; j < MONTHS; j++) {
                totalSum += matrixSalary[j];
            }
        }
        average = totalSum / (MONTHS * matrixSalaries.length);
        System.out.println("The total salary paid to all employees during the year was: $" + totalSum + "\n");
        System.out.println("The average salary paid to employees was: $" + average);
    }
}
