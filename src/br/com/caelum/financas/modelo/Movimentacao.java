package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class Movimentacao {
	
	private Integer Id;
	private String descricao;
	private Calendar data;
	private BigDecimal valor;
	private Conta conta;
	
}
