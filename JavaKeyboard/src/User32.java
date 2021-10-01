import com.sun.jna.Library;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.UINT;
import com.sun.jna.platform.win32.WinUser.INPUT;
public interface User32 extends Library {
	UINT SendInput(
			  DWORD    dword,
			  INPUT[] inputs,
			  int     cbSize
			);

}
