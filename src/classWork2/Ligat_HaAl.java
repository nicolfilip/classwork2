package classWork2;

import java.time.*;
import java.util.*;

import static classWork2.Employee.employeesCounter;

public class Ligat_HaAl {
    public static Employee[] employees = new Employee[100];
    private static Team[] teams = initializeTeams();

    private static Game[] games = gameBoard();
    ;

    private static Referee[] referees = initializeReferees();



    public Ligat_HaAl() {
        menu();
    }

    //    private static Employee[] intializeEmployees(){
//        Employee [] employees= new Employee[60];
//        for (Employee employee: employees){
//            employee.addPlayer()
//        }
//        return employees;
//
//    }
    private static Referee[] initializeReferees() {
        Referee[] referees = new Referee[4];
        referees[0] = new Referee("Ami", "Sultan", 5, 5, 10, 8);
        referees[1] = new Referee("Nicolay", "Tras", 10, 20, 60, 19);
        referees[2] = new Referee("Yuli", "Cohen", 2, 11, 15, 5);
        referees[3] = new Referee("Topaz", "Levi", 12, 25, 62, 30);
        employees[0] = referees[0];
        employees[1] = referees[1];
        employees[2] = referees[2];
        employees[3] = referees[3];


        return referees;
    }

    private static Team createHBS() {
        Player[] hbsPlayers = new Player[12];
        new Player("Omri", "Glayzer", 1, "Hapoel Beer-Sheva", 49, 30, "Goalkeeper");
        new Player("Ariel", "Harush", 2, "Hapoel Beer-Sheva", 7, 3, "Goalkeeper");
        new Player("Miguel", "Vitor", 6, "Hapoel Beer-Sheva", 75, 68, "Defender");
        new Player("Eyad", "Abu Abid", 1, "Hapoel Beer-Sheva", 60, 40, "Defender");
        new Player("Helder", "Lopes", 1, "Hapoel Beer Sheva", 56, 45, "Defender");
        new Player("Ramsey", "Safury", 3, "Hapoel Beer Sheva", 17, 12, "Midfielder");
        new Player("Dor", "Micha", 1, "Hapoel Beer Sheva", 26, 21, "Midfielder");
        new Player("Shai", "Elias", 1, "Hapoel Beer Sheva", 9, 5, "Midfielder");
        new Player("Roi", "Gordana", 4, "Hapoel Beer Sheva", 14, 9, "Midfielder");
        new Player("Tomer", "Hemed", 1, "Hapoel Beer Sheva", 13, 9, "Forward");
        new Player("Rotem", "Hatuel", 2, "Hapoel Beer Sheva", 22, 16, "Forward");
        new Player("Itay", "Shechter", 1, "Hapoel Beer Sheva", 5, 2, "Forward");

        Coach hbsCoach = new Coach("Elyaniv", "Barda", 2, "Hapoel Beer Sheva", true, 1);
        Manager hbsManager = new Manager("Guy", "Primor", 1);
        Team hbs = new Team("Hapoel Beer Sheva", "Toto Turner", hbsPlayers, hbsCoach, hbsManager);

        return hbs;
    }


    private static Team createHTA() {
        Player[] htaPlayers = new Player[12];
        new Player("Emilios", "Zubas", 2, "Hapoel Tel Aviv", 81, 62, "Goalkeeper");
        new Player("Stephen", "Marinovik", 3, "Hapoel Tel Aviv", 10, 6, "Goalkeeper");
        new Player("Edi", "Gutliv", 4, "Hapoel Tel Aviv", 25, 23, "Defender");
        new Player("Antuan", "Konet", 2, "Hapoel Tel Aviv", 11, 9, "Defender");
        new Player("Ben", "Bitton", 1, "Hapoel Tel Aviv", 60, 49, "Defender");
        new Player("Dan", "Aynbinder", 2, "Hapoel Tel Aviv", 15, 10, "Midfielder");
        new Player("Shlomi", "Azulay", 3, "Hapoel Tel Aviv", 32, 28, "Midfielder");
        new Player("Omer", "Senior", 1, "Hapoel Tel Aviv", 21, 15, "Midfielder");
        new Player("David", "Klatines", 4, "Hapoel Tel Aviv", 65, 57, "Midfielder");
        new Player("Niv", "Zrihen", 2, "Hapoel Tel Aviv", 45, 32, "Forward");
        new Player("Hisham", "Layos", 4, "Hapoel Tel Aviv", 9, 5, "Forward");
        new Player("Rave", "Assayag", 3, "Hapoel Tel Aviv", 15, 14, "Forward");

        Coach htaCoach = new Coach("Haim", "Silbes", 5, "Hapoel Tel Aviv", false, 3);
        Manager htaManager = new Manager("Itzik", "Nisanov", 6);
        Team hta = new Team("Hapoel Tel Aviv", "Bloomfield", htaPlayers, htaCoach, htaManager);

        return hta;

    }

