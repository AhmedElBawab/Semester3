import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import javax.sql.*;

public class myConnection implements Connection {
	
	public myConnection(String path) {
		
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		// TODO Auto-generated method stub
	    throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void abort(Executor arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		/////////////////////////////////////////////////////////
	}

	@Override
	public void commit() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Array createArrayOf(String arg0, Object[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		myStatement s = new myStatement(c);
		return s;
	}

	@Override
	public Statement createStatement(int arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Statement createStatement(int arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Struct createStruct(String arg0, Object[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public String getCatalog() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public String getClientInfo(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isValid(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public String nativeSQL(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public CallableStatement prepareCall(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void releaseSavepoint(Savepoint arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void rollback() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void rollback(Savepoint arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setAutoCommit(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setCatalog(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setClientInfo(Properties arg0) throws SQLClientInfoException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setHoldability(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setReadOnly(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Savepoint setSavepoint(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setSchema(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setTransactionIsolation(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}
}
