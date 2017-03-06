package travail2;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.*;
import ws.ProduitwsStub.Produit;
import ws.MMMStub.*;
import ws.ProduitwsStub.*;
/**
 * Servlet implementation class demcontroller
 */
public class demcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }



	
	 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{PrintWriter out = response.getWriter();

response.setContentType("text/html");
try{
	// call service MMM 
MMMStub ds = new MMMStub();
ProduitwsStub ps = new ProduitwsStub();
out.println("<h3>Demo client avec deux services :1_affichage d'un texte , 2:récupération de la liste des produits</h3>");


out.println(ds.bnj(new Bnj()).get_return());
Produit p = ps.findd(new Findd()).get_return();
out.print("<h3>les informations  d'un seul produit sont : </h3>");
out.print("<br> numéro : " + p.getId());
out.print("<br> nom : " + p.getName());
out.print("<br> prix : " + p.getPrice());
out.print("<h3>les informations consommées de la liste des produits sont:</h3>");
for (Produit pr : ps.findall(new Findall()).get_return()){
	out.print("<br> numéro produit : " + pr.getId());
	out.print("<br> nom produit : " + pr.getName());
	out.print("<br> prix produit : " + pr.getPrice());
	out.print("<br>==================================");
}
}

catch (Exception e){
 out.print(e.getMessage());
 			
	}

}
				/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
