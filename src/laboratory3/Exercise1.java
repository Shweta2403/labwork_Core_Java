package laboratory3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integers seperated by spaces");
		
		String input = sc.nextLine();
		
		int sum = 0;
		StringTokenizer st = new StringTokenizer(input, " ");
		while (st.hasMoreElements()) {
			
			String n = st.nextToken();
			System.out.println(n);
			
			sum += Integer.parseInt(n);
			
			
		}
		System.out.println("Sum equals to " + sum);
		sc.close();
		
	}

}
