
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ConnectString", dispId = 0x1)
    String getConnectString();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ConnectString", dispId = 0x1)
    void setConnectString(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Table", dispId = 0x2)
    String getTable();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Table", dispId = 0x2)
    void setTable(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x3)
    String getDataSource();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DataSource", dispId = 0x3)
    void setDataSource(String param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Columns", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getColumns();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "RowCount", dispId = 0x5)
    Integer getRowCount();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch getFilters();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param MsoMoveRow [in] {@code MsoMoveRow}
     * @param RowNbr [in, optional] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x60020009)
    Integer Move(MsoMoveRow MsoMoveRow,
            Integer RowNbr);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param bstrSrc [in, optional] {@code String}
     * @param bstrConnect [in, optional] {@code String}
     * @param bstrTable [in, optional] {@code String}
     * @param fOpenExclusive [in, optional] {@code Integer}
     * @param fNeverPrompt [in, optional] {@code Integer}
     */
    @ComMethod(name = "Open", dispId = 0x6002000a)
    void Open(String bstrSrc,
            String bstrConnect,
            String bstrTable,
            Integer fOpenExclusive,
            Integer fNeverPrompt);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param SortField1 [in] {@code String}
     * @param SortAscending1 [in, optional] {@code Boolean}
     * @param SortField2 [in, optional] {@code String}
     * @param SortAscending2 [in, optional] {@code Boolean}
     * @param SortField3 [in, optional] {@code String}
     * @param SortAscending3 [in, optional] {@code Boolean}
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
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ApplyFilter", dispId = 0x6002000c)
    void ApplyFilter();
            
    
}