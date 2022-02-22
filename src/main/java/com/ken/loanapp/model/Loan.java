package com.ken.loanapp.model;

import java.math.BigDecimal;

public class Loan implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loanNo;
    private User userByCustIdNo;
    private User userByOfficerIdNo;
    private Integer loanStatusId;
    private BigDecimal loanAmt;
    private Repayment repayment;

    public Loan() {
    }

    public Loan(User userByCustIdNo, User userByOfficerIdNo, Integer loanStatusId, BigDecimal loanAmt,
            Repayment repayment) {
        this.userByCustIdNo = userByCustIdNo;
        this.userByOfficerIdNo = userByOfficerIdNo;
        this.loanStatusId = loanStatusId;
        this.loanAmt = loanAmt;
        this.repayment = repayment;
    }

    public Integer getLoanNo() {
        return this.loanNo;
    }

    public void setLoanNo(Integer loanNo) {
        this.loanNo = loanNo;
    }

    public User getUserByCustIdNo() {
        return this.userByCustIdNo;
    }

    public void setUserByCustIdNo(User userByCustIdNo) {
        this.userByCustIdNo = userByCustIdNo;
    }

    public User getUserByOfficerIdNo() {
        return this.userByOfficerIdNo;
    }

    public void setUserByOfficerIdNo(User userByOfficerIdNo) {
        this.userByOfficerIdNo = userByOfficerIdNo;
    }

    public Integer getLoanStatusId() {
        return this.loanStatusId;
    }

    public void setLoanStatusId(Integer loanStatusId) {
        this.loanStatusId = loanStatusId;
    }

    public BigDecimal getLoanAmt() {
        return this.loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Repayment getRepayment() {
        return this.repayment;
    }

    public void setRepayment(Repayment repayment) {
        this.repayment = repayment;
    }

}
