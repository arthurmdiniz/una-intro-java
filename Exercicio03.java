import java.util.Scanner;

//jdoodle

public class Exercicio03{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int  idade;
        double altura;
        //string next()
        //int nextInt()
        //double nextDouble()
        
        //String - int - double - char 
        
        System.out.print("Digite seu nome: ");
        nome = scanner.next();
        
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();

        System.out.print("O seu nome é: " + nome + ", sua idade é: "+ idade + ", e sua altura é: " + altura +".");

        
    }
}