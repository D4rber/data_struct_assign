/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author yongj
 */
public class Programme {
    private String programmeCode;
    private String programmeName;
    
    public Programme() {
        programmeCode = null;
        programmeName = null;
    }
    
    public Programme(String Code) {
        programmeCode = Code;
        this.programmeName = null;
    }
     public Programme(String pCode, String pName) {
        this.programmeCode = pCode;
        this.programmeName = pName;
    }
     
    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String pCode) {
        this.programmeCode = pCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String pName) {
        this.programmeName = pName;
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

        if (this.programmeCode != other.programmeCode) {
            return false;
        }

        return true;
    }
    
    @Override
    public String toString(){
        return String.format("\n\t Programme Code : %-15s Programme Name : %-30s", programmeCode, programmeName);
    }
}
