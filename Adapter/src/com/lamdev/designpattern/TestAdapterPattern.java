package com.lamdev.designpattern;

public class TestAdapterPattern {

	public static void main(String[] args) {
		XPay xPay = new XPayImpl();
		xPay.setCreditCardNo("123");
		xPay.setCustomerName("Nguyen Hoai Lam");
		xPay.setCardCVVNo((short)111);
		xPay.setCardExpMonth("10");
		xPay.setCardExpYear("2100");
		xPay.setAmount(2500d);
		
		PayD adapter = new XPayToPayDAdapter(xPay);
		testPayD(adapter);
	}
	
	private static void testPayD(PayD payD){
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}

}
