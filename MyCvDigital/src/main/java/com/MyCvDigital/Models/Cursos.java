package com.MyCvDigital.Models;

import lombok.Data;

import java.util.Date;

@Data
public class Cursos {

    private int id;
    private String nombreCurso;
    private String anno;
    private Date fechaInicio;
    private Date fechaFin;

}
