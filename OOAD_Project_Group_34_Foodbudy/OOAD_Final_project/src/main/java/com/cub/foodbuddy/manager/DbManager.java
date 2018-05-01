package com.cub.foodbuddy.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.cub.foodbuddy.model.Admin;
import com.cub.foodbuddy.model.EndUser;
import com.cub.foodbuddy.model.Feedback;
import com.cub.foodbuddy.model.Host;
import com.cub.foodbuddy.model.Profile;
import com.cub.foodbuddy.model.Recommendation;

@Service
public class DbManager {
	@SuppressWarnings("deprecation")
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void saveToDb(Object object)
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		session.save(object);                                                                                                                            

		session.getTransaction().commit();                                                                                                                       

		session.close();
	}
	
	public void updateToDb(Object object)
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		session.update(object);                                                                                                                           

		session.getTransaction().commit();                                                                                                                       

		session.close();
	}
	
	public EndUser getEndUserFromDb(String userId)
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		EndUser endUser = (EndUser) session.get(EndUser.class, userId);
                                                                                                                  
		session.getTransaction().commit();
		
		session.close();
		
		return endUser;
	}
	
	public Host getHostFromDb(String userId)
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		Host host = (Host) session.get(Host.class, userId);
                                                                                                                  
		session.getTransaction().commit();
		
		session.close();
		
		return host;
	}
	
	@SuppressWarnings("unchecked")
	public List<Profile> getAllProfiles()
	{
		List<Profile> endUserProfiles = new ArrayList<>();
		List<Profile> hostProfiles = new ArrayList<>();
		List<Profile> adminProfiles = new ArrayList<>();
		
		List<Profile> allProfiles = new ArrayList<>();
		
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();
		
		endUserProfiles = session.createQuery("from EndUser").list();
		hostProfiles = session.createQuery("from Host").list();
		adminProfiles = session.createQuery("from Admin").list();
		
		session.getTransaction().commit();
		
		session.close();
		
		allProfiles.addAll(endUserProfiles);
		allProfiles.addAll(hostProfiles);
		allProfiles.addAll(adminProfiles);
		
		return allProfiles;
	}
	
	@SuppressWarnings("unchecked")
	public Profile getProfileByEmail(String email)
	{
		List<Profile> endUserProfiles = new ArrayList<>();
		List<Profile> hostProfiles = new ArrayList<>();
		List<Profile> adminProfiles = new ArrayList<>();
		
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();
		
		endUserProfiles = session.createQuery("from EndUser").list();
		
		for (Profile p : endUserProfiles)
		{
			if (p.getEmail().equals(email))
				return (EndUser)p;
		}
		
		hostProfiles = session.createQuery("from Host").list();
		for (Profile p : hostProfiles)
		{
			if (p.getEmail().equals(email))
				return (Host)p;
		}
		
		adminProfiles = session.createQuery("from Admin").list();
		for (Profile p : adminProfiles)
		{
			if (p.getEmail().equals(email))
				return (Admin)p;
		}
		
		session.getTransaction().commit();
		
		session.close();
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Profile> getProfilesByType(String type)
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();
		
		if (type.equals("endUser"))
		{
			List<Profile> endUserProfiles = new ArrayList<>();
			
			endUserProfiles = session.createQuery("from EndUser").list();
			
			return endUserProfiles;
		}
		else if (type.equals("host"))
		{
			List<Profile> hostProfiles = new ArrayList<>();
			
			hostProfiles = session.createQuery("from Host").list();
			
			return hostProfiles;
		}
		else if (type.equals("admin"))
		{
			List<Profile> adminProfiles = new ArrayList<>();
			
			adminProfiles = session.createQuery("from Admin").list();
			
			return adminProfiles;
		}
		
		session.getTransaction().commit();
		
		session.close();
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public void deleteProfile(String email)
	{
		List<Profile> endUserProfiles = new ArrayList<>();
		List<Profile> hostProfiles = new ArrayList<>();

		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();

		endUserProfiles = session.createQuery("from EndUser").list();

		for (Profile p : endUserProfiles)
		{
			if (p.getEmail().equals(email))
			{
				EndUser endUserToDelete;
				
				endUserToDelete = (EndUser) session.load(EndUser.class, email);
				session.delete(endUserToDelete);
				session.flush();
			}
				
		}

		hostProfiles = session.createQuery("from Host").list();
		for (Profile p : hostProfiles)
		{
			if (p.getEmail().equals(email))
			{
				Host hostToDelete;

				hostToDelete = (Host) session.load(Host.class, email);
				session.delete(hostToDelete);
				session.flush();
			}
		}

		session.getTransaction().commit();

		session.close();
	}
	
	public Profile getAdminFromDb(String email) {
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		Admin admin = (Admin) session.get(Admin.class, email);

		session.getTransaction().commit();

		session.close();

		return admin;
	}
	
	@SuppressWarnings("unchecked")
	public List<Host> getAllHostProfiles()
	{
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();

		List<Host> hostProfiles = new ArrayList<>();

		hostProfiles = session.createQuery("from Host").list();

		session.getTransaction().commit();

		session.close();

		return hostProfiles;
	}
	
	public void saveFeedbacksToDb(Feedback feedback){
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		session.save(feedback);                                                                                                                         

		session.getTransaction().commit();                                                                                                                       

		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Feedback> getFeedbackById(String email) {
		
		List<Feedback> feedbackInDB = new ArrayList<>();
		List<Feedback> feedbacks = new ArrayList<>();
		
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction(); 
		
		feedbackInDB = session.createQuery("from Feedback").list();
		
		for (Feedback f : feedbackInDB)
		{
			if (f.getEmail().equals(email))
			{
				feedbacks.add(f);
			}
		}
		
		return feedbacks;
	}
	
	@SuppressWarnings("unchecked")
	public List<Feedback> getFeedbackByName(String name) {

		List<Feedback> feedbackInDB = new ArrayList<>();
		List<Feedback> feedbacks = new ArrayList<>();

		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction(); 

		feedbackInDB = session.createQuery("from Feedback").list();

		for (Feedback f : feedbackInDB)
		{
			if (f.getName().equals(name))
			{
				feedbacks.add(f);
			}
		}

		return feedbacks;
	}
	
	@SuppressWarnings("unchecked")
	public List<Recommendation> getRecommendationsFromDb(){
		
		List<Recommendation> recommendationInDB = new ArrayList<>();
		
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		recommendationInDB = session.createQuery("from Recommendation").list();                                                                                                                     

		session.getTransaction().commit();                                                                                                                       

		session.close();
		
		return recommendationInDB;
	}
	
	public void saveRecommendationsToDb(Recommendation recommendation) {
		Session session = sessionFactory.openSession();                                                                                                          
		session.beginTransaction();                                                                                                                              

		session.save(recommendation);                                                                                                                      

		session.getTransaction().commit();                                                                                                                       

		session.close();
		
	}
}
