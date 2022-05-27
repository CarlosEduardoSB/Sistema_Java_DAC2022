package model;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Jogo {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "descricao_jogo" , nullable = false)
	private String descricao;
	@Column(name = "data_criacao_jogo" , nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao = new Date();
	@Column(name = "v1" , nullable = false)
	private Integer v1;
	@Column(name = "v2" , nullable = false, length = 40)
	private Integer v2;
	@Column(name = "v3" , nullable = false, length = 40)
	private Integer v3;
	@Column(name = "v4" , nullable = false, length = 40)
	private Integer v4;
	@Column(name = "v5" , nullable = false, length = 40)
	private Integer v5;
	@Column(name = "v6" , nullable = false, length = 40)
	private Integer v6;
	@Column(name = "v7" , nullable = false, length = 40)
	private Integer v7;
	@Column(name = "v8" , nullable = false, length = 40)
	private Integer v8;
	@Column(name = "v9" , nullable = false, length = 40)
	private Integer v9;
	@Column(name = "v10" , nullable = false, length = 40)
	private Integer v10;
	
	@Override
	public String toString() {
		return "jogo [id=" + id + ", descricao=" + descricao + ", dataCriacao=" + dataCriacao + ", v1=" + v1 + ", v2="
				+ v2 + ", v3=" + v3 + ", v4=" + v4 + ", v5=" + v5 + ", v6=" + v6 + ", v7=" + v7 + ", v8=" + v8 + ", v9="
				+ v9 + ", v10=" + v10 + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getV1() {
		return v1;
	}

	public void setV1(Integer v1) {
		this.v1 = v1;
	}

	public Integer getV2() {
		return v2;
	}

	public void setV2(Integer v2) {
		this.v2 = v2;
	}

	public Integer getV3() {
		return v3;
	}

	public void setV3(Integer v3) {
		this.v3 = v3;
	}

	public Integer getV4() {
		return v4;
	}

	public void setV4(Integer v4) {
		this.v4 = v4;
	}

	public Integer getV5() {
		return v5;
	}

	public void setV5(Integer v5) {
		this.v5 = v5;
	}

	public Integer getV6() {
		return v6;
	}

	public void setV6(Integer v6) {
		this.v6 = v6;
	}

	public Integer getV7() {
		return v7;
	}

	public void setV7(Integer v7) {
		this.v7 = v7;
	}

	public Integer getV8() {
		return v8;
	}

	public void setV8(Integer v8) {
		this.v8 = v8;
	}

	public Integer getV9() {
		return v9;
	}

	public void setV9(Integer v9) {
		this.v9 = v9;
	}

	public Integer getV10() {
		return v10;
	}

	public void setV10(Integer v10) {
		this.v10 = v10;
	}
	
	public String mostrarPares() {
		 ArrayList<Integer> lista = new ArrayList();
		
		if (v1 % 2 == 0 ) {
			lista.add(v1);
			
		}
		
		if (v2 % 2 == 0 ) {
			lista.add(v2);
			
		}
		
		if (v3 % 2 == 0 ) {
			lista.add(v3);
			
		}
		
		if (v4 % 2 == 0 ) {
			lista.add(v4);
			
		}
		
		if (v5 % 2 == 0 ) {
			lista.add(v5);
			
		}
		
		if (v6 % 2 == 0 ) {
			lista.add(v6);
			
		}
		
		if (v7 % 2 == 0 ) {
			lista.add(v7);
			
		}
		
		if (v8 % 2 == 0 ) {
			lista.add(v8);
			
		}
		
		if (v9 % 2 == 0 ) {
			lista.add(v9);
			
		}
		
		if (v10 % 2 == 0 ) {
			lista.add(v10);
			
		}
		
		return lista.toString();
		
		
	}
	
	
	
	

}
