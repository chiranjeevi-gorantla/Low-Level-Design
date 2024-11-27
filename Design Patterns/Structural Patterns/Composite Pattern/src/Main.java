import component.Employee;
import composite.Ceo;
import composite.Manager;
import leaf.Developer;

public class Main {
    public static void main(String[] args) {

        //leaves
        Employee developer1 = new Developer("John Wick", "Senior Software Engineer");
        Employee developer2 = new Developer("Jan Wong", "Software Development Engineer");

        Employee developer3 = new Developer("Sanjay Sahu", "Full Stack Developer");
        Employee developer4 = new Developer("Gilgoyle", "Cloud Engineer");

        //composites
        Employee manager1 = new Manager("Andrew Taylor", "Senior Manager");
        manager1.addMemberToTeam(developer1);
        manager1.addMemberToTeam(developer2);

        Employee manager2 = new Manager("Dinesh", "Product Maanger");
        manager2.addMemberToTeam(developer3);
        manager2.addMemberToTeam(developer4);

        Employee ceo = new Ceo("Richard Hendricks", "CEO");
        ceo.addMemberToTeam(manager1);
        ceo.addMemberToTeam(manager2);

        ceo.printDetails();
    }
}