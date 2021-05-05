
package business;

import java.time.LocalDate;

public class Socio extends Acesso{
    
    private int numSocio;
    public int getNumSocio() {
        return this.numSocio;
    }
    public void setNumSocio(int numSocio) throws Excecao{
        if(numSocio >0) {
        this.numSocio = numSocio;
        } else throw new Excecao("numSocio","numeros nulos ou negativos");
    }
    public Socio(String nome, long cpf, LocalDate dataNascimento,int numSocio, LocalDate ultimoAcesso) throws Excecao{
        super(nome, cpf, dataNascimento,ultimoAcesso);
        this.setNumSocio(numSocio);
        
    }
    @Override
    public String toString() {
        return super.toString() +", Numero do Socio: " + numSocio +  "";
    }
    
    

}
