import java.io.*;

class Pattern{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i<num; i++){
			for(int j = 0; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}