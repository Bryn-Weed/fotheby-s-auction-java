

import com.matisse.MtDatabase;
import com.matisse.MtException;

public class MatisseConnector {

	private String hostname = "localhost";
	private String dbname = "Auction";
	private MtDatabase db = new MtDatabase(hostname, dbname);

	public void connect() throws MtException
	{
		db.open();
		db.startTransaction();
	}

	public void disconnect() throws MtException
	{
		db.commit();
		db.close();
	}

	public void failDisconnect() throws MtException
	{
		db.close();
	}

	public MtDatabase getDB()
	{
		return db;
	}
}
