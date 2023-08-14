/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProgrammeManagement {
    public static void main(String args[]){
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please input > ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    addProgramme();
                    break;
                case 2: 
                    removeProgramme();
                    break;
                case 3:
                    findProgramme();
                    break;
                case 4:
                    amendProgrammeDetail();
                    break;
                case 5:
                    listAllProgramme();
                    break;
                case 6:
                    addTutorialGroup();
                    break;
                case 7:
                    removeTutorialGroup();
                    break;
                case 8:
                    listAllTutorialGroup();
                    break;
                case 9:
                    generateReports();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;    
            }
            
        }while(choice != 0);
    }

    private static void addProgramme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeProgramme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void findProgramme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void amendProgrammeDetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void listAllProgramme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addTutorialGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeTutorialGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void listAllTutorialGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void generateReports() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
