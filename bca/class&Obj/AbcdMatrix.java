import java.util.*;
class AbcdMatrix{
    static char mat[][];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        int letterIndex = 0;
        mat = new char[n][n];

        for(int i = 0; i<n; i++){
            //if even we go Right -->
            if((i & 1) == 0){
                for(int j = 0; j<n; j++){
                    char ch = alphas.charAt(letterIndex++);
                    letterIndex %= 26;
                    mat[i][j] = (j&1) == 0? ch: Character.toUpperCase(ch);
                }
            }
            // odd so we go left <----
            else{
                for(int j = n-1; j>=0; j--){
                    char ch = alphas.charAt(letterIndex++);
                    letterIndex %= 26;
                    mat[i][j] = (j&1) == 1? ch: Character.toUpperCase(ch);
                }
            }
        }
        //display
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}