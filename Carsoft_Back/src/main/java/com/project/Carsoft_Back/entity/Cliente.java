package com.project.Carsoft_Back.entity;

import java.util.List;

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

@Entity
@Table(name="cliente")
@Getter
@Setter
public class Cliente extends persona {
	 /**
	  * 
	  */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	@Column(name="comprobante", nullable=false, length = 45, unique=false)
	private String comprobante;
 
	/* @JsonIgnore
	 @OneToMany(mappedBy="cliente")
	 private List<Alquiler> alquileres;*/
	

}
