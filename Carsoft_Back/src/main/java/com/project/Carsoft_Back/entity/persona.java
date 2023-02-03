package com.project.Carsoft_Back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Table(name="persona")
@Getter
@Setter
@MappedSuperclass
public class persona implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_persona;
	@Column(name="nombre", nullable=false, length = 45, unique=false)
	private String nombre;
	@Column(name="apellido", nullable=false, length = 45, unique=false)
	private String apellido ;
	@Column(name="direccion", nullable=false, length = 100, unique=false)
	private String direccion;
	@Column(name="telefono", nullable=false, length = 10, unique=false)
	private String telefono;
	@Column(name="correo", nullable=false, length = 45, unique=true)
	private String correo;
	@Column(name="edad", nullable=false, length = 50, unique=false)
	private int edad;
	@Column(name="usuario", nullable=false, length = 10, unique=true)
	private String usuario;
	@Column(name="contraseña", nullable=false, length = 15, unique=false)
	private String contraseña;
	@Column(name="ciudad", nullable=false, length = 20, unique=false)
	private String ciudad;
	@Column(name="genero", nullable=false, length = 20, unique=false)
	private String genero;
	
	
}
