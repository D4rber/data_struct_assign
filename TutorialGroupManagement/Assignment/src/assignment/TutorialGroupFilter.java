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
public class TutorialGroupFilter {
    public List<TutorialGroup> filterByMaxStudents(List<TutorialGroup> groups, int maxStudents) {
        List<TutorialGroup> filteredGroups = new ArrayList<>();

        groups.stream().filter(group -> (group.getMaxStudents() <= maxStudents)).forEachOrdered(group -> {
            filteredGroups.add(group);
        });

        return filteredGroups;
    }

    // Other filter methods...
}
