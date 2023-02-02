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
@Table(name="alquiler")
@Getter
@Setter

public class Alquiler  implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id_alquiler;
	 @Column(name="num_dias_alquiler", nullable=false, length = 10, unique=false)
	 private String num_dias_alquiler;
	 @Column(name="precio_alquiler", nullable=false, unique=false)
	 private Double precio_alquiler;
	 
	 private Date fecha_salida;
     private Date fecha_entrega;
     
     
     @Column(name="documento_garantia", nullable=false, length = 15, unique=false)
	 private String documento_garantia;
     @Column(name="descripcion_alquiler", nullable=false, length = 150, unique=false)
	 private String descripcion_alquiler;
     @Column(name="precio_total", nullable=false, unique=false)
	 private Double precio_total;
	 
	 
}
