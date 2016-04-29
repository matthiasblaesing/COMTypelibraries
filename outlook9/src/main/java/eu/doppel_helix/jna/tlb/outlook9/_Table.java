
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630D2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630D2-0000-0000-C000-000000000046}")
public interface _Table {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x62)</p>
     */
    @ComMethod(name = "FindRow", dispId = 0x62)
    Row FindRow(String Filter);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComMethod(name = "FindNextRow", dispId = 0x63)
    Row FindNextRow();
            
    /**
     * <p>id(0xfbcf)</p>
     */
    @ComMethod(name = "GetArray", dispId = 0xfbcf)
    Object GetArray(Integer MaxRows);
            
    /**
     * <p>id(0x57)</p>
     */
    @ComMethod(name = "GetNextRow", dispId = 0x57)
    Row GetNextRow();
            
    /**
     * <p>id(0x50)</p>
     */
    @ComMethod(name = "GetRowCount", dispId = 0x50)
    Integer GetRowCount();
            
    /**
     * <p>id(0xfb1e)</p>
     */
    @ComMethod(name = "MoveToStart", dispId = 0xfb1e)
    void MoveToStart();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Restrict", dispId = 0x64)
    Table Restrict(String Filter);
            
    /**
     * <p>id(0x61)</p>
     */
    @ComMethod(name = "Sort", dispId = 0x61)
    void Sort(String SortProperty,
            Object Descending);
            
    /**
     * <p>id(0xfb93)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xfb93)
    Columns getColumns();
            
    /**
     * <p>id(0xfb1f)</p>
     */
    @ComProperty(name = "EndOfTable", dispId = 0xfb1f)
    Boolean getEndOfTable();
            
    
}