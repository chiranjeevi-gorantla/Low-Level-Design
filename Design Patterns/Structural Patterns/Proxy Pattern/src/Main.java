import virtualPoxy.Company;
import virtualPoxy.ContactList;
import virtualPoxy.ContactListProxyImpl;
import virtualPoxy.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("AB Company", "United States", "+1 123345678", contactList);

        System.out.println("Company Name: "+company.getCompanyName());
        System.out.println("Company Address: "+company.getCompanyAddress());
        System.out.println("Company Contact No.: "+company.getCompanyContactNo());

        System.out.println("Requesting for contact list");

//        contactList = company.getContactList();

        List<Employee> employeeList = contactList.getEmployeeList();

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}