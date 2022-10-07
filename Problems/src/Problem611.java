import java.util.Scanner;

public class Problem611 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counter = new int[n];
        for(int j = 0; j < n; j++){
            counter[j] = 0;
        }
        String[] letter = new String[n];
        String[] word = new String[n];

        for(int i = 0; i < n; i++){
             letter[i] = scanner.next();
             word[i] = scanner.nextLine();

             for(int j = 0; j < word[i].length(); j++){
                if(letter[i].charAt(0) == word[i].charAt(j)){
                    counter[i] += 1;
                }
             }
        }

       for(int i = 1; i <= n; i++){
           System.out.println(counter[n - i] + " " + letter[n - i] + " in" + word[n - i]);
       }
    }
}
