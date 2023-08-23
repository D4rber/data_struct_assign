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
import java.util.Iterator;
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
        programmeList.getEntry(1).setTutorialGroups(tutorialGroupList);
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
    
        if(programmeList.remove(programmeToFind(programmeCode))!=null){
            System.out.println("Remove Success");
        }else{
            System.out.println("Programme Not Found");
        }
    }
    
    public void findProgramme(){
        System.out.println("Find Programme");
        System.out.println("=====================");
        System.out.println("Enter Programme Code");
        String programmeCode = scanner.nextLine();
        
        Programme programmeToFind = programmeList.getEntry(programmeToFind(programmeCode));
        if(programmeToFind != null){
            System.out.println(programmeToFind.toString());
        }else{
            System.out.println("Programme Not Found");
        }
    }
    
    public void amendProgrammeDetail(){
        
    }
    
    public void listAllProgramme(){
        System.out.println("Programme");
        System.out.println("===================");
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
        scanner.nextLine();
        TutorialGroup tutorialGroup  = new TutorialGroup(tutorialGroupName, numberOfStudent);
        
        Programme programmeToFind = programmeList.getEntry(programmeToFind(programmeCode));
        programmeToFind.getTutorialGroups().add(tutorialGroup);

//        Programme programmeToFind = new Programme("programmeCode");
//        programmeList.getEntry(new Programme(programmeCode)).getTutorialGroups().add(tutorialGroup);
//        programmeList.getEntry(new Programme(programmeCode)).setTutorialGroup(tutorialGroupList);
    }
    
    public void removeTutorialGroup(){
        System.out.println("Remove Tutorial Group");
        System.out.println("==========================");
        System.out.println("Enter Programme Code: ");
        String programmeCode = scanner.nextLine();
        
        Programme programmeToFind = programmeList.getEntry(programmeToFind(programmeCode));
        if(programmeToFind != null){
            System.out.println("Enter Tutorial Name: ");
            String groupName = scanner.nextLine();
            for(int i=0; i<programmeToFind.getTutorialGroups().getNumberOfEntries(); i++){
                if(programmeToFind.getTutorialGroups().getEntry(i+1).getGroupName().equals(groupName)){
                    programmeToFind.getTutorialGroups().remove(i+1);
                }
            }
        }else{
            System.out.println("Programme Not Found");
        }
    }
    
    public void listAllTutorialGroup(){
        System.out.println("Tutorial Group");
        System.out.println("========================");
        System.out.println("Enter Programme Code: ");
        String programmeCode = scanner.nextLine();
        
        Programme programmeToFind = programmeList.getEntry(programmeToFind(programmeCode));
        for(int i=0; i<programmeToFind.getTutorialGroups().getNumberOfEntries(); i++){
            System.out.println(programmeToFind.getTutorialGroups().getEntry(i+1).toString());
        }
    }
    public void generateReports(){
        testing();        
    }
    
    private int programmeToFind(String programmeCode){
        int position = 0;
        for(int i=0; i<programmeList.getNumberOfEntries(); i++ ){
            if(programmeList.getEntry(i+1).getProgrammeCode().equals(programmeCode)){
                position = i+1;
            }
        }
        return position;
    }
    
    private void testing(){
        Iterator iterator = programmeList.getIterator();
        while(iterator.hasNext()){
            System.out.println("1");
            System.out.println(iterator.next());
        }
    }
}
