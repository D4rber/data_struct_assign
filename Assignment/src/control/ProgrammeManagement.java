/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import adt.ArrayList;
import adt.ListInterface;
import java.util.Scanner;
import entity.Programme;
import entity.TutorialGroup;
/**
 *
 * @author HP
 */
public class ProgrammeManagement {
    private ListInterface<Programme> programmeList = new ArrayList<>();
    private ListInterface<TutorialGroup> tutorialGroupList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public ProgrammeManagement(){
        
        tutorialGroupList.add(new TutorialGroup("G1",23));
        tutorialGroupList.add(new TutorialGroup("G2",25));
        programmeList.add(new Programme("DCS", "Diploma in Computer Science", 32));
        programmeList.add(new Programme("RDS","Bachelor Degree in Data Science", 31));
        programmeList.getEntry(1).setTutorialGroup(tutorialGroupList);
    }
    public void addProgramme(){
        System.out.println("Add Programme");
        System.out.println("==================");
        System.out.println("Enter Programme Code: ");
        String programmeCode = scanner.nextLine();
        System.out.println("Enter Programme Name: ");
        String programmeName = scanner.nextLine();
        System.out.println("Enter Credit Hours: ");
        int creditHours = scanner.nextInt();
        
        Programme programme = new Programme(programmeCode, programmeName, creditHours);
        programmeList.add(programme);
        System.out.println("Programme Added Succussfuly");
     }
    
    public void removeProgramme(){
      System.out.println("Remove Programme");
      System.out.println("==================");
      System.out.println("Enter Programme Code : ");
      String programmeCode = scanner.nextLine();
      for(int i = 0; i < programmeList.getNumberOfEntries(); i++){
        if(programmeList.getEntry(i+1).getProgrammeCode == programmeCode){
            programmeList.remove(i+1);

        }
      }
      
    }
    
    public void findProgramme(){
        System.out.println("Find Programme");
        System.out.println("=====================");
        System.out.println("Enter Programme Code");
        String programmeCode = scanner.nextLine();
        for(int i = 0; i < programmeList.getNumberOfEntries(); i++){
            if(programmeList.getEntry(i+1).getProgrammeCode == programmeCode){
                System.out.println(programmeList.getEntry(i+1).toString());

        }
      }
    }
    
    public void amendProgrammeDetail(){
        
    }
    
    public void listAllProgramme(){
        System.out.println("Programme");
        System.out.println("===================");
        System.out.println(programmeList.getEntry(1).getTutorialGroup().getEntry(3));
        System.out.println(programmeList.getNumberOfEntries());
        System.out.println(programmeList.getEntry(1).getTutorialGroup().getNumberOfEntries());
        for(int i=0; i<programmeList.getNumberOfEntries(); i++){
            
            System.out.println(programmeList.getEntry(i+1).toString());
        }
    }
    
    public void addTutorialGroup(){
        System.out.println("Add Tutorial Group");
        System.out.println("========================");
        System.out.println("Enter Programme Code: ");
        String programmeCode = scanner.nextLine();
        
        System.out.println("Enter Tutorial Group Name: ");
        String tutorialGroupName = scanner.nextLine();
        System.out.println("Enter Number of Student: ");
        int numberOfStudent = scanner.nextInt();
        TutorialGroup tutorialGroup  = new TutorialGroup(tutorialGroupName, numberOfStudent);
        Programme programmeToFind = new Programme("programmeCode");
        programmeList.getEntry(new Programme(programmeCode)).tutorialGroups.add(tutorialGroup);
//        programmeList.getEntry(new Programme(programmeCode)).setTutorialGroup(tutorialGroupList);
    }
    
    public void removeTutorialGroup(){
        
    }
    
    public void listAllTutorialGroup(){
        
    }
    
    public void generateReports(){
        
    }
}
