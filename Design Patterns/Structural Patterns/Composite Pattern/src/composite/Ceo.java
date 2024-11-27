package composite;

import component.Employee;

import java.util.ArrayList;
import java.util.List;

public class Ceo extends Employee {
    private final String name;
    private final String position;
    private final List<Employee> teamMembers = new ArrayList<>();

    public Ceo(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void addMemberToTeam(Employee employee) {
        teamMembers.add(employee);
    }

    public void removeMemberToTeam(Employee employee) {
        teamMembers.remove(employee);
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
        System.out.println("Team members: ");
        for (Employee employee : getTeamMembers()) {
            employee.printDetails();
        }
    }
}
