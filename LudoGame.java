/*Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when he rolls a 6 on the die.
In the current turn, Chef rolled the numberX on the die. Determine if Chef can enter a new token into the play in the current turn or not.*/
import java.util.Scanner;

public class LudoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the number rolled by Chef
            int numberRolled = scanner.nextInt();

            // Check if Chef can enter a new token
            if (numberRolled == 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
