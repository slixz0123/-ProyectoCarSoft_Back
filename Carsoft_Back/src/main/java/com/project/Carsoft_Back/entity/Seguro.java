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
@Table(name="seguro")
@Getter
@Setter
public class Seguro  implements Serializable{
	


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_seguro;
	@Column(name="lugar_reserva", nullable=false, length = 50, unique=false)
	private String nom_seguro;
	@Column(name="precio_seguro", nullable=false, unique=false)
	private Double precio_seguro;
}
