public class Calendar {

    public static void main(String[] args) {
        String day = "Friday";

        switch(day){
            case "Monday": System.out.println("Can't");break;
            case "Tuesday": System.out.println("Busy");break;
            case "Wednesday": System.out.println("Let's do it!");break;
            case "Thursday": System.out.println("Yeah!");break;
            case "Friday": System.out.println("Perhaps.");break;
            case "Saturday": System.out.println("Sure");break;
            case "Sunday": System.out.println("Certainly!");
            default: System.out.println("Which day of the week?");
    }
    
}
}