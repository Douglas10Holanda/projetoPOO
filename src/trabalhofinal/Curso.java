package trabalhofinal;

public final class Curso {
    //Atributos
    private String nome;
    private int ID;

    //Métodos Especiais
    public Curso(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
