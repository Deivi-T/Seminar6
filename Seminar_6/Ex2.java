import java.util.Random;

// Ndërtoni një program që inicializon një tabelë me dhjetë elementë numra random me vlerë nga 1
// deri në 10 dhe afishon:
// a) Elementët në pozion çift
// b) Të gjithë elementët në pozicion të kundërt
// c) Elementin e parë dhe elementin e fundit

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] table = new int[n];
        for(int i = 0; i < n; i++){
            table[i] = random.nextInt(11-1)+1;
        }
        System.out.print("Elementet ne pozicionin e fillestar jane: ");
        for(int i = 0; i < n; i++){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
        
        pozCift(n, table);
        pozKundert(n, table);
        System.out.println("Elementi i pare: " +table[0]);
        System.out.println("Elementi i fundit: " +table[n-1]);
    }
    
    public static void pozCift(int n, int[] table){ //a
        System.out.print("Elementet ne pozicionin cift jane: ");
        for(int i = 0; i < n; i += 2){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
    public static void pozKundert(int n, int[] table){ //b
        System.out.print("Elementet ne pozicionin e kundert jane: ");
        for(int i = n-1; i >= 0; i--){
            System.out.print(table[i]+ " ");
        }
        System.out.println();
    }
}
