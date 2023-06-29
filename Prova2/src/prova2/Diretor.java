
package prova2;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca implements Contratacao{
    private double PREMIO= 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo Funcionario");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo Fucionario");
        
    }
    
}
