package felype.agendamento;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.collections.FXCollections;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class AgendamentoControl {
    private ObservableList<Agendamento> lista = FXCollections.observableArrayList();
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty tipoExame = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> dataCriacao = new SimpleObjectProperty<>(LocalDate.now());
    private StringProperty status = new SimpleStringProperty("");
    private StringProperty medicoResponsavel = new SimpleStringProperty("");
    private StringProperty unidadeExame = new SimpleStringProperty("");
    private StringProperty observacoes = new SimpleStringProperty("");
    private StringProperty formaPagamento = new SimpleStringProperty("");

    private int contador = 0;

    public void entidadeParaTela(Agendamento a){
        this.tipoExame.set(a.getTipoExame());
        this.dataCriacao.set(a.getDataCriacao().toLocalDate()); // Ajuste para LocalDate
        this.status.set(a.getStatus());
        this.medicoResponsavel.set(a.getMedicoResponsavel());
        this.unidadeExame.set(a.getUnidadeExame());
        this.observacoes.set(a.getObservacoes());
        this.formaPagamento.set(a.getFormaPagamento());
    }

    public void excluir(Agendamento a) { 
        System.out.println("Excluído agendamento com id: " + a.getId());
        lista.remove(a);
    }

    public void gravar() { 
        if (id.get() == 0) { 
            Agendamento a = new Agendamento();
            contador += 1;
            a.setId(contador); // Gera um ID único
            a.setTipoExame(this.tipoExame.get());
            a.setDataCriacao(LocalDateTime.now()); // A data e hora da criação
            a.setStatus(this.status.get());
            a.setMedicoResponsavel(this.medicoResponsavel.get());
            a.setUnidadeExame(this.unidadeExame.get());
            a.setObservacoes(this.observacoes.get());
            a.setFormaPagamento(this.formaPagamento.get());
            lista.add(a);
        } else { 
            for (Agendamento a : lista) { 
                if (a.getId() == this.id.get()) { 
                    a.setTipoExame(this.tipoExame.get());
                    a.setDataCriacao(LocalDateTime.now()); // Atualiza a data e hora da criação
                    a.setStatus(this.status.get());
                    a.setMedicoResponsavel(this.medicoResponsavel.get());
                    a.setUnidadeExame(this.unidadeExame.get());
                    a.setObservacoes(this.observacoes.get());
                    a.setFormaPagamento(this.formaPagamento.get());
                }
            }
        }
        limparTudo();
        System.out.println("Lista tamanho: " + lista.size());
    }

    public void limparTudo() { 
        id.set(0);
        tipoExame.set("");
        dataCriacao.set(LocalDate.now()); // Ajuste para LocalDate
        status.set("");
        medicoResponsavel.set("");
        unidadeExame.set("");
        observacoes.set("");
        formaPagamento.set("");
    }

    public void pesquisarPorUnidadeExame() { 
        for (Agendamento a : lista) { 
            if (a.getUnidadeExame().contains(unidadeExame.get())) { 
                tipoExame.set(a.getTipoExame());
                dataCriacao.set(a.getDataCriacao().toLocalDate()); // Ajuste para LocalDate
                status.set(a.getStatus());
                medicoResponsavel.set(a.getMedicoResponsavel());
                unidadeExame.set(a.getUnidadeExame());
                observacoes.set(a.getObservacoes());
                formaPagamento.set(a.getFormaPagamento());
            }
        } 
    }

    public ObservableList<Agendamento> getLista(){
        return this.lista;
    }

    public IntegerProperty idProperty(){
        return this.id;
    }

    public StringProperty tipoExameProperty(){
        return this.tipoExame;
    }

    public ObjectProperty<LocalDate> dataCriacaoProperty(){
        return this.dataCriacao;
    }

    public StringProperty statusProperty(){
        return this.status;
    }

    public StringProperty medicoResponsavelProperty(){
        return this.medicoResponsavel;
    }

    public StringProperty unidadeExameProperty(){
        return this.unidadeExame;
    }

    public StringProperty observacoesProperty(){
        return this.observacoes;
    }

    public StringProperty formaPagamentoProperty(){
        return this.formaPagamento;
    }
}
