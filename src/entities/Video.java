package entities;

public class Video implements AcoesVideo{
	
	private String titulo;
	private Integer avaliacao;
	private Integer views;
	private Integer curtidas;
	private Boolean reproduzindo;
	
	public Video() {
		
	}

	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public  Integer getCurtidas() {
		return curtidas;
	}

	private void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public Boolean getReproduzindo() {
		return reproduzindo;
	}

	private void setReproduzindo(Boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas()+1);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo: " + this.titulo);
		sb.append("\nAvaliacoes: " + this.getAvaliacao());
		sb.append("\nLikes: " + this.getCurtidas());
		sb.append("\nReproduzindo: " + this.getReproduzindo());
		return sb.toString();
	}
}
