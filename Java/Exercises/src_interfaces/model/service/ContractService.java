package model.service;

import java.util.Calendar;

import model.entites.Contract;
import model.entites.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double amount = contract.getTotalValue() / months;
		Calendar c = Calendar.getInstance();
		c.setTime(contract.getDate());
		for(int i=1; i<=months; i++) {	
			Double p1 =  onlinePaymentService.interest(amount, i);
			Double p2 =  onlinePaymentService.paymentFee(amount + p1);
			Double result = amount + p1 + p2;
			c.add(Calendar.DAY_OF_MONTH ,+31);
	
			contract.getIntallments().add(new Installment(c.getTime(), result));
		}
	}

}
