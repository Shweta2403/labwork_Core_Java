package laboratory_1;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n="";
		n = sc.next();
		n = n.toLowerCase();
		//Exercise2.lower(n);
		Exercise2.traffic(n);
	}
	static void traffic(String n) {
		switch(n) {
		case "red":
			System.out.println("STOP");
			break;
		case "yellow":
			System.out.println("READY");
			break;
		case "green":
			System.out.println("GO");
			break;
		default:
			System.out.println("Choose among red, yellow and green");
			
			
		}
	}
//	static void lower(String n) {
//		n = n.toLowerCase();
//	}
}
