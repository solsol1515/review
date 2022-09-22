package singleton;
/*****Singleton pattern*****/
public class WorkA {
	
	DBConnect con;
	
	public WorkA() {
		//con = new DBConnect();
		//con.getInstance();
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A작업");
	}
	
	
}
