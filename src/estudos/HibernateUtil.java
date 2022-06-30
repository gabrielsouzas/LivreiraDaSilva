package estudos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory () throws Exception{
		if (sf == null){
			Configuration cfg = new Configuration();
			cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
			cfg.setProperty("hibernate.connection.username", "postgres");
			cfg.setProperty("hibernate.connection.password", "pingaiada");
			cfg.setProperty("hibernate.connection.url", "jdbc:postgresql:bancoLivreiraDaSilva");
			cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
			cfg.setProperty("hibernate.current_session_context_class", "thread");
			cfg.setProperty("hibernate.show_sql", "true");
			cfg.addClass(Editora.class);
			cfg.addClass(Livro.class);
			sf = cfg.buildSessionFactory();
		}
		return sf;
		
	}

	public static Session getSession() throws Exception{
		SessionFactory s = getSessionFactory();
		return s.getCurrentSession();
	}
	
	public static void begin() throws Exception{
		getSession().getTransaction().begin();
	}
	
	public static void commit() throws Exception{
		getSession().getTransaction().commit();
	}
	
}
