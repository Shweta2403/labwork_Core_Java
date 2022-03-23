package laboratory3;
import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(checkOrder(input));
		sc.close();
		
		
	}
	/// abcd
	// 4
	// ch1 = b ch2 = a
	// diff =1
	// abcd
	public static boolean checkOrder(String input) {
	    boolean ans = true;
	    for (int i = 1; i<input.length(); i++) {
	    	char ch1 = input.charAt(i);
	    	char ch2 = input.charAt(i-1);
	    	int diff = ch1-ch2;
	    	
	    	if (diff < 0) {
	    		ans = false;
	    		break;
	    }
	    	
	    	else 
	    		ans = true;
	    	
	    	//System.out.println(ch1-ch2);
	    	
	    }
		return ans;
	}

}
