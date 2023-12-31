
package dao;

import ADT.*;
import Entity.*;

/**
 *
 * @author Tongkitming
 */

public class TutorInitialize {
    public ListInterface<Tutors> initializeTutors() {
    ListInterface<Tutors> tutorList = new LinkedList<>();
    
    
    tutorList.add(new Tutors("1001","Twh","DATA STRUCTURE", "RDS2S1G1", 6000));
    tutorList.add(new Tutors("1002","Ali","DATA SCIENCE", "RDS2S1G2", 7000));
    tutorList.add(new Tutors("1003","Abu","DATA STRUCTURE", "RDS2S1G3", 5000));
    tutorList.add(new Tutors("1004","Tkm","STATISTIC", "RDS2S1G4", 4000));
    tutorList.add(new Tutors("1005","Tmk","DATA STRUCTURE", "RDS2S1G5", 9000));
    

    return tutorList;
  }
} 

