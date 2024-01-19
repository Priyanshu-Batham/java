import java.io.*;
import java.util.Random;

class RandomNums{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		
		System.out.print("Enter how many Numbers: ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++){
			System.out.println(rand.nextInt(5));
		}
	}
}