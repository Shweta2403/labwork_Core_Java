
package laboratory_1; 
import java.util.Scanner;


public class Exercise_1 {
	public static void main(String[] args) {
		int n, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		result = Exercise_1.calsum(n);
		System.out.println(result);
		
		
	}
	
	static int calsum(int n) {
		
		int temp, last=0, sum=0;
		temp = n;
		while(temp!=0)
		{
			last = temp % 10;
			sum += last*last*last;
			temp = temp/10;
		}
		return sum;
		
		
	}

}
