import java.util.Random;

// Ndërtoni një program që gjeneron një sekuencë prej 20 numra rasti hedhjesh zari dhe afishon
// vlerat duke vendosur në kllapa numrat që përsëriten si më poshtë:
// 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1.

//check later

public class Ex9 {
    public static void main(String[] args){
        int length = 20;
        int[] table = new int[length];
        diceThrows(length, table);
        tableOutput(length, table);
        duplicate(length, table);
    }
    public static void diceThrows(int n, int[] table){
        Random random = new Random();
        for(int i = 0; i < n; i++){
            table[i] = random.nextInt(7);
        }
    }
    public static void tableOutput(int n, int[] table){
        System.out.print("Elementet e tabeles jane: ");
        for(int i = 0; i < n; i++){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
    public static void duplicate(int n, int[] table){
        for(int i = 0; i < n - 1 ; i++){
            //int temp = table[i];
            if(table[i] == table[i+1]){
                System.out.print("(" +table[i]);
                for(int j = i + 1; j < n; j++){
                    if(table[j] == table[i]){
                        System.out.print(table[j]);
                    }
                }
            }
        }
    }
}
