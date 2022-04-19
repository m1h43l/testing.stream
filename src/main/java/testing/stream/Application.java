package testing.stream;

import java.util.stream.Stream;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

public class Application {

	public static void main(String[] args) {
		new Application().run();
	}

	private void run() {
		Jdbi jdbi = new IbmiDatabaseProvider().createJdbi();
		try (Handle handle = jdbi.open()) {
			CustomerDao dao = handle.attach(CustomerDao.class);
			Stream<Customer> stream = dao.list();
			stream.forEach(customer -> System.out.println(customer));
		}
		;
	}
}
