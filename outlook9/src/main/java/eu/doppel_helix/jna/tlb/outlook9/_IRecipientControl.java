
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D87E7E16-6897-11CE-A6C0-00AA00608FAA})</p>
 */
@ComInterface(iid="{D87E7E16-6897-11CE-A6C0-00AA00608FAA}")
public interface _IRecipientControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(7)</p>
     * @param Enabled [out] {@code Byte}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT Enabled);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(8)</p>
     * @param Enabled [in] {@code Byte}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Byte Enabled);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(9)</p>
     * @param BackColor [out] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackColor(VARIANT BackColor);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(10)</p>
     * @param BackColor [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackColor(Integer BackColor);
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(11)</p>
     * @param ForeColor [out] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeColor(VARIANT ForeColor);
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(12)</p>
     * @param ForeColor [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    com.sun.jna.platform.win32.WinNT.HRESULT setForeColor(Integer ForeColor);
            
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(13)</p>
     * @param ReadOnly [out] {@code Byte}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadOnly(VARIANT ReadOnly);
            
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(14)</p>
     * @param ReadOnly [in] {@code Byte}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadOnly(Byte ReadOnly);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(15)</p>
     * @param Font [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT Font);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(16)</p>
     * @param Font [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.WinNT.HRESULT setFont(com.sun.jna.platform.win32.COM.util.IDispatch Font);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param Effect [out] {@code Integer}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT getSpecialEffect(VARIANT Effect);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param Effect [in] {@code Integer}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT setSpecialEffect(Integer Effect);
            
    
}