package laboratory3;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		System.out.println("Enter the string !");
		Exercise2.getImage();
		
	}


	
	static void getImage() {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		sc.close();
		 
        StringBuffer sbr = new StringBuffer(str);
        
//        sbr.reverse();
        System.out.println(str + "|" + sbr.reverse());  
        
	}
}
