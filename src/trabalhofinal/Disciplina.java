package trabalhofinal;

public final class Disciplina {
    //Atributos
    private String nome;
    private int creditos;

    //Métodos Personalizados
    public void visualizar_Turmas(){
        System.out.println("Visualizando Turmas!");
    }
    
    //Métodos Especiais
    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }    
}
