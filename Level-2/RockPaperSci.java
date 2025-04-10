import java.util.*;

class RockPaperSci {
    
    public static String gencompChoice(String[] choices) {
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    public static String[][] checking(String userChoice, String compChoice, int gameNumber) {
        String result;
        if (userChoice.equalsIgnoreCase(compChoice)) {
            result = "Tie";
        } else if ((userChoice.equalsIgnoreCase("ROCK") && compChoice.equals("SCISSOR")) ||
                   (userChoice.equalsIgnoreCase("SCISSOR") && compChoice.equals("PAPER")) ||
                   (userChoice.equalsIgnoreCase("PAPER") && compChoice.equals("ROCK"))) {
            result = "User Wins";
        } else {
            result = "Computer Wins";
        }

        return new String[][] {{String.valueOf(gameNumber), userChoice, compChoice, result}};
    }

    public static double[] calculateStats(String[][] results, int totalGames) {
        int userWins = 0, compWins = 0, ties = 0;

        for (int i = 0; i < totalGames; i++) {
            if (results[i][3].equals("User Wins")) {
                userWins++;
            } else if (results[i][3].equals("Computer Wins")) {
                compWins++;
            } else {
                ties++;
            }
        }

        double userWinPercentage = (userWins / (double) totalGames) * 100;
        double compWinPercentage = (compWins / (double) totalGames) * 100;
        double avgWins = (userWins + compWins) / 2.0;

        return new double[] {userWinPercentage, compWinPercentage, avgWins};
    }

    public static void displayResults(String[][] results, double[] stats, int totalGames) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-10s %-15s %-15s%n", "Game No.", "User", "Computer", "Result");
        System.out.println("-----------------------------------------------------");
        
        for (int i = 0; i < totalGames; i++) {
            System.out.printf("%-10s %-10s %-15s %-15s%n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.printf("User Win Percentage: %.2f%%\n", stats[0]);
        System.out.printf("Computer Win Percentage: %.2f%%\n", stats[1]);
        System.out.printf("Average Wins Per Player: %.2f\n", stats[2]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int no_of_games = scn.nextInt();
        scn.nextLine();

        String[] choices = {"ROCK", "PAPER", "SCISSOR"};
        String[][] results = new String[no_of_games][4];

        for (int i = 0; i < no_of_games; i++) {
            System.out.println("\nChoose ROCK, PAPER, OR SCISSOR:");
            String userChoice = scn.next().toUpperCase();

            if (!userChoice.equals("ROCK") && !userChoice.equals("PAPER") && !userChoice.equals("SCISSOR")) {
                System.out.println("Invalid Choice! Enter ROCK, PAPER, or SCISSOR.");
                i--;  // Repeat the current round
                continue;
            }

            String compChoice = gencompChoice(choices);
            System.out.println("Computer chose: " + compChoice);

            results[i] = checking(userChoice, compChoice, i + 1)[0];
        }

        double[] stats = calculateStats(results, no_of_games);
        displayResults(results, stats, no_of_games);

        scn.close();
    }
}
