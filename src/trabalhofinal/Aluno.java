package trabalhofinal;

public final class Aluno extends Pessoa{
    //Atributos
    private int matricula;

    //Métodos Personalizados
    public void matricular(){
        System.out.println("Aluno(a): "+getNome()+ " Matriculado(a) com sucesso!");
    }
    
    //Métodos Especiais
    public Aluno(int matricula, String nome, String sexo, int idade, String cpf) {
        super(nome, sexo, idade, cpf);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "------------------ \nALUNO(A): " + getNome() + "\nIDADE: "+ getIdade() + "\nSEXO: " + getSexo()+
                "\nNº DO CPF: " + getCpf()+ "\nNº DE MATRÍCULA: " + getMatricula()+"\n";
    }
}
