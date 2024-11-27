package component;

import java.util.List;

public abstract class Employee {
    public abstract String getName();
    public abstract String getPosition();

    public void addMemberToTeam(Employee employee) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void removeMemberToTeam(Employee employee) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public List<Employee> getTeamMembers() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public abstract void printDetails();
}
