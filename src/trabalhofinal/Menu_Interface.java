package trabalhofinal;

public class Menu_Interface implements Menu{
    //Atributos
    private String login;
    private String senha;
    private String funcao;
    
    //Métodos Especiais
    public Menu_Interface(String login, String senha, String funcao) {
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    //Métodos Abstratos
    @Override
    public void login() {
        System.out.println();
    }

    @Override
    public void senha() {
        System.out.println();
    }

    @Override
    public void funçao() {
        System.out.println();
    }
    
}
