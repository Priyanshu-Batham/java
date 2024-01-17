import java.io.*;

class Reverse{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number to reverse: ");
		int num = Integer.parseInt(br.readLine());
		int ans = 0;
		//int temp = num;

		for(int temp = num; temp > 0;){
			int digit = temp % 10;
			ans *= 10;
			ans += digit;
			temp /= 10;
		}

		System.out.println("Reverse of "+num+ " is "+ans);
	}
}