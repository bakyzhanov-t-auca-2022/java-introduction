import java.util.Scanner;

public class ProblemSumOfRightHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();

            if(i >= n/2){
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
