package com.ken.loanapp.model;

public class LoanOfficer implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int officerIdNo;
    private User user;
    private String officerName;

    public LoanOfficer() {
    }

    public LoanOfficer(User user) {
        this.user = user;
    }

    public LoanOfficer(User user, String officerName) {
        this.user = user;
        this.officerName = officerName;
    }

    public int getOfficerIdNo() {
        return this.officerIdNo;
    }

    public void setOfficerIdNo(int officerIdNo) {
        this.officerIdNo = officerIdNo;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOfficerName() {
        return this.officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

}
