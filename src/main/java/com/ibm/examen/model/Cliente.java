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
@Table(name = "cliente")
@Access(FIELD)
public class Cliente {

    private static final long serialVersionUID = 1921707937244377676L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false, unique = true)
    private Integer codigo;
    
    @Column(name = "nombre", nullable = false, length = 80)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 80)
    private String apellido;

    @Column(name = "direccion", nullable = false, length = 250)
    private String direccion;
    
    @Column(name = "telefono", nullable = false, length = 250)
    private String telefono;
    
    @Column(name = "email", nullable = false, length = 60)
    private String email;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}


