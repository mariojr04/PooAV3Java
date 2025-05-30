public class Funcionario extends Pessoa{

    private String funcao;

    public Funcionario(String cpf, String nome, int idade, String funcao){
        super(cpf, nome, idade);
        this.funcao = funcao;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getFuncao(){
        return funcao;
    }
}