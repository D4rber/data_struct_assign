package Control;

import ADT.*;
import Boundary.TutorManagementUI;
import Boundary.TutorManagementUI.*;
import static Boundary.TutorManagementUI.*;
import Entity.Tutors;

import dao.*;

import java.util.Scanner;

/**
 *
 * @author Tongkitming
 */

public class TutorManagementSystem {

    public static void main(String[] args) {

        TutorManagementUI ui = new TutorManagementUI();
        TutorInitialize t = new TutorInitialize();
        TutorInitializeS tutor = new TutorInitializeS();
        ListInterface<Tutors> tutorList = t.initializeTutors();
        Scanner scanner = new Scanner(System.in);
        UndoRedoManager<ListInterface<Tutors>> undoRedoManager = new UndoRedoManager<>();
        StackInterface<Tutors> tutorStack = tutor.initializeTutorsS();
        StackInterface<Tutors> previousStateUndo = new LinkedStack<>();
        int choice;
        do {
            choice = ui.getSelection();
            switch (choice) {
                case 1:

                    Tutors newTutor = InputModule.inputTutorDetails();

                    if (tutorList.add(newTutor)) {
                        tutorStack.push(newTutor);
                        previousStateUndo.push(newTutor);
                        System.out.println("Tutor added successfully.");
                    } else {

                        System.out.println("Failed to add tutor. Maximum capacity reached.");
                    }

                    break;
                case 2:

                    int positionToDelete = InputModule.inputPosition();
                    ListInterface<Tutors> previousList = tutorList;
                    if (tutorList.remove(positionToDelete) != null) {

                        System.out.println("Tutor deleted successfully.");
                    } else {
                        System.out.println("Failed to delete tutor.");
                    }

                    break;

                case 3:
                    String tutorName = InputModule.inputTutorName();
                    Tutors foundTutor = tutorList.find(tutorName);

                    if (foundTutor != null) {
                        System.out.println("Found Tutor: " + foundTutor);
                    } else {
                        System.out.println("Tutor not found.");
                    }

                    break;

                case 4:
                    tutorList.listAll();

                    int positionToReplace = InputModule.inputPosition();

                    Tutors newTutorData = InputModule.inputTutorDetails();
                    if (tutorList.replace(positionToReplace, newTutorData)) {
                        System.out.println("Tutor replaced successfully.");
                    } else {
                        System.out.println("Failed to replace tutor.");
                    }

                    break;

                case 5:

                    System.out.println("\nTotal tutor : " + tutorList.getNumberOfEntries() + "\nAll tutors:\n" + tutorList);
                    promptEnterKey();
                    break;
                case 6:
                    String filterSubject = InputModule.inputSubject();
                    tutorList.filter(filterSubject);
                    break;
                case 7:
                    generateSalaryReport(tutorList);
                    break;

                case 8:
                    if (previousStateUndo != null) {
                        tutorList.clear();
                        tutorStack.pop();
                        while (tutorStack.getNumOfEntry()!= 0)
                        tutorList.add(tutorStack.pop());
                        tutorList.listAll();
                        System.out.println("Undo successful.");
                    } else {
                        System.out.println("Nothing to undo.");
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
