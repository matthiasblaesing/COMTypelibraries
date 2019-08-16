
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020961-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020961-0000-0000-C000-000000000046}")
public interface Windows extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Window Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(13)</p>
     * @param Window [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xa)
    Window Add(Object Window);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(14)</p>
     * @param ArrangeStyle [in, optional] {@code Object}
     */
    @ComMethod(name = "Arrange", dispId = 0xb)
    void Arrange(Object ArrangeStyle);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(15)</p>
     * @param Document [in] {@code Object}
     */
    @ComMethod(name = "CompareSideBySideWith", dispId = 0xc)
    Boolean CompareSideBySideWith(Object Document);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "BreakSideBySide", dispId = 0xd)
    Boolean BreakSideBySide();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "ResetPositionsSideBySide", dispId = 0xe)
    void ResetPositionsSideBySide();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x3eb)
    Boolean getSyncScrollingSideBySide();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x3eb)
    void setSyncScrollingSideBySide(Boolean param0);
            
    
}