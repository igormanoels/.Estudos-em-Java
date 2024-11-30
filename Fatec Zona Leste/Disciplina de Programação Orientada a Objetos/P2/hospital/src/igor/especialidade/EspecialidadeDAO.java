package igor.especialidade;

public interface EspecialidadeDAO {

    String gravar(Especialidade e);
    
    Especialidade atualizar(Especialidade e);
    
    String remover(Especialidade e); 

    Especialidade procurar(Especialidade  e);
    
    
}

