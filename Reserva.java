public class Reserva {

    private int idReserva;
    private Double valor;
    private String dataEntrada;
    private String dataSaida;
    private Boolean checkin;
    private Boolean checkout;
    private Quarto quarto;
    private Hospede hospede;

    public Reserva(int idReserva, Double valor, String dataEntrada, String dataSaida, Boolean checkin, Boolean checkout, Quarto quarto, Hospede hospede){
        this.idReserva = idReserva;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.checkin = checkin;
        this.checkout = checkout;
        this.quarto = quarto;
        this.hospede = hospede;
    }

    public void setIdReserva(int idReserva){
        this.idReserva = idReserva;
    }

    public int getIdReserva(){
        return idReserva;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getDataEntrada(){
        return dataEntrada;
    }

    public void setDatasaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public String getDataSaida(){
        return dataSaida;
    }
    public void setCheckin(Boolean checkin){
        this.checkin = checkin;
    }

    public Boolean getCheckin(){
        return checkin;
    }

    public void setCheckout( Boolean checkout){
        this.checkout = checkout;
    }

    public  Boolean getCheckout(){
        return checkout;
    }
    public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }

    public Quarto getQuarto(){
        return quarto;
    }

    public void setHospede(Hospede hospede){
        this.hospede = hospede;
    }

    public Hospede getHospede(){
        return hospede;
    }

    public void ToString(){
        System.out.println("Id da reserva: " + getIdReserva());
        System.out.println("Valor da reserva: " + getValor());
        System.out.println("Data de entrada: " + getDataEntrada());
        System.out.println("Data de saida: " + getDataSaida());
        System.out.println("Fez checkin?: " + getCheckin());
        System.out.println("Fez checkout: " + getCheckout());
        System.out.println("Quarto: " + getQuarto());
        System.out.println("Hospede: " + getHospede());
    }
}
