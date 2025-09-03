import java.util.Scanner;

// Online IDE - Code Editor, Compiler, Interpreter

public class Exercicio01{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2, soma;
        //string next()
        //int nextInt()
        //double nextDouble()
        
        //String - int - double - char 
        
        System.out.print("Digite primeiro numero: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite segundo numero: ");
        num2 = scanner.nextInt();
       
        soma = num1 + num2;
        
        System.out.println("A soma dos números informado é: " + soma);
        
    }
}
