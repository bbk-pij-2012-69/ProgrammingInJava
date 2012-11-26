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
	public static void main(String[] args) throws NumberFormatException, IOException {
		Accounting acc = new Accounting();
		acc.launch(args);
	}

	private String readLine() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value = br.readLine();
		return value;
	}

	
	private void printSummary(){
		int count = 0;
		int totalDebt = 0;

		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
			totalDebt += current.getAmount();

		}
		System.out.println("You have " + count + " bills unpaid (total debt: " + totalDebt + ")");
	}

	private String getConcept() throws IOException{
		System.out.print(" Concept: ");
		return this.readLine();
	}

	private int getAmount() throws NumberFormatException, IOException{
		System.out.print(" Concept: ");
		return Integer.parseInt(this.readLine());
	}
	
	
	private void launch(String[] args) throws NumberFormatException, IOException {
		String concept = "";
		int amount = 0;
		do {
			System.out.println("What’s your next bill (type \"END\" to finish)?");
			concept = getConcept();
			if (!concept.equals("END")) {
				System.out.print(" Amount: ");
				amount = getAmount() ;
			}
			addBillToList(concept, amount);
		} while (!concept.equals("END"));
		
		this.printSummary();
	}
	
	
	private void addBillToList(String concept, int amount) {
		if(concept == "END")
			return;
		
		Bill bill = new Bill(concept, amount);

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
		int billCount = 2;
		
		this.addBillToList("Dentist", 61);
		this.addBillToList("MOT", 55);
		this.addBillToList("END", 0);

		int count = 0;
		for (Bill current = firstBill; current != null; current = current.getNextBill()) {
			count++;
		}

		assertEquals(count, billCount);

	}

}