public class GuessContinents {
    final String CYAN = "\u001B[36m";
    final String RED = "\u001B[31m";
    final String YELLOW = "\u001B[33m";
    final String WHITE = "\u001B[37m";
    final String BLACK = "\u001B[30m";
    final String BLUE = "\033[0;34m";
    final String BLUE_BRIGHT = "\033[0;94m";
    final String PURPLE = "\033[0;35m";
    final String GREEN = "\u001B[32m";
    // Instance variables
    private int maxRounds;
    private int tries = 1;
    private int totalTries = 0;
    private int correctGuess = 0;
    private String currentContinent = "";
    // to prevent repeats during random
    private boolean c1 = false;
    private boolean c2 = false;
    private boolean c3 = false;
    private boolean c4 = false;
    private boolean c5 = false;
    private boolean c6 = false;
    private boolean c7 = false;
    // continent names
    private final String continent1 = "North America";//north america
    private final String continent2 = "South America";// south america
    private final String continent3 = "Europe";//europe
    private final String continent4 = "Asia";//asia
    private final String continent5 = "Africa";//africa
    private final String continent6 = "Australia";//australia
    private final String continent7 = "Antarctica";//antarctica

    // Constructors

    /**
     * Constructor for the Person object.
     * Will set the maxRounds instance variable to maxRounds parameter.
     * @param maxRounds MaxRounds of the GuessContinents instance
     */
    public GuessContinents(int maxRounds) {
        this.maxRounds = maxRounds;
    }


    /**
     * Constructor for the Person object.
     *Will set maxRounds instance variable to a default of 3.
     */
    public GuessContinents()
    {
        maxRounds = 3;
    }

    /**
     * Rolls/Randomize and prints out the continent that hasn't been chosen yet and sets corresponding boolean values(of conitnents) in GuessContinents instance to true
     *
     * @return The name of the selected continent from GuessContinents instance
     */
    public String generateContinent() {
        while ((c1 != true) || (c2 != true) || (c3 != true) || (c4 != true) || (c5 != true) || (c6 != true)|| (c7 != true)) {// creates a random continent and making sure it doesn't repeat
            int num = (int)((Math.random() * 7) + 1);
            if (num == 1 && c1 == false) {
                currentContinent = continent1;
                c1 = true;
                return continent1;
            } else if (num == 2 && c2 == false) {
                currentContinent = continent2;
                c2 = true;
                return continent2;
            } else if (num == 3 && c3 == false) {
                currentContinent = continent3;
                c3 = true;
                return continent3;
            } else if (num == 4 && c4 == false) {
                currentContinent = continent4;
                c4 = true;
                return continent4;
            } else if (num == 5 && c5 == false) {
                currentContinent = continent5;
                c5 = true;
                return continent5;
            } else if (num == 6 && c6 == false) {
                currentContinent = continent6;
                c6 = true;
                return continent6;
            } else if (num == 7 && c7 == false) {
                currentContinent = continent7;
                c7 = true;
                return continent7;
            }
        }
        return "";
    }

    /**
     * Returns an description/result of each user's attempts. It gives the user 3 tries for each attempt and if gone over will set output to false
     *
     * @parameter User input from from the user.
     * @return A boolean depending on userInput
     */
    public boolean guess(String userInput) throws InterruptedException {
        // method determines if user inputs is equal to continenet
        if (userInput.toLowerCase().equals(currentContinent.toLowerCase())) {
            correctGuess++;
            totalTries++;
            Animations.correct();
            System.out.println(GREEN + "You got it correct!");
            System.out.println(WHITE + "");

            tries = 1;
            return true;
        }
        else {
            totalTries++;
            tries++;
            if (tries < 4) {
                Animations.wrong();
                System.out.println(RED + "Try Again. Attempt #" + tries + WHITE);
            }
            if (tries > 3) {
                Animations.wrong();
                System.out.println("My continent was " + BLUE_BRIGHT + currentContinent + WHITE + "!");
                tries = 1;
                System.out.println();
            }
            return false;
        }
    }

