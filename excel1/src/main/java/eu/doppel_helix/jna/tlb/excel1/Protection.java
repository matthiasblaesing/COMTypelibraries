
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024467-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024467-0000-0000-C000-000000000046}")
public interface Protection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7f0)</p>
     */
    @ComProperty(name = "AllowFormattingCells", dispId = 0x7f0)
    Boolean getAllowFormattingCells();
            
    /**
     * <p>id(0x7f1)</p>
     */
    @ComProperty(name = "AllowFormattingColumns", dispId = 0x7f1)
    Boolean getAllowFormattingColumns();
            
    /**
     * <p>id(0x7f2)</p>
     */
    @ComProperty(name = "AllowFormattingRows", dispId = 0x7f2)
    Boolean getAllowFormattingRows();
            
    /**
     * <p>id(0x7f3)</p>
     */
    @ComProperty(name = "AllowInsertingColumns", dispId = 0x7f3)
    Boolean getAllowInsertingColumns();
            
    /**
     * <p>id(0x7f4)</p>
     */
    @ComProperty(name = "AllowInsertingRows", dispId = 0x7f4)
    Boolean getAllowInsertingRows();
            
    /**
     * <p>id(0x7f5)</p>
     */
    @ComProperty(name = "AllowInsertingHyperlinks", dispId = 0x7f5)
    Boolean getAllowInsertingHyperlinks();
            
    /**
     * <p>id(0x7f6)</p>
     */
    @ComProperty(name = "AllowDeletingColumns", dispId = 0x7f6)
    Boolean getAllowDeletingColumns();
            
    /**
     * <p>id(0x7f7)</p>
     */
    @ComProperty(name = "AllowDeletingRows", dispId = 0x7f7)
    Boolean getAllowDeletingRows();
            
    /**
     * <p>id(0x7f8)</p>
     */
    @ComProperty(name = "AllowSorting", dispId = 0x7f8)
    Boolean getAllowSorting();
            
    /**
     * <p>id(0x7f9)</p>
     */
    @ComProperty(name = "AllowFiltering", dispId = 0x7f9)
    Boolean getAllowFiltering();
            
    /**
     * <p>id(0x7fa)</p>
     */
    @ComProperty(name = "AllowUsingPivotTables", dispId = 0x7fa)
    Boolean getAllowUsingPivotTables();
            
    /**
     * <p>id(0x8bc)</p>
     */
    @ComProperty(name = "AllowEditRanges", dispId = 0x8bc)
    AllowEditRanges getAllowEditRanges();
            
    
}