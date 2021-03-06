
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024445-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024445-0000-0000-C000-000000000046}")
public interface OLEDBError extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x643)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "SqlState", dispId = 0x643)
    String getSqlState();
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    String getErrorString();
            
    /**
     * <p>id(0x769)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Native", dispId = 0x769)
    Integer getNative();
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Number", dispId = 0x1c3)
    Integer getNumber();
            
    /**
     * <p>id(0x76a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Stage", dispId = 0x76a)
    Integer getStage();
            
    
}