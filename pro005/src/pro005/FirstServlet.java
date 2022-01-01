package pro005;

public class FirstServlet extends HttpServlet{
	@Override
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	@Override
	protected void doGet(HttpServlet req, HttpServletRequest resp)
	throws ServletException, IOException{
		System.out.println("doGet 메서드 호출");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
