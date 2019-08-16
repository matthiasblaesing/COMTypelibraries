
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C032E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C032E-0000-0000-C000-000000000046}")
public interface BalloonLabels extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030000)
    String getName();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem(Integer Index);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030003)
    Integer getCount();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x60030003)
    void setCount(Integer param0);
            
    
}