import java.io.*;

class Pattern{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		int i = 0;
		do{
			int j = 0;
			do{
				System.out.print("*");
				j++;
			}while(j<i+1);

			i++;
			System.out.println();
		}while(i<num);
	}	
}