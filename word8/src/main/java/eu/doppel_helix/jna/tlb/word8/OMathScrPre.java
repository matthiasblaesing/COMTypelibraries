
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({AFAF0C0E-8603-40F6-8FD1-42726CAC21E3})</p>
 */
@ComInterface(iid="{AFAF0C0E-8603-40F6-8FD1-42726CAC21E3}")
public interface OMathScrPre extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Sub", dispId = 0x67)
    OMath getSub();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Sup", dispId = 0x68)
    OMath getSup();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "E", dispId = 0x69)
    OMath getE();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "ToScrSubSup", dispId = 0xc9)
    OMathFunction ToScrSubSup();
            
    
}