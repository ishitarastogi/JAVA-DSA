// import java.util.Scanner;
//  class CheckUpperLower1{
// public static void main(String args[]){
//     char ch;//variable declaration
//  Scanner scan=new Scanner(System.in); 
//     //create a scanner object for input
    
// System.out.println("Enter the character for find case ");
// ch=scan.next().charAt(0);;// store the input from the user
// System.out.println(ch);
// // if(ch>=65 && ch<=90){
// //     System.out.println(ch+" is an upper case letter ");
// // }
// // else if(ch>=97 && ch<=122){
// //     System.out.println(ch+" is a lower case letter ");
// // }
// // else{
// //     System.out.println(ch+" is not an Alphabets ");
// // }
//  }
// }
import java.util.Scanner;
 class Exercise6 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
     //   x = x / 1000;
        System.out.println(x);
        y = Math.round(y * 1000);
      //  y = y / 1000;
        System.out.println(y);

        // if (x == y)
        // {
        //     System.out.println("They are the same up to three decimal places");
        // }
        // else
        // {
        //     System.out.println("They are different");
        // }
    }
}