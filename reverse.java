package strings;
import java.util.*;
public class reverse {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=new String();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("the reversed string is: ");
		System.out.println(rev);
		
		
	}
}
