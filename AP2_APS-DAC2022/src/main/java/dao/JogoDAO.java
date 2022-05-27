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
		j = em.find(Jogo.class, j.getId());
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	
	}
	
	public static List<Jogo> listar(){
		EntityManager em  =  JpaUtil.criarEntityManager();
		Query query = em.createQuery("SELECT jogo FROM Jogo jogo");
		List<Jogo> listaJogos = query.getResultList();
		em.close();
		return listaJogos;
	
	}
	
	public static String verificarPares() {
		EntityManager em = JpaUtil.criarEntityManager();
		String contador = (String) em.createQuery("SELECT v1,v2,v3,v4,v5,v6,v7,v8,v9,10 FROM jogo WHERE % 2 = 0").getSingleResult();
		em.close();
		return contador;
	}

}
