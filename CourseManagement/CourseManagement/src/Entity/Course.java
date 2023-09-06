/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import adt.ArrayList;
import adt.ListInterface;

/**
 *
 * @author yongj
 */
public class Course {
    private String courseCode;
    private String courseName;
    private ListInterface<Programme> courseProgramme;
    
  public Course(){
      this.courseCode = null;
      this.courseName = null;
      this.courseProgramme = new ArrayList<>();
           }
    
    public Course(String cCode,String cName){
    this.courseCode = cCode;
    this.courseName = cName;
    this.courseProgramme = new ArrayList<>();
    }

    public Course(String cCode) {
         this.courseCode = cCode;
         this.courseProgramme = new ArrayList<>();
    }
    public Course(String cCode, String cName, ListInterface<Programme> prog) {
        this.courseCode = cCode;
        this.courseName = cName;
        this.courseProgramme = prog;
    }
 
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String cCode) {
        this.courseCode = cCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String cName) {
        this.courseName = cName;
    }
 
    public ListInterface<Programme> getAllProgramme() {
        return courseProgramme;
    }
    
    public void addProgrammeToCourse(Programme prog) {
        courseProgramme.add(prog);
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

        final Course other = (Course) obj;

        if (!(this.courseCode.equals(other.courseCode))) {
            return false;
        }

        return true;
    }
   @Override
    public String toString(){
        return String.format(" Course Code : %-10s Course Name : %-30s", courseCode, courseName);
    } 
}
