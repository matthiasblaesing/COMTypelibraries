
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1530-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1530-0000-0000-C000-000000000046}")
public interface OfficeDataSourceObject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ConnectString", dispId = 0x1)
    String getConnectString();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ConnectString", dispId = 0x1)
    void setConnectString(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Table", dispId = 0x2)
    String getTable();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Table", dispId = 0x2)
    void setTable(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x3)
    String getDataSource();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x3)
    void setDataSource(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getColumns();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "RowCount", dispId = 0x5)
    Integer getRowCount();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch getFilters();
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComMethod(name = "Move", dispId = 0x60020009)
    Integer Move(MsoMoveRow MsoMoveRow,
            Integer RowNbr);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComMethod(name = "Open", dispId = 0x6002000a)
    void Open(String bstrSrc,
            String bstrConnect,
            String bstrTable,
            Integer fOpenExclusive,
            Integer fNeverPrompt);
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComMethod(name = "SetSortOrder", dispId = 0x6002000b)
    void SetSortOrder(String SortField1,
            Boolean SortAscending1,
            String SortField2,
            Boolean SortAscending2,
            String SortField3,
            Boolean SortAscending3);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComMethod(name = "ApplyFilter", dispId = 0x6002000c)
    void ApplyFilter();
            
    
}