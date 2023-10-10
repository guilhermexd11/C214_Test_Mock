package test.java.br.inatel.cdg.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import main.java.br.inatel.cdg.AtendimentoProfessores;
import main.java.br.inatel.cdg.BuscaAtendimento;
import main.java.br.inatel.cdg.AtendimentoService;

public class TesteBuscaProfessor {

    AtendimentoService atendimentoService;
    BuscaAtendimento buscaAtendimento;

    @Before
    public void setup(){
        atendimentoService = new MockProfessorService();
        buscaAtendimento = new BuscaAtendimento(atendimentoService);
    }
    @Test
    public void testeBuscaMarcelo(){
        AtendimentoProfessores marcelo = buscaAtendimento.consultaInfoAtendimento("Marcelo");
        assertEquals("Marcelo", marcelo.getNomeProfessor());
        assertEquals("19h00", marcelo.getHorario());
        assertEquals("Noturno", marcelo.getPeriodo());
        assertEquals(2, marcelo.getSala());
        assertEquals(4, marcelo.getPredio(marcelo.getSala()));
    }

    @Test
    public void testeBuscaChris(){
        AtendimentoProfessores chris = buscaAtendimento.consultaInfoAtendimento("Chris");
        assertEquals("Chris", chris.getNomeProfessor());
        assertEquals("15h00", chris.getHorario());
        assertEquals("Integral", chris.getPeriodo());
        assertEquals(9, chris.getSala());
        assertEquals(4, chris.getPredio(chris.getSala()));
    }

    @Test
    public void testeBuscaRenzo(){
        AtendimentoProfessores renzo = buscaAtendimento.consultaInfoAtendimento("Renzo");
        assertEquals("Renzo", renzo.getNomeProfessor());
        assertEquals("17h30", renzo.getHorario());
        assertEquals("Integral", renzo.getPeriodo());
        assertEquals(7, renzo.getSala());
        assertEquals(4, renzo.getPredio(renzo.getSala()));
    }

    @Test
    public void testeBuscaYvo(){
        AtendimentoProfessores yvo = buscaAtendimento.consultaInfoAtendimento("Yvo");
        assertEquals("Yvo", yvo.getNomeProfessor());
        assertEquals("23h00", yvo.getHorario());
        assertEquals("Noturno", yvo.getPeriodo());
        assertEquals(14, yvo.getSala());
        assertEquals(3, yvo.getPredio(yvo.getSala()));
    }

    @Test
    public void testBuscaSoned(){
        AtendimentoProfessores soned = buscaAtendimento.consultaInfoAtendimento("Soned");
        assertEquals("Soned", soned.getNomeProfessor());
        assertEquals("10h00", soned.getHorario());
        assertEquals("Integral", soned.getPeriodo());
        assertEquals(28, soned.getSala());
        assertEquals(2, soned.getPredio(soned.getSala()));
    }

    @Test
    public void testBuscaVitor(){
        AtendimentoProfessores vitor = buscaAtendimento.consultaInfoAtendimento("Vitor");
        assertEquals("Vitor", vitor.getNomeProfessor());
        assertEquals("12h00", vitor.getHorario());
        assertEquals("Noturno", vitor.getPeriodo());
        assertEquals(0, vitor.getSala());
        assertEquals(0, vitor.getPredio(vitor.getSala()));
    }

    @Test
    public void testeSalaMarcelo() {
        AtendimentoProfessores marcelo = buscaAtendimento.consultaInfoAtendimento("Marcelo");
        assertEquals(2, marcelo.getPredio(marcelo.getSala()));

    }

    @Test
    public void testeSalaChris() {
        AtendimentoProfessores chris = buscaAtendimento.consultaInfoAtendimento("Chris");
        assertEquals(9, chris.getPredio(chris.getSala()));

    }

    @Test
    public void testeSalaRenzo() {
        AtendimentoProfessores renzo = buscaAtendimento.consultaInfoAtendimento("Renzo");
        assertEquals(7, renzo.getPredio(renzo.getSala()));

    }

    @Test
    public void testeSalaYvo() {
        AtendimentoProfessores yvo = buscaAtendimento.consultaInfoAtendimento("Yvo");
        assertEquals(14, yvo.getPredio(yvo.getSala()));
    }

    @Test
    public void testeSalaSoned() {
        AtendimentoProfessores soned = buscaAtendimento.consultaInfoAtendimento("Soned");
        assertEquals(4, soned.getPredio(soned.getSala()));
    }


    /**************[TESTES P/ CENÁRIOS DE FALHAS]**************/

    @Test
    public void testBuscaKarina(){
        AtendimentoProfessores phyll = buscaAtendimento.consultaInfoAtendimento("Karina");
        assertNotEquals("Karina", phyll.getNomeProfessor());
    }

    @Test
    public void testBuscaSamuel(){
        AtendimentoProfessores samuel = buscaAtendimento.consultaInfoAtendimento("Samuel");
        assertNotEquals("Samuel", samuel.getNomeProfessor());
    }

    @Test
    public void testBuscaMoises(){
        AtendimentoProfessores moises = buscaAtendimento.consultaInfoAtendimento("Moises");
        assertNotEquals("Moises", moises.getNomeProfessor());
    }

    @Test
    public void testBuscaGuilherme(){
        AtendimentoProfessores guilherme = buscaAtendimento.consultaInfoAtendimento("Guilherme");
        assertNotEquals("Guilherme", guilherme.getNomeProfessor());
    }

    @Test
    public void testBuscaHorarioChris(){
        AtendimentoProfessores chris = buscaAtendimento.consultaInfoAtendimento("Chris");
        assertNotEquals("21h00", chris.getHorario());
    }

    @Test
    public void testeSala28noPREDIO1() {
        AtendimentoProfessores soned = buscaAtendimento.consultaInfoAtendimento("Soned");
        assertNotEquals(1, soned.getPredio(soned.getSala()));
    }

    @Test
    public void testeSala2noPredio6() {
        AtendimentoProfessores marcelo = buscaAtendimento.consultaInfoAtendimento("Marcelo");
        assertNotEquals(3, marcelo.getPredio(marcelo.getSala()));
    }

    @Test
    public void testBuscaDaniela(){
        AtendimentoProfessores daniela = buscaAtendimento.consultaInfoAtendimento("Daniela");
        assertNotEquals("Daniela", daniela.getNomeProfessor());
    }

    @Test
    public void testBuscaPhyll(){
        AtendimentoProfessores exterexposito = buscaAtendimento.consultaInfoAtendimento("Phyll");
        assertNotEquals("Phyll", exterexposito.getNomeProfessor());
    }
}