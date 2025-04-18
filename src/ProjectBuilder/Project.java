/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBuilder;

import java.util.List;

/**
 *
 * @author adcam
 */
public class Project {
    private String name;
    private String company;
    private List<String> requirements;
    private List<String> technologies;
    private int numStudents;
    private String difficulty;

    public Project(String name, String company, List<String> requirements, List<String> technologies, int numStudents, String difficulty) {
        this.name = name;
        this.company = company;
        this.requirements = requirements;
        this.technologies = technologies;
        this.numStudents = numStudents;
        this.difficulty = difficulty;
    }
       public String getName() {
    return name;
}

public String getCompany() {
    return company;
}

public int getNumStudents() {
    return numStudents;
}

public String getDifficulty() {
    return difficulty;
}
     @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", requirements=" + requirements +
                ", technologies=" + technologies +
                ", numStudents=" + numStudents +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }


}
