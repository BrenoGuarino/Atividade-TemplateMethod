
import org.example.Ginasta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GinastaTest {

    @Test
    void deveAprovar() {
        Ginasta atleta = new Ginasta();
        atleta.setTesteVelocidade(7.0f);
        atleta.setTesteResistencia(7.0f);
        assertEquals("Passou no teste físico", atleta.verificarTestesFísicos());
    }

    @Test
    void deveReprovar() {
        Ginasta atleta = new Ginasta();
        atleta.setTesteVelocidade(7.0f);
        atleta.setTesteResistencia(6.9f);
        assertEquals("Reprovou no teste físico", atleta.verificarTestesFísicos());
    }

    @Test
    void deveRetornarInformacoes() {
        Ginasta atleta = new Ginasta();
        atleta.setTesteVelocidade(7.0f);
        atleta.setTesteResistencia(7.0f);
        atleta.setNome("Fulano");
        atleta.setInscricao(123456);
        assertEquals("Ginasta{Número de Inscrição=123456, nome='Fulano', resultado=Passou no teste físico}", atleta.getInfo());
    }
}