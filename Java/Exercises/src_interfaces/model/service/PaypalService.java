package model.service;


public class PaypalService implements OnlinePaymentService {
	//Regras de negócio ao ser implementadas o serviço do Paypal

	@Override
	public Double interest(Double amount, Integer mounths) {
		return amount * 0.01 * mounths;
	}

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}
	
}
