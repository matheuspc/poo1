import java.util.Scanner;

public class Pessoa {

    String nomePessoa;
    private String cpfPessoa;

    public boolean setCpf (String cpfPessoa){
        if (ValidaCPF.isCPF(cpfPessoa)) {
            //System.out.printf("%s\n", ValidaCPF.imprimeCPF(getCpfPessoa()));
            this.cpfPessoa = cpfPessoa;
            return true;
        }
        else {
            System.out.printf("Favor inserir um CPF válido: \n");
            return false;
        }

    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void lerDados (){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        this.nomePessoa = s.nextLine();
        System.out.println("Digite o cpf da pessoa:");
        while (!setCpf(s.nextLine()));

    }

    public void mostrarDados(){

        System.out.println("Nome da pessoa: " + this.nomePessoa);
        System.out.printf("CPF da pessoa: %s\n", ValidaCPF.imprimeCPF(cpfPessoa));
    }

}
