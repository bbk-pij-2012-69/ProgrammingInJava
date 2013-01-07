
public class Comparator {
//	Original
//	public int getMax(int n, int m) {
//	if (n > m) {
//		return n;
//	} else {
//		return m;
//	}
//}
//public double getMax(double d1, double d2) {
//	if (d1 > d2) {
//		return d1;
//	} else {
//		return d2;
//	}
//}
//public String getMax(String number1, String number2) {
//	int n1 = Integer.parseInt(number1);
//	int n2 = Integer.parseInt(number2);
//	if (n1 > n2) {
//		return number1;
//	} else {
//		return number2;
//	}
//}

	public int getMax(int n, int m) {
		return (int) this.getMax((double)n, (double)m);
	}
	
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public String getMax(String number1, String number2) {
		return String.valueOf(getMax(Integer.parseInt(number1), Integer.parseInt(number2)));
	}

	public static void main(String[] args) {
		Comparator comparator = new Comparator();
			
		System.out.println(comparator.getMax(1,2));

		System.out.println(comparator.getMax(1.456,2.68796));

		System.out.println(comparator.getMax("1","2"));


	}

}
