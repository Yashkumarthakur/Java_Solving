package practice_codes.paypal;

import static java.lang.System.out;

import java.text.DecimalFormat;

/*
 * CHALLENGE DESCRIPTION:
 * The goal of this challenge is to design a cash register program. 
 * You will be given two float numbers. 
 * The first is the purchase price (PP) of the item. The second is the cash (CH) given by the customer. 
 * Your register currently has the following bills/coins within it:
 * 'PENNY': .01,
 * 'NICKEL': .05,
 * 'DIME': .10,
 * 'QUARTER': .25,
 * 'HALF DOLLAR': .50,
 * 'ONE': 1.00,
 * 'TWO': 2.00,
 * 'FIVE': 5.00,
 * 'TEN': 10.00,
 * 'TWENTY': 20.00,
 * 'FIFTY': 50.00,
 * 'ONE HUNDRED': 100.00
 * The aim of the program is to calculate the change that has to be returned to the customer.
 * 
 * INPUT SAMPLE:
 * 15.94;16.00
 * OUTPUT SAMPLE:
 * NICKEL,PENNY
 * 
 * INPUT SAMPLE:
 * 17;16
 * OUTPUT SAMPLE:
 * ERROR
 * 
 * INPUT SAMPLE:
 * 35;35
 * OUTPUT SAMPLE:
 * ZERO
 * 
 * INPUT SAMPLE:
 * 45;50
 * OUTPUT SAMPLE:
 * FIVE
*/
public class CashRegister {

	// if accept input from file , filescanner
	/**
	 * public static void main(String[] args) { File file = new File(args[0]);
	 * Scanner fileScanner = new Scanner(file);
	 * 
	 * while(fileScanner.hasNextLine()){ String line = fileScanner.nextLine();
	 * if(!line.equalsIgnoreCase("")){ String elements[] = line.split(";"); float
	 * price = Float.parseFloat(elements[0]); float cash =
	 * Float.parseFloat(elements[1]); double change = cash - price;
	 * 
	 * if(change < 0){ System.out.println("ERROR"); }else if(change == 0){
	 * System.out.println("ZERO"); }else{ System.out.println(findChange(change)); }
	 * } } fileScanner.close(); }
	 */

	public static void main(String[] args) {
		float price = Float.parseFloat("17");
		float cash = Float.parseFloat("16");
		callCashRegister(price, cash);
	}

	protected static String callCashRegister(float price, float cash) {
		out.println("Given Data:");
		out.println("price : " + price);
		out.println("cash : " + cash);
		String result = cashRegister(price, cash);
		out.println("Result change is :" + result);
		return result;

	}

	private static String cashRegister(float price, float cash) {
		double change = cash - price;
		if (change < 0) {
			return "ERROR";
		} else if (change == 0) {
			return "ZERO";
		} else {
			return findChange(change);
		}
	}

	private static String findChange(double change) {

		String textChange = "";

		DecimalFormat df = new DecimalFormat("########.##");
		int intChange = (int) (Double.valueOf(df.format(change)) * 100);

		while (intChange >= 0.01) {
			if (intChange >= 10000) {
				textChange += "ONE HUNDRED,";
				intChange -= 10000;
			} else if (intChange >= 5000) {
				textChange += "FIFTY,";
				intChange -= 5000;
			} else if (intChange >= 2000) {
				textChange += "TWENTY,";
				intChange -= 2000;
			} else if (intChange >= 1000) {
				textChange += "TEN,";
				intChange -= 1000;
			} else if (intChange >= 500) {
				textChange += "FIVE,";
				intChange -= 500;
			} else if (intChange >= 200) {
				textChange += "TWO,";
				intChange -= 200;
			} else if (intChange >= 100) {
				textChange += "ONE,";
				intChange -= 100;
			} else if (intChange >= 50) {
				textChange += "HALF DOLLAR,";
				intChange -= 50;
			} else if (intChange >= 25) {
				textChange += "QUARTER,";
				intChange -= 25;
			} else if (intChange >= 10) {
				textChange += "DIME,";
				intChange -= 10;
			} else if (intChange >= 5) {
				textChange += "NICKEL,";
				intChange -= 5;
			} else if (intChange >= 1) {
				textChange += "PENNY,";
				intChange -= 1;
			}
		}
		return textChange.substring(0, textChange.length() - 1);
	}
}