    private static Team createMH() {
        Player[] mhPlayers = new Player[12];
        new Player("Josh", "Cohen", 2, "Maccabi Haifa", 90, 85, "Goalkeeper");
        new Player("Roey", "Mashpaty", 1, "Maccabi Haifa", 54, 49, "Goalkeeper");
        new Player("Abdulay", "Sak", 3, "Maccabi Haifa", 10, 7, "Defender");
        new Player("Sun", "Menahem", 2, "Maccabi Haifa", 15, 13, "Defender");
        new Player("Pier", "Korno", 2, "Maccabi Haifa", 40, 29, "Defender");
        new Player("Dolev", "Haziza", 4, "Maccabi Haifa", 70, 63, "Midfielder");
        new Player("Cheron", "Sheri", 3, "Maccabi Haifa", 22, 19, "Midfielder");
        new Player("Joni", "Naor", 1, "Maccabi Haifa", 21, 20, "Midfielder");
        new Player("Mohamad", "Abu Fani", 3, "Maccabi Haifa", 65, 63, "Midfielder");
        new Player("Omer", "Atzili", 2, "Maccabi Haifa", 37, 32, "Forward");
        new Player("Ferantzdi", "Piro", 1, "Maccabi Haifa", 8, 7, "Forward");
        new Player("Din", "David", 2, "Maccabi Haifa", 20, 16, "Forward");

        Coach mhCoach = new Coach("Barak", "Bachar", 5, "Maccabi Haifa", true, 4);
        Manager mhManager = new Manager("Yaakov", "Shachar", 10);
        Team mh = new Team("Maccabi Haifa", "Sami Ofer", mhPlayers, mhCoach, mhManager);
        return mh;
    }

    private static Team[] initializeTeams() {
        Team[] teams = new Team[4];
        teams[0] = createHBS();
        teams[1] = createHTA();
        teams[2] = createMH();
        teams[3] = createBj();

        return teams;

    }

    private static Team createBj() {
        Player[] bjPlayers = new Player[12];
        new Player("Miguel", "Silva", 2, "Beitar Jerusalem", 60, 57, "Goalkeeper");
        new Player("Netanel", "Daloya", 3, "Beitar Jerusalem", 36, 28, "Goalkeeper");
        new Player("Sergey", "Borodin", 1, "Beitar Jerusalem", 11, 7, "Defender");
        new Player("Gregory", "Morozov", 4, "Beitar Jerusalem", 24, 21, "Defender");
        new Player("Ori", "Dahan", 2, "Beitar Jerusalem", 30, 29, "Defender");
        new Player("Ofir", "Krief", 4, "Beitar Jerusalem", 70, 67, "Midfielder");
        new Player("Tamir", "Adi", 1, "Beitar Jerusalem", 22, 15, "Midfielder");
        new Player("Bar", "Cohen", 3, "Beitar Jerusalem", 35, 31, "Midfielder");
        new Player("Tarazi", "Toma", 4, "Beitar Jerusalem", 68, 65, "Midfielder");
        new Player("Yarden", "Shoa", 2, "Beitar Jerusalem", 37, 34, "Forward");
        new Player("Fred", "Friday", 1, "Beitar Jerusalem", 11, 9, "Forward");
        new Player("Avishay", "Cohen", 2, "Beitar Jerusalem", 20, 19, "Forward");

        Coach bjCoach = new Coach("Yossi", "Abukasis", 6, "Beitar Jerusalem", false, 2);
        Manager bjManager = new Manager("Kfir", "Edri", 7);
        Team bj = new Team("Beitar Jerusalem", "Teddi", bjPlayers, bjCoach, bjManager);
        return bj;
    }


