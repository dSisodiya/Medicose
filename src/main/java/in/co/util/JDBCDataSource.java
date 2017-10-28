package in.co.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//import in.co.sunrays.proj4.exception.ApplicationException;

import in.co.exception.ApplicationException;

/**
 * JDBC DataSource is a Data Connection Pool
 * 
 * 
 */
public class JDBCDataSource {

	/**
	 * JDBC Database connection pool ( DCP )
	 */
	private static JDBCDataSource datasource;

	private JDBCDataSource() {
	}

	private ComboPooledDataSource cpds = null;

	/**
	 * Create instance of Connection Pool
	 * 
	 * @return
	 */
	public static JDBCDataSource getInstance() {
		if (datasource == null) {

			ResourceBundle rb = ResourceBundle.getBundle("in.co.bundle.system");

			datasource = new JDBCDataSource();
			datasource.cpds = new ComboPooledDataSource();
			try {
				datasource.cpds.setDriverClass(rb.getString("driver"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			datasource.cpds.setJdbcUrl(rb.getString("url"));
			datasource.cpds.setUser(rb.getString("username"));
			datasource.cpds.setPassword(rb.getString("password"));
			datasource.cpds.setInitialPoolSize(new Integer((String) rb.getString("initialPoolSize")));
			datasource.cpds.setAcquireIncrement(new Integer((String) rb.getString("acquireIncrement")));
			datasource.cpds.setMaxPoolSize(new Integer((String) rb.getString("maxPoolSize")));
			datasource.cpds.setMaxIdleTime(Integer.parseInt(rb.getString("timeout")));
			datasource.cpds.setMinPoolSize(new Integer((String) rb.getString("minPoolSize")));

		}
		return datasource;
	}

	/**
	 * Gets the connection from ComboPooledDataSource
	 * 
	 * @return connection
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		return getInstance().cpds.getConnection();
	}
	
	/**
	 * Closes a connection
	 * 
	 * @param connection
	 * @throws Exception
	 */
	public static void closeConnection(Connection connection) {
		
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	public static void trnRollback(Connection connection) throws ApplicationException {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				throw new in.co.exception.ApplicationException(null);
				// null isliye liya hai q ki box me jo bhi validation lgate h wo
				// print ho
				// null ki jgh "msg" use kia to msg print hoga
			}
		}
	}

}