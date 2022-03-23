package laboratory_1;
import java.util.Scanner;

public class Exercise3{  
public static void main(String args[])  
{    
 int x1=0,x2=1,x3,i,count=10;    
 System.out.print(x1+" "+x2);
    
 for(i=2;i<count;++i)  
 {    
  x3 =x1 + x2;    
  System.out.print(" "+ x3);    
  x1 = x2;    
  x2 = x3;    
 }    
  
}
}

//public class Exercise3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		num = sc.nextInt();
//		//Exercise3.fib_nonre(num);
//		Exercise3.fib_re(num);
//		
//	}
//	static void fib_nonre(int num) {
//		int n = num;
//		if (n <= 1) {
//			System.out.println("1");
//		}
//		else {
//			int n3=0, n1=1,n2=1;
//			for (int i=2;i<n;i++) {
//				n3 = n1 + n2;
//				n1 = n2;
//				n2 = n3;
//			}
//			System.out.println(n3);
//		}
//		
//	}
//	
//	static int fib_re(int num) {
////		int n1=1,n2=1,n3=0;
//		if (num <= 1) {
//			return 1;
//		}
//		else {
//			System.out.println( (fib_re(num-1)+fib_re(num-2)));
//			
//		}
//		
//		}
//	
//
//}
