public class JavaMart {
    public static void main(String[] args) {

        double wallet = 100;
        double car = 45.99;
        double shoes = 79.99;

        System.out.println("Can you buy me this car");
        if (car <= wallet){
            System.out.println("Sure!\n");
            wallet -= car;
        } else {
            System.out.println("Sorry, I only have " + wallet +" left");
        }


        System.out.println("Can you buy me this nike shoes?");
        if (shoes <= wallet){
            System.out.println("Sure!");
            wallet -= shoes;
        } else {
            System.out.println("Sorry, I only have " + wallet +" left");
        }


        
    }
    
}
