package chapter10.EX_09;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	VIPCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
}
