import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HoraTest {

    // tem que ser publico e void
    @Test
    public void mostraHoraFormatadaCorretamente() {
        // Arrange - preparar "o mundo de teste" como conveniente
        Hora hora = new Hora(7, 6, 5);

        // Act - executar um "teste facil" e registrar a resposta
        String horaFormatada = hora.horaFormatada();

        // Assert - verificar o resultado
        assertEquals("07:06:05", horaFormatada); // esperado, registrado

        // control espaco quando tiver escrevendo um metodo para ver o package dele e os
        // parametros
    }

    @Test
    public void verificaHoraAdiantadaCorretamente() {
        // Arrange - preparar "o mundo de teste" como conveniente
        Hora hora = new Hora(18, 9, 15);
        Hora horaAdiantada = new Hora(13, 0, 0);

        // Act - executar um "teste facil" e registrar a resposta
        boolean adiantada = hora.estahNaFrenteDe(horaAdiantada);

        // Assert - verificar o resultado
        assertTrue(adiantada);
    }

    @Test
    public void verificaHoraAtrasadaCorretamente() {
        // Arrange - preparar "o mundo de teste" como conveniente
        Hora hora = new Hora(18, 9, 15);
        Hora horaAdiantada = new Hora(21, 0, 0);

        // Act - executar um "teste facil" e registrar a resposta
        boolean adiantada = hora.estahNaFrenteDe(horaAdiantada);

        // Assert - verificar o resultado
        assertFalse(adiantada);
    }
}
