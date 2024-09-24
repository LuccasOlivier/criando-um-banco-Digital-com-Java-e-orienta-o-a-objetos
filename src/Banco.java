import java.util.List;

public class Banco {
    private String nome;
    private List <Conta> contas;

    //Métodos getter/setter

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //Getter e Setter

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    
}
