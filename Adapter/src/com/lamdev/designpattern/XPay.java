package com.lamdev.designpattern;

public interface XPay {
	 public String getCreditCardNo();
	 public String getCustomerName();
	 public String getCardExpMonth();
	 public String getCardExpYear();
	 public Short getCardCVVNo();
	 public Double getAmount();
	 
	 public void setCreditCardNo(String creditCartNo);
	 public void setCustomerName(String customerName);
	 public void setCardExpMonth(String cardExpMonth);
	 public void setCardExpYear(String cardExpYear);
	 public void setCardCVVNo(Short cardCVVNo);
	 public void setAmount(Double amount);
	 
}
