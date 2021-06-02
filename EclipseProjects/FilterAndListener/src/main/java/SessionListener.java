import javax.servlet.http.*;

public class SessionListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent se) {	
		System.out.println("A new Session is created");
	}
	
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session Destroyed");
	}
}