import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VoleiTest {
    @Test
    public void testPontuacao() {
        Volei jogo = new Volei();
        jogo.pontoTimeA();
        jogo.pontoTimeA();
        jogo.pontoTimeB();
        assertEquals(2, jogo.getPontuacaoTimeA());
        assertEquals(1, jogo.getPontuacaoTimeB());
    }

    @Test
    public void testVencedor() {
        Volei jogo = new Volei();
        for (int i = 0; i < 25; i++) {
            jogo.pontoTimeA();
        }
        // Assegure-se de que a diferença é de pelo menos 2 pontos
        for (int i = 0; i < 23; i++) {
            jogo.pontoTimeB();
        }
        assertEquals("Time A", jogo.getVencedor());
    }

    @Test
    public void testVencedorCom25Pontos() {
        Volei jogo = new Volei();
        for (int i = 0; i < 25; i++) {
            jogo.pontoTimeA();
        }
        for (int i = 0; i < 23; i++) {
            jogo.pontoTimeB();
        }
        assertEquals("Time A", jogo.getVencedor());
    }

    @Test
    public void testJogoEmAndamento() {
        Volei jogo = new Volei();
        for (int i = 0; i < 24; i++) {
            jogo.pontoTimeA();
        }
        assertEquals("Jogo em andamento", jogo.getVencedor());
    }

    @Test
    public void testVerificarBola() {
        Volei jogo = new Volei();
        assertEquals("Dentro", jogo.verificarBola(5, 5));
        assertEquals("Fora", jogo.verificarBola(19, 5));
        assertEquals("Fora", jogo.verificarBola(5, 10));
        assertEquals("Dentro", jogo.verificarBola(18, 9));
    }
}
