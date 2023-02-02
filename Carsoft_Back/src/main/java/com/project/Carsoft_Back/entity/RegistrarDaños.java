package com.project.Carsoft_Back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="registrarDaños")
@Getter
@Setter
public class RegistrarDaños  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_rgd;
	@Column(name="descripcion", nullable=false, length = 45, unique=false)
	private String descripcion;
	@Column(name="precio", nullable=false, unique=false)
	private Double precio;

}
