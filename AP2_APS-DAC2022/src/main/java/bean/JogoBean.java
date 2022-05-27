package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import dao.JogoDAO;
import model.Jogo;

@ManagedBean
public class JogoBean {
	private Jogo jogo = new Jogo();
	private List<Jogo> listaJogos;
	private Random valorAletorio = new Random();
	
	public void salvar() {
		jogo.setV1(valorAletorio.nextInt(30));
		jogo.setV2(valorAletorio.nextInt(30));
		jogo.setV3(valorAletorio.nextInt(30));
		jogo.setV4(valorAletorio.nextInt(30));
		jogo.setV5(valorAletorio.nextInt(30));
		jogo.setV6(valorAletorio.nextInt(30));
		jogo.setV7(valorAletorio.nextInt(30));
		jogo.setV8(valorAletorio.nextInt(30));
		jogo.setV9(valorAletorio.nextInt(30));
		jogo.setV10(valorAletorio.nextInt(30));
		JogoDAO.salvar(jogo);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Solicitação Bem-Sucedido", "Jogo Registrado com Sucesso!"));
	}
	
	public void editar() {
		JogoDAO.editar(jogo);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
				"Solicitação Bem-Sucedido","Jogo Editado com Sucesso"));
	}
	
	public void mostrarPares1() {
		String pares = JogoDAO.verificarPares();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Solicitação Bem-Sucedido", "Existem " + pares + " Sobremesas Registradas!"));
	}
	
	public void mostrarPares12(Jogo jogo) {
		String numeros;
		numeros = jogo.mostrarPares();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Solicitação Bem-Sucedido", "Os números pares são: " + numeros));
		
	}
	
	public void excluir(Jogo jogo) {
		JogoDAO.excluir(jogo);
		listaJogos.remove(jogo);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
				"Solicitação Bem-Sucedido", "Jogo Excluído com Sucesso!"));
	}
	
	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getlistaJogos() {

		if (listaJogos == null) {
			listaJogos = JogoDAO.listar();
		}

		return listaJogos;
	}

	public void setListajogos(List<Jogo> listajogos) {
		this.listaJogos = listajogos;
	}
	
	

}
