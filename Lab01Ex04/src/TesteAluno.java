public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = "123";
        aluno.nome = "vinicius";
        aluno.boletim.notaNP1.valor = 5.5;
        aluno.boletim.notaNP2.valor = 10;
        
        aluno.relatorio();
    }
    
}
