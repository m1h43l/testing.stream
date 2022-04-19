## Test Application - DB2 on IBM i (via JTOpen) with Jdbi

To execute the test application you need to change the access data in the class testing.stream.IbmiDataSourceProvider.

The class testing.stream.Application contains the `main` method.

I get the following error:

```
Exception in thread "main" org.jdbi.v3.core.result.ResultSetException: Unable to advance result set [statement:"SELECT c.NAME, c.BUSINESSID FROM CUSTOMER c FETCH FIRST 10 ROWS ONLY", arguments:{positional:{}, named:{}, finder:[]}]
	at org.jdbi.v3.core.result.ResultSetResultIterator.safeNext(ResultSetResultIterator.java:108)
	at org.jdbi.v3.core.result.ResultSetResultIterator.hasNext(ResultSetResultIterator.java:60)
	at java.base/java.util.Iterator.forEachRemaining(Iterator.java:132)
	at org.jdbi.v3.core.result.ResultIterator.forEachRemaining(ResultIterator.java:39)
	at java.base/java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
	at testing.stream.Application.run(Application.java:17)
	at testing.stream.Application.main(Application.java:10)
Caused by: java.sql.SQLException: Cursor state not valid.
	at com.ibm.as400.access.JDError.createSQLExceptionSubClass(JDError.java:920)
	at com.ibm.as400.access.JDError.throwSQLException(JDError.java:436)
	at com.ibm.as400.access.JDError.throwSQLException(JDError.java:413)
	at com.ibm.as400.access.AS400JDBCResultSet.checkOpen(AS400JDBCResultSet.java:418)
	at com.ibm.as400.access.AS400JDBCResultSet.beforePositioning(AS400JDBCResultSet.java:1329)
	at com.ibm.as400.access.AS400JDBCResultSet.next(AS400JDBCResultSet.java:1862)
	at org.jdbi.v3.core.result.ResultSetResultIterator.safeNext(ResultSetResultIterator.java:106)
	... 7 more
```
