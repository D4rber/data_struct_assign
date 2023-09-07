/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;
import control.CourseMaintenance;
import control.ProgrammeManagement;
import control.TutorialGroupMaintainance;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DSA {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String choice;
do{
        System.out.println("Welcome to University Management System");
        System.out.println("=======================================================");
        System.out.println("1. Programme Management");
        System.out.println("2. Course Management");
        System.out.println("3. Tutorial Group Management");
        System.out.println("0. Exit System");
        System.out.print("Please input > ");
        choice = scanner.nextLine();
        System.out.println("\n\n");
        switch(choice){
            case "1":
                new ProgrammeManagement().programmeManagement();
                break;
            case "2":
                new CourseMaintenance().runCourseMaintenance();
                break;
            case "3":
                new TutorialGroupMaintainance().runTutorMaintenance();
            default:
                System.out.println("Invalid Input");
        }
    }while(!choice.equals("0"));
    }
}
    