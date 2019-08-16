
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F1-0000-0000-C000-000000000046}")
public interface _NavigationFolders extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x51)
    _NavigationFolder Item(Object Index);
            
    /**
     * <p>id(0xfbc2)</p>
     * <p>vtableId(13)</p>
     * @param Folder [in] {@code MAPIFolder}
     */
    @ComMethod(name = "Add", dispId = 0xfbc2)
    NavigationFolder Add(MAPIFolder Folder);
            
    /**
     * <p>id(0xfbc3)</p>
     * <p>vtableId(14)</p>
     * @param RemovableFolder [in] {@code NavigationFolder}
     */
    @ComMethod(name = "Remove", dispId = 0xfbc3)
    void Remove(NavigationFolder RemovableFolder);
            
    
}