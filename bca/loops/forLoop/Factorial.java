import java.io.*;
class Factorial{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		int ans = 1;

		for(int i = num; i> 0; i--)  ans *= i;

		System.out.print("Factorial: "+ans);
		
	}
}