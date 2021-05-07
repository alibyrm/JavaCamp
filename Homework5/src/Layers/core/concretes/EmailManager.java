package Layers.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Layers.core.abstracts.EmailService;

public class EmailManager implements EmailService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	@Override
	public boolean isValidEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}
	@Override
	public void sendEmail(String email) {
		System.out.println(email + "hesabýna kod gönderilmiþtir. Lütfen hesabýnýzý kontrol edin");
		
	}
	@Override
	public void activateEmail(String email) {
		System.out.println("Hesap aktifleþtirilmiþtir.");
		
	}

}
