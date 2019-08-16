
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020892-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020892-0000-0000-C000-000000000046}")
public interface Windows extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x27e)</p>
     * <p>vtableId(10)</p>
     * @param ArrangeStyle [in, optional] {@code XlArrangeStyle}
     * @param ActiveWorkbook [in, optional] {@code Object}
     * @param SyncHorizontal [in, optional] {@code Object}
     * @param SyncVertical [in, optional] {@code Object}
     */
    @ComMethod(name = "Arrange", dispId = 0x27e)
    Object Arrange(XlArrangeStyle ArrangeStyle,
            Object ActiveWorkbook,
            Object SyncHorizontal,
            Object SyncVertical);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Window getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Window get_Default(Object Index);
            
    /**
     * <p>id(0x8c6)</p>
     * <p>vtableId(15)</p>
     * @param WindowName [in] {@code Object}
     */
    @ComMethod(name = "CompareSideBySideWith", dispId = 0x8c6)
    Boolean CompareSideBySideWith(Object WindowName);
            
    /**
     * <p>id(0x8c8)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "BreakSideBySide", dispId = 0x8c8)
    Boolean BreakSideBySide();
            
    /**
     * <p>id(0x8c9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    Boolean getSyncScrollingSideBySide();
            
    /**
     * <p>id(0x8c9)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    void setSyncScrollingSideBySide(Boolean param0);
            
    /**
     * <p>id(0x8ca)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ResetPositionsSideBySide", dispId = 0x8ca)
    void ResetPositionsSideBySide();
            
    
}