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

@Entity
@Table(name = "producto")
@Access(FIELD)
public class Producto {

    private static final long serialVersionUID = 1921707937244377676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false, unique = true)
    private Integer codigo;
    
    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;
    
    @Column(name = "precio", nullable = false, columnDefinition="Decimal(10,2) default '0.00'")
    private double precio;
    
    @Column(name = "numero_existencias", nullable = false)
    private double numeroExistencias;

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getNumeroExistencias() {
		return numeroExistencias;
	}

	public void setNumeroExistencias(double numeroExistencias) {
		this.numeroExistencias = numeroExistencias;
	}
}

