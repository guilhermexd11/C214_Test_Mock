package main.java.br.inatel.cdg;

public class AtendimentoProfessores {

    private String nomeProfessor;
    private String horario;
    private String periodo;
    private int sala;

    public AtendimentoProfessores(String nomeProfessor, String horario, String periodo, int sala) {
        this.nomeProfessor = nomeProfessor;
        this.horario = horario;
        this.periodo = periodo;
        this.sala = sala;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getHorario() {
        return horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getSala() {
        return sala;
    }

    public int getPredio(int sala) {
        int predio;
        if( sala >= 1 && sala <= 5 ){
            predio = 1;
            return predio;
        }
        else if( sala >= 6 && sala <= 10 ){
            predio = 2;
            return predio;
        }
        else if( sala >= 11 && sala <= 15 ){
            predio = 3;
            return predio;
        }
        else if( sala >= 16 && sala <= 20 ){
            predio = 4;
            return predio;
        }
        else if( sala >= 21 && sala <= 25 ){
            predio = 6;
            return predio;
        }
        else{
            predio = 0;
            return predio;
        }
    }
}