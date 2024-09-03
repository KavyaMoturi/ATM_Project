import java.util.Scanner;

public class ATM {

    // Initialising the balance amount as 0.
    private static float balanceAmount = 0.0f;

    public static void main(String[] args) {
        atmMachineTransaction();
        System.out.println("Thank you for the visit!");
    }

    // Function for operations in ATM Machine
    private static void atmMachineTransaction() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choices Available in the ATM Machine");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Balance Amount");
            System.out.println();

            // Take an appropriate option to select which operation
            System.out.print("Your option: ");
            int option = scanner.nextInt();

            float withdrawAmount;
            float depositAmount;

            switch (option) {
                // Case for Depositing money
                case 1:
                    System.out.print("\nEnter the amount to deposit: ");
                    depositAmount = scanner.nextFloat();
                    balanceAmount += depositAmount;

                    System.out.println("Your current balance is Rs. " + balanceAmount + ". Thanks for depositing!");
                    break;

                // Case for Money Withdrawal
                case 2:
                    System.out.print("\nPlease enter amount to withdraw: ");
                    withdrawAmount = scanner.nextFloat();
                    if (withdrawAmount > balanceAmount) {
                        System.out.println("Insufficient funds! Please proceed to deposit money.");
                    } else {
                        balanceAmount -= withdrawAmount;
                        System.out.println("You have withdrawn Rs. " + withdrawAmount + " and your balance is Rs. " + balanceAmount);
                    }
                    break;

                // Case for checking current bank amount
                case 3:
                    System.out.println("Your current bank balance is: " + balanceAmount);
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }

            System.out.println("Do you want a new transaction? Press 1 to 'proceed' and 2 to 'exit' from here");
            System.out.print("Your option: ");
            int newTransaction = scanner.nextInt();
            if (newTransaction == 2) {
                break; // Exit the loop and end the program
            }
        }

        scanner.close();
    }
}
