import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.jna.platform.win32.WinDef.WORD;

public class MainFrame {
	private JFrame frame;
	public MainFrame() {
		frame = new JFrame("KeyBoard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,300);
		
		JPanel contents = new JPanel(new FlowLayout(1));
		
		int k = 0;
		for(char i = 'a'; i<='z'; i++) {
			new Button(contents, ""+i,new WORD(0x41+k));
			k++;
		}
		for(int i = 0; i<=9; i++) {
			new Button(contents, ""+i,new WORD(0x30+i));
		}
		new Button(contents, "Enter",new WORD(0x0D) ); new Button(contents, "Space", new WORD(0x20)); new Button(contents, "Backspace", new WORD(0x08));
		
		frame.setContentPane(contents);
		frame.setAlwaysOnTop(true);
		
		frame.setUndecorated(false);
		frame.setFocusableWindowState(false);
		frame.setFocusable(false);
		frame.enableInputMethods(false);
		frame.setVisible(true);
	}
	
}

