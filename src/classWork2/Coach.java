package classWork2;

public class Coach extends Employee {

    private String teamName_ofCoach;
    private boolean pastPlayer;
    private int numberOfChampionships;

    public Coach( String firstName, String lastName, int seniority, String teamName_ofCoach, boolean pastPlayer, int numberOfChampionships){
        super(firstName, lastName, seniority);
        this.teamName_ofCoach= teamName_ofCoach;
        this.pastPlayer= pastPlayer;
        this.numberOfChampionships= numberOfChampionships;


    }

    public Coach(Coach other) {
        super(other.getFirstName(), other.getLastName(), other.getSeniority());
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

    public String getTeamName_ofCoach() {
        return teamName_ofCoach;
    }

    public int getNumberOfChampionships() {
        return numberOfChampionships;
    }

    public boolean isPastPlayer() {
        return pastPlayer;
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

    public void setTeamName_ofCoach(String teamName_ofCoach) {
        addTeam(teamName_ofCoach);
    }

    public void setPastPlayer(boolean pastPlayer) {
        this.pastPlayer = pastPlayer;
    }

    public void setNumberOfChampionships(int numberOfChampionships) {
        this.numberOfChampionships = numberOfChampionships;
    }

    public double salaryOfEmployee(){
        int x= getSeniority();
        int y= getNumberOfChampionships();
        return getBaseSalary() + (200*x) + (500*y);
    }

    @Override
    public boolean outstanding() {
        return getNumberOfChampionships()>2;
    }
    public void addChampionship(){
        numberOfChampionships++;

    }
    private void addTeam(String  team){
        if (team!= null){
            this.teamName_ofCoach= team;
        }
    }
    public String toString(){
        return super.toString() + "\nCoach's team name:  " + getTeamName_ofCoach() + "\nIs the coach a former player? " + isPastPlayer() + "\nNumber of championships: " + getNumberOfChampionships() + "\nUpdated salary: " + salaryOfEmployee();
    }
}
