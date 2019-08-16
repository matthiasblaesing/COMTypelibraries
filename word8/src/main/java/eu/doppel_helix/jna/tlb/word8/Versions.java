
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B3-0000-0000-C000-000000000046}")
public interface Versions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AutoVersion", dispId = 0x3)
    WdAutoVersions getAutoVersion();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdAutoVersions}
     */
    @ComProperty(name = "AutoVersion", dispId = 0x3)
    void setAutoVersion(WdAutoVersions param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Version Item(Integer Index);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(15)</p>
     * @param Comment [in, optional] {@code Object}
     */
    @ComMethod(name = "Save", dispId = 0xb)
    void Save(Object Comment);
            
    
}