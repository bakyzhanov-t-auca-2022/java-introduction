import java.util.Scanner;

public class ProblemMario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int k = 0; k<q; k++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }

            int h = 0;
            int l = 0;

            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    h = h + 1;
                }
                else if (a[j] > a[j + 1]) {
                    l = l + 1;
                }
            }
            int w = k+1;
            System.out.print("\nCase " + w + ": " + h + " " + l);
        }
    }
}
