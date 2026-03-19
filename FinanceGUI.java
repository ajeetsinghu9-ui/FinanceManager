import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FinanceGUI {

    static double income = 0;
    static double expense = 0;
    static ArrayList<String> transactions = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Personal Finance Manager");
        frame.setTitle("Personal Finance Manager - Desktop App");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton addIncome = new JButton("Add Income");
        JButton addExpense = new JButton("Add Expense");
        JButton summary = new JButton("Show Summary");
        JButton history = new JButton("Show Transactions");
        JButton forecast = new JButton("Forecast Expense");

        frame.add(addIncome);
        frame.add(addExpense);
        frame.add(summary);
        frame.add(history);
        frame.add(forecast);

        forecast.addActionListener(e -> {

    double predictedExpense = expense * (1 + Math.random() * 0.2);

    JOptionPane.showMessageDialog(null,
            "Predicted Next Month Expense (Approx): " + predictedExpense);
});

        addIncome.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter Income Amount");
            double inc = Double.parseDouble(input);
            income += inc;
            transactions.add("Income: " + inc);
        });

        addExpense.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter Expense Amount");
            double exp = Double.parseDouble(input);

            String category = JOptionPane.showInputDialog("Enter Category (Food/Travel/Shopping)");

            expense += exp;
            transactions.add("Expense: " + exp + " | Category: " + category);
        });

        summary.addActionListener(e -> {
            double balance = income - expense;
            JOptionPane.showMessageDialog(null,
                    "Total Income: " + income +
                    "\nTotal Expense: " + expense +
                    "\nBalance: " + balance);
        });

        history.addActionListener(e -> {
            String all = "";
            for(String t : transactions){
                all += t + "\n";
            }
            JOptionPane.showMessageDialog(null, all);
        });

        frame.setVisible(true);
    }
}
 