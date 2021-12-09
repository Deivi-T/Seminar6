import java.util.Scanner;

// 4. Ndërtoni një metodë që merr si parametër një tabelë dhe heq vlerën më të vogël nga një tabelë e
// mbushur pjesërisht. Testoni metodën.

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int length = 1000;
        int[] table = new int[length];
        int currentSize = 0;
        System.out.println("Jepni vlera te tabeles: ");
        while(sc.hasNextInt()){
            if(currentSize < length){
                table[currentSize] = sc.nextInt();
                currentSize++;
            }
        }
        tableOutput(currentSize, table);
        remSmallest(currentSize, table);
        sc.close();
    }
    
    public static void tableOutput(int n, int[] table){
        System.out.print("Elementet e tabeles jane: ");
        for(int i = 0; i < n; i++){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
    public static void remSmallest(int n,  int[] table){
        int pos = 0;
        for(int i = 1; i < n; i++){
            if(table[i] < table[0]){
                pos = i;
            }
        }
        for(int i = pos; i < n - 1; i++){
            table[i] = table[i+1];
        }
        tableOutput(n - 1, table);
    }
}
