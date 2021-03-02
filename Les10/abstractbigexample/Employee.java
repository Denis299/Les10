package Les10.abstractbigexample;

public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;
    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked;
    private String curPosition;
    private String[] positionWorked = new String[10];

    abstract void paySalary();

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }


    void changePosition(String newPosition) {
        saveCurPositionToHistory();
        curPosition = newPosition;
    }
private void saveCurPositionToHistory(){
    int index = 0;
    for (String pos : positionWorked) {

        if (pos == null) {
            positionWorked[index] = curPosition; break;
        }
        index++;

    }
}
        int getBalance () {
            return bankAccount.getBalance();
        }

    public String getName() {
        return name;
    }
}
