package laboratory3;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(modifyNumber(n));
		sc.close();
		
	}
	
	
	
	//4562=1142
	
	public static int modifyNumber(int n) {
		String s = String.valueOf(n);
		String ans = "";
		for(int i=1;i<s.length();i++) {
			char ch1 = s.charAt(i-1);
			char ch2 = s.charAt(i);
			int diff = Math.abs(ch1 - ch2);
			ans = ans + diff;	
			
		}
		ans = ans + s.charAt(s.length()-1);
		return Integer.valueOf(ans);
	}
}
