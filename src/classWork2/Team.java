package classWork2;

import java.util.List;

public class Team {
    private String teamName;
    private String stadiumName;
    private List<Player> players;
    private int amountOfPlayers;
    private Coach coach;
    private Manager manager;

    public Team(String teamName, String stadiumName, List<Player> players, Coach coach, Manager manager) {
        this.teamName = teamName;
        this.stadiumName = stadiumName;
        this.players = players;
        this.coach = new Coach(coach);
        this.manager = new Manager(manager);
    }

    public Team(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player1) {
        players.add(player1);
    }

    public void addManager(Manager manager1) {
        if (manager != null) {
            this.manager = new Manager(manager1);
        } else {
            System.out.println("This team already have a manager");
        }
    }

    public void addCoach(Coach coach1) {
        if (coach != null) {
            this.coach = new Coach(coach1);
        } else {
            System.out.println("This team already have a coach");
        }
    }

    public Player checkIdNumber(String idNumber) {
        for (int i = 0; i < players.size(); i++) {
            if (idNumber.equals(players.get(i).getIdNumber())) {
                return players.get(i);
            }
        }
        System.out.println("The ID entered does not belong to any player ");
        return null;
    }

    public Player checkName(String firstName, String lastName) {
        for (int i = 0; i < players.size(); i++) {
            if (firstName.equals(players.get(i).getFirstName()) && lastName.equals(players.get(i).getLastName())) {
                return players.get(i);
            }
        }
        System.out.println("There is no player with this name");
        return null;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    public Coach getCoach() {
        return coach;
    }

    public Manager getManager() {
        return manager;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setAmountOfPlayers(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public void setCoach(Coach coach) {
        addCoach(coach);
    }

    public void setManager(Manager manager) {
        addManager(manager);
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < players.size(); i++) {
            output += "\nPlayer " + i + players.get(i);
        }
        output += "\nTeam name: " + getTeamName() + ", stadium name: " + getStadiumName() + "\nCoach: " + getCoach() + "\nManager: " + getManager();
        return output;
    }

}
