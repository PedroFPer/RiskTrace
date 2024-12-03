package com.ducks.risktrace.DTO;

import java.util.ArrayList;

public class RelEmprDTO {
    private String nomeEmpr;
    private ArrayList<SetorEmprDTO> listaSetorEmpr;

    public RelEmprDTO() {
        this.listaSetorEmpr = new ArrayList<>();
    }


    public RelEmprDTO(String nomeEmpr, ArrayList<SetorEmprDTO> listaSetorEmpr) {
        this.nomeEmpr = nomeEmpr;
        this.listaSetorEmpr = listaSetorEmpr;
    }


    public String getNomeEmpr() {
        return nomeEmpr;
    }

    public void setNomeEmpr(String nomeEmpr) {
        this.nomeEmpr = nomeEmpr;
    }

    public ArrayList<SetorEmprDTO> getListaSetorEmpr() {
        return listaSetorEmpr;
    }

    public void setListaSetorEmpr(SetorEmprDTO setorEmpr) {
        if (this.listaSetorEmpr == null) {
            this.listaSetorEmpr = new ArrayList<>();
        }
        this.listaSetorEmpr.add(setorEmpr);
    }
}
