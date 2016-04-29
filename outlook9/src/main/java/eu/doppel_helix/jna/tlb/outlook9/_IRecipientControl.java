
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D87E7E16-6897-11CE-A6C0-00AA00608FAA})</p>
 */
@ComInterface(iid="{D87E7E16-6897-11CE-A6C0-00AA00608FAA}")
public interface _IRecipientControl {
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT Enabled);
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Byte Enabled);
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackColor(VARIANT BackColor);
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackColor(Integer BackColor);
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeColor(VARIANT ForeColor);
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    com.sun.jna.platform.win32.WinNT.HRESULT setForeColor(Integer ForeColor);
            
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadOnly(VARIANT ReadOnly);
            
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadOnly(Byte ReadOnly);
            
    /**
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT Font);
            
    /**
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.WinNT.HRESULT setFont(com.sun.jna.platform.win32.COM.util.IDispatch Font);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT getSpecialEffect(VARIANT Effect);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT setSpecialEffect(Integer Effect);
            
    
}