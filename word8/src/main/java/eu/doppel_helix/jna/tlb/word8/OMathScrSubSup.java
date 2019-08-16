
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DC489AD4-23C4-4F4B-990F-45A51C7C0C4F})</p>
 */
@ComInterface(iid="{DC489AD4-23C4-4F4B-990F-45A51C7C0C4F}")
public interface OMathScrSubSup extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "E", dispId = 0x67)
    OMath getE();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Sub", dispId = 0x68)
    OMath getSub();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Sup", dispId = 0x69)
    OMath getSup();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "AlignScripts", dispId = 0x6a)
    Boolean getAlignScripts();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlignScripts", dispId = 0x6a)
    void setAlignScripts(Boolean param0);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "RemoveSub", dispId = 0xc8)
    OMathFunction RemoveSub();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "RemoveSup", dispId = 0xc9)
    OMathFunction RemoveSup();
            
    /**
     * <p>id(0xca)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "ToScrPre", dispId = 0xca)
    OMathFunction ToScrPre();
            
    
}