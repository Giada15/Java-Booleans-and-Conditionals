public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "rainy";
       switch (weather){
            case "sunny": System.out.println("You should wear a shirt"); break;
            case "cloudy": System.out.println("You should wear a sweater"); break;
            case "rainy": System.out.println("You should wear a raincoat"); break;
            case "snow": System.out.println("You should wear a jacket");break;
            default: System.out.println("You can wear whatever you want");
       }


        // Section 2: User role
        int role = 2;

        switch(role){
            case 1: System.out.println("Admin"); break;
            case 2: System.out.println("Editor"); break;
            case 3: System.out.println("User"); break;
            default: System.out.println("Please contact HR");
        }


        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid\n");
        }else if(temperature >= 80){
            System.out.println("It's too hot\n");
        }else if (temperature <= 60 && humidity >=60){
            System.out.println("It's too cold and humid");
        }else if (temperature <=60){
            System.out.println("It's too cold");
        }else {
            System.out.println("It's comfortable");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        if (age >=18 && age <= 60 && income >= 30000){
            System.err.println("You are elegible for the credit card");
        }else{
            System.out.println("Sorry, you are not elegible for the credit card");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch(lightColor){
            case "green": System.out.println("Go!"); break;
            case "yellow": System.out.println("Slow down!"); break;
            case "red": System.out.println("Stop!"); break;
            default: System.out.println("Power outage!");
        }
       

        // Section 2: Exam grade
        int grade = 85;
        if(grade >=90){
            System.out.println("A");
        }else if (grade >=80){
            System.out.println("B");
        }else if (grade >=70){
            System.out.println("C");
        }else if (grade >=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
          

        // Section 3: Browser type
        String browser = "Chrome";
        switch(browser){
            case "Chrome": System.out.println("");break;
            case "Firefox": System.out.println("");break;
            case "Safari": System.out.println("");break;
            default: System.out.println("");
        }
      
        // Decide whether to use if-else or switch
    
    }
}
