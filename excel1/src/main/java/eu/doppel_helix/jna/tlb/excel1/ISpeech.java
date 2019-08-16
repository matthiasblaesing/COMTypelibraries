
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
     * <p>vtableId(7)</p>
     * @param Text [in] {@code String}
     * @param SpeakAsync [in, optional] {@code Object}
     * @param SpeakXML [in, optional] {@code Object}
     * @param Purge [in, optional] {@code Object}
     */
    @ComMethod(name = "Speak", dispId = 0x7e1)
    com.sun.jna.platform.win32.WinNT.HRESULT Speak(String Text,
            Object SpeakAsync,
            Object SpeakXML,
            Object Purge);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlSpeakDirection}
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirection(VARIANT RHS);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(9)</p>
     * @param RHS [in] {@code XlSpeakDirection}
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT setDirection(XlSpeakDirection RHS);
            
    /**
     * <p>id(0x8bb)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SpeakCellOnEnter", dispId = 0x8bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getSpeakCellOnEnter(VARIANT RHS);
            
    /**
     * <p>id(0x8bb)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SpeakCellOnEnter", dispId = 0x8bb)
    com.sun.jna.platform.win32.WinNT.HRESULT setSpeakCellOnEnter(Boolean RHS);
            
    
}