package pruebas;

import java.util.List;

import dao.SubjectDAO;
import dao.SubjectDAOImplement;
import model.Subject;

public class Prueba01 {
	
	public static void main(String[] args) {
	
	SubjectDAO subject = new SubjectDAOImplement();
	List<Subject> lista = subject.findAll();
	for (Subject r: lista) {
		System.out.println(r.getIdsubject());
		System.out.println(r.getSubject());
		System.out.println(r.getCredits());
		
		
	   }
	}

}
