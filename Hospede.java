import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    @Override
    public void ToString(){
        System.out.println("CPF: " + getCpf());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Rg: " + getRg());
        System.out.println("Tem fidelidade: " + getFidelidade());
    }
    @Override
    public Boolean Inserir() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("hospedes.txt", true))) {
            bw.write(this.toString());
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Erro ao inserir hóspede: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Boolean Editar() {
        ArrayList<Hospede> lista = Listar();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("hospedes.txt"))) {
            for (Hospede h : lista) {
                if (h.getCpf().equals(this.getCpf())) {
                    bw.write(this.toString());
                } else {
                    bw.write(h.toString());
                }
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    
    public ArrayList<Hospede> Listar() {
        ArrayList<Hospede> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("hospedes.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                lista.add(new Hospede(dados[0], dados[1], Integer.parseInt(dados[2]), dados[3], Boolean.parseBoolean(dados[4])));
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar hóspedes: " + e.getMessage());
        }
        return lista;
    }

    
    public Hospede ConsultarHospede(int id) {
        ArrayList<Hospede> lista = Listar();
        if (id < 0 || id >= lista.size()) return null;
        return lista.get(id);
    }
}