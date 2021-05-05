package app;
import java.time.LocalDate;
import business.*;
public class Aplicacao {

    public static void main(String[] args) {
        
        try {
        LocalDate hoje = LocalDate.now();
        LocalDate nasc1 = LocalDate.of(2002,3,18);
        LocalDate nasc2 = LocalDate.of(2000,12,19);
        Socio socio1 = new Socio("Bruno Silveira",111989676781l,nasc1,1234,hoje);
        System.out.println("Socio 1: "+ socio1.toString());
        Socio socio2 = new Socio("Joao da Silva",11471989674l,nasc2,1235,hoje);
        System.out.println("Socio 2: "+ socio2.toString());
        Socio socio3 = new Socio("Bruno da Silva",11471989674l,nasc1,1235,LocalDate.of(2019, 8,20));
        System.out.println("Socio 3: "+ socio3.toString());
        Visitante vis = new Visitante("José Lima",19876654312l, nasc2,8921,hoje);
        System.out.println("Visitante: "+ vis.toString());
        Clube club = new Clube();
        club.addAcesso(socio1);
        club.addAcesso(socio2);
        club.addAcesso(socio3);
        club.addAcesso(vis);
        int nacessos = club.acessosDia(hoje);
        System.out.println("Numero de acessos no dia de hoje: "+ nacessos);
        System.out.println("Valida entrada de socio: ");
        if(club.validaSocio(socio1)) {
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado");
        }
        Visitante[] visitantes = new Visitante[100];
        System.out.println("Visitantes na data de: "+hoje+" :");
        visitantes=  club.consultarVisitantesDia(hoje);
        for(int i=0;i<visitantes.length;i++) {
            if(visitantes[i]==null) {
                break;
            }
            System.out.println(visitantes[i].toString());
        }
        Acesso[] acess = new Acesso[100];
        LocalDate data = LocalDate.of(2021,2,2);
        System.out.println("Todos acessos entre:"+data+" e "+hoje);
        acess = club.consultarAcessos(data, hoje.plusDays(1));
        for(int i=0;i<acess.length;i++) {
            if(acess[i]==null) {
                break;
            }
            System.out.println(acess[i].toString());
        }
        }catch(Excecao ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
        
    }
}
