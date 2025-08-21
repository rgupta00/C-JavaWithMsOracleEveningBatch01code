package com.oracle.session05.dip;
//LLM
interface MessagingService{
	public void sendMessage();
}
class EmailService implements MessagingService{
	public void sendMessage() {
		System.out.println("send email ");
	}
}
class SmsService implements MessagingService{
	public void sendMessage()  {
		System.out.println("send sms ");
	}
}

//LLM
class BankTrasaction{
	
	private MessagingService messagingService;
	
	public BankTrasaction(MessagingService messagingService) {
		this.messagingService = messagingService;
	}
	public void transferwMoneny(int fromId, int toId, double amount) {
		messagingService.sendMessage();
		//
	}
}
public class Demo {
	
	public static void main(String[] args) {
		MessagingService messagingService=new EmailService();
		BankTrasaction bankTrasaction=new BankTrasaction(messagingService) ;
		bankTrasaction.transferwMoneny(1, 2, 10);
	}

}
