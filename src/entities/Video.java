package entities;

public class Video implements AcoesVideo{
	
	private String titulo;
	private Double avaliacao;
	private Double views;
	private Integer curtidas;
	private Boolean reproduzindo;
	
	public Video() {
		
	}

	public Video(String titulo, Double avaliacao, Double views,
			Integer curtidas) {
		this.titulo = titulo;
		this.avaliacao = avaliacao;
		this.views = views;
		this.curtidas = curtidas;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Double getViews() {
		return views;
	}

	public void setViews(Double views) {
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
	
	
}
