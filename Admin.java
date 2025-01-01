/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Najaf
 */


class Admin extends User {
    private boolean isVerified;
    private ArrayList<String> employees= new ArrayList<>();
    private final int maxEmployees=15;
    
    //default and parametrized constructors
    public Admin(){this.isVerified= false;}
    public Admin(String userName, String password, int phoneNumber) {
            super(userName, password, phoneNumber);
            this.isVerified = false;
            this.employees = new ArrayList<>(maxEmployees);
    }
    // Verifies the identity of the admin 
    public boolean verify() {
        if (isVerified) return true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Admin account id username: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals("MovieWavesDeveloper")&& inputUserName.equals("ARRDN")) {
            isVerified = true;
            return true;
        } else {
            System.out.println("Verification failed. Admin access is denied.");
            return false;
        }
    }
    //Adds an employee to the list of employees
    public void addEmployee(String employee) {
        if (!verify()) return;

        if (employees.size() < maxEmployees) {
             employees.add(employee);
             System.out.println("You have added an employee by the name of: " + employee);
        } else {
            System.out.println("Cannot add employee. You have reached the maximum limit for employees.");
    }
}
    //Removes an employee from the list of employees
    public void removeEmployee(String employee) {
        if (!verify()) return;

        if (employees.remove(employee)) {
            System.out.println("You have removed an employee by the name of: " + employee);
        } else {
            System.out.println("Cannot remove an employee. The employee by the name of: " + employee + " is not found. " );
        }
    }
}