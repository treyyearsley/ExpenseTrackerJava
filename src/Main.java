import java.util.Scanner; //allows user inputs

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // declare myObj to allow user input to be stored as a variable

        //Give user menu options to choose from.
        System.out.println("Please enter an expense Category number");
        System.out.println("1. Groceries");
        System.out.println("2. Housing");
        System.out.println("3. Utilities");
        System.out.println("4. Entertainment");
        System.out.println("5. Miscellaneous");

        Integer menuChoice = myObj.nextInt();

        //If statement will run different functions based on user input
        if (menuChoice == 1){
            Expense.groceries();
        }
        else if (menuChoice == 2) {
            Expense.housing();
        }
        else if (menuChoice == 3) {
            Expense.utilities();
        }
        else if (menuChoice == 4) {
            Expense.entertainment();
        }
        else if (menuChoice == 5) {
            Expense.miscellaneous();
        }
        //Let the user know if they didn't enter a valid menu option.
        else {
            System.out.println("Please enter a valid menu option.");
        }
    }
}