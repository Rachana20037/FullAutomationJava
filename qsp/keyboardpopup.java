package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class keyboardpopup {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	Runtime.getRuntime().exec("Notepad");
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_P);
}
}

