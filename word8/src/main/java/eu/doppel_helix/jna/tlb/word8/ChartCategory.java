
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({5A90588C-C066-4BD4-8FE5-722454A15553})</p>
 */
@ComInterface(iid="{5A90588C-C066-4BD4-8FE5-722454A15553}")
public interface ChartCategory extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    Boolean getIsFiltered();
            
    /**
     * <p>id(0xb47)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    void setIsFiltered(Boolean param0);
            
    
}