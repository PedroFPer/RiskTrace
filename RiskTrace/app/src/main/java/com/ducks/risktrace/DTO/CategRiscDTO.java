package com.ducks.risktrace.DTO;

public class CategRiscDTO {
    private String risco;
    private String agentes;
    private String meioDePropa;
    private String fonteGerad;
    private String danos;
    private String probabil;
    private String severid;
    private String signif;
    private String medImplan;
    private String respons;


    public CategRiscDTO() {}


    public CategRiscDTO(String risco, String agentes, String meioDePropa, String fonteGerad,
                        String danos, String probabil, String severid, String signif,
                        String medImplan, String respons) {
        this.risco = risco;
        this.agentes = agentes;
        this.meioDePropa = meioDePropa;
        this.fonteGerad = fonteGerad;
        this.danos = danos;
        this.probabil = probabil;
        this.severid = severid;
        this.signif = signif;
        this.medImplan = medImplan;
        this.respons = respons;
    }

    // Getters e Setters
    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public String getAgentes() {
        return agentes;
    }

    public void setAgentes(String agentes) {
        this.agentes = agentes;
    }

    public String getMeioDePropa() {
        return meioDePropa;
    }

    public void setMeioDePropa(String meioDePropa) {
        this.meioDePropa = meioDePropa;
    }

    public String getFonteGerad() {
        return fonteGerad;
    }

    public void setFonteGerad(String fonteGerad) {
        this.fonteGerad = fonteGerad;
    }

    public String getDanos() {
        return danos;
    }

    public void setDanos(String danos) {
        this.danos = danos;
    }

    public String getProbabil() {
        return probabil;
    }

    public void setProbabil(String probabil) {
        this.probabil = probabil;
    }

    public String getSeverid() {
        return severid;
    }

    public void setSeverid(String severid) {
        this.severid = severid;
    }

    public String getSignif() {
        return signif;
    }

    public void setSignif(String signif) {
        this.signif = signif;
    }

    public String getMedImplan() {
        return medImplan;
    }

    public void setMedImplan(String medImplan) {
        this.medImplan = medImplan;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }
}
