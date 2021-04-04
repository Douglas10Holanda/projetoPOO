package trabalhofinal;

public final class Reitor extends Professor{
    //Atributos
    private String Senha_Especial;
    
    //Métodos Personalizados
    public void cadastrar_Professor(){
        System.out.println("Professor cadastrado com sucesso!");
    }
    
    public void cadastrar_Curso(){
        System.out.println("Curso cadastrado com sucesso");
    }
    
    public void incluir_Disciplina(){
        System.out.println("Disciplina incluida com sucesso pelo Reitor!");
    }
    
    //Métodos Especiais
    public Reitor(String Senha_Especial, int matricula, String nome, String sexo, int idade, String cpf) {
        super(matricula, nome, sexo, idade, cpf);
        this.Senha_Especial = Senha_Especial;
    }
    
    public String getSenha_Especial() {
        return Senha_Especial;
    }

    public void setSenha_Especial(String Senha_Especial) {
        this.Senha_Especial = Senha_Especial;
    }
}
