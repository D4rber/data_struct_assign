/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Programme {
    private String programmeCode;
    private String programmeName;
    private int creditHours;
    private ArrayList<String> tutorialGroup;

public Programme(String programmeCode, String programmeName, int creditHours){
    this.programmeCode = programmeCode;
    this.programmeName = programmeName;
    this.creditHours = creditHours;
    this.tutorialGroup = new ArrayList<>();
}

    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    
    
    public ArrayList<String> getTutorialGroup() {
        return tutorialGroup;
    }

    public void setTutorialGroup(ArrayList<String> tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
    }

    @Override
    public String toString() {
        return "Programme{" + "programmeCode=" + programmeCode + ", programmeName=" + programmeName + ", tutorialGroup=" + tutorialGroup + '}';
    }

}

