
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
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x27e)</p>
     */
    @ComMethod(name = "Arrange", dispId = 0x27e)
    Object Arrange(XlArrangeStyle ArrangeStyle,
            Object ActiveWorkbook,
            Object SyncHorizontal,
            Object SyncVertical);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Window getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Window get_Default(Object Index);
            
    /**
     * <p>id(0x8c6)</p>
     */
    @ComMethod(name = "CompareSideBySideWith", dispId = 0x8c6)
    Boolean CompareSideBySideWith(Object WindowName);
            
    /**
     * <p>id(0x8c8)</p>
     */
    @ComMethod(name = "BreakSideBySide", dispId = 0x8c8)
    Boolean BreakSideBySide();
            
    /**
     * <p>id(0x8c9)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    Boolean getSyncScrollingSideBySide();
            
    /**
     * <p>id(0x8c9)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    void setSyncScrollingSideBySide(Boolean param0);
            
    /**
     * <p>id(0x8ca)</p>
     */
    @ComMethod(name = "ResetPositionsSideBySide", dispId = 0x8ca)
    void ResetPositionsSideBySide();
            
    
}