
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020930-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020930-0000-0000-C000-000000000046}")
public interface Fields extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    Integer getLocked();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Locked", dispId = 0x2)
    void setLocked(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Field Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ToggleShowCodes", dispId = 0x64)
    void ToggleShowCodes();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Update", dispId = 0x65)
    Integer Update();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Unlink", dispId = 0x66)
    void Unlink();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "UpdateSource", dispId = 0x68)
    void UpdateSource();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(19)</p>
     * @param Range [in] {@code Range}
     * @param Type [in, optional] {@code Object}
     * @param Text [in, optional] {@code Object}
     * @param PreserveFormatting [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x69)
    Field Add(Range Range,
            Object Type,
            Object Text,
            Object PreserveFormatting);
            
    
}