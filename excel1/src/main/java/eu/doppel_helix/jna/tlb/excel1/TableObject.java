
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CE-0000-0000-C000-000000000046}")
public interface TableObject {
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
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    Boolean getRowNumbers();
            
    /**
     * <p>id(0x631)</p>
     */
    @ComProperty(name = "RowNumbers", dispId = 0x631)
    void setRowNumbers(Boolean param0);
            
    /**
     * <p>id(0x634)</p>
     */
    @ComProperty(name = "FetchedRowOverflow", dispId = 0x634)
    Boolean getFetchedRowOverflow();
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    XlCellInsertionMode getRefreshStyle();
            
    /**
     * <p>id(0x636)</p>
     */
    @ComProperty(name = "RefreshStyle", dispId = 0x636)
    void setRefreshStyle(XlCellInsertionMode param0);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x2a9)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x2a9)
    Range getDestination();
            
    /**
     * <p>id(0x638)</p>
     */
    @ComProperty(name = "ResultRange", dispId = 0x638)
    Range getResultRange();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    Boolean Refresh();
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    Boolean getEnableEditing();
            
    /**
     * <p>id(0x63b)</p>
     */
    @ComProperty(name = "EnableEditing", dispId = 0x63b)
    void setEnableEditing(Boolean param0);
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    Boolean getPreserveColumnInfo();
            
    /**
     * <p>id(0x74b)</p>
     */
    @ComProperty(name = "PreserveColumnInfo", dispId = 0x74b)
    void setPreserveColumnInfo(Boolean param0);
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    Boolean getPreserveFormatting();
            
    /**
     * <p>id(0x5dc)</p>
     */
    @ComProperty(name = "PreserveFormatting", dispId = 0x5dc)
    void setPreserveFormatting(Boolean param0);
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    Boolean getAdjustColumnWidth();
            
    /**
     * <p>id(0x74c)</p>
     */
    @ComProperty(name = "AdjustColumnWidth", dispId = 0x74c)
    void setAdjustColumnWidth(Boolean param0);
            
    /**
     * <p>id(0x8d1)</p>
     */
    @ComProperty(name = "ListObject", dispId = 0x8d1)
    ListObject getListObject();
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    
}