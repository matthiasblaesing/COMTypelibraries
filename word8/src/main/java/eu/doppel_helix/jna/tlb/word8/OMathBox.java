
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({842C37FE-C76F-4B2B-9B60-C408CB5E838E})</p>
 */
@ComInterface(iid="{842C37FE-C76F-4B2B-9B60-C408CB5E838E}")
public interface OMathBox extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "OpEmu", dispId = 0x68)
    Boolean getOpEmu();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OpEmu", dispId = 0x68)
    void setOpEmu(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "NoBreak", dispId = 0x69)
    Boolean getNoBreak();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoBreak", dispId = 0x69)
    void setNoBreak(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Diff", dispId = 0x6a)
    Boolean getDiff();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Diff", dispId = 0x6a)
    void setDiff(Boolean param0);
            
    
}