
package prova2;



import java.time.LocalDate;

public class Motoboy extends Funcionario implements Contratacao{
    private String CarteiraDeHabilitacao;

    public Motoboy(String CarteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String CarteiraDeHabilitacao) {
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo Funcionario");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo Funcionario");
    }
    
}
