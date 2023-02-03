package com.project.Carsoft_Back.entity;

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
@Table(name="propietario")
@Getter
@Setter
public class Propietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_propietario;
	@Column(name="codigo", nullable=false, length = 45, unique=false)
	private String codigo;
}
