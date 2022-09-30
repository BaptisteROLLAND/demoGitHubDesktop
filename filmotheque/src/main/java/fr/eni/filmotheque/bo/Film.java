package fr.eni.filmotheque.bo;

public class Film {
	private long id;
	private String nom;
	private int annee;
	private int duree;
	private String synopsis;
	private Genre genre;
	
	public Film() {
	}
	
	public Film(long id, String nom, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.nom = nom;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.genre= genre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Film [nom=" + nom + "]";
	}

}
