package testing.stream;

import javax.sql.DataSource;

import com.ibm.as400.access.AS400JDBCDataSource;

public class IbmiDataSourceProvider {

	public DataSource provideDataSource() {
		String host = "your_ibmi";
		String user = "user";
		String password = "pass";
		String libraries = "library";

		AS400JDBCDataSource ds = new AS400JDBCDataSource(host, user, password);
		ds.setLibraries(libraries);
		ds.setBlockSize(32);
		return ds;

	}
}
