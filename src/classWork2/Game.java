package classWork2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Game {
    private Date date ;
    private Team team1;
    private Team team2;
    private String winner_team;
    private int numberOfGoals_team1;
    private int getNumberOfGoals_team2;
    private Referee [] referees;

    public Game(Date date, Team team1,Team team2, List<Referee> referees)  {
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);

        this.date = date;

        this.team1=team1;
        this.team2=team2;
        this.referees= new Referee[0];
    }
    public String resultOfTheGame(){
        return  "\nTeams: " + team1.getTeamName() + "\nThe amount of goals of team : " +team1.getTeamName() + " " + numberOfGoals_team1 + " " +team2.getTeamName() + "\nThe amount of goals of team: " + team2.getTeamName()+ " " + "\nNumber of goals: " +getNumberOfGoals_team2 ;
    }
    public String toString(){
        return "\nTeam 1: " + team1.getTeamName() + "\nManager: " + team1.getManager().toString() + "\nTeam 2: " + team2.getTeamName() + "\nManager: " + team2.getManager().toString() +  "\nThe winner team: " + getWinner_team() ;
    }
    public void updateJudgmentErrors(String idNumber){
        for (int i=0; i<referees.length; i++){
            if (idNumber.equals(referees[i].getIdNumber())){
                referees[i].addJudgmentErrors(1);
            }
        }
    }
    public void updateNumberOfGoals(String idNumber){
        for (int i=0; i< team1.getPlayers().size(); i++){
            if (idNumber.equals(team1.getPlayers().get(i).getIdNumber())){
                team1.getPlayers().get(i).addAttempts(1);
                team1.getPlayers().get(i).addSuccessfulAttempts(1);
                setNumberOfGoals_team1(1);
            }
        }
        for (int i=0; i< team2.getPlayers().size(); i++){
            if (idNumber.equals(team1.getPlayers().get(i).getIdNumber())){
                team2.getPlayers().get(i).addAttempts(1);
                team2.getPlayers().get(i).addSuccessfulAttempts(1);
                setGetNumberOfGoals_team2(1);
            }
        }
    }

    public Date getDate() {
        return date;
    }

    public int getNumberOfGoals_team1() {
        return numberOfGoals_team1;
    }

    public int getGetNumberOfGoals_team2() {
        return getNumberOfGoals_team2;
    }

    public Referee[] getReferees() {
        return referees;
    }

    public String getWinner_team() {
        if (getNumberOfGoals_team1()> getGetNumberOfGoals_team2()){
            return team1.getTeamName();
        }
       else if (getNumberOfGoals_team1()<getGetNumberOfGoals_team2()){
            return team2.getTeamName();
        }
        else {
            return "Tie";
        }

    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumberOfGoals_team1(int numberOfGoals_team1) {
        this.numberOfGoals_team1 = numberOfGoals_team1;
    }

    public void setGetNumberOfGoals_team2(int getNumberOfGoals_team2) {
        this.getNumberOfGoals_team2 = getNumberOfGoals_team2;
    }

    public void setReferees(Referee[] referees) {
        this.referees = referees;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void setWinner_team(String winner_team) {
        this.winner_team = winner_team;
    }


}
