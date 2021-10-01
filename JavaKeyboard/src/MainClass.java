import com.sun.jna.Native;
import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
public class MainClass {
	public static User32 user32;
	public static WinUser.INPUT input;
	public static void main(String[] args) {
		initInput();
		@SuppressWarnings("unused")
		MainFrame frame = new MainFrame();
	}
	private static void initInput() {
		user32 = (User32) Native.load(User32.class);
		input = new WinUser.INPUT();
		input.type = new WinDef.DWORD(WinUser.INPUT.INPUT_KEYBOARD);
		input.input.setType("ki");
        input.input.ki.wScan = new WinDef.WORD( 0 );
        input.input.ki.time = new WinDef.DWORD( 0 );
        input.input.ki.dwExtraInfo = new BaseTSD.ULONG_PTR( 0 );
        input.input.ki.dwFlags = new WinDef.DWORD( 0 );  
	}
}
