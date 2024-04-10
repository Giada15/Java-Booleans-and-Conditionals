public class AskJava {

    public static void main(String[] args) {
        double change = 3.50;
        double price = 2.50;
        System.out.println("Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change > price) + "\n");

        int numPeople = 20;
        int numPeopleEl = 5;
        System.out.println("Hi Java, can the elevaotr hold everyone?");
        System.out.println("Java: " + (numPeople < numPeopleEl) + "\n");

        String moodFriend = "sad";
        System.out.println("Hi Java, will my friend be happy?");
        System.out.println("Java: " + (moodFriend.equals("happy")) + "\n");

        int numPeopleTot = 20;
        int numPeopleParty = 20;
        System.out.println("Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (numPeopleTot <= numPeopleParty) + "\n");

        String election = "no";
        System.out.println("Hi Java, will I win the election?");
        System.out.println("Java: " + (election.equals("yes")) + "\n");


    }
    
}
