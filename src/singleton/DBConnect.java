package singleton;
/*****Singleton pattern*****/
public class DBConnect {

	private DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con = null;
	
	public static DBConnect getInstance() {			// 객체 생성없이
		if(con==null) {
			con = new DBConnect();
		}
		return con;
	}
	
}
