public class Cliente {
    private String nome;
    private String senha; //Adicionando senha


    //Construtor
    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    //Método getter/setter
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha (String senha){
        this.senha = senha;
    }

    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    } 
}
