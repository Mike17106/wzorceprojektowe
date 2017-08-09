public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message="+msg);
	}

}

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}
public interface Consumer {

	void processMessages(String msg, String rec);
}
public class MyDIApplication implements Consumer{

	private MessageService service;

	public MyDIApplication(MessageService svc){
		this.service=svc;
	}

	@Override
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}
public interface MessageServiceInjector {

	public Consumer getConsumer();
}