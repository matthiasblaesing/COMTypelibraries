
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024466-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024466-0001-0000-C000-000000000046}")
public interface ISpeech extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7e1)</p>
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    com.sun.jna.platform.win32.WinNT.HRESULT Speak(String Text,
            Object SpeakAsync,
            Object SpeakXML,
            Object Purge);
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirection(VARIANT RHS);
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT setDirection(XlSpeakDirection RHS);
            
    /**
     * <p>id(0x8bb)</p>
     */
    @ComProperty(name = "SpeakCellOnEnter", dispId = 0x8bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getSpeakCellOnEnter(VARIANT RHS);
            
    /**
     * <p>id(0x8bb)</p>
     */
    @ComProperty(name = "SpeakCellOnEnter", dispId = 0x8bb)
    com.sun.jna.platform.win32.WinNT.HRESULT setSpeakCellOnEnter(Boolean RHS);
            
    
}