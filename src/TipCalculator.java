import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner and Decimal Formatter
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the Tip Calculator!"); //Welcome

        System.out.print("How many people are in your group? "); // Group Size
        int groupSize =  scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? (0-100): "); //Tip Percent
        double tipPercent = (double) scan.nextInt()/100;
        scan.nextLine();

        double totalBillNoTip = 0; // Initalize Variables for the while loop
        double userInput = 0;

        while (userInput != -1) { // Make it so loop ends when -1 is entered
            totalBillNoTip += userInput;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            userInput = scan.nextDouble();
            scan.nextLine();
        }

        System.out.println("---------------------------------");

        //Calculations
        double totalTip = totalBillNoTip * tipPercent;
        double billWithTip = totalBillNoTip + totalTip;
        double perPersonCost = totalBillNoTip / groupSize;
        double tipPerPerson = totalTip/groupSize;
        double costPerPerson = perPersonCost + tipPerPerson;

        //Format all numbers to a uniform #.##
        int tipPercentd = (int) (tipPercent*100);
        String totalBillNoTipd = formatter.format(totalBillNoTip);
        String totalTipd = formatter.format(totalTip);
        String billWithTipd = formatter.format(billWithTip);
        String perPersonCostd = formatter.format(perPersonCost);
        String tipPerPersond = formatter.format(tipPerPerson);
        String costPerPersond = formatter.format(costPerPerson);

        //Print Commands to display the information
        System.out.println("Total Bill Before Tip: " + totalBillNoTipd);
        System.out.println("Tip Percentage: " + tipPercentd);
        System.out.println("Total Tip: " + totalTipd);
        System.out.println("Total Bill With Tip: " + billWithTipd);
        System.out.println("Per Person Cost Before Tip: " + perPersonCostd);
        System.out.println("Tip Per Person: " + tipPerPersond);
        System.out.println("Total Cost Per Person: " + costPerPersond);


    }
}
