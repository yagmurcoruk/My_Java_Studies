public class Main {
    // ortak özelliklere sahip iki class vardır ex:id,firstName..
    public static void main(String[] args) {
        // person miras bırakan olduğu için nesne oluşturmamıza gerek yoktur.
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();



    }
}

