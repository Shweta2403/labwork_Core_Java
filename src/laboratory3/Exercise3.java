package laboratory3;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Enter the String ..!");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(alterString(str.toCharArray()));
		sc.close();
	}
	
	static String alterString(char[] str) {
	
		
		for (int i =0;i<str.length;i++) {
			
			if (!isVowel(str[i])) {
				if (str[i] == 'z') {
					str[i] = 'b';
				}
				else {
					str[i] = (char)(str[i]+1);
					if (isVowel(str[i])) {
						str[i] = (char)(str[i] + 1);
					}
				}
			}
		}
		return String.valueOf(str);
	}
	
	static boolean isVowel(char c)
	{
		if (c!= 'a' && c!= 'e' && c!= 'i' && c!='o' && c!='u') {
			return false;
		}
		return true;
	}
}

