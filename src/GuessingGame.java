
    /*
     * greet player
     *get player name
     *choose random number between 1 and 100
     *repeat forever:
     *get guess
     *if guess is incorrect:
     *give hint
     *increase number of guesses
     *else:
     *congratulate player

     * */
    import java.util.InputMismatchException;
    import java.util.Scanner;
    import java.util.Random;
    public class GuessingGame {
        public GuessingGame() {
            System.out.println("Howdy, what is your name?");
            System.out.println("(type in your name)");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            System.out.println(name + " I am thinking of a number between 1 and 100");
            System.out.println("Can you guess what the number is?");

            //computer generate random number
            Random rand = new Random();
            // call method nextInt and pass in upper range bound
            int number = rand.nextInt(100);
            int tries = 0;

            //build the guessing game
            while (true) {
                int guess;
                try {
                    guess = input.nextInt();
                } catch (InputMismatchException e) {
                    String bad_input = input.next(); // need to progress past bad input
                    System.out.println("That is not an integer, try again");
                    continue;
                }
                if (guess < 1 || guess > 100) {
                    System.out.println(guess + " is not a valid number, try again ");
                    continue;
                }
                tries = tries + 1;
                if (guess < number) {
                    System.out.println("Your guess  is too low, try again.");
                } else if (guess > number) {
                    System.out.println("Your guess is too high, try again");
                } else {
                    System.out.println("Well done " + name);
                    System.out.println("You found my number in " + tries + " tries!");
                    break;
                }
            }
        }
    }

