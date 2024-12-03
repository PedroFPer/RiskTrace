package com.ducks.risktrace.DTO;

import java.util.ArrayList;

public class SetorEmprDTO {
    private String setor;
    private String etapTrab;
    private String ativExecu;
    private ArrayList<CategRiscDTO> listaCategList;

    public SetorEmprDTO() {
        this.listaCategList = new ArrayList<>();
    }

    public SetorEmprDTO(String setor, String etapTrab, String ativExecu, ArrayList<CategRiscDTO> listaCategList) {
        this.setor = setor;
        this.etapTrab = etapTrab;
        this.ativExecu = ativExecu;
        this.listaCategList = listaCategList;
    }

    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEtapTrab() {
        return etapTrab;
    }

    public void setEtapTrab(String etapTrab) {
        this.etapTrab = etapTrab;
    }

    public String getAtivExecu() {
        return ativExecu;
    }

    public void setAtivExecu(String ativExecu) {
        this.ativExecu = ativExecu;
    }

    public ArrayList<CategRiscDTO> getListaCategList() {
        return listaCategList;
    }

    public void adicListaCategList(CategRiscDTO CategRiscDTO) {
        if (this.listaCategList == null) {
            this.listaCategList = new ArrayList<>();
        }
        this.listaCategList.add(CategRiscDTO);
    }

}
