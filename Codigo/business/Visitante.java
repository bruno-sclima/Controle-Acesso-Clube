package business;

import java.time.LocalDate;

public class Visitante extends Acesso{
    
    private int numConvite;
    public int getNumConvite() {
        return this.numConvite;
    }
    public void setNumConvite(int numConvite) throws Excecao{
        if(numConvite >0) {
        this.numConvite = numConvite;}
        else throw new Excecao("numConvite","numeros nulos ou negativos");
    }
    public Visitante(String nome, long cpf, LocalDate dataNascimento,int numConvite, LocalDate dataConvite) throws Excecao{
        super(nome, cpf, dataNascimento,dataConvite);
        this.setNumConvite(numConvite);
        
    }
    @Override
    public String toString() {
        return super.toString() +" Numero do Convite: " + numConvite +  "";
    }
    
    

}
