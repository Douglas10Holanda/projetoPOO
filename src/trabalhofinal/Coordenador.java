package trabalhofinal;

public final class Coordenador extends Professor{
    //Atributos
    private String Senha_Especial;
    
    //Métodos Personalizados
    public void incluir_Disciplina(){
        System.out.println("Disciplina Incluida com sucesso pelo Coordenador!");
    }
    
    //Métodos Especiais
    public Coordenador(String Senha_Especial, int matricula, String nome, String sexo, int idade, String cpf) {
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
