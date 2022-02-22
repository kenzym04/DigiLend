package com.ken.loanapp.model;

import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer usrId;
    private String pcode;
    private int permission;
    private LoanOfficer loanOfficer;
    private Set<Loan> loansForCustIdNo = new HashSet<Loan>(0);
    private Customer customer;
    private Set<Loan> loansForOfficerIdNo = new HashSet<Loan>(0);

    public User() {
    }

    public User(String pcode, int permission) {
        this.pcode = pcode;
        this.permission = permission;
    }

    public User(String pcode, int permission, LoanOfficer loanOfficer, Set<Loan> loansForCustIdNo, Customer customer,
            Set<Loan> loansForOfficerIdNo) {
        this.pcode = pcode;
        this.permission = permission;
        this.loanOfficer = loanOfficer;
        this.loansForCustIdNo = loansForCustIdNo;
        this.customer = customer;
        this.loansForOfficerIdNo = loansForOfficerIdNo;
    }

    public Integer getUsrId() {
        return this.usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getPcode() {
        return this.pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPermission() {
        return this.permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public LoanOfficer getLoanOfficer() {
        return this.loanOfficer;
    }

    public void setLoanOfficer(LoanOfficer loanOfficer) {
        this.loanOfficer = loanOfficer;
    }

    public Set<Loan> getLoansForCustIdNo() {
        return this.loansForCustIdNo;
    }

    public void setLoansForCustIdNo(Set<Loan> loansForCustIdNo) {
        this.loansForCustIdNo = loansForCustIdNo;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Loan> getLoansForOfficerIdNo() {
        return this.loansForOfficerIdNo;
    }

    public void setLoansForOfficerIdNo(Set<Loan> loansForOfficerIdNo) {
        this.loansForOfficerIdNo = loansForOfficerIdNo;
    }

}
