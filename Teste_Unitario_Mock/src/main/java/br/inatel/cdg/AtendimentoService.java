package main.java.br.inatel.cdg;

public interface AtendimentoService {
    public String consultaInfoAtendimento(String nomeProfessor);

    public boolean atendimentoDisponivel(String nomeProfessor);

}