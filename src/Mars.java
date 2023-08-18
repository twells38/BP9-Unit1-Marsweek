
    /**Create a string variable named colonyName, and set it equal to your desired name
     *Create an int variable named shipPopulation, and set it equal to 300
     *Create a double variable named meals, and set it equal to 4000.00
     * Create a boolean variable named landing, and set it equal to true
     * everyone will eat 0.75 meals a day to preserve food. The landing process takes 2 days.
     * Calculate how many meals are left after landing using mathematical operators.
     * Print the number of meals that are left.
     * An extra crate of food is found increasing meals by 50%! Reassign the value of meals to be 50% higher than it was using a mathematical expression.
     * The births onboard are very perfectly timed and 5 more babies join the population during the 2 days it takes to land. Reassign shipPopulation to reflect that.
     * */


    public class Mars {
        public static void main(String[] args) {
            String colonyName = "SpaceX";
            int shipPopulation = 300;
            double meals = 4000.00;
            boolean landing = true;
            String landingLocation = "The Hill";
            meals = meals - (shipPopulation * 0.75);//day 1
            meals = meals - (shipPopulation * 0.75);//day 2
            System.out.println("Number of meals that are left: " + meals);
            meals = meals + (meals * 50 / 100);
            shipPopulation = shipPopulation + 5;
            System.out.println("ShipPopulation after baby birth on board: " + shipPopulation);
            if (landingLocation.equalsIgnoreCase("The Plain")) {
                System.out.println("Bbzzzz Landing on the Plain");
            } else {
                System.out.println("Error!!!! Flight plan already set.Landing on the Plain");
            }
            try{
                landing = landingCheck(30);

            }catch (Exception e){
                System.out.println(e.toString());
            }
            new GuessingGame();

            new MarsExpedition();

            try{
               new FindingsList();

            }catch (Exception e){
                System.out.println(e.toString());
            }


        }


        /*
         * create a public function called landingCheck.
         * returns a boolean value
         * @int parameter called minutesLeft
         * inside landingCheck
         * create a for loop that initializes an int variable called minute which is set to 0.
         * The loop should increment by 1 until it reaches the number of minutesLeft
         * Inside the loop, create an if statement.
         * If the number of minutes is even print “Right”,
         * if the number of minutes is divisible by 3 print “Left”
         * if the number is divisible by both 2 and 3 print “Keep Center”
         * If the number isn’t divisible by any of those factors, print “Calculating”.
         **/


        public static boolean landingCheck(int minutesLeft) throws InterruptedException {
            for (int minute = 0; minute <= minutesLeft; minute++) {
                if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                    System.out.println("Keep Center");
                } else if ((minute % 2) == 0) {
                    System.out.println("Right");
                } else if ((minute % 3) == 0) {
                    System.out.println("Left");
                } else {
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
            System.out.println("Landed");
            return false;
        }
    }

