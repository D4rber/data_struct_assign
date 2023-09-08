package control;

import adt.*;
import boundary.TutorManagementUI;

import entity.Tutors;

import dao.*;

import java.util.Scanner;

/**
 *
 * @author Tongkitming
 */

public class TutorManagementSystem {

    public void runTutorManager() {

        TutorManagementUI ui = new TutorManagementUI();
        TutorInitialize t = new TutorInitialize();
        TutorInitializeS tutor = new TutorInitializeS();
        ListInterface<Tutors> tutorList = t.initializeTutors();
        Scanner scanner = new Scanner(System.in);
        UndoRedoManager<ListInterface<Tutors>> undoRedoManager = new UndoRedoManager<>();
        StackInterface<Tutors> tutorStack = tutor.initializeTutorsS();
        StackInterface<Tutors> previousStateUndo = new LinkedStack<>();
        previousStateUndo.clear();
        
        int choice;
        do {
            choice = ui.getSelection();
            switch (choice) {
                case 1:

                    Tutors newTutor = ui.inputTutorDetails();

                    if (tutorList.add(newTutor)) {
                        tutorStack.push(newTutor);
                        previousStateUndo.push(newTutor);
                        System.out.println("Tutor added successfully.");
                    } else {

                        System.out.println("Failed to add tutor. Maximum capacity reached.");
                    }

                    break;
                case 2:

                    int positionToDelete = ui.inputPosition();
                    ListInterface<Tutors> previousList = tutorList;
                    if (tutorList.remove(positionToDelete) != null) {

                        System.out.println("Tutor deleted successfully.");
                    } else {
                        System.out.println("Failed to delete tutor.");
                    }

                    break;

                case 3:
                    String tutorNameToFind = ui.inputTutorName(); // Assuming you have a method to input the tutor name

                    boolean tutorFound = false;

                    // Iterate through the tutorList to find the tutor by name
                    for (int i = 1; i <= tutorList.getNumberOfEntries(); i++) {
                        Tutors tutorFind = tutorList.getEntry(i);
                        if (tutorFind.getName().equalsIgnoreCase(tutorNameToFind)) {
                            System.out.println("Found Tutor: " + tutorFind);
                            tutorFound = true;
                            break; // Exit the loop once a tutor is found
                        }
                    }

                    if (!tutorFound) {
                        System.out.println("Tutor not found.");
                    }

                    break;
                    
                case 4:
                    tutorList.listAll();

                    int positionToReplace =ui.inputPositionID();

                    Tutors newTutorData = ui.inputTutorDetails();
                    if (tutorList.replace(positionToReplace, newTutorData)) {
                        System.out.println("Tutor replaced successfully.");
                    } else {
                        System.out.println("Failed to replace tutor.");
                    }

                    break;

                case 5:

                    System.out.println("\nTotal tutor : " + tutorList.getNumberOfEntries() + "\nAll tutors:\n" + tutorList);
                    ui.promptEnterKey();
                    break;
                case 6:
                    String subjectToFilter = ui.inputSubjectToFilter();
                    ListInterface<Tutors> filteredTutors = new LinkedList<>(); // Create a new list to store filtered tutors

                    // Iterate through the original tutorList and add tutors with a matching subject to the filteredTutors list
                    for (int i = 1; i <= tutorList.getNumberOfEntries(); i++) {
                        Tutors tutorF = tutorList.getEntry(i);
                        if (tutorF.getSubject().equalsIgnoreCase(subjectToFilter)) {
                            filteredTutors.add(tutorF);
                        }
                    }

                    if (filteredTutors.isEmpty()) {
                        System.out.println("No tutors found for the subject: " + subjectToFilter);
                    } else {
                        System.out.println("Tutors teaching " + subjectToFilter + ":");
                        for (int i = 1; i <= filteredTutors.getNumberOfEntries(); i++) {
                            Tutors tutorR = filteredTutors.getEntry(i);
                            System.out.println(tutorR);
                        }
                    }
                    break;
                case 7:
                    ui.generateSalaryReport(tutorList);
                    break;

                case 8:
                    if (previousStateUndo.getNumOfEntry()> 0 && previousStateUndo.getNumOfEntry() < 2) {
                        tutorList.clear();
                        tutorStack.pop();
                        while (tutorStack.getNumOfEntry()!= 0)
                        tutorList.add(tutorStack.pop());
                        tutorStack = tutor.initializeTutorsS();
                        tutorList.listAll();
                        previousStateUndo.pop();
                        System.out.println("Undo successful.");
                    } else {
                        System.out.println("Cannot to undo please remove the tutor");
                    } 
                    break;

                case 9:

                    System.out.println("Done Exit Tutor Management System");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        } while (choice != 9);

    }

}
