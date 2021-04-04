package trabalhofinal;

public class Professor extends Pessoa {
    //Atributos
    private int matricula;

    //Métodos Personalizados
    public void lançar_Media(){
        System.out.println("Média Lançada!");
    }
    
    public void lançar_Frequencia(){
        System.out.println("\n Frequência Lançada!");
    }
    
    //Métodos Especiais
    public Professor(int matricula, String nome, String sexo, int idade, String cpf) {
        super(nome, sexo, idade, cpf);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
