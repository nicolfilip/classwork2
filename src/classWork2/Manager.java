package classWork2;

public class Manager extends Employee{

    public Manager(String firstName, String lastName,  int seniority){
        super(firstName,lastName,seniority);
    }
    public Manager(Manager other){
        this(other.getFirstName(), other.getLastName(), other.getSeniority());
    }

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

    @Override
    public int getSeniority() {
        return super.getSeniority();
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

    @Override
    public void setSeniority(int seniority) {
        super.setSeniority(seniority);
    }

    @Override
    public double salaryOfEmployee() {
        int y= getSeniority();
        return getBaseSalary()*3 +y*500;
    }

    @Override
    public boolean outstanding() {
        return getSeniority()>4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThe manager's updated salary is: " + salaryOfEmployee();
    }
}
