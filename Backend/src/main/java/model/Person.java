package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "Civilite")
	private String Civilite;
	
	@Column(name = "Nom")
	private String Nom;

	@Column(name = "Prenom")
	private String Prenom;
	
	@Column(name = "Date_naissance")
	private String Date_naissance;
	
	@Column(name = "N_enfants")
	private int N_enfants;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Telephone")
	private int Telephone;
	
	@Column(name = "Telephone2")
	private int Telephone2;
	
	@Column(name = "Mobile")
	private int Mobile;
	
	@Column(name = "Adresse")
	private String Adresse;
	
	@Column(name = "Pays")
	private String Pays;
	
	@Column(name = "Ville")
	private String Ville;
	
	@Column(name = "Rue")
	private String Rue;
	
	@Column(name = "RueN")
	private String RueN;
	
	@Column(name = "Codepostal")
	private int Codepostal;
	
	@Column(name = "ComplementAdresse")
	private String ComplementAdresse;
	
	@Column(name = "Motscles")
	private String Motscles;
	
	@Column(name = "Commantaire")
	private String Commantaire;
	
	@Column(name = "Relation")
	private String Relation;
	
	@Column(name = "elements")
	private String elements;
	
	
	
	
	public Person(long id, String civilite, String nom, String prenom, String date_naissance, int n_enfants,
			String email, int telephone, int telephone2, int mobile, String adresse, String pays, String ville,
			String rue, String rueN, int codepostal, String complementAdresse, String motscles, String commantaire,
			String relation, String elements) {
		super();
		this.id = id;
		Civilite = civilite;
		Nom = nom;
		Prenom = prenom;
		Date_naissance = date_naissance;
		N_enfants = n_enfants;
		Email = email;
		Telephone = telephone;
		Telephone2 = telephone2;
		Mobile = mobile;
		Adresse = adresse;
		Pays = pays;
		Ville = ville;
		Rue = rue;
		RueN = rueN;
		Codepostal = codepostal;
		ComplementAdresse = complementAdresse;
		Motscles = motscles;
		Commantaire = commantaire;
		Relation = relation;
		this.elements = elements;
	}


	public Person() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCivilite() {
		return Civilite;
	}


	public void setCivilite(String civilite) {
		Civilite = civilite;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public String getDate_naissance() {
		return Date_naissance;
	}


	public void setDate_naissance(String date_naissance) {
		Date_naissance = date_naissance;
	}


	public int getN_enfants() {
		return N_enfants;
	}


	public void setN_enfants(int n_enfants) {
		N_enfants = n_enfants;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getTelephone() {
		return Telephone;
	}


	public void setTelephone(int telephone) {
		Telephone = telephone;
	}


	public int getTelephone2() {
		return Telephone2;
	}


	public void setTelephone2(int telephone2) {
		Telephone2 = telephone2;
	}


	public int getMobile() {
		return Mobile;
	}


	public void setMobile(int mobile) {
		Mobile = mobile;
	}


	public String getAdresse() {
		return Adresse;
	}


	public void setAdresse(String adresse) {
		Adresse = adresse;
	}


	public String getPays() {
		return Pays;
	}


	public void setPays(String pays) {
		Pays = pays;
	}


	public String getVille() {
		return Ville;
	}


	public void setVille(String ville) {
		Ville = ville;
	}


	public String getRue() {
		return Rue;
	}


	public void setRue(String rue) {
		Rue = rue;
	}


	public String getRueN() {
		return RueN;
	}


	public void setRueN(String rueN) {
		RueN = rueN;
	}


	public int getCodepostal() {
		return Codepostal;
	}


	public void setCodepostal(int codepostal) {
		Codepostal = codepostal;
	}


	public String getComplementAdresse() {
		return ComplementAdresse;
	}


	public void setComplementAdresse(String complementAdresse) {
		ComplementAdresse = complementAdresse;
	}


	public String getMotscles() {
		return Motscles;
	}


	public void setMotscles(String motscles) {
		Motscles = motscles;
	}


	public String getCommantaire() {
		return Commantaire;
	}


	public void setCommantaire(String commantaire) {
		Commantaire = commantaire;
	}


	public String getRelation() {
		return Relation;
	}


	public void setRelation(String relation) {
		Relation = relation;
	}


	public String getElements() {
		return elements;
	}


	public void setElements(String elements) {
		this.elements = elements;
	}
	

	
	
	
	
}