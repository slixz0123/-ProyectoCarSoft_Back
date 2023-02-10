package com.project.Carsoft_Back.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="reserva")
public class Reserva implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_reserva", nullable=false, length = 45, unique=false)
	private Long cod_reserva;
	@Column(name="lugar_reserva", nullable=false, length = 45, unique=false)
	 private String lugar_reserva;
	@Column(name="hora", nullable=false, length = 45, unique=false)
	 private String hora;

	 private Date fecha_inicio;
	 private Date fecha_fin;
	 @Column(name="forma_pago", nullable=false, length = 45, unique=false)
	 private String forma_pago;
	 
	 
	 /* @ManyToOne
	  @JoinColumn(name="id_cliente", referencedColumnName = "id_cli")
	  private Cliente cliente;*/

}
