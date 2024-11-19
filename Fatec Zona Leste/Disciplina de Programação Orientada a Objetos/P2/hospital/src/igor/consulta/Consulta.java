package igor.consulta;

import java.sql.Date;

import igor.especialidade.Especialidade;

public class Consulta {

    private String cpf;
    private int registro;
    private Date dataAgendamento;
    private String horario;
    private int sala;
    private Especialidade especialidade;
    private String descricao;
    
    public Consulta(String cpf, int registro, Date dataAgendamento, String horario, int sala,
            Especialidade especialidade, String descricao) {
        this.cpf = cpf;
        this.registro = registro;
        this.dataAgendamento = dataAgendamento;
        this.horario = horario;
        this.sala = sala;
        this.especialidade = especialidade;
        this.descricao = descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public String getHorario() {
        return horario;
    }

    public int getSala() {
        return sala;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
