package entities;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private Integer totAssistido;
	
	public Gafanhoto() {
		super();
	}

	public Gafanhoto(String nome, Integer idade, Character sexo, 
			String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + this.nome);
		sb.append("\nIdade: " + this.idade);
		sb.append("\nSexo: " + this.sexo);
		sb.append("\nLogin: " + this.login);
		sb.append("\nTotal Assistido: " + this.totAssistido);
		return sb.toString();
	}
	
	
}
