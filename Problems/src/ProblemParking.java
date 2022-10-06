import java.util.Scanner;

public class ProblemParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCases = scanner.nextInt();
        int[] Answers = new int[numberOfCases];

        for(int j = 0; j < numberOfCases; j++) {
            int numberOfShops = scanner.nextInt();
            int[] positionsOfShops = new int[numberOfShops];

            int max = 0;
            int min = 100;

            for(int i = 0; i < numberOfShops; i++) {
                positionsOfShops[i] = scanner.nextInt();
                if(max < positionsOfShops[i]) {
                    max = positionsOfShops[i];
                }
                if(min > positionsOfShops[i]) {
                    min = positionsOfShops[i];
                }
            }
            Answers[j]= 2 * max - 2 * min;
        }

        for (int i = 0; i < numberOfCases; i++){
            System.out.println(Answers[i]);
        }

    }
}