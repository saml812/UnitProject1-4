import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\033[H\033[2J");
        Animations.welcome();

        Scanner input = new Scanner(System.in);

        GuessContinents.intro();
        System.out.println( "How many rounds would you like to play? (Max 7) (Type \"-1\" for default)");
        int rounds = input.nextInt();
        if (rounds == -1)  // if user wants a default option
        {
            GuessContinents test = new GuessContinents();
            rounds = 3;
            String user = input.nextLine();
            //lets the user have 3 attempts/tries per round to guess.
            for (int j = 0; j < rounds; j++)
            {
                System.out.println("Guess my continent!");
                test.generateContinent();
                test.hints();
                user = input.nextLine();

                if (test.guess(user) == false)
                {
                    int i = 1;
                    while (i != 3)
                    {
                        user = input.nextLine();
                        if (test.guess(user) == true)
                        {
                            i = 3;
                        }
                        else
                            i++;
                    }
                }
            }

            System.out.println(test);
            test.ending();

            System.out.println("The game will end in 10 seconds.");
            Thread.sleep(10000);
            Animations.ending();

        }
        else //if user wanted to input their own rounds
        {
            GuessContinents test1 = new GuessContinents(rounds);
            String user = input.nextLine();
            //lets the user have 3 attempts/tries per round to guess.
            for (int j = 0; j < rounds; j++)
            {
                System.out.println("Guess my continent!");
                test1.generateContinent();
                test1.hints();
                user = input.nextLine();

                if (test1.guess(user) == false)
                {
                    int i = 1;
                    while (i != 3)
                    {
                        user = input.nextLine();
                        if (test1.guess(user) == true)
                        {
                            i = 3;
                        }
                        else
                            i++;
                    }
                }
            }

            System.out.println(test1);
            test1.ending();

            System.out.println("The game will end in 10 seconds.");
            Thread.sleep(10000);
            Animations.ending();
        }
        input.close();
    }
}
