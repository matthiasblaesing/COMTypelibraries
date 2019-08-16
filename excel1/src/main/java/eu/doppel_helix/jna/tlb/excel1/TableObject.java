
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CE-0000-0000-C000-000000000046}")
public interface TableObject extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x631)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    Boolean getRowNumbers();
            
    /**
     * <p>id(0x631)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    void setRowNumbers(Boolean param0);
            
    /**
     * <p>id(0x634)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    Boolean getFetchedRowOverflow();
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    XlCellInsertionMode getRefreshStyle();
            
    /**
     * <p>id(0x636)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code XlCellInsertionMode}
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    void setRefreshStyle(XlCellInsertionMode param0);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x2a9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    Range getDestination();
            
    /**
     * <p>id(0x638)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    Range getResultRange();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    Boolean Refresh();
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    Boolean getEnableEditing();
            
    /**
     * <p>id(0x63b)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    void setEnableEditing(Boolean param0);
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    Boolean getPreserveColumnInfo();
            
    /**
     * <p>id(0x74b)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    void setPreserveColumnInfo(Boolean param0);
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    Boolean getPreserveFormatting();
            
    /**
     * <p>id(0x5dc)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    void setPreserveFormatting(Boolean param0);
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    Boolean getAdjustColumnWidth();
            
    /**
     * <p>id(0x74c)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    void setAdjustColumnWidth(Boolean param0);
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    
}