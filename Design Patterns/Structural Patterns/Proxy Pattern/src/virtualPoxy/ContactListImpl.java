package virtualPoxy;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList {

    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Employee A", 25, "Software Engineer"));
        empList.add(new Employee("Employee B", 22, "Software Development Manager"));
        empList.add(new Employee("Employee C", 32, "Senior Software Engineer"));
        empList.add(new Employee("Employee D", 48, "Quality Engineer"));
        empList.add(new Employee("Employee E", 28, "Data Engineer"));
        return empList;
    }
}
