package business;
import java.time.LocalDate;
public class Clube {

    private Acesso[] acessos;
    private final static int MAX_LENGTH = 1000;
    private int quantAcesso =0;
    public Clube() {
        acessos = new Acesso[Clube.MAX_LENGTH];
    }
    public void addAcesso(Acesso acesso) {
        if(this.acessos.length>quantAcesso) {
            this.acessos[quantAcesso++] = acesso;
        }
    }
    public Acesso[] getAcessos() {
        return this.acessos;
    }
    public Visitante[] consultarVisitantesDia(LocalDate data) {
        Visitante[] visitantes = new Visitante[quantAcesso];
        int j=0;
        for (int i=0;i<acessos.length;i++) {
            if(acessos[i] instanceof Visitante) {
                if(acessos[i].getDataAcesso().equals(data)) {
                    visitantes[j++] = (Visitante) acessos[i];
                    
                }
            }
        }
        return visitantes;
    }
    public Acesso[] consultarAcessos(LocalDate data1,LocalDate data2) {
        Acesso[] acessoData = new Acesso[quantAcesso];
        int j =0;
        for(int i=0;i <this.quantAcesso;i++) {
                if((acessos[i].getDataAcesso().isAfter(data1)) && (acessos[i].getDataAcesso().isBefore(data2) )) {
                    acessoData[j++]= acessos[i];
                    
                }
            
        }
        return acessoData;
    }
    public boolean validaSocio(Socio socio) {
        boolean valida=false;
        for(int i=0;i<this.quantAcesso;i++) {
            if(acessos[i] instanceof Socio) {
                Socio aux = (Socio) acessos[i];
                
                if(socio.getNumSocio() == aux.getNumSocio()) {
                    valida = true;
                    break;
                }
            }
        }
        return valida;
    }
    public int acessosDia(LocalDate data) {
        int cont=0;
        for(int i=0;i<this.quantAcesso;i++) {
            if(acessos[i].getDataAcesso().equals(data)) {
                cont++;
            }
        }
        return cont;
    }
    
}