    private void menu() {
        boolean close = false;
        while (!close) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice: \n1.Add Player \n2.Add Referee \n3.Print Team Details \n4.Print referee details \n5.Print future games details ");
            System.out.println("6.Print employee salary \n7.Add Goal \n8.Add judgment errors \n9.Print outstanding people \n10.Print table \n11.Print player details with smallest salary  \n12. Exit");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Please specify the team the player joins : ");
                    String teamNamePlayer = scanner.next();
                    System.out.println("Please indicate the first name of the player: ");
                    scanner.nextLine();
                    String firstNamePlayer = scanner.next();
                    System.out.println("Please indicate the last name of the player: ");
                    scanner.nextLine();
                    String lastNamePlayer = scanner.next();
                    System.out.println("Please indicate the seniority of the player: ");
                    scanner.nextLine();
                    int seniorityPlayer = scanner.nextInt();
                    System.out.println("Please indicate the type of the player (Goalkeeper, Defender, Midfielder, Forward): ");
                    scanner.nextLine();
                    String typePlayer = scanner.next();
                    Player player = new Player(firstNamePlayer, lastNamePlayer, seniorityPlayer, teamNamePlayer, 0, 0, typePlayer);
                    addPlayerToTheGame(player);
                    break;
                case 2:
                    System.out.println("Please indicate the first name of the referee: ");
                    String firstNameReferee = scanner.next();
                    System.out.println("Please indicate the last name of the referee: ");
                    scanner.nextLine();
                    String lastNameReferee = scanner.next();
                    System.out.println("Please indicate the id number of the referee: ");
                    scanner.nextLine();
                    String idNumberReferee = scanner.next();
                    System.out.println("Please indicate the seniority of the referee: ");
                    scanner.nextLine();
                    int seniorityReferee = scanner.nextInt();
                    System.out.println("Please indicate the number of his judgment errors:");
                    scanner.nextLine();
                    int judgmentErrors = scanner.nextInt();
                    System.out.println("Please indicate the number of games he refereed: ");
                    scanner.nextLine();
                    int numberOfGamesReferee = scanner.nextInt();
                    int maximumJudgmentErrors = 0;
                    for (Referee value : referees) {
                        maximumJudgmentErrors = Math.max(judgmentErrors, value.getMaximumJudgmentErrors());
                    }
                    Referee referee = new Referee(firstNameReferee, lastNameReferee, seniorityReferee, judgmentErrors, numberOfGamesReferee, maximumJudgmentErrors);
                    addReferee(referee);
                    break;
                case 3:
                    for (Team team : teams) {
                        System.out.println(team);
                    }
                    System.out.println("Please select a football team by its name: ");
                    String teamChoose = scanner.next();
                    if (teamChoose.equals(teams[0].getTeamName()) || teamChoose.equals(teams[1].getTeamName()) || teamChoose.equals(teams[2].getTeamName()) || teamChoose.equals(teams[3].getTeamName())) {
                        print_team_details(teamChoose);
                    } else {
                        System.out.println("The name of the team isn't correct");
                    }
                    break;
                case 4:
                    for (Referee value : referees) {
                        System.out.println(value);
                        System.out.println(value.getTotalGamesRefereed());
                        System.out.println();
                    }
                    break;
                case 5:
                    Date today = new Date();
                    for (Game game : games) {
                        if (game.getDate().after(today)) {
                            System.out.println(game);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Please enter the employee's ID number ");
                    String employeeIdNumber = scanner.next();
                    print_employee_salary(employeeIdNumber);
                    break;
                case 7:
                    add_goal();
                    break;
                case 8:
                    add_judgment_errors();
                    break;
                case 9:
                    print_outstanding_people();
                    break;
                case 10:
                    print_table();
                    break;
                case 11:
                    print_player_details_with_smallest_salary();
                    break;
                case 12:
                    close = true;
                    System.out.println("See you next time :)");
                    break;
                default:
                    System.out.println("Please choose from the following choices ");
                    System.out.println();
                    break;

            }

        }
    }

