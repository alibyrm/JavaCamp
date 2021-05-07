package Layers.core.abstracts;

public interface EmailService {
	boolean isValidEmail(String email);
	void sendEmail(String email);
	void activateEmail(String email);

}
