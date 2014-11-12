package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaInsereConta {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta = new Conta();
		ContaDao dao = new ContaDao(manager);
		
		conta.setTitular("Claudia");
		conta.setBanco("Santander");
		conta.setNumero("1244446-6");
		conta.setAgencia("331");
		
		manager.getTransaction().begin();
		
		dao.adiciona(conta);
		
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Conta gravada com sucesso!");
	}
}