    private static Game[] gameBoard() {
        Game[] games = new Game[12];
        Date date = new Date(2020 - 1900, 9 - 1, 22, 12, 30);
        Date date1 = new Date(2021 - 1900, 2 - 1, 27, 13, 30);
        Date date2 = new Date(2020 - 1900, 10 - 1, 4, 19, 0);
        Date date3 = new Date(2022 - 1900, 6 - 1, 6, 20, 30);
        Date date4 = new Date(2021 - 1900, 11 - 1, 22, 12, 30);
        Date date5 = new Date(2023 - 1900, 11 - 1, 4, 13, 0);
        Date date6 = new Date(2020 - 1900, 6 - 1, 8, 18, 30);
        Date date7 = new Date(2022 - 1900, 7 - 1, 20, 19, 0);
        Date date8 = new Date(2021 - 1900, 12 - 1, 25, 20, 0);
        Date date9 = new Date(2023 - 1900, 3 - 1, 18, 17, 55);
        Date date10 = new Date(2023 - 1900, 4 - 1, 1, 21, 0);
        Date date11 = new Date(2024 - 1900, 2 - 1, 1, 22, 0);

        games[0] = new Game(date, teams[0], teams[1], referees);
        games[1] = new Game(date1, teams[1], teams[0], referees);
        games[2] = new Game(date2, teams[0], teams[2], referees);
        games[3] = new Game(date3, teams[2], teams[0], referees);
        games[4] = new Game(date4, teams[2], teams[3], referees);
        games[5] = new Game(date5, teams[3], teams[2], referees);
        games[6] = new Game(date6, teams[0], teams[3], referees);
        games[7] = new Game(date7, teams[3], teams[0], referees);
        games[8] = new Game(date8, teams[1], teams[2], referees);
        games[9] = new Game(date9, teams[2], teams[1], referees);
        games[10] = new Game(date10, teams[1], teams[3], referees);
        games[11] = new Game(date11, teams[3], teams[1], referees);
        return games;
    }

    private void addPlayerToTheGame(Player player) {
        Employee[] temp = new Employee[employees.length + 1];
        for (int i = 0; i < employeesCounter; i++) {
            if (player.getIdNumber().equals(employees[i].getIdNumber())) {
                System.out.println("There is already a player with this id number ");
            } else {
                temp[i] = employees[i];
                temp[employees.length] = player;
                employees = temp;
            }

        }
        if (player.getTeamName().equals(teams[0].getTeamName())) {
            teams[0].addPlayer(player);
        } else if (player.getTeamName().equals(teams[1].getTeamName())) {
            teams[1].addPlayer(player);
        } else if (player.getTeamName().equals(teams[2].getTeamName())) {
            teams[2].addPlayer(player);
        } else {
            teams[3].addPlayer(player);
        }

        System.out.println("The player added successfully");
    }

    private void addReferee(Referee referee) {
        Employee[] temp = new Employee[employees.length + 1];
        for (int i = 0; i < employeesCounter; i++) {
            if (referee.getIdNumber().equals(employees[i].getIdNumber())) {
                System.out.println("There is already a referee with this id number ");
            } else {
                temp[i] = employees[i];
                temp[employees.length] = referee;
                employees = temp;

            }
        }
        Referee[] temp1 = new Referee[referees.length + 1];
        for (int i = 0; i < referees.length; i++) {
            temp1[i] = referees[i];
            temp1[referees.length] = referee;
            referees = temp1;
        }
        System.out.println("The referee added successfully");
    }


    private void print_team_details(String team) {
        for (int i = 0; i < teams.length; i++) {
            if (team.equals(teams[i].getTeamName())) {
                System.out.println(teams[i]);
            }
        }
    }

    private void print_employee_salary(String idNumber) {
        int c = 0;
        for (int i = 0; i < employeesCounter; i++) {
            if (employees[i].getIdNumber().equals(idNumber)) {
                System.out.println(employees[i].salaryOfEmployee());
                c++;
            }
        }
        if (c == 0) {
            System.out.println("There is no employee with this id number");
        }

    }

