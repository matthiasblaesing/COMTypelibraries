
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({50209974-BA32-4A03-8FA6-BAC56CC056FD})</p>
 */
@ComInterface(iid="{50209974-BA32-4A03-8FA6-BAC56CC056FD}")
public interface OMathFrac extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Num", dispId = 0x67)
    OMath getNum();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Den", dispId = 0x68)
    OMath getDen();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x69)
    WdOMathFracType getType();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdOMathFracType}
     */
    @ComProperty(name = "Type", dispId = 0x69)
    void setType(WdOMathFracType param0);
            
    
}