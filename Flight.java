import java.util.*;

public class Flight {
    private static boolean[] seats = new boolean[12];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter your choice: ");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. View Ticket Details");
            System.out.println("3. Exit");
            int input = sc.nextInt();

            if(input == 1){
                ReserveTicket();
            }else if(input == 2){
                ViewTicketDetails();
            }else if(input == 3){
                break;
            }else{
                System.out.println("Invalid Input Given. Pls give a valid input");
            }
        }
        sc.close();
    }

    private static void ViewTicketDetails() {
        for(int i=0;i<seats.length;i++){
            if(seats[i] == true){
                System.out.println("Seat " + (i+1) + ": Reserved");
            }else {
                System.out.println("Seat "+(i+1) + ": Available");
            }
        }
    }
}