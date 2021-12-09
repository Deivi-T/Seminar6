import java.util.Random;
import java.util.Arrays;

// 10. Ndërtoni një program që gjeneron 20 numra rasti me vlerë midis 0 dhe 99 në një tabelë. Programi
// afishon sekuencën, i rendit ato dhe më pas afishon sekuencën e renditur. Përdorni metodën sort nga
// libraria e Javës.

public class Ex10 {
    public static void main(String[] args){
        int length = 20;
        int[] table = new int[length];
        random(length, table);
        tableOutput(length, table);
        Arrays.sort(table);
        tableOutput(length, table);
    }

    public static void random(int n, int[] table){
        Random random = new Random();
        for(int i = 0; i < n; i++){
            table[i] = random.nextInt(100);
        }
    }
    public static void tableOutput(int n, int[] table){
        System.out.print("Elementet e tabeles jane: ");
        for(int i = 0; i < n; i++){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
}
