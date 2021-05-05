package test;
import java.time.LocalDate;
import business.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ClubeTest {

    Clube club;
    @BeforeEach
    public void setUp() throws Excecao{
        club = new Clube();
        Socio s1 = new Socio("Carlos Esteves",111989676781l,LocalDate.of(2000,12,19),1337,LocalDate.of(2014,12,20));
        club.addAcesso(s1);
        Socio s2 = new Socio("Lucas Esteves",19765896767l,LocalDate.of(1999,11,11),1234,LocalDate.of(2014,12,20));
        club.addAcesso(s2);
        Visitante v1 = new Visitante("José Lima",19876654312l, LocalDate.of(2000,12,19),8921,LocalDate.now());
        club.addAcesso(v1);
    }
    @Test
    public void testValidaSocio() throws Excecao {
        Socio socio = new Socio("Lucas Esteves",19765896767l,LocalDate.of(1999,11,11),1234,LocalDate.of(2014,12,20));
        assertTrue(club.validaSocio(socio));
    }
    @Test
    public void testAcessosDia() {
        assertEquals(club.acessosDia(LocalDate.of(2014,12,20)),2);
    }
    @Test
    public void testConsultarPessoas() throws Excecao {
        Acesso[] vresp = club.consultarAcessos(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        String resp = vresp[0].toString();
        Visitante v1 = new Visitante("José Lima",19876654312l, LocalDate.of(2000,12,19),8921,LocalDate.now());
        assertEquals(resp,v1.toString());
    }
    @Test
    public void testConsultarVisitantesDia() throws Excecao {
        Visitante vaux = new Visitante("José Lima",19876654312l, LocalDate.of(2000,12,19),8921,LocalDate.now());
        Visitante[] vresp = club.consultarVisitantesDia(LocalDate.now());
        String resp = vresp[0].toString();
        
        assertEquals(resp,vaux.toString());
    }
}
