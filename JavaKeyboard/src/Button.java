import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;

public class Button {
	
	private JButton button;
	private WinDef.WORD keyCode;
	public Button(JPanel panel,String name, WinDef.WORD keyCode) {
		button = new JButton(name);
		button.setFocusable(false);
		panel.add(button);
		this.keyCode = keyCode;
		button.addActionListener(new Listener());
	}
	class Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
	        MainClass.input.input.ki.wVk = keyCode;
	        MainClass.user32.SendInput( new WinDef.DWORD( 1 ), ( WinUser.INPUT[] ) MainClass.input.toArray( 1 ), MainClass.input.size() );
		}
		
	}
}