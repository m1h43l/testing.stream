package testing.stream;

import java.util.stream.Stream;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface CustomerDao {

	@RegisterBeanMapper(Customer.class)
	@SqlQuery("SELECT c.NAME, c.BUSINESSID FROM CUSTOMER c FETCH FIRST 10 ROWS ONLY")
	Stream<Customer> list();
}
