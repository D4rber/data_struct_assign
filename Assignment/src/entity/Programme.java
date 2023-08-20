/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.ArrayList;
import adt.ListInterface;

/**
 *
 * @author HP
 */
public class Programme {
    private String programmeCode;
    private String programmeName;
    private int creditHours;
    private ListInterface<TutorialGroup> tutorialGroup;

    
public Programme(String programmeCode, String programmeName, int creditHours){
    this.programmeCode = programmeCode;
    this.programmeName = programmeName;
    this.creditHours = creditHours;
}

public Programme(String programmeCode){
    this.programmeCode = programmeCode;
}

public Programme(String programmeCode, String programmeName, int creditHours, ListInterface<TutorialGroup> tutorialGroup){
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

    public ListInterface<TutorialGroup> getTutorialGroup() {
        return tutorialGroup;
    }

    public void setTutorialGroup(ListInterface<TutorialGroup> tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
    }
@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Programme other = (Programme) obj;

        if (!(this.programmeCode.equals(other.programmeCode))) {
            return false;
        }

        return true;
    }
    @Override
    public String toString() {
        return "Programme{" + "programmeCode=" + programmeCode + ", programmeName=" + programmeName + ", creditHours=" + creditHours + '}';
    }
    
  
}

