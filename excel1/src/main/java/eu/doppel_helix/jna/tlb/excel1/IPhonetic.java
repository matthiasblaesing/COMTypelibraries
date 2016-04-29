
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024438-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024438-0001-0000-C000-000000000046}")
public interface IPhonetic {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x68a)</p>
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacterType(VARIANT RHS);
            
    /**
     * <p>id(0x68a)</p>
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    com.sun.jna.platform.win32.WinNT.HRESULT setCharacterType(Integer RHS);
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlignment(Integer RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    
}