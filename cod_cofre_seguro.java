import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de cofre a ser criado (digital ou físico): ");
        String tipoCofre = scanner.nextLine();
        
        if (tipoCofre.equals("digital")) {
            System.out.print("Digite a senha do cofre digital (apenas números): ");
            String senha = scanner.nextLine();
            
            System.out.print("Confirme a senha do cofre digital: ");
            String confirmacaoSenha = scanner.nextLine();
            
            if (senha.equals(confirmacaoSenha)) {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Método de abertura: Senha");
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Método de abertura: Senha");
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equals("físico")) {
            System.out.println("Tipo: Cofre Físico");
            System.out.println("Método de abertura: Chave");
        } else {
            System.out.println("Tipo de cofre inválido!");
        }
        
        scanner.close();
    }
}
