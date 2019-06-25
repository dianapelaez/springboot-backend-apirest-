package com.ibm.examen.model;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import static javax.persistence.AccessType.FIELD;

import java.util.Objects;

@Entity
@Table(name = "tarjeta")
@Access(FIELD)
public class Tarjeta {

    private static final long serialVersionUID = 1921707937244377676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false, unique = true)
    private Integer codigo;
    
    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;
    
    @Column(name = "franquicia", nullable = false, length = 80)
    private String franquicia;
    
    @Column(name = "cupo", nullable = false,  columnDefinition="Decimal(10,2)")
    private double cupo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public double getCupo() {
		return cupo;
	}

	public void setCupo(double cupo) {
		this.cupo = cupo;
	}
}