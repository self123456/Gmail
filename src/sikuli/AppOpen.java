package sikuli;

import org.sikuli.script.App;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class AppOpen {

	public static void main(String[] args) throws Exception {
		ImagePath.setBundlePath("D:\\AutomationSoftware\\resources\\Sikuli");
		
		App.open("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		Thread.sleep(5000);
		
		Screen screen = new Screen();
		screen.type("https://electoralsearch.in/");
		screen.type(Key.ENTER);
		
		screen.click("btnContinue.PNG");
		screen.type("lstStates.PNG", "Goa");
		
		App.close("chrome.exe");
		
		
	}

}
