package trabalhofinal;

public final class Instituição {
    //Atributos
    private String nome;
    private String endereço;

    //Métodos Especiais
    public Instituição(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
