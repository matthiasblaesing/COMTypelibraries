
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024423-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024423-0000-0000-C000-000000000046}")
public interface CustomView extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x629)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PrintSettings", dispId = 0x629)
    Boolean getPrintSettings();
            
    /**
     * <p>id(0x62a)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "RowColSettings", dispId = 0x62a)
    Boolean getRowColSettings();
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    void Show();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    
}