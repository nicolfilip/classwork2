package classWork2;

public class Player extends Employee{

    private String teamName;
    private int  attempts;
    private int successful_attempts;
    private String player_position;
     private final static int baseSalary_player= 6500;
    public Player (String firstName, String lastName, int seniority, String teamName, int attempts, int successful_attempts, String player_position){
        super(firstName,lastName,seniority);
        this.teamName= teamName;
        this.attempts=attempts;
        this.successful_attempts= successful_attempts;
        setPlayer_position(player_position);

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

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setSuccessful_attempts(int successful_attempts) {
        this.successful_attempts = successful_attempts;
    }

    public void setPlayer_position(String player_position) {
        if (player_position.equals("Goalkeeper") || player_position.equals("Defender") || player_position.equals("Midfielder") || player_position.equals("Forward")){
            this.player_position= player_position;
        }
        else {
            System.out.println("Wrong type");
        }
    }

    public static int getBaseSalary_player() {
        return baseSalary_player;
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

    public String getTeamName() {
        return teamName;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getSuccessful_attempts() {
        return successful_attempts;
    }

    public String getPlayer_position() {
        return player_position;
    }

    public double success_rate () {
        if (player_position.equals("Goalkeeper")) {
            return (double) successful_attempts / attempts ;
        } else if (player_position.equals("Defender")) {
            return (double) successful_attempts / attempts ;
        } else if (player_position.equals("Midfielder")) {
            return (double) successful_attempts / attempts ;
        } else if (player_position.equals("Forward")) {
            return (double) successful_attempts / attempts ;
        } else {
            return 0.0;
        }
    }
    public boolean outstanding(){
        return success_rate()>0.75;
        }
    public void addAttempts (int extraAttempts){
        this.attempts += extraAttempts;
    }
    public void addSuccessfulAttempts (int extraSuccessfulAttempts){
        this.successful_attempts += extraSuccessfulAttempts;
    }
    public double salaryOfEmployee(){
        double x= success_rate();
         return getBaseSalary_player() + (x/100) *2000;
    }
    public String toString(){
        return super.toString() + "\nBase salary for player: " + baseSalary_player +  "\nNumber of attempts: " + getAttempts() + ", number of successful attempts: " + getSuccessful_attempts() +"\nSuccess rate: " + success_rate() + "\nUpdated monthly salary: " + salaryOfEmployee();
    }
    }







