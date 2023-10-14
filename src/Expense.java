import java.util.Scanner; // Scanner allows user input to be scanned and used.
import java.util.ArrayList; //ArrayList allows for changeable array.
public class Expense {
    public static void groceries() {
    ArrayList<Double> groceryExpenses = new ArrayList<Double>();
        Scanner myObj = new Scanner(System.in); // User inputs are stored in the myObj variable.
        System.out.println("Please enter your desired grocery budget.");

        Integer gBudget = myObj.nextInt(); //get grocery budget from user
        System.out.println("Your grocery budget is:$" + gBudget);

        System.out.println("Please enter your grocery expenses.");
        Double gExpense1 = myObj.nextDouble();
        groceryExpenses.add(gExpense1);
        System.out.println("Please enter another grocery expense. 1 for Yes/ 6 for No. If you have no more expenses please enter 0.");
        Integer answer = myObj.nextInt();

        while (answer < 6){ // get expense if the user has more than one. Will continue to loop until 5 expenses are added.
            System.out.println("Please enter your grocery expenses.");
            Double gExpense = myObj.nextDouble();
            groceryExpenses.add(gExpense);
            answer++;
        }
        System.out.println("Your grocery expenses were:" + groceryExpenses);

        Double sum = 0.0;
        for (double expenses : groceryExpenses){
            sum += expenses;
        }

        System.out.println("The sum of your grocery expenses is: $" + sum); //sum of total grocery expenses

        if (sum > gBudget){ //compare desired budget and sum of expenses.
            System.out.println("Try reducing you grocery expenses next month.");
        }

        else {
            System.out.println("Good job staying under budget!");
        }

    }

    public static void housing() { //method for housing expenses. Runs the same as grocery method.
        ArrayList<Double> housingExpenses = new ArrayList<Double>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your desired housing budget.");

        Integer hBudget = myObj.nextInt();
        System.out.println("Your housing budget is:$" + hBudget);

        System.out.println("Please enter your housing expenses.");
        Double hExpense1 = myObj.nextDouble();
        housingExpenses.add(hExpense1);
        System.out.println("Please enter another housing expense. 1 for Yes/ 6 for No. If you have no more expenses please enter 0.");
        Integer answer = myObj.nextInt();

        while (answer < 6){
            System.out.println("Please enter your housing expenses.");
            Double hExpense = myObj.nextDouble();
            housingExpenses.add(hExpense);
            answer++;
        }
        System.out.println("Your grocery expenses were:" + housingExpenses);

        Double sum = 0.0;
        for (double expenses : housingExpenses){
            sum += expenses;
        }

        System.out.println("The sum of your housing expenses is: $" + sum);

        if (sum > hBudget){
            System.out.println("Try reducing you housing expenses next month.");
        }

        else {
            System.out.println("Good job staying under budget!");
        }

    }

    public static void utilities() { // method for utility expense. Runs the same as grocery method
        ArrayList<Double> utilityExpenses = new ArrayList<Double>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your desired utility budget.");

        Integer uBudget = myObj.nextInt();
        System.out.println("Your utility budget is:$" + uBudget);

        System.out.println("Please enter your utility expenses.");
        Double uExpense1 = myObj.nextDouble();
        utilityExpenses.add(uExpense1);
        System.out.println("Please enter another utility expense. 1 for Yes/ 6 for No. If you have no more expenses please enter 0.");
        Integer answer = myObj.nextInt();

        while (answer < 6){
            System.out.println("Please enter your utility expenses.");
            Double uExpense = myObj.nextDouble();
            utilityExpenses.add(uExpense);
            answer++;
        }
        System.out.println("Your utility expenses were:" + utilityExpenses);

        Double sum = 0.0;
        for (double expenses : utilityExpenses){
            sum += expenses;
        }

        System.out.println("The sum of your utility expenses is: $" + sum);

        if (sum > uBudget){
            System.out.println("Try reducing you utility expenses next month.");
        }

        else {
            System.out.println("Good job staying under budget!");
        }

    }

    public static void entertainment() { //method for entertainment expenses. Runs the same as grocery method.
        ArrayList<Double> entertainmentExpenses = new ArrayList<Double>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your desired entertainment budget.");

        Integer eBudget = myObj.nextInt();
        System.out.println("Your entertainment budget is:$" + eBudget);

        System.out.println("Please enter your entertainment expenses.");
        Double eExpense1 = myObj.nextDouble();
        entertainmentExpenses.add(eExpense1);
        System.out.println("Please enter another entertainment expense. 1 for Yes/ 6 for No. If you have no more expenses please enter 0.");
        Integer answer = myObj.nextInt();

        while (answer < 6){
            System.out.println("Please enter your entertainment expenses.");
            Double eExpense = myObj.nextDouble();
            entertainmentExpenses.add(eExpense);
            answer++;
        }
        System.out.println("Your entertainment expenses were:" + entertainmentExpenses);

        Double sum = 0.0;
        for (double expenses : entertainmentExpenses){
            sum += expenses;
        }

        System.out.println("The sum of your entertainment expenses is: $" + sum);

        if (sum > eBudget){
            System.out.println("Try reducing you entertainment expenses next month.");
        }

        else {
            System.out.println("Good job staying under budget!");
        }

    }

    public static void miscellaneous () { //method for miscellaneous expense. Runs the same as Grocery and other methods.
        ArrayList<Double> miscExpenses = new ArrayList<Double>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your desired miscellaneous budget.");

        Integer mBudget = myObj.nextInt();
        System.out.println("Your miscellaneous budget is:$" + mBudget);

        System.out.println("Please enter your miscellaneous expenses.");
        Double mExpense1 = myObj.nextDouble();
        miscExpenses.add(mExpense1);
        System.out.println("Please enter another miscellaneous expense. 1 for Yes/ 6 for No. If you have no more expenses please enter 0.");
        Integer answer = myObj.nextInt();

        while (answer < 6){
            System.out.println("Please enter your miscellaneous expenses.");
            Double mExpense = myObj.nextDouble();
            miscExpenses.add(mExpense);
            answer++;
        }
        System.out.println("Your miscellaneous expenses were:" + miscExpenses);

        Double sum = 0.0;
        for (double expenses : miscExpenses){
            sum += expenses;
        }

        System.out.println("The sum of your miscellaneous expenses is: $" + sum);

        if (sum > mBudget){
            System.out.println("Try reducing you miscellaneous expenses next month.");
        }

        else {
            System.out.println("Good job staying under budget!");
        }
        //Other methods for other expense could be added very easily. Menu would have to be changed as well.
    }
}