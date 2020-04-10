//Collatz Conjecture Project
//MATH2358-262
//Jordan Finney
//Mason Greenwell
//Dylan Messerly
//John-Luke Speight


import java.util.Scanner;


public class Collatz {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Collatz Conjecture");
        System.out.println("Enter an integer: ");

        int userNumber = userInput.nextInt();
        System.out.println("It takes " + evalCollatz(userNumber) + " steps to reach 1 using Collatz Conjecture. ");
        System.out.println("Initial Number entered: " + userNumber + ".");

    }

    //Collatz Algorithm
    //pre condition n > 1
    public static int evalCollatz(int userInteger String){
        if(userInteger == 1) {
            return 0;
        }
        else if (userInteger % 2 == 0){
            return 1 + evalCollatz(userInteger/2);
        }
        else {
            return 1 + evalCollatz(userInteger * 3 + 1);
        }
    }

    public  static int menuLoop ( int userSelection)
}
