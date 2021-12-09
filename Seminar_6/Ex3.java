import java.util.Scanner;

// 3. Ndërtoni metodat e mëposhtme të cilat marrin si paramentër një tabelë dhe :

// b. Zëvendëson elementin e parë me të fundit
// c. Sposton të gjithë elementët në të djathtë, ndërsa elementin e fundit e vendos në fillim si
// për shembull tabela 1 4 9 16 25 do të transformohet në 25 1 4 9 16 25
// d. Heq elementin e mesit nëse numri i elementëve të tabelës është tek ose dy elementët e
// mesit nëse tabela ka numër çift elementësh
// e. Kthen numrin e dytë më të madh në tabelë
// f. Kthen true nëse tabela është e renditur në rendin rritës
// g. Kthen true nëse tabela përban dy elementë fqinjë të dublikuar
// h. Kthen true nëse tabela përmban elementë të dublikuar

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Madhesia e tableses: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] table = new int[n];
        tableInput(n, table);
        tableOutput(n, table);
        //fillimFund(n, table); //b
        //tableOutput(n, table);
        // spostoDjathas(n, table); //c
        // tableOutput(n, table);
        // if(n % 2 ==0){ //d
        //     remMiddleCift(n, table);
        //     tableOutput(n - 2, table);
        // }
        // else{
        //     remMiddleTek(n, table);
        //     tableOutput(n - 1, table);
        // }
        // System.out.println("Elementi i dyte me i madh ne tabele eshte: " +SecondLargest(n, table)); //e
        // System.out.println("Tabela eshte renditur ne rendit rrites: " +sorted(n, table)); //f
        //System.out.println("Tabela permban 2 element fqinj me vlere te njejte: " +elmFqinj(n, table)); //g
        System.out.println("Tabela permban 2 element me vlere te njejte: " +elmBarabarte(n, table)); //h
        
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
    public static void fillimFund(int n, int[] table){ //b
        int temp = table[0];
        table[0] = table[n-1];
        table[n-1] = temp;
    }
    public static void spostoDjathas(int n, int[] table){ //c
        int lastEm = table[n-1];
        for(int i = n-1; i > 0; i--){
            table[i]  = table[i-1];
        }
        table[0] = lastEm;
    }
    public static void remMiddleCift(int n, int[] table){ //d
        int mes = n / 2;
        for(int i = mes - 1; i < n - 1; i++){ //mes - 1 pasi numerimi ne array fillon nga 0
            table[i] = table[i + 1];
        }
        for(int i = mes - 1; i < n - 2; i++){
            table[i] = table[i + 1];
        }
        System.out.print("Elementet e tabeles me sasi cift elementesh jane: ");
    }
    public static void remMiddleTek(int n, int[] table){ //d
        int mes = n / 2;
        for(int i = mes; i < n - 1; i++){ //nuk ka nevoje per mes - 1 pasi rumbullakoset vet posht m gjate pjestimit te n me 2
            table[i] = table[i + 1];
        }
        System.out.print("Elementet e tabeles me sasi tek elementesh jane: ");
    }
    public static int SecondLargest(int n, int[] table){ //e
        int largestvalue = 0;
        int nextlargest = 0;
        for(int i = 0; i < n; i++){
            if(table[i] > largestvalue){
                nextlargest = largestvalue;
                largestvalue = table[i];
            }
            else if(table[i] > nextlargest){
                nextlargest = table[i];
            }
        }
        return nextlargest;
    }
    public static boolean sorted(int n, int[] table){ //f
        for(int i = 0;i < n - 1; i++){
            if(table[i] > table[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean elmFqinj(int n, int[] table){ //g
        for(int i = 0;i < n - 1; i++){
            if(table[i] == table[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean elmBarabarte(int n, int[] table){ //h
        for(int i = 0;i < n - 1; i++){
            for(int j = i+1; j < n; j ++){
                if(table[i] == table[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
