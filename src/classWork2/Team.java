package classWork2;

public class Team {
    private String teamName;
    private String stadiumName;
    private Player[] players;
    private int amountOfPlayers;
    private Coach coach;
    private Manager manager;

    public Team(String teamName, String stadiumName, Player[] players, Coach coach, Manager manager) {
        this.teamName = teamName;
        this.stadiumName = stadiumName;
        this.players = new Player[amountOfPlayers];
        this.coach = new Coach(coach);
        this.manager = new Manager(manager);
    }

    public Team(Player[] players) {
        this.players = new Player[amountOfPlayers];
    }

    public void addPlayer(Player player1) {
        Player[] temp = new Player[players.length + 1];
        for (int i = 0; i < players.length; i++) {
            temp[i] = players[i];
            temp[players.length] = player1;
            players = temp;
        }
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
        for (int i = 0; i < players.length; i++) {
            if (idNumber.equals(players[i].getIdNumber())) {
                return players[i];
            }
        }
        System.out.println("The ID entered does not belong to any player ");
        return null;
    }

    public Player checkName(String firstName, String lastName) {
        for (int i = 0; i < players.length; i++) {
            if (firstName.equals(players[i].getFirstName()) && lastName.equals(players[i].getLastName())) {
                return players[i];
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

    public Player[] getPlayers() {
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

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < players.length; i++) {
            output += "\nPlayer " + i + players[i];
        }
        output += "\nTeam name: " + getTeamName() + ", stadium name: " + getStadiumName() + "\nCoach: " + getCoach() + "\nManager: " + getManager();
        return output;
    }

}
