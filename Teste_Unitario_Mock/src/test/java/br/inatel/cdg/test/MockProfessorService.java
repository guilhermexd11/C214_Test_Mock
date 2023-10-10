package test.java.br.inatel.cdg.test;

import java.util.ArrayList;
import main.java.br.inatel.cdg.AtendimentoService;

public class MockProfessorService implements AtendimentoService {

    @Override
    public String consultaInfoAtendimento(String nomeProfessor) {

        if (nomeProfessor == "Marcelo"){
            return ProfessorConst.Marcelo;
        }else if (nomeProfessor == "Chris"){
            return ProfessorConst.Chris;
        }else if (nomeProfessor == "Renzo"){
            return ProfessorConst.Chris;
        }else if(nomeProfessor == "Yvo"){
            return ProfessorConst.Yvo;
        }else if(nomeProfessor == "Soned"){
            return ProfessorConst.Soned;
        }else{
            return ProfessorConst.Vitor;
        }
    }

    @Override
    public boolean atendimentoDisponivel(String nomeProfessor) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Marcelo");
        list.add("Chris");
        list.add("Renzo");
        list.add("Yvo");
        list.add("Soned");

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(nomeProfessor) || list.get(i).equals(nomeProfessor)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}