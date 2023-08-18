import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException{
        Thread.sleep(500); //Use Thread.sleep(500) to stop the terminal for half a second while you’re on your expedition
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");
        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println(rockList);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list ");
        rockList.remove("not rock");
        System.out.println(rockList);

        Thread.sleep(1000);
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println("Fossil data download");
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shape implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        //Fossil
        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        //special supply lists
        Thread.sleep(700);
        HashSet <String> supplies = new HashSet<>();
        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        supplies.remove("Stun gun");
        //creates Iterator object.
        Iterator itr = supplies.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
