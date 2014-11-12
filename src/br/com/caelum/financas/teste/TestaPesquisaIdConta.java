package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaPesquisaIdConta {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		Conta encontrado = new Conta();
		ContaDao dao = new ContaDao(manager);
		
		encontrado = dao.busca(1);
		
		System.out.println(encontrado.getTitular());
		
		manager.close();
	}
}
