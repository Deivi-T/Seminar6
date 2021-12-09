import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Madhesia e tabeles: ");
        int n = sc.nextInt();
        int[] table = new int[n];

        tableInput(n, table);
        tableOutput(n, table);
        outputReverse(n, table);

        sc.close();
    }
    public static void tableInput(int n, int[] table){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Jepni elementin e " +(i+1));
            table[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void tableOutput(int n, int[] table){
        System.out.print("Elementet e tabeles jane: ");
        for(int i = 0; i < n; i++){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
    public static void outputReverse(int n, int[] table){
        System.out.print("Elementet e tabeles mbrapsht jane: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
}
