/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import adt.ArrayList;
import adt.ListInterface;
import entity.Programme;
import entity.TutorialGroup;

/**
 *
 * @author ASUS
 */
public class ProgrammeInitialize {
       public ListInterface<Programme> programmeInitialize() {
        ListInterface<Programme> programmeList = new ArrayList<>();
        ListInterface<TutorialGroup> tutorialGroupList = new ArrayList<>();
        tutorialGroupList.add(new TutorialGroup("G1", 23));
        tutorialGroupList.add(new TutorialGroup("G2", 25));
        programmeList.add(new Programme("DCS", "Diploma in Computer Science", 32));
        programmeList.add(new Programme("RDS", "Bachelor Degree in Data Science", 31, new ArrayList<>()));
        programmeList.getEntry(1).setTutorialGroups(tutorialGroupList);
        
        return programmeList;
    }
} 

