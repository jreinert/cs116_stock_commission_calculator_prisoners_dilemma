/* Description: Prisoner's dilemma game that reads input from 2 players and determines prison terms for one or both players depending on responses (confession)
 * Name: Jeremy Reinert
 * Date: 10/16/2018
 * Version: 1.0
 * 
 * Integer values: 0 for confession and 1 for no confession
 * 
 * STEP 1: Read user input from player 1 and store confession as int in player1Confession
 * STEP 2: Read user input from player 2 and store confession as int in player2Confession
 * STEP 3: Determine if one or both players confessed and print prison sentence to the console
 */

// Import Java scanner library
import java.util.Scanner;
public class Q2_PrisonersDilemmaGame {

	public static void main(String[] args) {
		// Declare variables
		Scanner input = new Scanner(System.in);
		int player1Confession, player2Confession;
		
		// STEP 1: Read user input from player 1 and store confession as int in player1Confession
		System.out.println("Player 1, you and another member of your crimminal gang have been arrested. The prosecutors lack sufficient evidence to convict you both.");
		System.out.println("If one of you, but not the other confesses, the one who confesses will go free and the other will get 10 years in prison.");
		System.out.println("If neither of you confess, you both will get 1 year in prison.");
		System.out.println("If both of you confess, you both get 5 years in prison.");
		System.out.println("Without knowing how the other member of your crimminal gang has answered, do you confess?");
		System.out.println("Please enter 0 to confess to the crime and 1 to not confess to the crime.");
		player1Confession = input.nextInt();
		
		// STEP 2: Read user input from player 1 and store confession as int in player1Confession
		System.out.println("Player 2, you and another member of your crimminal gang have been arrested. The prosecutors lack sufficient evidence to convict you both.");
		System.out.println("If one of you, but not the other confesses, the one who confesses will go free and the other will get 10 years in prison.");
		System.out.println("If neither of you confess, you both will get 1 year in prison.");
		System.out.println("If both of you confess, you both get 5 years in prison.");
		System.out.println("Without knowing how the other member of your crimminal gang has answered, do you confess?");
		System.out.println("Please enter 0 to confess to the crime and 1 to not confess to the crime.");
		player2Confession = input.nextInt();
		
		// STEP 3: Determine if one or both players confessed and print prison sentence to the console
		if (player1Confession == 0 ^ player2Confession == 0) {
			if (player1Confession == 0 && player2Confession == 1) {
				System.out.println("Player 1 confessed and goes free.");
				System.out.println("Player 2 gets 10 years in prison.");
			}
			else if (player1Confession == 1 && player2Confession == 0) {
				System.out.println("Player 2 confessed and goes free.");
				System.out.println("Player 1 gets 10 years in prison.");
			}
			else {
				System.out.println("One or both of the players did not enter a valid response (0 or 1). Please retry and enter a valid response.");
			}
		} 
		else if (player1Confession == 0 && player2Confession == 0) {
			System.out.println("Both players confessed and each get 5 years in prison.");
		}
		else if (player1Confession == 1 && player2Confession == 1) {
			System.out.println("Neither player confessed and each get 1 year in prison.");
		}
		else if (player1Confession < 0 || player1Confession > 1 || player2Confession < 0 || player2Confession > 0) {
			System.out.println("One or both of the players did not enter a valid response (0 or 1). Please retry and enter a valid response.");
		}
		
		// Close input scanner
		input.close();
	}

}
