/* Description: Reads input for the value of a stock sale, calculates commission based on the value of the sale, and then displays the commission
 * Author: Jeremy Reinert
 * Date: 10/16/2018
 * Version: 1.0
 * 
 * STEP 1: Read user input for value of stock sale
 * STEP 2: Calculate commission based on value of stock sale and display commission to console:
 * 	Stock Sale		Commission
 * 	<100			30
 * 	100 - 999		30 + (.02 * valueOfStockSale)
 * 	1000 - 9999		30 + (.01 * valueOfStockSale)
 * 	10000 - 99999	30 + (.005 * valueOfStockSale)
 * 
 */

//Import Java scanner library
import java.util.Scanner;
public class Q1_StockCommissionCalculator {

	public static void main(String[] args) {
		// Variable declaration
		Scanner input = new Scanner(System.in);
		double commission, valueOfStockSale;
		
		// Initialize commission to base value of 30
		commission = 30;
		
		// STEP 1: Read user input for value of stock sale
		System.out.println("Please enter the value of the stock sale: ");
		valueOfStockSale = input.nextDouble();
		
		// STEP2: Calculate commission and display commission to console
		if (valueOfStockSale < 100) {
			System.out.println("The commission on the sale is " + "$"+commission);
		}
		else if (valueOfStockSale >= 100 && valueOfStockSale < 1000) {
			commission += (.02 * valueOfStockSale);
			System.out.println("The commission on the sale is " + "$"+commission);
		}
		else if (valueOfStockSale >= 1000 && valueOfStockSale < 10000) {
			commission = 40 + (.01 * valueOfStockSale);
			System.out.println("The commission on the sale is " + "$"+commission);
		}
		else if (valueOfStockSale >= 10000 && valueOfStockSale < 100000) {
			commission = 75 + (.005 * valueOfStockSale);
			System.out.println("The commission on the sale is " + "$"+commission);
		}
		else {
			System.out.println("Please enter a valid stock sale of less than $100,000");
		}
		
		// Close input
		input.close();
		
	}

}
