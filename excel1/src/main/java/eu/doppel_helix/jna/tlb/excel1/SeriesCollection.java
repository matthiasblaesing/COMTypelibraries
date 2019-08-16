
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086C-0000-0000-C000-000000000046}")
public interface SeriesCollection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Source [in] {@code Object}
     * @param Rowcol [in, optional] {@code XlRowCol}
     * @param SeriesLabels [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Series Add(Object Source,
            XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xe3)</p>
     * <p>vtableId(12)</p>
     * @param Source [in] {@code Object}
     * @param Rowcol [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     */
    @ComMethod(name = "Extend", dispId = 0xe3)
    Object Extend(Object Source,
            Object Rowcol,
            Object CategoryLabels);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    Series Item(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(15)</p>
     * @param Rowcol [in, optional] {@code XlRowCol}
     * @param SeriesLabels [in, optional] {@code Object}
     * @param CategoryLabels [in, optional] {@code Object}
     * @param Replace [in, optional] {@code Object}
     * @param NewSeries [in, optional] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste(XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace,
            Object NewSeries);
            
    /**
     * <p>id(0x45d)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "NewSeries", dispId = 0x45d)
    Series NewSeries();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    Series _Default(Object Index);
            
    
}