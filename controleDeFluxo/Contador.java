import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        try{
            int i = diferencaN2N1();  
            for(int j = 1; j<=i; j++){
                System.out.println("Imprimindo o numero " + j);
            }       
        } catch(ParametroInvalidoException e){
            System.out.println("O Segundo número não pode ser menor do que o primeiro!");
            e.printStackTrace();
        }

    }

    private static int diferencaN2N1() throws ParametroInvalidoException {
        int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        while(sc.hasNext()){
            if(sc.hasNextInt()) n1 = sc.nextInt(); break; 
        } 
        System.out.println("Digite o segundo número: ");
        while(sc.hasNext()){
            if(sc.hasNextInt()) n2 = sc.nextInt(); break; 
        } 
        sc.close();
        if(n2<n1) throw new ParametroInvalidoException();
        return n2-n1;
    }
}

