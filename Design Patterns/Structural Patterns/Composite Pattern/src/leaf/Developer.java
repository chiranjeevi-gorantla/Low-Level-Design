package leaf;

import component.Employee;

public class Developer extends Employee {
    private final String name;
    private final String position;

    public Developer(String name, String position) {
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

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
    }
}
