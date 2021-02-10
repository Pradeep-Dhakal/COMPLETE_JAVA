public class Employee {
    private int id;
    private String FirstName;
    private String LastName;
    private int Salary;

    public Employee(int id, String FirstName, String LastName, int Salary) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getlastName() {
        return LastName;
    }

    public String getName() {
        return FirstName + " " + LastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = getSalary() + Salary;

    }

    public int getAnnualSalary() {
        return Salary * 12;
    }

    public int raiseSalary(int percent) {
        
        return this.Salary = Salary + Salary * percent/100;
    }

    public String toString() {
        return "Employee \n" + " ID: " + id + "\n Name=" + FirstName + " " + LastName + " \n salary: " + Salary;
    }

    public static void main(String[] args) {
        Employee EMP = new Employee(999, "pradeep", "Dhakal", 5000);
        // EMP.getID(500);
        System.out.println(EMP.getID());
        System.out.println(EMP.getName());
        System.out.println(EMP.getFirstName());
        System.out.println(EMP.getlastName());
        EMP.setSalary(1000);
        System.out.println(EMP.getSalary());
        System.out.println("Anual Salary: " + EMP.getAnnualSalary());
        EMP.raiseSalary(15);
        System.out.println(EMP.toString());

    }

}