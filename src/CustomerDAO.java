import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDAO {
	private Session session = null;

	public void createSession() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		this.session = sf.getCurrentSession();
	}

	public Customer create(Customer newCustomer) {
		Transaction transaction = session.beginTransaction();
		session.save(newCustomer);
		transaction.commit();
		return newCustomer;
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("Hibernate Example Customer");

		System.out.println("Customer id before creation:" + customer.getCustomerId());
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.createSession();
		Customer persistedCustomer = customerDAO.create(customer);
		System.out.println("Customer id after creation:" + persistedCustomer.getCustomerId());
		
		customerDAO.createSession();
		List<Customer> listCust = customerDAO.listAllCustomer();
		for (Customer cust: listCust)
		{
			System.out.println("[Customer ID #"+ cust.getCustomerId()+ " AND Customer Name is # "+ cust.getCustomerName() +"]" );
			
		}
	}
	
	
	public List<Customer> listAllCustomer() {
		Transaction transaction = session.beginTransaction();

		String hql = "FROM Customer";
		Query query = session.createQuery(hql);
		List<Customer> results = query.list();
		
		//session.save(newCustomer);
		//transaction.commit();
		return results;
	}
}
