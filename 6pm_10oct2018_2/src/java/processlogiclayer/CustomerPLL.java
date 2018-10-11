package processlogiclayer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import repositorio.Customer;
import repositorio.NorthwindFactory;
import repositorio.NorthwindRepositorySingleton;

/**
 *
 * @author ONivia
 */
public class CustomerPLL {
    public CustomerPLL() {
    }
    
    public static Customer obtenerCustomer(String customerid) {
        Logger.getRootLogger().setLevel(Level.ERROR);
                        
        NorthwindFactory repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
        Customer cust = null;        
        Query query = null;
        
        query = repositorioNorthwind.getSession().createQuery("FROM Customer WHERE CustomerID = :CustomerID");
        query.setString("CustomerID", customerid);        
        cust = (Customer)query.uniqueResult();
        
        return cust;
    }
}
