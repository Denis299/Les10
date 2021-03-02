package Les10.abstractbigexample;

public class DeveloperEmployee extends Employee {
    private String[] frameworks = new String[10];

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance()+1000+getSalaryPerMonth();
        getBankAccount().setBalance(newBalance);
    }
}
