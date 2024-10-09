import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

    private long id;
    private String ra;
    private String nome;
    private LocalDate nascimento;
    
    public long getId() {
        return id;
    }
    public void setId(String id) {
        this.id = Long.parseLong(id);
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nascimento = LocalDate.parse(nascimento, data);
    }
    
}
