import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String decision = scan.nextLine();
        if(decision.equals("yes")){
            System.out.println("\nGreat! In one line" +
                   "\nHow much money do you have in your savings?" +
                   "\nAnd, how much do you owe in credit card debt?");
        double savings = scan.nextDouble();
        double cardDebt = scan.nextDouble();

        System.out.println("How many years have you worked for");
        double years = scan.nextDouble();

        System.out.println("What is your name?");
        scan. nextLine();
        String name = scan.nextLine();

        if(savings>=10000 && cardDebt<5000 && years>2){
            System.out.println("Congratulations "+name+", you have been approved!");
        }else{
            System.out.println("Sorry, you are not eligible for a mortgage.");
        }

        }else {
            System.out.println("OK. Have a nice day!");
        }

        scan.close();
    }
    
}
