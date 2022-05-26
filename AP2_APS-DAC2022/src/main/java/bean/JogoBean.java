package bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import dao.JogoDAO;
import model.Jogo;

public class JogoBean {
	private Jogo jogo = new Jogo();
	private List<Jogo> listajogos;
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
	

}
