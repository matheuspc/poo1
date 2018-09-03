import java.util.Scanner;

public class Pessoa {

    String nomePessoa;
    String cpfPessoa;

    public void lerDados (){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        this.nomePessoa = s.nextLine();
        System.out.println("Digite o cpf da pessoa:");
        this.cpfPessoa = s.next();
    }

    public void mostrarDados(){

        System.out.println("Nome da pessoa: " + this.nomePessoa);
        System.out.println("CPF da pessoa: " + this.cpfPessoa);
    }

}
