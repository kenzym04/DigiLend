package com.ken.loanapp.model;

public class Customer  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int custIdNo;
     private User user;
     private String custName;

    public Customer() {
    }

	
    public Customer(User user) {
        this.user = user;
    }
    public Customer(User user, String custName) {
       this.user = user;
       this.custName = custName;
    }
   
    public int getCustIdNo() {
        return this.custIdNo;
    }
    
    public void setCustIdNo(int custIdNo) {
        this.custIdNo = custIdNo;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getCustName() {
        return this.custName;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }




}


