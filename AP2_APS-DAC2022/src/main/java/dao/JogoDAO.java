package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Jogo;
import util.JpaUtil;

public class JogoDAO {
	public static void salvar(Jogo j) {
		EntityManager em  =  JpaUtil.criarEntityManager(); 
		em.getTransaction().begin(); 
		em.persist(j); 
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static void editar(Jogo j) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.merge(j); 
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Jogo j) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	
	}
	
	public static List<Jogo> listar(){
		EntityManager em  =  JpaUtil.criarEntityManager();
		Query query = em.createQuery("SELECT sobremesa FROM Sobremesa sobremesa");
		List<Jogo> listaSobremesas = query.getResultList();
		em.close();
		return listaSobremesas;
	
	}

}
