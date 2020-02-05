package com.cts.Hibernate.Hibernateorm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	 SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	 Session session = factory.openSession();
    	 Product pd=new Product(4,"lap",247.3);
    	session.beginTransaction();
    	session.save(pd);
    	//System.out.println(pd);
    	session.getTransaction().commit();
    	
    }
}
