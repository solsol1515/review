package singleton;
/*****Singleton pattern*****/
public class WorkC {

	DBConnect con;
	
	public WorkC(){
		// con = new DBConnect();
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("C작업");
	}
	
}
