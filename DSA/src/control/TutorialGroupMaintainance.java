/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import adt.*;
import boundary.TutorialGroupUI;
import dao.TutorialGroupDAO;
import utility.MessageUI;
import entity.TutorialGroup;

/**
 *
 * @author howeiyoung
 */
public class TutorialGroupMaintainance {

    public ListInterface<TutorialGroup> tutorialGroupList = new ArrayList<>(10);
    public ListInterface<TutorialGroup> gSize = new ArrayList<>(10);

    private TutorialGroupDAO tutorialGroupDAO = new TutorialGroupDAO();
    private TutorialGroupUI tutorialGroupUI = new TutorialGroupUI();

    public void runTutorMaintenance() {

        tutorialGroupList.add(new TutorialGroup("John Smith", 1, "johnsmith@example.com"));
        tutorialGroupList.add(new TutorialGroup("Mary Johnson", 1, "maryjohnson@example.com"));
        tutorialGroupList.add(new TutorialGroup("David Brown", 1, "davidbrown@example.com"));
        tutorialGroupList.add(new TutorialGroup("Sarah Taylor", 2, "sarahtaylor@example.com"));
        tutorialGroupList.add(new TutorialGroup("Michael Davis", 1, "michaeldavis@example.com"));
        tutorialGroupList.add(new TutorialGroup("Emily White", 2, "emilywhite@example.com"));
        tutorialGroupList.add(new TutorialGroup("William Wilson", 3, "williamwilson@example.com"));
        tutorialGroupList.add(new TutorialGroup("Olivia Harris", 3, "oliviaharris@example.com"));
        tutorialGroupList.add(new TutorialGroup("James Miller", 4, "jamesmiller@example.com"));
        tutorialGroupList.add(new TutorialGroup("Sophia Anderson", 4, "sophiaanderson@example.com"));
        tutorialGroupList.add(new TutorialGroup("howei8", 5, "howei603@gmail.com"));
        tutorialGroupList.add(new TutorialGroup("howeiy8", 5, "howeiy604@gmail.com"));
        tutorialGroupList.add(new TutorialGroup("howei9", 6, "howei603@gmail.com"));
        tutorialGroupList.add(new TutorialGroup("howeiy9", 1, "howeiy604@gmail.com"));
        gSize.add(new TutorialGroup(1, 5, false));
        gSize.add(new TutorialGroup(2, 5, false));
        gSize.add(new TutorialGroup(3, 5, false));
        gSize.add(new TutorialGroup(4, 5, false));
        gSize.add(new TutorialGroup(5, 5, false));
        gSize.add(new TutorialGroup(6, 5, false));

        //to count whether each of the group is full
        groupIsFull(countStudent());
        int choice;
        do {
            choice = tutorialGroupUI.getMenuChoice();
            switch (choice) {
                case 0 :
                    MessageUI.displayExitMessage();
                case 1 :
                    addNewStudent();
                case 2 :
                    removeStudent();
                case 3 :
                    changeTutorialGroup();
                case 4 :
                    findStudent();
                case 5 :
                    tutorialGroupUI.listAllStudents(listAllStudents());
                case 6 :
                    filter();
                default :
                    MessageUI.displayInvalidChoiceMessage();
            }
        } while (choice != 0);
    }

//main
    public static void main(String[] args) {
        TutorialGroupMaintainance tgMaintenance = new TutorialGroupMaintainance();
        tgMaintenance.runTutorMaintenance();
    }

//SUBCLASS
    private int[] countStudent() {
        int[] count = new int[10];
        for (int i = 1; i <= gSize.getNumberOfEntries(); i++) {
            for (int j = 1; j <= tutorialGroupList.getNumberOfEntries(); j++) {
                if (tutorialGroupList.getEntry(j).getNumber() == gSize.getEntry(i).getCgroup()) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    private void groupIsFull(int[] count) {

        for (int i = 1; i < gSize.getNumberOfEntries(); i++) {
            if (count[i] == gSize.getEntry(i).getSize()) {
                gSize.getEntry(i).setIsFull(true);
            } else {
                gSize.getEntry(i).setIsFull(false);
            }
        }
    }

    public String findStudent() {
        boolean isValid = false;
        String name = null;

        while (!isValid) {
            name = tutorialGroupUI.inputTutorialGroupName();

            for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
                if (name.equals(tutorialGroupList.getEntry(i).getName())) {
                    isValid = true;
                    break;
                } else if ("quit".equals(name)) {
                    name = null;
                    break;
                } else if(tutorialGroupList.getNumberOfEntries() ==i){
                    MessageUI.nothingFound();
                }
            }
        }
        return name;
    }
    //

//Add a student to a tutorial group
    private void addNewStudent() {

        for (int i = 1; i < gSize.getNumberOfEntries(); i++) {
            if (!gSize.getEntry(i).isIsFull()) {
                TutorialGroup newStudent = tutorialGroupUI.inputTutorialGroupDetails(i);
                tutorialGroupList.add(newStudent);
                break;
            }
        }
        tutorialGroupDAO.saveToFile(tutorialGroupList);
        tutorialGroupUI.listAllStudents(listAllStudents());
    }

    //Remove a student from a tutorial group
    public void removeStudent() {
        tutorialGroupUI.listAllStudents(listAllStudents());
        String name = findStudent();
        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
            if (name.equals(tutorialGroupList.getEntry(i).getName())) {
                if (tutorialGroupUI.comfirmationRemove(tutorialGroupList.getEntry(i))) {
                    tutorialGroupList.remove(i);
                }
            }

            tutorialGroupUI.listAllStudents(listAllStudents());
        }
    }

//Change the tutorial group for a student.
    public void changeTutorialGroup() {
        tutorialGroupUI.listAllStudents(listAllStudents());
        String name = findStudent();
        System.out.println("hello" + name);
        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
            if (name.equals(tutorialGroupList.getEntry(i).getName())) {
                int num = 1;
                int pInt = 0;
                while (gSize.getEntry(num).isIsFull()) {
                    num = tutorialGroupUI.changeGroup(tutorialGroupList.getEntry(i), gSize.getNumberOfEntries());
                    if (num == 0) {
                        break;
                    }
                    pInt = tutorialGroupList.getEntry(i).getNumber();
                    if (gSize.getEntry(num).isIsFull()) {
                        MessageUI.isFull();
                    }
                }
                if (!(pInt == 0)) {
                    tutorialGroupList.getEntry(i).setNumber(num);
                    tutorialGroupUI.displayChangeGroup(tutorialGroupList.getEntry(i), pInt);
                }
            }
        }
    }

//Find a student in a tutorial group
    public void foundStudent() {
        tutorialGroupUI.listAllStudents(listAllStudents());
        String name = findStudent();
        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
            System.out.println(tutorialGroupList.getEntry(i));
        }
    }

