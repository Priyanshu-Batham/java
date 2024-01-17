import java.io.*;
class Hcf{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first number(bigger): ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Enter second number(smaller): ");
		int b = Integer.parseInt(br.readLine());
	
		do{
			int temp = a%b;
			a = b;
			b = temp;
		}while(a%b > 0);
		System.out.println("HCF or GCD: "+b);
	}
}
//temp 3
//a    12
//b    3
