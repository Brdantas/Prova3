
package prova2;

import java.time.LocalDate;


public class Main {

    
    public static void main(String[] args) {
        Endereco endereco = null;
        Engenheiro engenheiro = new Engenheiro("8742874872", "Breno", "97733535", "8735823835", endereco, Setor.SAUDE, Genero.FEMININO, 18648.890, EstadoCivil.CASADO, LocalDate.MIN);
        Motoboy motoboy = new Motoboy("983983598", "Breno", "97537959", "983598398", endereco, Setor.SAUDE, Genero.FEMININO, 1987.98, EstadoCivil.CASADO, LocalDate.MIN);
        Gerente gerente = new Gerente(Bonificacao.DIREOTOR, "Breno", "984395354", "9359939", endereco, Setor.SAUDE, Genero.FEMININO, 1997.98, EstadoCivil.CASADO, LocalDate.MIN);
        Diretor diretor = new Diretor(Bonificacao.DIREOTOR, "Breno", "8395935", "8275793", endereco, Setor.SAUDE, Genero.FEMININO, 1985.98, EstadoCivil.CASADO, LocalDate.MIN);
        
        System.out.println("Engenheiro");
        System.out.println("Motoboy");
        System.out.println("Gerente");
        System.out.println("Diretor");
    }
    
    
}
