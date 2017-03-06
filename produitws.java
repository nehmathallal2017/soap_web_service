package travail2pkj;
import java.util.*;
import entities.*;

public class produitws {
public produit findd(){
	return new produit("1","pop corn",1250);}
	public List<produit> findall(){
		List<produit> listprdobj = new ArrayList<produit>();
		listprdobj.add(new produit("12","Marlboro",2000));
		listprdobj.add(new produit("13","mars",750));
		listprdobj.add(new produit("14","twix",1000));
		return listprdobj;
	}
	
}

