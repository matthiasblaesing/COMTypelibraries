
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020866-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020866-0000-0000-C000-000000000046}")
public interface Menu extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x251)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MenuItems", dispId = 0x251)
    MenuItems getMenuItems();
            
    
}