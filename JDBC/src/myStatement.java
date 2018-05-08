import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;

public class myStatement implements Statement {
	
	OurDatabase d = new OurDatabase();
	private ArrayList<String> parent = new ArrayList<String>();
	private int counter = 0;
	Connection c;
	private int qtime ;
	
	public myStatement (Connection c) {
		c = c;
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
	public void addBatch(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		parent.add(arg0);
		counter++;
	}

	@Override
	public void cancel() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void clearBatch() throws SQLException {
		// TODO Auto-generated method stub
		parent.clear();
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		c.close();
	}

	@Override
	public void closeOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean execute(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return d.executeStructureQuery(arg0);
	}

	@Override
	public boolean execute(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int[] executeBatch() throws SQLException {
		// TODO Auto-generated method stub
		int[] temp = new int[this.parent.size()];
		for(int i = 0 ; i< this.parent.size() ;i++) {
			temp[i] = d.executeUpdateQuery(this.parent.get(i));
		}
		return temp;
	}

	@Override
	public ResultSet executeQuery(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		myResultset rs = new myResultset(c , arg0);
		return rs;
	}

	@Override
	public int executeUpdate(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return d.executeUpdateQuery(arg0);
	}

	@Override
	public int executeUpdate(String arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int executeUpdate(String arg0, int[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int executeUpdate(String arg0, String[] arg1) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return this.c;
	}

	@Override
	public int getFetchDirection() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getFetchSize() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getMaxFieldSize() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getMaxRows() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean getMoreResults(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return this.qtime;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getResultSetType() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getUpdateCount() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public boolean isPoolable() throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setCursorName(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setEscapeProcessing(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setFetchDirection(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setFetchSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setMaxFieldSize(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setMaxRows(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setPoolable(boolean arg0) throws SQLException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public void setQueryTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		this.qtime = arg0;
	}

}
