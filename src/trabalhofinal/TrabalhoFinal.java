package trabalhofinal;

public class TrabalhoFinal {
    public static void main(String[] args) {
        System.out.println("----------ALUNO---------------\n");
        
        Aluno alunos[]= new Aluno[5];
        
        //Matricula - Nome - Sexo - Idade - CPF
        alunos[0] = new Aluno(472131, "Bruno Henrique", "Masculino", 20, "126.282.745-09");
        alunos[1] = new Aluno(478899, "Sabrina", "Feminino", 18, "046.282.540-59");
        alunos[2] = new Aluno(471490, "Arraxcaeta", "Masculino", 21, "029.888.540-19");
        alunos[3] = new Aluno(421300, "Andressa", "Feminino", 25, "122.282.540-60");
        alunos[4] = new Aluno(478322, "Gabigol", "Masculino", 22, "026.282.540-29");
        
        //Ações do Aluno
        alunos[0].matricular();
        alunos[1].matricular();
        alunos[2].matricular();
        alunos[3].matricular();
        alunos[4].matricular();
        
        System.out.println(alunos[0]);
        System.out.println(alunos[1]);
        System.out.println(alunos[2]);
        System.out.println(alunos[3]);
        System.out.println(alunos[4]);
        
        System.out.println("\n-----------professor--------------\n");
        
        Professor prof[] = new Professor[2];
        // Matricula - Nome - Sexo - Idade - CPF
        prof[0] = new Professor(44545, "Mister", "Masculino", 65, "4484848.445");
        prof[1] = new Professor(48484, "Millena", "Femenino", 25, "84845133-20");
       
        //Ações do Professor
        prof[0].lançar_Frequencia();
        prof[1].lançar_Media();
        
        System.out.println(prof[0]);
        System.out.println(prof[1]);
        
        System.out.println("-------------------------");
        
        System.out.println("\n-----------secretaria--------------\n");
        
        Secretaria secr[] = new Secretaria[4];
        //Matricula - Nome - Sexo - Idade - CPF
        secr[0] = new Secretaria(695236, "Thalita", "Feminino", 22, "6464564.10");
        
        //Ações da Secretaria
        secr[0].Emitir_Historico();
        secr[0].abrir_Turmas();
        secr[0].cadastrar_Aluno();
        
        System.out.println(secr[0]);
        
        System.out.println("-------------------------");
        
        
        System.out.println("\n----------coordenador---------------\n");
        
        Coordenador coo[] = new Coordenador[5];
        //Senha Especial - Matricula - Nome - Sexo - Idade - CPF
        coo[4] = new Coordenador("djiqjd", 4531, "Rogerio", "masculino", 45, "554533");
        
        //Ações do Coordenador
        coo[4].incluir_Disciplina();
        
        System.out.println(coo[4]);
        
        System.out.println("-------------------------");
        
        System.out.println("\n-----------reitor--------------\n");
        
        Reitor reit[] = new Reitor[8];
        //Senha Especial - Matricula - Nome - Sexo - Idade - CPF
        reit[7] = new Reitor("dokdow", 53351, "Jose", "Masculino", 45, "6531353");
        
        //Ações do Reitor
        reit[7].cadastrar_Curso();
        reit[7].cadastrar_Professor();
        reit[7].incluir_Disciplina();

        System.out.println(reit[7]);
    }   
}
