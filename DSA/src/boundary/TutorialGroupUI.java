/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entity.TutorialGroup;
import java.util.Scanner;
/**
 *
 * @author howeiyoung
 */
public class TutorialGroupUI {
private final Scanner scanner;

    public TutorialGroupUI() {
        // Initialize the scanner in the constructor
        scanner = new Scanner(System.in);
    }

//Tutorial Group Menu
    public int getMenuChoice() {
        
        System.out.println("\nMAIN MENU");
        System.out.println("1. Add new student in a tutorial group");
        System.out.println("2. Remove a student from a tutorial group");
        System.out.println("3. Change the tutorial group for student");
        System.out.println("4. Find a student in tutorial group");
        System.out.println("5. List all student in tutorial group");
        System.out.println("6. Filter");
        System.out.println("0. Quit");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return choice;
    }
    //display list
    public void listGroups(String outputStr){
        System.out.println("\nList of Groups\n" + outputStr);
    }
    public void listAllStudents(String outputStr) {

        System.out.println("\nList of Student\n" + outputStr);
    }

    public void listStudent(String outputStr) {
        System.out.println(outputStr);
    }
    
    //choice
    public int getChoice(){
        System.out.println("Filter Menu:"
                + "\n1) Tutoria Group\n2)Student");
        int choice = scanner.nextInt();
                scanner.nextLine();
              return choice;  
    }

    public int chooseGroup(int maxGroup) {

        System.out.println("Tutorial Group");
        for (int i = 1; i <= maxGroup; i++) {
            System.out.printf("%d. Group %d\n", i, i);
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
        
    }

    
    //add student
    public TutorialGroup inputTutorialGroupDetails(int num) {
        String tgName = inputTutorialGroupName();
        String tgEmail = generateEmail(tgName);
        int tgNumber = num;
        System.out.println();
        return new TutorialGroup(tgName, tgNumber, tgEmail);
    }
    
    public String inputTutorialGroupName() {
               String name = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter full student Name: ");
                name = scanner.nextLine();

                // Validate the input (customize this part based on your requirements)
                if (!name.isEmpty() && name.matches("^[a-zA-Z\\s]+$")&& name.length() >= 3) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid name.");
                }
            } catch (Exception e) {
                System.err.println("An error occurred while reading input: " + e.getMessage());
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return name;
    }
    
    private static String generateEmail(String studentName) {
        // Remove spaces and convert the student's name to lowercase
        String formattedName = studentName.replaceAll("\\s+", "").toLowerCase();

        // Define a domain name (e.g., "example.com")
        String domainName = "example.com";

        // Create the email by concatenating the formatted name and domain name
        String email = formattedName + "@" + domainName;

        return email;
    }

    
    private int inputTutorialGroupNumber() {
        System.out.print("Enter student group: ");
        int number = scanner.nextInt();
        return number;
    }



    public int removeStudent() {
        boolean validInput = false;
        int num = 0;
        
        while (!validInput) {
                    System.out.println("Enter which line to remove student base on above list: ");
         num = scanner.nextInt();
       
        }
 return num;
    }


    
//change group number
    public int changeGroup(TutorialGroup toChange, int maxNo){
        String name = toChange.getName();
        int currentGroup = toChange.getNumber();
        boolean inputValid = false;    
        int noChange = 0;
        
        System.out.println("To change "+name+" from group"+currentGroup
                + "\nEnter Which group to change");
        
        while(!inputValid){
            try{
                noChange = scanner.nextInt();
                if(noChange >=0 && noChange<=maxNo){
                    inputValid=true;
                }else{
                    System.out.println("Please enter the no. group exist in the list!");
                }
            }catch (Exception e) {
                System.err.println("An error occurred while reading input: " + e.getMessage());
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return noChange;
        
    }
    public void displayChangeGroup(TutorialGroup changed, int pInt){
        System.out.println("\n"+changed.getName()+" has changed from group" +pInt +" to group "+ changed.getNumber());
    }


public String filterName(){
    System.out.print("Enter which name to filter: ");
        String name = scanner.next();
        scanner.nextLine();
        return name;
}
    public int filterGroup(){
        System.out.print("Enter which line to filter: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    public int changeSize(){
        System.out.println("What size? :");
        int size = scanner.nextInt();
        scanner.nextLine();
        return size;
    }
    public TutorialGroup filterStudent() {
        String tgName = inputTutorialGroupName();
        String tgEmail = generateEmail(tgName);
        int tgNumber = inputTutorialGroupNumber();
        scanner.nextLine();
        System.out.println();
        return new TutorialGroup(tgName, tgNumber, tgEmail);
    }
    public boolean comfirmationRemove(TutorialGroup student){
        boolean confirm = false;
        System.out.println("Y to confirm remove "+student.getName()+" from group "+student.getNumber()+" if no then press N");
        String userInput = scanner.nextLine().trim().toUpperCase(); // Read and format user input
    switch (userInput) {
        case "Y":
            confirm = true;
            break;
        case "N":
            confirm = false;
            break;
        default:
            System.out.println("Invalid input. Please enter 'Y' to confirm or 'N' to cancel.");
            break;
    }

        return confirm;
        
        
    }
}
