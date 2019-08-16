
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006F025-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006F025-0000-0000-C000-000000000046}")
public interface _DRecipientControl extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Byte getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Byte param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    Byte getReadOnly();
            
    /**
     * <p>id(0x8001f008)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    void setReadOnly(Byte param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.COM.util.IDispatch getFont();
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    void setFont(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    Integer getSpecialEffect();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    void setSpecialEffect(Integer param0);
            
    
}