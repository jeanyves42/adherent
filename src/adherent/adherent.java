package adherent;

import java.util.Date;

public class adherent {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codepostal;
	private String datenaiss;
	private double cotisation;
	private String datecotisation;
	
	public adherent() {
		
	}
	
	public adherent(int id, String nom, String prenom, String adresse, String codepostal, String datenaiss, double cotisation, String datecotisation) {
		this.setId(id);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adresse);
		this.setCodepostal(codepostal);
		this.setDatenaiss(datenaiss);
		this.setCotisation(cotisation);
		this.setDatecotisation(datecotisation);
	}
	
	public String toString() {
		return "id = " + this.getId() + ", nom = " + this.getNom() + ", prenom = " + this.getPrenom() + ", adresse = " + this.getAdresse() + ", codepostal = " + this.getCodepostal() + ", datenaissance = " + this.getDatenaiss() + ", cotisation = " + this.getCotisation() + ", datecotisation = " + this.getDatecotisation();
	}
	
	/*public static void main(String[] args) {
	    System.out.println("Hello World !");
	}*/

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @return the codepostal
	 */
	public String getCodepostal() {
		return codepostal;
	}

	/**
	 * @return the datenaiss
	 */
	public String getDatenaiss() {
		return datenaiss;
	}

	/**
	 * @return the cotisation
	 */
	public double getCotisation() {
		return cotisation;
	}

	/**
	 * @return the datecotisation
	 */
	public String getDatecotisation() {
		return datecotisation;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param codepostal the codepostal to set
	 */
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	/**
	 * @param datenaiss the datenaiss to set
	 */
	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	/**
	 * @param cotisation the cotisation to set
	 */
	public void setCotisation(double cotisation) {
		this.cotisation = cotisation;
	}

	/**
	 * @param datecotisation the datecotisation to set
	 */
	public void setDatecotisation(String datecotisation) {
		this.datecotisation = datecotisation;
	}

}


