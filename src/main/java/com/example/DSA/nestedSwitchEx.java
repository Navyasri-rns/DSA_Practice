package com.example.DSA;

import java.util.Scanner;

public class nestedSwitchEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int empId = s.nextInt();
        System.out.print("Enter any department: ");
        String st = s.next();

        switch (empId){
            case 1:
                System.out.println("Navya");
                break;
            case 2:
                System.out.println("Navyasri");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (st){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    case "Non IT":
                        System.out.println("Non IT Departent");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid EmpID");
        }
    }
}
