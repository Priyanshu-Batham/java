import java.io.*;
class Factorial{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		int ans = 1;
		int i = num;

		do{
			ans *= i;
			i--;
		}while(i > 0);

		System.out.print("Factorial: "+ans);
		
	}
}