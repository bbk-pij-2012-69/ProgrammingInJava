import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class run {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		enterMarks();

	}
	
	public static void enterMarks() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mark, dist = 0, pass = 0, fail = 0, invalid = 0;
		do{
			System.out.print("Input a mark: ");
			mark = new Integer(br.readLine());
			
			if(mark <= 100 && mark > 69)
				++dist;
			else if(mark > 49 && mark < 70)
				++pass;
			else if (mark > 0 && mark < 50)
				++fail;
			else if(mark != -1)
				++invalid;
				
		}while(mark != -1);
		
		System.out.print("There are " + (dist + pass + fail) +  " students: ");
		System.out.print(dist + " distinctions, ");
		System.out.print(pass + " pass, ");
		System.out.print(fail + " fails ");
		System.out.println("(plus " + invalid + " invalid)");
		
	}


}
