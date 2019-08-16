
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024467-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024467-0001-0000-C000-000000000046}")
public interface IProtection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7f0)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowFormattingCells", dispId = 0x7f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowFormattingCells(VARIANT RHS);
            
    /**
     * <p>id(0x7f1)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowFormattingColumns", dispId = 0x7f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowFormattingColumns(VARIANT RHS);
            
    /**
     * <p>id(0x7f2)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowFormattingRows", dispId = 0x7f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowFormattingRows(VARIANT RHS);
            
    /**
     * <p>id(0x7f3)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowInsertingColumns", dispId = 0x7f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowInsertingColumns(VARIANT RHS);
            
    /**
     * <p>id(0x7f4)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowInsertingRows", dispId = 0x7f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowInsertingRows(VARIANT RHS);
            
    /**
     * <p>id(0x7f5)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowInsertingHyperlinks", dispId = 0x7f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowInsertingHyperlinks(VARIANT RHS);
            
    /**
     * <p>id(0x7f6)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowDeletingColumns", dispId = 0x7f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowDeletingColumns(VARIANT RHS);
            
    /**
     * <p>id(0x7f7)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowDeletingRows", dispId = 0x7f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowDeletingRows(VARIANT RHS);
            
    /**
     * <p>id(0x7f8)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowSorting", dispId = 0x7f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowSorting(VARIANT RHS);
            
    /**
     * <p>id(0x7f9)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowFiltering", dispId = 0x7f9)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowFiltering(VARIANT RHS);
            
    /**
     * <p>id(0x7fa)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowUsingPivotTables", dispId = 0x7fa)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowUsingPivotTables(VARIANT RHS);
            
    /**
     * <p>id(0x8bc)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code AllowEditRanges}
     */
    @ComProperty(name = "AllowEditRanges", dispId = 0x8bc)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowEditRanges(VARIANT RHS);
            
    
}