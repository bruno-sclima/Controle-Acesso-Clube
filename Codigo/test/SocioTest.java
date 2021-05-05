package test;
import java.time.LocalDate;
import business.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SocioTest {

    Socio s;
    @BeforeEach
    public void setUp() throws Excecao{
        s = new Socio("Carlos Esteves",111989676781l,LocalDate.of(2000,12,19),1337,LocalDate.of(2014,12,20));
    }
    @Test
    public void printDados() {
        assertEquals("Nome:Carlos Esteves, CPF:111989676781, Data de Nascimento:2000-12-19, Data de acesso:2014-12-20, Numero do Socio: 1337",s.toString());
    }
    @Test
    public void testExcecao() {
        assertThrows(Excecao.class,()->{s.setNumSocio(0);});
    }
}
