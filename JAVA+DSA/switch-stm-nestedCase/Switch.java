import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
String fruit= sc.next();

// if(fruit.equals("mango")){
//     System.out.println("MANGO");
// }

// if(fruit.equals("apple")){
//     System.out.println("APPLE");
// }

/** SWitch case */


// switch(fruit){
//     case "mango":
//     System.out.println("MANGOOOOOO!!");
//     break;

//     case "apple":
//     System.out.println("APPLEE!!");
//     break;

//     case "grapes":
//     System.out.println("GRAPES!!");
//     break;

//     default:
//     System.out.println("Please enter a valid case");
// }

/** Enhanced Switch case */


switch(fruit){
    case "mango" -> System.out.println("MANGOOOOOO!!");
    case "apple" -> System.out.println("APPLE!!");
    case "orange" -> System.out.println("ORANGE!!");
    default -> System.out.println("not valid");
}
    }
}