    /**
     * Prints out randomized hints for each continents
     */
    public void hints() {
        // method for hints
        int i = (int) (Math.random() * 4) + 1;
        if (currentContinent.equals("North America")) {
            if ((i == 1)) {
                System.out.println(BLUE + "An ambulance ride here costs more than your house." + WHITE);
            }
            else if ((i == 2)) {
                System.out.println(BLUE + "All life is percious...until it gets on your property." + WHITE);
            }
            else if ((i == 3)) {
                System.out.println(BLUE + "\"Make _______ great again\"" + WHITE);
            }
            else {
                System.out.println(BLUE + "Coloumbus discovered this." + WHITE);
            }
        }
        else if (currentContinent.equals("South America")) {
            if ((i == 1)) {
                System.out.println(BLUE + "Home to the world's largest snake." + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "Biggest rainforest goes brrr" + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "GOAL! GOAL! GOAL! GOAL! GOAL! GOOOOOOOOOOAL!" + WHITE);
            }
            else {
                System.out.println(BLUE + "Home to the largest river in the world." + WHITE);
            }
        }
        else if (currentContinent.equals("Europe")) {
            if (i == 1) {
                System.out.println(BLUE + "No one expects the Spanish Inquistion." + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "Lets hope they dont want to take over the world again" + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "Viva la Revolution" + WHITE);
            }
            else {
                System.out.println(BLUE + "A country in this continent needs a dental plan." + WHITE);
            }
        }
        else if (currentContinent.equals("Asia")) {
            if (i == 1) {
                System.out.println(BLUE + "Home to the highest mountains in the world." + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "" + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "FOR THE MOTHERLAND!" + WHITE);
            }
            else {
                System.out.println(BLUE + "BING CHLLING :COLD: :COLD: :ICE CREAM:." + WHITE);
            }
        }
        else if (currentContinent.equals("Africa")) {
            if (i == 1) {
                System.out.println(BLUE + "Pyramids" + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "Home to the largest desert in the world." + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "Ethnicity of the richest man." + WHITE);
            }
            else {
                System.out.println(BLUE + "Victoria Falls" + WHITE);
            }
        }
        else if (currentContinent.equals("Australia")) {
            if (i == 1) {
                System.out.println(BLUE + "Death by kangaroos." + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "Everything here tries to kill you." + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "Vegemites"+ WHITE);
            }
            else {
                System.out.println(BLUE + "Everything is upside down here" + WHITE);
            }
        }
        else {
            if (i == 1) {
                System.out.println(BLUE + "The icebergs are melting" + WHITE);
            }
            else if (i == 2) {
                System.out.println(BLUE + "It is a desert." + WHITE);
            }
            else if (i == 3) {
                System.out.println(BLUE + "Holds the most fresh water in the world." + WHITE);
            }
            else {
                System.out.println(BLUE + "Penguins, COLD, COLD, COLD!" + WHITE);
            }
        }
    }

    /**
     * Prints out of how many continents they guessed correctly, the amount of attempts and the number of continents they have to guess.
     *
     */
    public void ending() {
        // states score, total tries and number of tries
        String a = BLUE + "You got " + correctGuess + " out of " + maxRounds + "\nIt took you " + totalTries + " attempts for you to guess " + correctGuess + " continent.";
        System.out.println(a);
    }

    /**
     * Prints out of how many continents they guessed correctly, the amount of attempts and the number of continents they have to guess.
     *
     */
    public static void intro() {
        System.out.println("Welcome to \"Continent Guessing\" Game.");
        System.out.println("You will get 3 attempts to guess the continent per round.\n There will only be one hint in the beginning of each round.");
    }

    /**
     * Prints out phrases based on the percentage of correct scores.
     * @return phrases based on player score.
     */
    public String toString() {
        String b = CYAN + "Perfect!😁";
        String c = GREEN + "Well Done!😄";
        String d = YELLOW + "Thats alright.";
        String e = RED + "Boooo thats less than 50% right.😂";
        double average = (double) correctGuess / totalTries;
        if (average == 1) {
            return b;
        } else if (average > .50) {
            return c;
        } else if (average == .50) {
            return d;
        } else {
            return e;
        }
    }
}