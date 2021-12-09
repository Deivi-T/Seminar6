//import java.util.Scanner;
import java.util.Random;
//import java.lang.Math;
//import java.util.concurrent.ThreadLocalRandom;

// Ndërtoni një program që mbush tabelën me 10 numra të rastësishëm të ndryshëm midis 1 dhe
// 100.

public class Ex1{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = 10;
        int[] table = new int[n];
        for(int i = 0; i < n ; i++){
            table[i] = random.nextInt(101);
            //table[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
            //table[i] = ThreadLocalRandom.current().nextInt(0 , 101);
            System.out.println(table[i]);
        }
        //sc.close();
    }
}