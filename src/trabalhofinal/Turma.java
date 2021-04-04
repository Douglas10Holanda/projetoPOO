package trabalhofinal;

public final class Turma {
    //Atributos
    private String codigo;
    private final int periodo;
    private String disciplina;

    //Métodos Especiais
    public Turma(String codigo, int periodo, String disciplina) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
