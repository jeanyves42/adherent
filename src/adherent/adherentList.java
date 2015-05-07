package adherent;

import java.util.*;

public class adherentList {
	
	private ArrayList<adherent> list;
	private int currentId = 0;
	private boolean checkid = false;
	
	public adherentList() {
		list = new ArrayList<adherent>();
	}
	
	public void addAdherent(String nom, String prenom, String datenaiss) {
		int id = currentId++;
		list.add( new adherent(id, nom, prenom, "", "", datenaiss, 0.0, "" ) );
	}
	
	public void listAll() 
	{
		for (Iterator<adherent> i = list.iterator() ; i.hasNext() ; ) {
			System.out.println( i.next() );
		}
		System.out.println( "\n" );
	}
	
	public void addAdherent(int id, String nom, String prenom, String datenaiss) {
		if(id <= 0 || this.findAdherentById(id) != null) {
			id = currentId++;
		}
		list.add( new adherent(id, nom, prenom, "", "", datenaiss, 0.0, "" ) );
	}

	public List<adherent> getList() {
		return list;
	}
	
	public adherent findAdherentById(int id) {
		for (adherent adherent : list) {
			if (adherent.getId() == id) {
				return adherent;
			}
		}
		return null;
	}
	
	public List<adherent> updateAdherentById(int id, String prenom, String nom, String datenaiss) {
		list.get(id).setNom(nom);
		list.get(id).setPrenom(prenom);
		list.get(id).setDatenaiss(datenaiss);
		return list;
	}
	
	public List<adherent> deleteAdherentById(int id) {
		list.remove(id);
		return list;
	}
	
	public boolean checkId(int id) {
		boolean checkid = false;
		for (adherent adherent : list) {
			if (adherent.getId() == id) {
				checkid = true;
				break;
			} else {
				checkid = false;
			}
		}
		return checkid;
	}
}
