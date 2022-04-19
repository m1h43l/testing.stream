package testing.stream;

import javax.sql.DataSource;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

public class IbmiDatabaseProvider {

	DataSource dataSource;

	public Jdbi createJdbi() {
		Jdbi jdbi = Jdbi.create(new IbmiDataSourceProvider().provideDataSource());
		jdbi.installPlugin(new SqlObjectPlugin());
		return jdbi;
	}

	public Jdbi provideJdbi() {
		return createJdbi();
	}

	public Handle provideDatabaseHandle() {
		return createJdbi().open();
	}
}
