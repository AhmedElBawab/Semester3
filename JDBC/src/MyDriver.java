import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.*;

public class MyDriver implements Driver {

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		String[] temp = url.split(":");
		if(temp[0] == "jdbc") {
			return true;
		}
		return false;
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		File dir = (File) info.get("path");
	    String path = dir.getAbsolutePath();
	    Connection c = new myConnection(path);	    
	   // return connectionManager.getConnection(path);
	    return c;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		//////////////////////////////////////////////////////////////////////////
		return null;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unsupported Operation");
	}

}
