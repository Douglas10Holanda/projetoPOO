package trabalhofinal;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private String sexo;
    private int idade;
    private String cpf;

    //Métodos Especiais
    public Pessoa(String nome, String sexo, int idade, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "-------------- \n nome = " + getNome() + "\n sexo = " + getSexo() + "\n idade = " + getIdade() + "\n cpf = " + getCpf() + "";
    }
    
    
}
