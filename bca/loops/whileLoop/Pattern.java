import java.io.*;

class Pattern{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		int i = 0;
		while(i<num){
			int j = 0;
			while(j<i+1){
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}	
}