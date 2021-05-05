package test;
import java.time.LocalDate;
import business.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VisitanteTest {
    Visitante v;
    @BeforeEach
    public void setUp() throws Excecao{
        v = new Visitante("José Lima",19876654312l, LocalDate.of(2000,12,19),8921,LocalDate.now());
    }
    @Test 
    public void printDados() {
        assertEquals("Nome:José Lima, CPF:19876654312, Data de Nascimento:2000-12-19, Data de acesso:2021-04-22 Numero do Convite: 8921",v.toString());
    }

    @Test
    public void testExcecao() {
        assertThrows(Excecao.class,()->{v.setNumConvite(0);});
    }
}
