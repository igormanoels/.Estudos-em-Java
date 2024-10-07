public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String tel){
        this.telefone = tel;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Nome: " + this.nome + ", Telefone: " + this.telefone + ", E-mail: " + this.email; 
    }
}