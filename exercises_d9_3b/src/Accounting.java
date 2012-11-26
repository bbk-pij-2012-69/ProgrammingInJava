import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * A program for simple personal accounting.
 *
 * Asks the users about their bills, and then
 * says how many bills there are, and what is the
 * total debt.
 */
public class Accounting {
	/**
	 * The first element of the list of bills
	 */
	private Bill firstBill = null;
	private boolean testing = false;
	private int billCount = 0;
	
	public static void main(String[] args) throws IOException {
		Accounting acc = new Accounting();
		acc.launch(args);
	}
	
	private String readLine() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		return value;
	}
	private void launch(String[] args) throws IOException {
		String concept = "";
		int amount = 0;
		do {
			System.out.println("What’s your next bill (type \"END\" to finish)?");
			System.out.print(" Concept: ");
			concept = this.readLine();
			
			if (!concept.equals("END")) {
				if(this.testing) ++billCount;
				
				System.out.print(" Amount: ");
				String strAmount = this.readLine();
				amount = Integer.parseInt(strAmount);
				Bill newBill = new Bill(concept, amount);
				addBillToList(newBill);
			}
		} while (!concept.equals("END"));
		
		int count = 0;
		int totalDebt = 0;
		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
			totalDebt += current.getAmount();
		}
		System.out.println("You have " + count + " bills unpaid (total debt: " + totalDebt + ")");
	}
	
	private void addBillToList(Bill bill) {
		if (firstBill == null) {
			firstBill = bill;
			return;
		}
		Bill current = firstBill;
		while (current != null) {
			if (current.getNextBill() == null) {
				current.setNextBill(bill);
				return;
			}
			current = current.getNextBill();
		}
		return;
	}

	@Test
	public void testLaunch() throws IOException
	{
		testing = true;
		this.launch(new String[1]);
		
		int count = 0;
		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
		}
		
		assertEquals(count, this.billCount);

	}

}