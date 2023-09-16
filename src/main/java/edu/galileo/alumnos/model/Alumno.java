package edu.galileo.alumnos.model;
import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name="Alumno")
@Data
public class Alumno {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String carnet;

}
