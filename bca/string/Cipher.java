import java.io.*;
class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String str = br.readLine();
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        String alphas = "abcdefghijklmnopqrstuvwxyz";
        String res = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ') ch = alphas.charAt((ch-'a'+n)%26);
            res += ch;
        }
        System.out.print(res);
    }
}