    private void add_goal() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < games.length; i++) {
            System.out.println("Game number " + (i + 1) + ": " + games[i]);
            System.out.println(games[i].getDate());
        }
        System.out.println("Please select a game from the list by typing the desired game number: ");
        int choiceOfGame = scanner.nextInt();
        System.out.println("Please indicate the ID number of the player who scored a goal: ");
        String idNumberOfPlayer = scanner.next();
        for (int i = 0; i < games.length; i++) {
            if (choiceOfGame == (i + 1)) {
                if (games[i].getTeam1().checkIdNumber(idNumberOfPlayer) != null || games[i].getTeam2().checkIdNumber(idNumberOfPlayer) != null) {
                    games[i].updateNumberOfGoals(idNumberOfPlayer);
                    games[i].resultOfTheGame();
                }

            }

        }

    }

    private void add_judgment_errors() {
        Scanner scanner1 = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < games.length; i++) {
            System.out.println("Game number " + (i + 1) + ": " + games[i]);
            System.out.println();
            for (int j = 0; j < referees.length; j++) {
                System.out.println("Referees: " + referees[j].getFirstName() + " " + referees[j].getLastName());
            }
        }
        System.out.println("Please select a game from the list by typing the desired game number: ");
        int choiceOfGame = scanner1.nextInt();
        System.out.println("Please indicate the name of the referee for whom you would like to update new refereeing errors: ");
        System.out.println("First name: ");
        String firstName = scanner1.next();
        System.out.println("Last name: ");
        String lastName = scanner1.next();
        for (int i = 0; i < games.length; i++) {
            if (choiceOfGame == (i + 1)) {
                for (int j = 0; j < referees.length; j++) {
                    if (referees[j].getFirstName().equals(firstName) && referees[j].getLastName().equals(lastName)) {
                        games[i].updateJudgmentErrors(referees[j].getIdNumber());
                        counter++;
                    }
                }
                if (counter == 0) {
                    System.out.println("There is no referee in the selected game with the name you specified ");
                }
            }

        }


    }

    private void print_outstanding_people() {
        for (int i = 0; i < teams.length; i++) {
            System.out.println("Outstanding players/coaches/managers in team " + (i + 1) + ": ");
            for (int j = 0; j < teams[i].getPlayers().length; j++) {
                if (teams[i].getPlayers()[j].outstanding()) {
                    System.out.println("Information about the player: " + teams[i].getPlayers()[j] + "\nSuccess rate: " + teams[i].getPlayers()[j].success_rate());
                }
            }
            if (teams[i].getManager().outstanding()) {
                System.out.println("Information about the manager: " + teams[i].getManager());
            }
            if (teams[i].getCoach().outstanding()) {
                System.out.println("Information about the coach: " + teams[i].getCoach() + "\nIs the coach a former player? " + teams[i].getCoach().isPastPlayer() + "\nNumber of championships: " + teams[i].getCoach().getNumberOfChampionships());
            }
        }

        System.out.println("Outstanding referees: ");
        for (int i = 0; i < referees.length; i++) {
            if (referees[i].outstanding()) {
                boolean flag = false;
                if (referees[i].getJudgmentErrors() == referees[i].getMaximumJudgmentErrors()) {
                    flag = true;
                }
                System.out.println("Information about the referee: " + referees[i] + "\nNumber of judgment errors: " + referees[i].getJudgmentErrors() + "\nIs the number of judgment errors of this judge maximal?" + flag);
            }
        }
    }


    private void print_table() {
        System.out.println("Score table: ");
        for (int i = 0; i < games.length; i++) {
            if (games[i].getNumberOfGoals_team1() != 0 || games[i].getGetNumberOfGoals_team2() != 0) {
                if (games[i].getNumberOfGoals_team1() > games[i].getGetNumberOfGoals_team2()) {
                    games[i].setNumberOfGoals_team1(3);
                    System.out.println("The winner team is: " + games[i].getTeam1().getTeamName() + "\nScore: " + games[i].getNumberOfGoals_team1() + " - " + games[i].getGetNumberOfGoals_team2());
                } else if (games[i].getNumberOfGoals_team1() < games[i].getGetNumberOfGoals_team2()) {
                    games[i].setGetNumberOfGoals_team2(3);
                    System.out.println("The winner team is: " + games[i].getTeam2().getTeamName() + "\nScore: " + games[i].getNumberOfGoals_team1() + " - " + games[i].getGetNumberOfGoals_team2());
                } else {
                    games[i].setNumberOfGoals_team1(1);
                    games[i].setGetNumberOfGoals_team2(1);
                    System.out.println("Tie between the teams" + "\nScore: " + games[i].getNumberOfGoals_team1() + " - " + games[i].getGetNumberOfGoals_team2());
                }
            } else {
                System.out.println("The results of the game have not been typed yet" + "\nScore: " + "0-0");

            }

        }
    }

    private void print_player_details_with_smallest_salary() {
        for (int i = 0; i < teams.length; i++) {
            Player player_with_smallest_salary = teams[i].getPlayers()[0];
            for (int j = 1; j < teams[i].getPlayers().length; j++) {
                System.out.println("The players with the smallest salary in team " + (i + 1) + ": ");
                if (player_with_smallest_salary.salaryOfEmployee() > teams[i].getPlayers()[j].salaryOfEmployee()) {
                    player_with_smallest_salary = teams[i].getPlayers()[j];
                }
            }
            System.out.println(player_with_smallest_salary);

        }

    }

}







