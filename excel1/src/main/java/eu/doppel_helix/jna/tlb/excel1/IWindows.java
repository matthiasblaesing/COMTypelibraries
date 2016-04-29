
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020892-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020892-0001-0000-C000-000000000046}")
public interface IWindows {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x27e)</p>
     */
    @ComMethod(name = "Arrange", dispId = 0x27e)
    com.sun.jna.platform.win32.WinNT.HRESULT Arrange(XlArrangeStyle ArrangeStyle,
            Object ActiveWorkbook,
            Object SyncHorizontal,
            Object SyncVertical,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x8c6)</p>
     */
    @ComMethod(name = "CompareSideBySideWith", dispId = 0x8c6)
    com.sun.jna.platform.win32.WinNT.HRESULT CompareSideBySideWith(Object WindowName,
            VARIANT RHS);
            
    /**
     * <p>id(0x8c8)</p>
     */
    @ComMethod(name = "BreakSideBySide", dispId = 0x8c8)
    com.sun.jna.platform.win32.WinNT.HRESULT BreakSideBySide(VARIANT RHS);
            
    /**
     * <p>id(0x8c9)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSyncScrollingSideBySide(VARIANT RHS);
            
    /**
     * <p>id(0x8c9)</p>
     */
    @ComProperty(name = "SyncScrollingSideBySide", dispId = 0x8c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSyncScrollingSideBySide(Boolean RHS);
            
    /**
     * <p>id(0x8ca)</p>
     */
    @ComMethod(name = "ResetPositionsSideBySide", dispId = 0x8ca)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetPositionsSideBySide();
            
    
}