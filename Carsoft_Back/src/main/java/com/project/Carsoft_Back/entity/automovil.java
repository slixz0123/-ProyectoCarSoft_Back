package com.project.Carsoft_Back.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="automovil")
@Getter
@Setter
public class automovil  implements Serializable {
	
	 
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="num_placa", nullable=false, length = 8, unique=true)
	 private String num_placa;
	 @Column(name="modelo", nullable=false, length = 50, unique=false)
	 private String modelo;
	 @Column(name="estado", nullable=false, length = 20, unique=false)
	 private String estado;
	 @Column(name="color", nullable=false, length = 25, unique=false)
	 private String color;
	 @Column(name="anio", nullable=false, length = 4, unique=false)
	 private Date anio;
	 @Column(name="marca", nullable=false, length = 20, unique=false)
	 private String marca;
	 @Column(name="tipo_vehiculo", nullable=false, length = 50, unique=false)
	 private String tipo_vehiculo;
	

}
