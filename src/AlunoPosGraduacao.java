import java.util.Scanner;

public class AlunoPosGraduacao extends Aluno{

    String graduacaoAluno;
    String instituicaoAluno;
    int dtInicio;
    int dtFim;

    public void lerDados(){
        super.lerDados();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a graduacao do aluno:");
        this.graduacaoAluno = s.nextLine();
        System.out.println("Digite a instituição do aluno:");
        this.instituicaoAluno = s.nextLine();
        System.out.println("Digite o ano de início do curso:");
        this.dtInicio = s.nextInt();
        System.out.println("Digite o ano de término do curso:");
        this.dtFim = s.nextInt();
    }

    public void mostrarDados(){
        super.mostrarDados();

        System.out.println("Graduação do aluno: " + this.graduacaoAluno);
        System.out.println("Instituição do aluno: " + this.instituicaoAluno);
        System.out.println("Ano de início do curso: " + this.dtInicio);
        System.out.println("Ano de término do curso: " + this.dtFim);
    }

}
