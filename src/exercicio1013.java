import java.util.Scanner;

public class exercicio1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        int MaiorAB = (A+B+ Math.abs(A-B))/2;
        int MaiorABC = (MaiorAB + C + Math.abs(MaiorAB-C))/2;

        System.out.println(MaiorABC+" eh o maior");
        input.close();
    }
}
