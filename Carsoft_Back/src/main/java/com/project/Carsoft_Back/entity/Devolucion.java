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
@Table(name="devolucion")
@Getter
@Setter
public class Devolucion  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_dv;
	
	private Date fecha_dv;
	@Column(name="lugar_dv", nullable=false, length = 45, unique=false)
	private String lugar_dv;
	 
	 
}
