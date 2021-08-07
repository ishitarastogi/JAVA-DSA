import java.util.Scanner;
public class Week {
    public static void main(String[] args){
   System.out.println("Enter a number between 1 to 7"); 
    Scanner input= new Scanner(System.in);
    int day=input.nextInt();
    switch(day){
        case 1,2,3,4,5 -> System.out.println("weekdays");
        case 6,7 -> System.out.println("weekends");
    }
    }
}
