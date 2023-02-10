package com.project.Carsoft_Back.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cliente")
public class Cliente extends Persona  {
	 /**
	  * 
	  */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cli")
	private Long id_cli;
	
	@Column(name="comprobante", nullable=false, length = 45, unique=false)
	private String comprobante;
 
	
/*	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL)
	 private List<Reserva> reservas;*/
	 
	

}
