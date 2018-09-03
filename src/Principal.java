public class Principal {

    public static void main(String[] args) {
        //Curso c1 = new Curso();
        //c1.lerDados();
        //c1.mostrarDados();

        //Disciplina d1 = new Disciplina();
        //d1.lerDados();
        //d1.mostrarDados();

        Aluno f1 = new AlunoPosGraduacao();
        f1.lerDados();
        f1.mostrarDados();

        //if (ValidaCPF.isCPF(f1.getCpfPessoa()))
          //  System.out.printf("%s\n", ValidaCPF.imprimeCPF(f1.getCpfPessoa()));
        //else System.out.printf("Erro, CPF invalido !!!\n");
    }

}
