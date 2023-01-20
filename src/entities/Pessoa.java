package entities;

public abstract class  Pessoa {
	
	protected String nome;
	protected Integer idade;
	protected Character sexo;
	protected Integer experiencia; 
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Integer idade, Character sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	protected void ganharExp() {
		this.setExperiencia(this.getExperiencia()+1);
	}
	

	
}
