package com.lamdev.designpattern;

public class XPayToPayDAdapter implements PayD{
	
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cvvNo;
	private Double totalAmount;
	
	private final XPay xPay;
	
	public XPayToPayDAdapter(XPay xPay) {
		this.xPay = xPay;
		setPros();
	}
	
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cvvNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cvvNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	private void setPros() {
		setCustCardNo(this.xPay.getCreditCardNo());
		setCardOwnerName(this.xPay.getCustomerName());
		setCardExpMonthDate(this.xPay.getCardExpMonth() + "/" + this.xPay.getCardExpYear());
		setCVVNo(Short.toUnsignedInt(xPay.getCardCVVNo()));
		setTotalAmount(this.xPay.getAmount());
	}

}
