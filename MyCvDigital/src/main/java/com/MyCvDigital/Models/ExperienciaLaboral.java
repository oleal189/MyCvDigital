package com.MyCvDigital.Models;

import lombok.Data;

import java.util.Date;

@Data
public class ExperienciaLaboral {

    private int id;
    private String nombreCargo;
    private String nombreEmpresa;
    private String logoEmpresa;
    private Date fechaInicio;
    private Date fechaFin;
    private String paisEjecucion;
    private Tarea tareas;
}
