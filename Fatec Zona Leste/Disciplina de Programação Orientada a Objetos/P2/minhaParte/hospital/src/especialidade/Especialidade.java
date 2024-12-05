package especialidade;

public class Especialidade {

    private String especialidade;
    private int id;

    
    public Especialidade() {}

    public Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Especialidade(String especialidade, int id) {
        this.especialidade = especialidade;
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
