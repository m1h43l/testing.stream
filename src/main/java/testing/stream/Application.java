package testing.stream;

import java.util.stream.Stream;

import org.jdbi.v3.core.Jdbi;

public class Application {

	public static void main(String[] args) {
		new Application().run();
	}

	private void run() {
		Jdbi jdbi = new IbmiDatabaseProvider().createJdbi();
		CustomerDao dao = jdbi.onDemand(CustomerDao.class);
		try (Stream<Customer> stream = dao.list()) {
			stream.forEach(customer -> System.out.println(customer));
		}
		;
	}
}
