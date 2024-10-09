import java.util.ArrayList;
import java.util.List;

public class AlunoControll {
    
    private List<Aluno> alunos;
    
    public AlunoControll(){
        this.alunos = new ArrayList<>();
    }

    public void adcionarAluno(Aluno a) {
        alunos.add(a);
    }

    public Aluno pesquisarPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
