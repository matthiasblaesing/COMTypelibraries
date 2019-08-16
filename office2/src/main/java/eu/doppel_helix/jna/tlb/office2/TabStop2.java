
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03BB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03BB-0000-0000-C000-000000000046}")
public interface TabStop2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x2)
    void Clear();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Position", dispId = 0x3)
    Float getPosition();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Position", dispId = 0x3)
    void setPosition(Float param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Type", dispId = 0x4)
    MsoTabStopType getType();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code MsoTabStopType}
     */
    @ComProperty(name = "Type", dispId = 0x4)
    void setType(MsoTabStopType param0);
            
    
}