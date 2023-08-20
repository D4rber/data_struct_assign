/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ASUS
 */
public class TutorialGroup {
    private String groupName;
    private int numOfStudent;

    public TutorialGroup(String groupName, int numOfStudent) {
        this.groupName = groupName;
        this.numOfStudent = numOfStudent;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    @Override
    public String toString() {
        return "TutorialGroup{" + "groupName=" + groupName + ", numOfStudent=" + numOfStudent + '}';
    }
    
    
}
