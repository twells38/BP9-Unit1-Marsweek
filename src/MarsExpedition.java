import java.sql.SQLOutput;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("Boot up..");
        System.out.println("Ready!");
        System.out.println("What is you name?");
        String name = scanner.nextLine();

        System.out.println("Hi " +name+ " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = scanner.nextLine();

        if(answer.equals("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else{
            System.out.println("Too bad you are team leader. You have to go");
        }
        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = scanner.nextInt();
        scanner.nextLine();
        if(teamSize > 2){
            System.out.println("That is way to many people. We can only send 2 more members");
            teamSize =2;
        }else if(teamSize < 2) {
            System.out.println("That is not enough people. We need you and 2 more members.");
            teamSize =2;
        }else if(teamSize == 2){
            System.out.println("That is a perfect sized team. Good job!");
        }
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = scanner.nextLine();
        System.out.println("Nice Choice, you will be bringing a "+ snack+ " with you");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic"
                );

        String vehicleChoice = scanner.nextLine();
        if(vehicleChoice.equals("A")){
            vehicleChoice = "A Mars Rover";
        }else if(vehicleChoice.equals("B")){
            vehicleChoice = "A Chevy Silverado";
        }else if(vehicleChoice.equals("C")){
            vehicleChoice = "A Honda Civic";
        }else{
            vehicleChoice = "your feet";
        }
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates. and " + snack+ " for snacks" +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}
