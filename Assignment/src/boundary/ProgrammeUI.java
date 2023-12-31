/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import java.util.Scanner;
import control.ProgrammeManagement;

public class ProgrammeUI{
    private Scanner scanner = new Scanner(System.in);
    private ProgrammeManagement programmeManagement = new ProgrammeManagement();

    public void Menu(){
        int choice = 0;
        do{
            System.out.println("Welcome to Programme Management");
            System.out.println("========================================");
            System.out.println("1. Add new Programme");
            System.out.println("2. Remove Programme");
            System.out.println("3. Find Programme");
            System.out.println("4. Amend Programme Detail");
            System.out.println("5. List all Programme");
            System.out.println("6. Add Tutorial Group");
            System.out.println("7. Remove Tutorial Group");
            System.out.println("8. List all Tutorial Group");
            System.out.println("9. Generate Report");
            System.out.println("0. Exit System");
            System.out.print("Please input > ");
        
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    programmeManagement.addProgramme();
                    break;
                case 2: 
                    programmeManagement.removeProgramme();
                    break;
                case 3:
                    programmeManagement.findProgramme();
                    break;
                case 4:
                    programmeManagement.amendProgrammeDetail();
                    break;
                case 5:
                    programmeManagement.listAllProgramme();
                    break;
                case 6:
                    programmeManagement.addTutorialGroup();
                    break;
                case 7:
                    programmeManagement.removeTutorialGroup();
                    break;
                case 8:
                    programmeManagement.listAllTutorialGroup();
                    break;
                case 9:
                    programmeManagement.generateReports();
                    break;
                case 0:
                    System.out.println("Exit System");
                    break;
                default:
                    System.out.println("Invalid input, please try again");
                    break; 
            }
        }while(choice != 0);
    }
    
    public static void main(String args[]){
        new ProgrammeUI().Menu();
    }
}

    // public String inputProgrammeCode(){
    //     System.out.println("Enter Programme Code: ");
    //     String programmeCode = scanner.nextLine();
    //     return programmeCode;
    // }

    // public String inputProgrammeName(){
    //     System.out.println("Enter Programme Name: ");
    //     String programmeName = scanner.nextLine();
    //     return programmeName;
    // }

    // public int inputCreditHours(){
    //     System.out.println("Enter Credit Hours: ");
    //     int creditHours = scanner.nextInt();
    //     return creditHours;
    // }

    // public String inputTutorialGroup(){
    //     System.out.println("Enter Tutorial Group: ");
    //     String tutorialGroup = scanner.nextLine();
    //     return tutorialGroup;
    // }
    