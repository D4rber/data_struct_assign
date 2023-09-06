/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary;
import Entity.Course;
import java.util.Scanner;
/**
 *
 * @author yongj
 */
public class CourseMaintenanceUI {
    Scanner scanner = new Scanner(System.in);
    
    public String getDisplayMenuChoice(){
        System.out.println("\n");
        System.out.println("\t----------------------------------------");
        System.out.println("\t Welcome To Course Management Subsystem");
        System.out.println("\t----------------------------------------");
        System.out.println("\t   Press 1 : Add New Courses ");
        System.out.println("\t   Press 2 : Remove Courses ");
        System.out.println("\t   Press 3 : Find Courses ");
        System.out.println("\t   Press 4 : Amend Courses ");
        System.out.println("\t   Press 5 : Display Courses");
        System.out.println("\t   Press 6 : Add Programme To Course");
        System.out.println("\t   Press 7 : Remove Programme From Courses ");
        System.out.println("\t   Press 8 : Generate Report ");
        System.out.println("\t   Press 0 : End ");
        System.out.print("\t   Please Enter Your Choice : ");
        String choice = scanner.next();
        scanner.nextLine();//buffer
        
        return choice;
    }
   public Course inputCourseDetails(String cCode){
       System.out.println("\n\n");
        //add order module title
        System.out.println("\t ----------------");
        System.out.println("\t Add New Course");
        System.out.println("\t ----------------");
      
        System.out.print("\t Please enter Course Code  : ");
        cCode = scanner.nextLine();
        
        System.out.print("\t Please enter Course Name : ");
        String cName = scanner.nextLine();
        
        Course cr = new Course(cCode,cName);
        
        return cr;
   }
   
   public void deleteUI(){
        System.out.println("\n\n");
        System.out.println("\t -------------");
        System.out.println("\t Delete Course");
        System.out.println("\t -------------");
   }
                     
   public int getDeleteNo(int deleteNo){
        System.out.print("\n\t Enter the number to delete : ");
        deleteNo = scanner.nextInt();
        scanner.nextLine();
        
        return deleteNo;
   }
   
   public String fCourse(String cCode){
        System.out.println("\n\n");
        System.out.println("\t -----------");
        System.out.println("\t Find Course");
        System.out.println("\t -----------");
        System.out.print("\t Enter Course Code : ");
        cCode = scanner.nextLine();
        
        return cCode;
   }
   public void amendUI(){
        System.out.println("\n\n");
        System.out.println("\t ------------");
        System.out.println("\t Amend Course");
        System.out.println("\t ------------");
   }
   
   public int getAmendNo(int amendNo){
        System.out.print("\n\t Enter the number to amend : ");
        amendNo = scanner.nextInt();
        scanner.nextLine();
        
        return amendNo;
   }
   
//   public Course aCourse(String cCode){
//       
//       System.out.print("\t Enter new Course Code        : ");
//       cCode = scanner.nextLine();
//       
//       Course courseAmend = new Course(cCode);
//       return courseAmend;
//   }
   public Course amendC(String cCode){
       System.out.print("\t Enter new Course Code        : ");
       cCode = scanner.nextLine();
       
        System.out.print("\t Enter new Course Name        : ");
        String cName = scanner.nextLine();
        
        //Declare object
        Course cr = new Course(cCode, cName);

        return cr;
        
    }
   public void dCourse() {
        System.out.println("\n\n");
        System.out.println("\t --------------------");
        System.out.println("\t Display All Courses");
        System.out.println("\t --------------------");
  }
   
   public void courseRep(){
        System.out.println("\n\n");
        System.out.println("\t --------------------");
        System.out.println("\t        Report       ");
        System.out.println("\t --------------------");
        
   }
}
