import java.util.Scanner;

// 5. Ndërtoni një program që llogarit shumën alternative të elementëve në tabelë. Për shembull nëse
// programi lexon elementët 1 4 9 16 9 atëhërë do të llogarisë vlerën 1 – 4 + 9 – 16 + 9. //per kete array del -1

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jpeni numrin e elementeve te tabeles: ");
        int n = sc.nextInt();
        int[] table = new int[n];
        tableInput(n, table);
        tableOutput(n, table);
        System.out.println("Shuma e alternuar e elementeve te tabeles eshte: " +altSum(n, table));

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
    public static int altSum(int n, int[] table){
        int sum = 0;
        int sign = 1;
        for(int i = 0; i < n; i++){
            sum = sum + (sign * table[i]);
            sign *= -1;
        }
        return sum;
    }
}
