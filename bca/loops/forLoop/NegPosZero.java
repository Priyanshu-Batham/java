import java.io.*;

class NegPosZero{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos = 0, neg = 0, zero = 0;
		System.out.println("Enter 5 Numbers: ");
		
		for(int i = 0; i<5; i++){
			System.out.println("Enter "+(i+1)+" number");
			int num = Integer.parseInt(br.readLine());
			if(num > 0) pos++;
			else if(num < 0) neg++;
			else zero++;
		}
		System.out.println("You have entered "+pos+" positive numbers");
		System.out.println("You have entered "+neg+" negative numbers");
		System.out.println("You have entered "+zero+" zeroes");
	}
}