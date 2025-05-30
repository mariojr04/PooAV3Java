public class Hospede extends Pessoa{

    private String rg;
    private Boolean fidelidade;

    public Hospede(String cpf, String nome, int idade, String rg, Boolean fidelidade){
        super(cpf, nome, idade);
        this.rg = rg;
        this.fidelidade = fidelidade;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(Boolean fidelidade){
        this.fidelidade = fidelidade;
    }

    public Boolean getFidelidade(){
        return fidelidade;
    }
}