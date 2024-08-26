import org.example.Velocista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VelocistaTest {

    @Test
    void deveAprovar() {
        Velocista velocista = new Velocista();
        velocista.setTesteResistencia(4.0f);
        velocista.setTesteVelocidade(8.0f);
        assertEquals("Passou no teste físico", velocista.verificarTestesFísicos());
    }

    @Test
    void deveReprovar() {
        Velocista velocista = new Velocista();
        velocista.setTesteResistencia(6.0f);
        velocista.setTesteResistencia(5.9f);
        assertEquals("Reprovou no teste físico", velocista.verificarTestesFísicos());
    }

    @Test
    void deveRetornarInformacoes() {
        Velocista velocista = new Velocista();
        velocista.setTesteVelocidade(7.0f);
        velocista.setTesteResistencia(1.0f);
        velocista.setNome("Ciclano");
        velocista.setInscricao(123456);
        assertEquals("Velocista{Número de Inscrição=123456, nome='Ciclano', resultado=Reprovou no teste físico}", velocista.getInfo());
    }
}