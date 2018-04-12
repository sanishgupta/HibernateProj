import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetailTransactionDAO {

	
	
	private Session session = null;

	public void createSession() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		this.session = sf.getCurrentSession();
	}

	
	
	/*public RetailTransaction create(RetailTransaction retailTransaction) {
		Transaction transaction = session.beginTransaction();
		session.save(retailTransaction);
		transaction.commit();
		return retailTransaction;
	}*/
	
	
	public List<RetailTransaction> listAllRetailTransaction() {
		Transaction transaction = session.beginTransaction();

		String hql = "FROM RetailTransaction";
		Query query = session.createQuery(hql);
		List<RetailTransaction> results = query.list();
		
		//session.save(newCustomer);
		//transaction.commit();
		return results;
	}
	
	public static void main(String[] args) {
		
		
		RetailTransactionDAO retailTransactionDAO = new RetailTransactionDAO();
		retailTransactionDAO.createSession();
		
		List<RetailTransaction> listCust = retailTransactionDAO.listAllRetailTransaction();
		for (RetailTransaction cust: listCust)
		{
			//System.out.println("[Customer ID #"+ cust.getCustomerId()+ " AND Customer Name is # "+ cust.getCustomerName() +"]" );
			/*System.out.print("[Customer ID #"+ cust.getRetailStoreID()+ "|");
			System.out.print("[Customer ID #"+ cust.getTransactionSequenceNumber()+ "|");
			System.out.print("[Customer ID #"+ cust.getBusinessDayDate()+ "|");
			System.out.println("[Customer ID #"+ cust.getWorkstationID()+ "|");
			*/
			
			System.out.println(cust.getTransactionSequenceNumber());
						
		}

	}

}
