import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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


    @Override
    public void ToString(){
        System.out.println("CPF: " + getCpf());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Função: " + getFuncao());
    }

    @Override
    public Boolean Inserir() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("funcionarios.txt", true))) {
            bw.write(this.toString());
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Erro ao inserir funcionário: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Boolean Editar(){
        ArrayList<Funcionario> lista = Listar();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("funcionarios.txt"))) {
            for (Funcionario f : lista) {
                if (f.getCpf().equals(this.getCpf())) {
                    bw.write(this.toString());
                } else {
                    bw.write(f.toString());
                }
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }


    
    public ArrayList<Funcionario> Listar() {
        ArrayList<Funcionario> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("funcionarios.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                lista.add(new Funcionario(dados[0], dados[1], Integer.parseInt(dados[2]), dados[3]));
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }
        return lista;
    }
    

    public Funcionario ConsultarFuncionario(int id) {
        ArrayList<Funcionario> lista = Listar();
        if (id < 0 || id >= lista.size()){
            return null;
        } 
        return lista.get(id);
    }
}