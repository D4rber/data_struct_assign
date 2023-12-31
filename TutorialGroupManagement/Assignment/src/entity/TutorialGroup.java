/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author howei
 */
public class TutorialGroup implements Serializable{
    private String name;
    private int group;
    private int cgroup;
    private String email;
    private int size;
    private boolean isFull;

    public int getCgroup() {
        return cgroup;
    }

    public void setCgroup(int cgroup) {
        this.cgroup = cgroup;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }
    
    public TutorialGroup(){
    }
    
    public TutorialGroup(int cgroup, int size, boolean isFull){
        this.cgroup = cgroup;
        this.size = size;
        this.isFull = isFull;
    }
    
    public TutorialGroup(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public TutorialGroup(String name, int group, String email){
        this.name = name;
        this.group = group;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
   @Override
  public int hashCode() {
    int hash = 3;
    return hash;
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
    final TutorialGroup other = (TutorialGroup) obj;
    if (!Objects.equals(this, other)) {
      return false;
    }
    return true;
  }
  
 
 @Override
  public String toString() {
    return String.format("%dG  %-20s %20s", group, name, email);
  }

  public String customToString() {
    return String.format("%dG  %-10s %10s", cgroup, size, isFull);
  }
}
