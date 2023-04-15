package classWork2;

import java.util.UUID;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String idNumber;

    public Person(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
        this.idNumber= UUID.randomUUID().toString();
    }
    public Person(String firstName, String lastName, String id){
        this.firstName= firstName;
        this.lastName= lastName;
        this.idNumber= id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }
    public abstract boolean outstanding();

    public String toString(){
        return "First name: "+ firstName + "\nLast name: " + lastName + "\nId number: " + idNumber;
    }
}
