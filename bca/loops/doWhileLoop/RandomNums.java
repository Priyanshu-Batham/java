import java.io.*;
import java.util.Random;

class RandomNums{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		
		System.out.print("Enter a how many Numbers: ");
		int n = Integer.parseInt(br.readLine());
		
		do{
			System.out.println(rand.nextInt(5));
		}while(--n > 0);
	}
}