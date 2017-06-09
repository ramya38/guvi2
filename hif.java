import java.util.*;
class hif
{
	public static void main(String args[])
	{
		char n;
		Scanner sc=new Scanner(System.in);
		 n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		System.out.println(n+"is vowel");
		else 
		System.out.println(n+"is constant");
	}
}
