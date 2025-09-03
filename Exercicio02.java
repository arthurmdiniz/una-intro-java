import java.util.Scanner;

// Online IDE - Code Editor, Compiler, Interpreter

public class Exercicio02{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  num1,num2, subtracao, multiplicacao;
        double divisao;
        //string next()
        //int nextInt()
        //double nextDouble()
        
        //String - int - double - char 
        
        System.out.print("Digite primeiro numero: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite segundo numero: ");
        num2 = scanner.nextInt();
       
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = (double) num1 / num2;
        
        System.out.println("A subtracao dos números informado é: " + subtracao);
        System.out.println("A multiplicacao dos números informado é: " + multiplicacao);
        System.out.printf("A divisao dos números informado é: %.2f", divisao);
        
    }
}
