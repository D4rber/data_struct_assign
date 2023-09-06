/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary;
import Entity.*;
import adt.ArrayList;
import adt.ListInterface;
import java.util.Scanner;
/**
 *
 * @author yongj
 */
public class ProgrammeMaintenanceUI {
    Scanner scanner = new Scanner(System.in);
    private ListInterface<Programme> programmeList = new ArrayList<>();
    
    public String addProgToCourse(String cCode){
        System.out.println("\n\n");
        System.out.println("\t ------------------------");
        System.out.println("\t Add Programme To Course");
        System.out.println("\t ------------------------");
        
        System.out.print("\t Enter Course Code to Add Programme to Course: ");
        cCode = scanner.nextLine();
        
        return cCode;
    } 
    
    public String aProgramme(String pCode){
        System.out.print("\t Enter Programme Code : ");
        pCode = scanner.nextLine();
        
        return pCode;
    }
    
    public Programme addProgramme(String pCode){

        System.out.print("\t Enter Programme Name: ");
        String pName = scanner.nextLine();
        
       //Declare object
        Programme p = new Programme(pCode, pName);
        //add new programme into programmelist
        programmeList.add(p);
        return p;
        
    }
    
    public String deleteProgFromCourse(String cCode){
        
        System.out.println("\n\n");
        System.out.println("\t ----------------------------");
        System.out.println("\t Delete Programme from Course");
        System.out.println("\t ----------------------------");
        System.out.print("\t Enter Course Code : ");
        cCode = scanner.nextLine();
        
        return cCode;
        
    }
    
     
}
