/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author howei
 */
public class Main {
    public static void main(String[] args) {
        List<TutorialGroup> allGroups = new ArrayList<>();
        allGroups.add(new TutorialGroup(1, 20));
        allGroups.add(new TutorialGroup(2, 15));
        allGroups.add(new TutorialGroup(3, 30));

        TutorialGroupFilter filter = new TutorialGroupFilter();
        List<TutorialGroup> filteredGroups = filter.filterByMaxStudents(allGroups, 20);

        filteredGroups.forEach(group -> {
            System.out.println("Tutorial Group " + group.getNumber() + " has max students: " + group.getMaxStudents());
        });
    }
}

