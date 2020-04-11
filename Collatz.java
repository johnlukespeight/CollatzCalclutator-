//Collatz Conjecture Project
//MATH2358-262
//Jordan Finney
//Mason Greenwell
//Dylan Messerly
//John-Luke Speight

import java.util.Scanner;

class Collatz {

        public static void main(String[] args){
        Scanner searchSelection = new Scanner(System.in);

        System.out.println("Collatz Conjecture Calculator");
        System.out.println();

        //Menu Driven Loop
        while(true){

            System.out.println("Menu: 1) Calculate 2) Work Backwards 3) Negative Number 4) Exit Program");
            System.out.println();

            System.out.println("Enter your selection (1-4) from the following menu above:");
            int choice = searchSelection.nextInt();

            switch(choice){
                case 1:
                    System.out.println("CALCULATE NUMBER OF STEPS");
                    System.out.println("Enter an integer (n>1): ");
                    CollatzMethods calcColl = new CollatzMethods();
                    calcColl.CalcCollatz();
                    break;

                case 2:
                    System.out.println("Display");
                    break;

                case 3:
                    System.out.println("Work Backwards");
                    break;

                case 4:
                    System.out.println("Program Complete!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input. Please try again: ");
            }

        }
    }
}
