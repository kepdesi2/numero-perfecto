package basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Perfecto
 */
@WebServlet("/Perfecto")
public class Perfecto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Perfecto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int numero = 2;
		int cont1 = 1;
		int suma = 0;
		int perfectos = 0 ;
		while(perfectos<4) {
			while(cont1<numero) {
				if (numero%cont1==0) {
					suma = suma + cont1;
				}	
				cont1++;
			}
			
			if (numero==suma) {
				System.out.println(numero+" es perfecto");
				perfectos ++;
			}
			numero ++;
			cont1 = 1;
			suma = 0;
		}
	}

}
