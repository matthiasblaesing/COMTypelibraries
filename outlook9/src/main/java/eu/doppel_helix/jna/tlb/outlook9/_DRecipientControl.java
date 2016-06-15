
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
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Byte getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Byte param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    Byte getReadOnly();
            
    /**
     * <p>id(0x8001f008)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x8001f008)
    void setReadOnly(Byte param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    com.sun.jna.platform.win32.COM.util.IDispatch getFont();
            
    /**
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    void setFont(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    Integer getSpecialEffect();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "SpecialEffect", dispId = 0xc)
    void setSpecialEffect(Integer param0);
            
    
}