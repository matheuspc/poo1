import java.util.Scanner;

public class Professor extends Funcionario {

    String titulacaoProf;
    String pesquisaProf;

    public void lerDados (){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a titulação do professor: ");
        this.titulacaoProf = s.nextLine();
        System.out.println("Digite a área de pesquisa do professor: ");
        this.pesquisaProf = s.nextLine();
    }

    public void mostrarDados (){
        System.out.println("Titulação do professor: " + this.titulacaoProf);
        System.out.println("Área de pesquisa do professor: " + this.pesquisaProf);
    }

}
