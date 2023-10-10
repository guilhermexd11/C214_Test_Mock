package main.java.br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {

    AtendimentoService atendimentoService;

    public BuscaAtendimento(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    public AtendimentoProfessores consultaInfoAtendimento(String nomeProfessor){
        String atendimentoJSON = atendimentoService.consultaInfoAtendimento(nomeProfessor);

        //jsonObject é um objeto JSON feito A PARTIR DA STRING DE RETORNO
        JsonObject jsonObject = JsonParser.parseString(atendimentoJSON).getAsJsonObject();

        return new AtendimentoProfessores(jsonObject.get("nomeProfessor").getAsString(),
                jsonObject.get("horario").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsInt());
    }

    public boolean verificarArrayListExistente(String nomeProfessor){
        boolean atendimentoDisponivel = atendimentoService.atendimentoDisponivel(nomeProfessor);

        if (atendimentoDisponivel){
            return true;
        }
        else{
            return false;
        }
    }
}