public class Quarto{

    private int idQuarto;
    private String descQuarto;

    public Quarto(int idQuarto, String descQuarto){
        this.idQuarto = idQuarto;
        this.descQuarto = descQuarto;
    }

    public void setIdQuarto(int idQuarto){
        this.idQuarto = idQuarto;
    }

    public int getIdQuarto(){
        return idQuarto;
    }

    public void setDescQuarto(String descQuarto){
        this.descQuarto = descQuarto;
    }

    public String getDescQuarto(){
        return descQuarto;
    }

    public void ToString(){
        System.out.println("Id do quarto: " + getIdQuarto());
        System.out.println("Desc do quarto: " + getDescQuarto());
    }   
}