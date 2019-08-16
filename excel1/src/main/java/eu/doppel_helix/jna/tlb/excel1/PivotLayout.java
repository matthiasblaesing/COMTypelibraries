
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002444A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002444A-0000-0000-C000-000000000046}")
public interface PivotLayout extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2c9)</p>
     * <p>vtableId(10)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ColumnFields", dispId = 0x2c9)
    com.sun.jna.platform.win32.COM.util.IDispatch getColumnFields(Object Index);
            
    /**
     * <p>id(0x2cb)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "DataFields", dispId = 0x2cb)
    com.sun.jna.platform.win32.COM.util.IDispatch getDataFields(Object Index);
            
    /**
     * <p>id(0x2ca)</p>
     * <p>vtableId(12)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "PageFields", dispId = 0x2ca)
    com.sun.jna.platform.win32.COM.util.IDispatch getPageFields(Object Index);
            
    /**
     * <p>id(0x2c8)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "RowFields", dispId = 0x2c8)
    com.sun.jna.platform.win32.COM.util.IDispatch getRowFields(Object Index);
            
    /**
     * <p>id(0x2c7)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "HiddenFields", dispId = 0x2c7)
    com.sun.jna.platform.win32.COM.util.IDispatch getHiddenFields(Object Index);
            
    /**
     * <p>id(0x2c6)</p>
     * <p>vtableId(15)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "VisibleFields", dispId = 0x2c6)
    com.sun.jna.platform.win32.COM.util.IDispatch getVisibleFields(Object Index);
            
    /**
     * <p>id(0x2ce)</p>
     * <p>vtableId(16)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "PivotFields", dispId = 0x2ce)
    com.sun.jna.platform.win32.COM.util.IDispatch getPivotFields(Object Index);
            
    /**
     * <p>id(0x72f)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CubeFields", dispId = 0x72f)
    CubeFields getCubeFields();
            
    /**
     * <p>id(0x5d8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "PivotCache", dispId = 0x5d8)
    PivotCache getPivotCache();
            
    /**
     * <p>id(0x2cc)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "PivotTable", dispId = 0x2cc)
    PivotTable getPivotTable();
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    String getInnerDetail();
            
    /**
     * <p>id(0x2ba)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InnerDetail", dispId = 0x2ba)
    void setInnerDetail(String param0);
            
    /**
     * <p>id(0x2c4)</p>
     * <p>vtableId(22)</p>
     * @param RowFields [in, optional] {@code Object}
     * @param ColumnFields [in, optional] {@code Object}
     * @param PageFields [in, optional] {@code Object}
     * @param AppendField [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFields", dispId = 0x2c4)
    void AddFields(Object RowFields,
            Object ColumnFields,
            Object PageFields,
            Object AppendField);
            
    
}