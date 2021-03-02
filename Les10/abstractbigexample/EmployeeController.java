package Les10.abstractbigexample;

public class EmployeeController {
    private Employee[] employees = new Employee[100];

    void paySalaryForEmployess(){
        for(Employee employee:employees){
            employee.paySalary();
            System.out.println("Salary was payed successfully "+employee.getName()+" employee");
        }
    }
}
