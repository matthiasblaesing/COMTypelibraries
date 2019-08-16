
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020967-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020967-0000-0000-C000-000000000046}")
public interface Bookmarks extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "DefaultSorting", dispId = 0x3)
    WdBookmarkSortBy getDefaultSorting();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code WdBookmarkSortBy}
     */
    @ComProperty(name = "DefaultSorting", dispId = 0x3)
    void setDefaultSorting(WdBookmarkSortBy param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ShowHidden", dispId = 0x4)
    Boolean getShowHidden();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowHidden", dispId = 0x4)
    void setShowHidden(Boolean param0);
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(16)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Bookmark Item(Object Index);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param Name [in] {@code String}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x5)
    Bookmark Add(String Name,
            Object Range);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "Exists", dispId = 0x6)
    Boolean Exists(String Name);
            
    
}