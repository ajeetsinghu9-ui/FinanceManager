import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static double income = 0;
    static double expense = 0;
    static ArrayList<String> transactions = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n==== Personal Finance Manager ====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Show Summary");
            System.out.println("4. Exit");
            System.out.println("5. Show Transactions");
            System.out.println("6. Forecast Expense");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter income amount: ");
                    double inc = sc.nextDouble();
                    income += inc;
                    transactions.add("Income: " + inc);
                    break;

                case 2:
                    System.out.print("Enter expense amount: ");
    double exp = sc.nextDouble();

    sc.nextLine(); // buffer clear

    System.out.print("Enter category (Food/Travel/Shopping): ");
    String category = sc.nextLine();

    expense += exp;

    transactions.add("Expense: " + exp + " | Category: " + category);

    break;

                case 3:
                    showSummary();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                case 5:
                    System.out.println("\nTransaction History:");
                    for(String t : transactions){
                        System.out.println(t);
                    }
                    break;

                case 6:
    forecastExpense();
    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void showSummary(){

        double balance = income - expense;

        System.out.println("\nTotal Income: " + income);
        System.out.println("Total Expense: " + expense);
        System.out.println("Remaining Balance: " + balance);
    }

static void forecastExpense(){

    double predictedExpense = expense * 1.1;

    System.out.println("\nPredicted Next Month Expense: " + predictedExpense);
}
}