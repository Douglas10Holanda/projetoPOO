package trabalhofinal;

public final class Secretaria extends Pessoa{
    //Atributos
    private int id;

    //Métodos Personalizados
    public void abrir_Turmas(){
        System.out.println("Turma Aberta com Sucesso");
    }
    
    public void cadastrar_Aluno(){
        System.out.println("Aluno Cadastrado com Sucesso!");
    }
    
    public void matricular_Aluno(){
        System.out.println("Aluno Matriculado com Sucesso!");
    }
    
    public void Emitir_Historico(){
        System.out.println("Emissão de Histórico conluída!");
    }
    
    //metodos especiais
    public Secretaria(int id, String nome, String sexo, int idade, String cpf) {
        super(nome, sexo, idade, cpf);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
