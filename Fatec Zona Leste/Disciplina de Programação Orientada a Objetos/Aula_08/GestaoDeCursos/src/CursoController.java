import java.util.ArrayList;
import java.util.List;

public class CursoController {
    
    private List<Curso> cursos;

    public CursoController() {
        this.cursos = new ArrayList<>();
    }

    public void adcionar(Curso novoCurso) {
        cursos.add(novoCurso);
    }

    public Curso pesquisar(String nomeCurso) {
        Curso cursoPesquisado = null;
        for (Curso c : cursos) if (c.getNome().contains(nomeCurso)) cursoPesquisado = c;
        return cursoPesquisado;
    }
}
