
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5DAA8BB6-054E-48F6-BEAC-EAAD02BE0CC7})</p>
 */
@ComInterface(iid="{5DAA8BB6-054E-48F6-BEAC-EAAD02BE0CC7}")
public interface OMathMatRow extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Args", dispId = 0x67)
    OMathArgs getArgs();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x68)
    Integer getRowIndex();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xc8)
    void Delete();
            
    
}