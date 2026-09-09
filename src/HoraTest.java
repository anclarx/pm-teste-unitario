import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HoraTest {

    Hora hora;

    @BeforeEach
    public void setUp() {
        // Arrange - preparar "o mundo de teste" como conveniente
        hora = new Hora(18, 9, 15);

    }

    // tem que ser publico e void
    @Test
    public void mostraHoraFormatadaCorretamente() {

        // Act - executar um "teste facil" e registrar a resposta
        String horaFormatada = hora.horaFormatada();

        // Assert - verificar o resultado
        assertEquals("18:09:15", horaFormatada); // esperado, registrado

        // control espaco quando tiver escrevendo um metodo para ver o package dele e os
        // parametros
    }

    @Test
    public void verificaHoraAdiantadaCorretamente() {
        // Arrange - preparar "o mundo de teste" como conveniente
        Hora horaAdiantada = new Hora(13, 0, 0);

        // Act - executar um "teste facil" e registrar a resposta
        boolean adiantada = hora.estahNaFrenteDe(horaAdiantada);

        // Assert - verificar o resultado
        assertTrue(adiantada);
    }

    @Test
    public void verificaHoraAtrasadaCorretamente() {
        // Arrange - preparar "o mundo de teste" como conveniente
        Hora horaAdiantada = new Hora(21, 0, 0);

        // Act - executar um "teste facil" e registrar a resposta
        boolean adiantada = hora.estahNaFrenteDe(horaAdiantada);

        // Assert - verificar o resultado
        assertFalse(adiantada);
    }

    @Test
    public void verificarIncrementarCorretamente() {

        // Act - executar um "teste facil" e registrar a resposta
        Hora horaIncrementada = hora.incrementar(90);
        String horaIncrementadaFormatada = horaIncrementada.horaFormatada();

        assertEquals("19:39:15", horaIncrementadaFormatada);
    }

    @Test
    public void naoIncrementaMinutosNegativos() {

        // Act - executar um "teste facil" e registrar a resposta
        Hora horaIncrementada = hora.incrementar(-9);
        String horaIncrementadaFormatada = horaIncrementada.horaFormatada();

        assertEquals("18:09:15", horaIncrementadaFormatada);
    }

    @Test
    public void incrementaVirandoDia() {

        // Act - executar um "teste facil" e registrar a resposta
        Hora horaIncrementada = hora.incrementar(24 * 60 + 12);
        String horaIncrementadaFormatada = horaIncrementada.horaFormatada();

        assertEquals("18:21:15", horaIncrementadaFormatada);

    }
}
