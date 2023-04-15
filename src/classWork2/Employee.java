package classWork2;

public abstract class Employee extends Person{

    private int seniority;
    private final static double base_salary= 4500;
    public static Integer employeesCounter = 0;
    public Employee(String firstName, String lastName, int seniority){
        super(firstName, lastName);
        this.seniority= seniority;
        Ligat_HaAl.employees.add(this);
    }
    public abstract double salaryOfEmployee();

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    public int getSeniority() {
        return seniority;
    }

    public  static double getBaseSalary() {
        return base_salary;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String toString (){
        return super.toString() + "\nSeniority: " + seniority + "\nBase salary: " + base_salary;
    }
}
