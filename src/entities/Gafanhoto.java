package entities;

public class Gafanhoto extends Pessoa{
	
	private Boolean login;
	private Integer totAssistido;
	
	public Gafanhoto() {
		super();
	}

	public Gafanhoto(String nome, Integer idade, Character sexo, Integer experiencia, 
			Boolean login, Integer totAssistido) {
		super(nome, idade, sexo, experiencia);
		this.login = login;
		this.totAssistido = totAssistido;
	}

	public Boolean getLogin() {
		return login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
	}

	public Integer getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(Integer totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido()+1);
	}
	
}
