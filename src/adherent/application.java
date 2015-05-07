package adherent;

import java.util.*;
import java.text.*;

public class application {
	
	private static adherentList list = new adherentList();
	
	public static void main(String[] args) 
	{
		initialize();
		showMenu();
	}
	
	private static void initialize() 
	{	
		list.addAdherent("Ivor","Fuller","26/03/1954");
		list.addAdherent("Gregory","Lowery","19/12/2006");
		list.addAdherent("Minerva","Cleveland","25/10/1975");
		list.addAdherent("Raven","Mcgee","12/08/1966");
		list.addAdherent("Madonna","Brewer","09/12/1998");
		list.addAdherent("Ralph","Spence","27/10/1989");
		list.addAdherent("Madison","Bowman","20/02/2010");
		list.addAdherent("Tana","Frost","16/12/1977");
		list.addAdherent("Florence","Cherry","13/10/1983");
		list.addAdherent("Xenos","Meyer","06/07/1994");	
	}
	
	private static void showMenu() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("L pour lister\r\nA pour ajouter\r\nM pour modifier\r\nV pour visualiser les informations d'un adhérent\r\nS pour supprimer\r\nSaisir votre choix : ");
		String str = sc.nextLine();
		switch (str)
		{
		  case "L":
			  list();
		    break; 
		  case "A":
			  add();
		    break;
		  case "M":
			  edit();
		    break; 
		  case "V":
			  show();
		    break; 
		  case "S":
			  delete();
		    break; 
		  default:
			  System.out.println("La saisie est incorrecte");    
		}
	}
	
	private static void list()
	{
		list.listAll();
		showMenu();
	}
	
	private static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez le prénom et le nom");
		  String prenom = sc.next();
		  String nom = sc.next();
		  System.out.println("Donnez la date de naissance (dd/mm/YYYY)");
		  String datenaiss = sc.next();
		  list.addAdherent(nom,prenom,datenaiss);
		  list.listAll();
		  showMenu();
	}
	
	private static void edit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir l'identifiant de l'adherent à modifier");
		int id1 = sc.nextInt();
		if (list.checkId(id1)) {
			System.out.println("Saisir le nouveau prénom et le nouveau nom de l'adherent");
			String prenom1 = sc.next();
			String nom1 = sc.next();
			System.out.println("Saisir la nouvelle date de naissance (dd/mm/YYYY)");
			String datenaiss1 = sc.next();
			list.updateAdherentById(id1, prenom1, nom1, datenaiss1);
			list.listAll();
		} else {
			  System.out.println("L'identifiant saisi est incorrect");
		}
		showMenu();
	}
	
	private static void show()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir l'identifiant de l'adherent à visualiser");
		  int id3 = sc.nextInt();
		  if (list.checkId(id3)) {
			  System.out.println(list.findAdherentById(id3)+"\r\n");
		  } else {
			  System.out.println("L'identifiant saisi est incorrect ou a été supprimé\r\n");
		  }
		showMenu();
	}
	
	private static void delete()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir l'identifiant de l'adherent à supprimer");
		  int id2 = sc.nextInt();
		  if (list.checkId(id2)) {
			  list.deleteAdherentById(id2);
			  list.listAll();
		  } else {
			  System.out.println("L'identifiant saisi est incorrect");
		  }
		showMenu();
	}
}