//List all students in a tutorial group    
    public String listAllStudents() {
        String outputStr = "";
        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {

            outputStr += tutorialGroupList.getEntry(i) + "\n";
        }
        return outputStr;
    }

//
    public String listStudents() {
        String outputStr = "";

        int choice = tutorialGroupUI.chooseGroup(gSize.getNumberOfEntries());
        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
            if (tutorialGroupList.getEntry(i).getNumber() == choice) {
                outputStr += tutorialGroupList.getEntry(i) + "\n";
            }
        }
        String message = String.format("\nList of Tutorial Group %d \n", choice);
        System.out.println(message);
        return outputStr;
    }

    public String listGroups() {
        String outputStr = "";

        for (int i = 1; i <= gSize.getNumberOfEntries(); i++) {
            outputStr += gSize.getEntry(i).customToString() + "\n";
        }
        return outputStr;
    }

//Filter tutorial groups based on criteria
    public void filter() {
        int choice;
        do {
            choice = tutorialGroupUI.getChoice();
            switch (choice) {
                case 0 :
                    MessageUI.displayExitMessage();
                case 1 :
                    filterGroup();
                case 2 :
                    filterStudent();
                default :
                    MessageUI.displayInvalidChoiceMessage();
            }
        } while (choice != 0);

    }

    public void filterGroup() {
        tutorialGroupUI.listGroups(listGroups());
        int choice = tutorialGroupUI.filterGroup();
        for (int i = 1; i <= gSize.getNumberOfEntries(); i++) {
            if (gSize.getEntry(i).getCgroup() == choice) {
                gSize.getEntry(i).setSize(tutorialGroupUI.changeSize());
            }

        }

    }

    public void filterStudent() {
        tutorialGroupUI.listStudent(listStudents());

        String name = findStudent();

        for (int i = 1; i <= tutorialGroupList.getNumberOfEntries(); i++) {
            if (tutorialGroupList.getEntry(i).getName().equals(name)) {
                boolean isMax = false;
                TutorialGroup filterStudent = null;
                while(!isMax){
                    filterStudent = tutorialGroupUI.filterStudent();
                    if(gSize.getEntry(filterStudent.getNumber()).isIsFull()){
                        MessageUI.isFull();
                    }else{
                        isMax = true;
                    }
                }
                
                
                tutorialGroupList.replace(i, filterStudent);
            }
        }
    }
}
