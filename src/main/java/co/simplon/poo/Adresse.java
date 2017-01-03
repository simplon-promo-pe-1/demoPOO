package co.simplon.poo;

public class Adresse {
	
	private int codePostal;
	private String ville;
	private int numeroVoie;
	private String nomVoie;

	public Adresse(int numeroVoie, String nomVoie, int codePostal, String ville) {
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public int getNumeroVoie() {
		return numeroVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", ville=" + ville
				+ ", numeroVoie=" + numeroVoie + ", nomVoie=" + nomVoie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomVoie == null) ? 0 : nomVoie.hashCode());
		result = prime * result + numeroVoie;
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (codePostal != other.codePostal)
			return false;
		if (nomVoie == null) {
			if (other.nomVoie != null)
				return false;
		} else if (!nomVoie.equals(other.nomVoie))
			return false;
		if (numeroVoie != other.numeroVoie)
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}
}