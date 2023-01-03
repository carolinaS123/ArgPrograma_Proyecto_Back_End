package com.portfoliocemsArgProg.backportfoliocsalanova.dto;

public class EducacionDto {
    private String institucion;
    private String titulacion;
    private String inicio_edu;
    private String fin_edu;
    private String descripcion_edu;

    public EducacionDto() {
    }

    public EducacionDto(String institucion, String titulacion, String inicio_edu, String fin_edu, String descripcion_edu) {
        this.institucion = institucion;
        this.titulacion = titulacion;
        this.inicio_edu = inicio_edu;
        this.fin_edu = fin_edu;
        this.descripcion_edu = descripcion_edu;
    }


}
