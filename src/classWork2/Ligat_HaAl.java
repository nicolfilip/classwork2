package classWork2;

import java.util.*;

import static classWork2.Employee.employeesCounter;

public class Ligat_HaAl {
    public static List<Employee> employees = new ArrayList<>();

    private static List<Team> teams  = initializeTeams();

    private static List<Game> games = gameBoard();


    private static List<Referee> referees = initializeReferees();
    private static Integer maximumJudgmentErrors = 0;



    public Ligat_HaAl() {
        menu();
    }

    private static List<Team> initializeTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(createHBS());
        teams.add(createHTA());
        teams.add(createMH());
        teams.add(createBj());

        return teams;

    }

    //    private static Employee[] intializeEmployees(){
//        Employee [] employees= new Employee[60];
//        for (Employee employee: employees){
//            employee.addPlayer()
//        }
//        return employees;
//

//    }
    private static List<Referee> initializeReferees() {
        List<Referee> referees = new ArrayList<>();
        referees.add(new Referee("Ami", "Sultan", 5, 5, 10, 8));
        referees.add(new Referee("Nicolay", "Tras", 10, 20, 60, 19));
        referees.add(new Referee("Yuli", "Cohen", 2, 11, 15, 5));
        referees.add(new Referee("Topaz", "Levi", 12, 25, 62, 30));
        maximumJudgmentErrors = referees.stream()
                .mapToInt(Referee::getJudgmentErrors)
                .max()
                .orElse(0);
        return referees;
    }

    private static Team createHBS() {
        List<Player> hbsPlayers = new ArrayList<>();
        hbsPlayers.add(new Player("Omri", "Glayzer", 1, "Hapoel Beer-Sheva", 49, 30, "Goalkeeper"));
        hbsPlayers.add(new Player("Ariel", "Harush", 2, "Hapoel Beer-Sheva", 7, 3, "Goalkeeper"));
        hbsPlayers.add(new Player("Miguel", "Vitor", 6, "Hapoel Beer-Sheva", 75, 68, "Defender"));
        hbsPlayers.add(new Player("Eyad", "Abu Abid", 1, "Hapoel Beer-Sheva", 60, 40, "Defender"));
        hbsPlayers.add(new Player("Helder", "Lopes", 1, "Hapoel Beer Sheva", 56, 45, "Defender"));
        hbsPlayers.add(new Player("Ramsey", "Safury", 3, "Hapoel Beer Sheva", 17, 12, "Midfielder"));
        hbsPlayers.add(new Player("Dor", "Micha", 1, "Hapoel Beer Sheva", 26, 21, "Midfielder"));
        hbsPlayers.add(new Player("Shai", "Elias", 1, "Hapoel Beer Sheva", 9, 5, "Midfielder"));
        hbsPlayers.add(new Player("Roi", "Gordana", 4, "Hapoel Beer Sheva", 14, 9, "Midfielder"));
        hbsPlayers.add(new Player("Tomer", "Hemed", 1, "Hapoel Beer Sheva", 13, 9, "Forward"));
        hbsPlayers.add(new Player("Rotem", "Hatuel", 2, "Hapoel Beer Sheva", 22, 16, "Forward"));
        hbsPlayers.add(new Player("Itay", "Shechter", 1, "Hapoel Beer Sheva", 5, 2, "Forward"));

        Coach hbsCoach = new Coach("Elyaniv", "Barda", 2, "Hapoel Beer Sheva", true, 1);
        Manager hbsManager = new Manager("Guy", "Primor", 1);
        return new Team("Hapoel Beer Sheva", "Toto Turner", hbsPlayers, hbsCoach, hbsManager);


    }


    private static Team createHTA() {
        List<Player> htaPlayers = new ArrayList<>();
        htaPlayers.add(new Player("Emilios", "Zubas", 2, "Hapoel Tel Aviv", 81, 62, "Goalkeeper"));
        htaPlayers.add(new Player("Stephen", "Marinovik", 3, "Hapoel Tel Aviv", 10, 6, "Goalkeeper"));
        htaPlayers.add(new Player("Edi", "Gutliv", 4, "Hapoel Tel Aviv", 25, 23, "Defender"));
        htaPlayers.add(new Player("Antuan", "Konet", 2, "Hapoel Tel Aviv", 11, 9, "Defender"));
        htaPlayers.add(new Player("Ben", "Bitton", 1, "Hapoel Tel Aviv", 60, 49, "Defender"));
        htaPlayers.add(new Player("Dan", "Aynbinder", 2, "Hapoel Tel Aviv", 15, 10, "Midfielder"));
        htaPlayers.add(new Player("Shlomi", "Azulay", 3, "Hapoel Tel Aviv", 32, 28, "Midfielder"));
        htaPlayers.add(new Player("Omer", "Senior", 1, "Hapoel Tel Aviv", 21, 15, "Midfielder"));
        htaPlayers.add(new Player("David", "Klatines", 4, "Hapoel Tel Aviv", 65, 57, "Midfielder"));
        htaPlayers.add(new Player("Niv", "Zrihen", 2, "Hapoel Tel Aviv", 45, 32, "Forward"));
        htaPlayers.add(new Player("Hisham", "Layos", 4, "Hapoel Tel Aviv", 9, 5, "Forward"));
        htaPlayers.add(new Player("Rave", "Assayag", 3, "Hapoel Tel Aviv", 15, 14, "Forward"));

        Coach htaCoach = new Coach("Haim", "Silbes", 5, "Hapoel Tel Aviv", false, 3);
        Manager htaManager = new Manager("Itzik", "Nisanov", 6);
        return new Team("Hapoel Tel Aviv", "Bloomfield", htaPlayers, htaCoach, htaManager);

    }

    private static Team createMH() {
        List<Player> mhPlayers = new ArrayList<>();
        mhPlayers.add(new Player("Josh", "Cohen", 2, "Maccabi Haifa", 90, 85, "Goalkeeper"));
        mhPlayers.add(new Player("Roey", "Mashpaty", 1, "Maccabi Haifa", 54, 49, "Goalkeeper"));
        mhPlayers.add(new Player("Abdulay", "Sak", 3, "Maccabi Haifa", 10, 7, "Defender"));
        mhPlayers.add(new Player("Sun", "Menahem", 2, "Maccabi Haifa", 15, 13, "Defender"));
        mhPlayers.add(new Player("Pier", "Korno", 2, "Maccabi Haifa", 40, 29, "Defender"));
        mhPlayers.add(new Player("Dolev", "Haziza", 4, "Maccabi Haifa", 70, 63, "Midfielder"));
        mhPlayers.add(new Player("Cheron", "Sheri", 3, "Maccabi Haifa", 22, 19, "Midfielder"));
        mhPlayers.add(new Player("Joni", "Naor", 1, "Maccabi Haifa", 21, 20, "Midfielder"));
        mhPlayers.add(new Player("Mohamad", "Abu Fani", 3, "Maccabi Haifa", 65, 63, "Midfielder"));
        mhPlayers.add(new Player("Omer", "Atzili", 2, "Maccabi Haifa", 37, 32, "Forward"));
        mhPlayers.add( new Player("Ferantzdi", "Piro", 1, "Maccabi Haifa", 8, 7, "Forward"));
        mhPlayers.add( new Player("Din", "David", 2, "Maccabi Haifa", 20, 16, "Forward"));

        Coach mhCoach = new Coach("Barak", "Bachar", 5, "Maccabi Haifa", true, 4);
        Manager mhManager = new Manager("Yaakov", "Shachar", 10);
        return new Team("Maccabi Haifa", "Sami Ofer", mhPlayers, mhCoach, mhManager);

    }


    private static Team createBj() {
        List<Player> bjPlayers = new ArrayList<>();
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
        return new Team("Beitar Jerusalem", "Teddi", bjPlayers, bjCoach, bjManager);

    }


    private void menu() {
        boolean close = false;
        while (!close) {
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            System.out.println("Please enter your choice: \n1.Add Player \n2.Add Referee \n3.Print Team Details \n4.Print referee details \n5.Print future games details ");
            System.out.println("6.Print employee salary \n7.Add Goal \n8.Add judgment errors \n9.Print outstanding people \n10.Print table \n11.Print player details with smallest salary  \n12. Exit");
            int choice = -1;
            do{
                try{
                    choice = scanner.nextInt();
                }catch (Exception e){
                    System.out.println("Please choose a valid number in range 1-12");
                }}while(choice == -1);



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
                    System.out.println("Please indicate the id of the player: ");
                    scanner.nextLine();
                    String id = scanner.next();
                    System.out.println("Please indicate the seniority of the player: ");
                    scanner.nextLine();
                    int seniorityPlayer = scanner.nextInt();
                    System.out.println("Please indicate the type of the player (Goalkeeper, Defender, Midfielder, Forward): ");
                    scanner.nextLine();
                    String typePlayer = scanner.next();
                    if(employees.stream().anyMatch(it ->it.getIdNumber().equals(id))){
                        System.out.println("Cant");
                        break;
                    }
                    Player player = new Player(firstNamePlayer, lastNamePlayer, id, seniorityPlayer, teamNamePlayer, 0, 0, typePlayer);
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
                    if(judgmentErrors > maximumJudgmentErrors)
                        maximumJudgmentErrors = judgmentErrors;
                    Referee referee = new Referee(firstNameReferee, lastNameReferee, seniorityReferee, judgmentErrors, numberOfGamesReferee, maximumJudgmentErrors);
                    addReferee(referee);
                    break;
                case 3:
                    for (Team team : teams) {
                        System.out.println(team);
                    }
                    System.out.println("Please select a football team by its name: ");
                    String teamChoose = scanner.next();
                    if (teamChoose.equals(teams.get(0).getTeamName()) || teamChoose.equals(teams.get(1).getTeamName()) || teamChoose.equals(teams.get(2).getTeamName()) || teamChoose.equals(teams.get(3).getTeamName())) {
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

    private static List<Game> gameBoard() {
        List<Game> games = new ArrayList<>();
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

        games.add(new Game(date, teams.get(0), teams.get(1), referees));
        games.add(new Game(date1, teams.get(1), teams.get(0), referees));
        games.add(new Game(date2, teams.get(0), teams.get(2), referees));
        games.add(new Game(date3, teams.get(2), teams.get(0), referees));
        games.add(new Game(date4, teams.get(2), teams.get(3), referees));
        games.add(new Game(date5, teams.get(3), teams.get(2), referees));
        games.add(new Game(date6, teams.get(0), teams.get(3), referees));
        games.add(new Game(date7, teams.get(3), teams.get(0), referees));
        games.add(new Game(date8, teams.get(1), teams.get(2), referees));
        games.add(new Game(date9, teams.get(2), teams.get(1), referees));
        games.add(new Game(date10, teams.get(1), teams.get(3), referees));
        games.add(new Game(date11, teams.get(3), teams.get(1), referees));
        return games;
    }

    private void addPlayerToTheGame(Player player) {
        if (player.getTeamName().equals(teams.get(0).getTeamName())) {
            teams.get(0).addPlayer(player);
            System.out.println("The player added successfully");
        } else if (player.getTeamName().equals(teams.get(1).getTeamName())) {
            teams.get(1).addPlayer(player);
            System.out.println("The player added successfully");
        } else if (player.getTeamName().equals(teams.get(2).getTeamName())) {
            teams.get(2).addPlayer(player);
            System.out.println("The player added successfully");
        } else if(player.getTeamName().equals(teams.get(3).getTeamName())) {
            teams.get(3).addPlayer(player);
        System.out.println("The player added successfully");
        }else{
            System.out.println("Team not recognized. Player was not added.");
        }
    }

    private void addReferee(Referee referee) {
        if(employees.stream().anyMatch(it ->it.getIdNumber().equals(referee.getIdNumber()))){
            System.out.println("Cant");
        }
        referees.add(referee);
        System.out.println("The referee added successfully");
    }


    private void print_team_details(String team) {
        for (int i = 0; i < teams.size(); i++) {
            if (team.equals(teams.get(i).getTeamName())) {
                System.out.println(teams.get(i));
            }
        }
    }

    private void print_employee_salary(String idNumber) {
        int c = 0;
        for (int i = 0; i < employeesCounter; i++) {
            if (employees.get(i).getIdNumber().equals(idNumber)) {
                System.out.println(employees.get(i).salaryOfEmployee());
                c++;
            }
        }
        if (c == 0) {
            System.out.println("There is no employee with this id number");
        }

    }

    private void add_goal() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < games.size(); i++) {
            System.out.println("Game number " + (i + 1) + ": " + games.get(i));
            System.out.println(games.get(i).getDate());
        }
        System.out.println("Please select a game from the list by typing the desired game number: ");
        int choiceOfGame = scanner.nextInt();
        System.out.println("Please indicate the ID number of the player who scored a goal: ");
        String idNumberOfPlayer = scanner.next();
        for (int i = 0; i < games.size(); i++) {
            if (choiceOfGame == (i + 1)) {
                if (games.get(i).getTeam1().checkIdNumber(idNumberOfPlayer) != null || games.get(i).getTeam2().checkIdNumber(idNumberOfPlayer) != null) {
                    games.get(i).updateNumberOfGoals(idNumberOfPlayer);
                    games.get(i).resultOfTheGame();
                }

            }

        }

    }

    private void add_judgment_errors() {
        Scanner scanner1 = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < games.size(); i++) {
            System.out.println("Game number " + (i + 1) + ": " + games.get(i));
            System.out.println();
            for (int j = 0; j < referees.size(); j++) {
                System.out.println("Referees: " + referees.get(j).getFirstName() + " " + referees.get(j).getLastName());
            }
        }
        System.out.println("Please select a game from the list by typing the desired game number: ");
        int choiceOfGame = scanner1.nextInt();
        System.out.println("Please indicate the name of the referee for whom you would like to update new refereeing errors: ");
        System.out.println("First name: ");
        String firstName = scanner1.next();
        System.out.println("Last name: ");
        String lastName = scanner1.next();
        for (int i = 0; i < games.size(); i++) {
            if (choiceOfGame == (i + 1)) {
                for (int j = 0; j < referees.size(); j++) {
                    if ( referees.get(j).getFirstName().equals(firstName) && referees.get(j).getLastName().equals(lastName)) {
                        games.get(i).updateJudgmentErrors( referees.get(j).getIdNumber());
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
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Outstanding players/coaches/managers in team " + (i + 1) + ": ");
            for (int j = 0; j < teams.get(i).getPlayers().size(); j++) {
                if (teams.get(i).getPlayers().get(j).outstanding()) {
                    System.out.println("Information about the player: " + teams.get(i).getPlayers().get(j) + "\nSuccess rate: " + teams.get(i).getPlayers().get(j).success_rate());
                }
            }
            if (teams.get(i).getManager().outstanding()) {
                System.out.println("Information about the manager: " + teams.get(i).getManager());
            }
            if (teams.get(i).getCoach().outstanding()) {
                System.out.println("Information about the coach: " + teams.get(i).getCoach() + "\nIs the coach a former player? " + teams.get(i).getCoach().isPastPlayer() + "\nNumber of championships: " + teams.get(i).getCoach().getNumberOfChampionships());
            }
        }

        System.out.println("Outstanding referees: ");
        for (int i = 0; i < referees.size(); i++) {
            if ( referees.get(i).outstanding()) {
                boolean flag = false;
                if ( referees.get(i).getJudgmentErrors() ==  referees.get(i).getMaximumJudgmentErrors()) {
                    flag = true;
                }
                System.out.println("Information about the referee: " +  referees.get(i) + "\nNumber of judgment errors: " +  referees.get(i).getJudgmentErrors() + "\nIs the number of judgment errors of this judge maximal?" + flag);
            }
        }
    }


    private void print_table() {
        System.out.println("Score table: ");
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getNumberOfGoals_team1() != 0 || games.get(i).getGetNumberOfGoals_team2() != 0) {
                if (games.get(i).getNumberOfGoals_team1() > games.get(i).getGetNumberOfGoals_team2()) {
                    games.get(i).setNumberOfGoals_team1(3);
                    System.out.println("The winner team is: " + games.get(i).getTeam1().getTeamName() + "\nScore: " + games.get(i).getNumberOfGoals_team1() + " - " + games.get(i).getGetNumberOfGoals_team2());
                } else if (games.get(i).getNumberOfGoals_team1() < games.get(i).getGetNumberOfGoals_team2()) {
                    games.get(i).setGetNumberOfGoals_team2(3);
                    System.out.println("The winner team is: " + games.get(i).getTeam2().getTeamName() + "\nScore: " + games.get(i).getNumberOfGoals_team1() + " - " + games.get(i).getGetNumberOfGoals_team2());
                } else {
                    games.get(i).setNumberOfGoals_team1(1);
                    games.get(i).setGetNumberOfGoals_team2(1);
                    System.out.println("Tie between the teams" + "\nScore: " + games.get(i).getNumberOfGoals_team1() + " - " + games.get(i).getGetNumberOfGoals_team2());
                }
            } else {
                System.out.println("The results of the game have not been typed yet" + "\nScore: " + "0-0");

            }

        }
    }

    private void print_player_details_with_smallest_salary() {
//        for (int i = 0; i < teams.size(); i++) {
//            Player player_with_smallest_salary = teams.get(i).getPlayers();
//            for (int j = 1; j < teams.get(i).getPlayers().size(); j++) {
//                System.out.println("The players with the smallest salary in team " + (i + 1) + ": ");
//                if (player_with_smallest_salary.salaryOfEmployee() > teams.get(i).getPlayers()[j].salaryOfEmployee()) {
//                    player_with_smallest_salary = teams.get(i).getPlayers()[j];
//                }
//            }
//            System.out.println(player_with_smallest_salary);
//
//        }

    }

}







