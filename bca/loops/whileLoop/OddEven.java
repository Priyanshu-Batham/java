import java.io.*;

class OddEven{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter how many Numbers: ");
		int num = Integer.parseInt(br.readLine());
		
		//this is wrong as sopl returns void
		//int a = (num%2 == 0)? System.out.println("Even") : System.out.println("Odd");
		
		//valid, ternary opr is used to assign value and we can't use it without assigning
		//int a = (num%2 == 0)? 1 : 0;
		//System.out.println(a);
		
		while(num-- > 0){
			System.out.print("Enter number: ");
			int n = Integer.parseInt(br.readLine());
			if(n % 2 == 0) System.out.println("Even");
			else System.out.println("Odd"); 
		}
	}
}