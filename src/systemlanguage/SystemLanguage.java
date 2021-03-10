package systemlanguage;

import java.util.Locale;

public class SystemLanguage {
	
	public static void main(String[] args) {
		
		Locale language = Locale.getDefault();
		
		System.out.println("The system language is: " + language.getDisplayLanguage());
	}
}
