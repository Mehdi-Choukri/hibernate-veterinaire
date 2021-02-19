package domaine.test;

import java.util.List;

import org.apache.log4j.BasicConfigurator;

import domaine.dao.UtilisateurDao;
import domaine.model.Utilisateur;

public class Main {

	public static void main(String[] args) {
		 
		//BasicConfigurator.configure();
		UtilisateurDao UD = new UtilisateurDao();
	 
		
		 
		
		List<Utilisateur> list = UD.getAllUtilisateurs();
		for (Utilisateur utilisateur2 : list) {
			System.out.println(utilisateur2.toString());
			
		}
		
		
		
 
		
	}

}
