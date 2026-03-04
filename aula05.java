import java.util.Random;

public class aula05 {

    public static Random random = new Random();

    public static void main(String[] args) {

        int[] vetor = new int[100];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(30) + 1; // 1 a 30
        }
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        System.out.print("{");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.println("Média dos valores: " + media);
    }
}