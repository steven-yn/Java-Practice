package pro005;

public class FirstServlet extends HttpServlet{
	@Override
	public void init() throws ServletException{
		System.out.println("init �޼��� ȣ��");
	}
	
	@Override
	protected void doGet(HttpServlet req, HttpServletRequest resp)
	throws ServletException, IOException{
		System.out.println("doGet �޼��� ȣ��");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
