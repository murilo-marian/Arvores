
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Util {
    public static int[] geraArray(int num) {
        int[] vetor = new int[num];
        for (int i = 0; i < num; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    public static int[] geraArrayInverso(int num) {
        int[] vetor = new int[num];
        for (int i = 0; i < num; i++) {
            vetor[num - 1 - i] = i;
        }
        return vetor;
    }

    public static int[] aleatorizaArray(int[] vetor)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = vetor.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = vetor[index];
            vetor[index] = vetor[i];
            vetor[i] = a;
        }
        return vetor;
    }
}
