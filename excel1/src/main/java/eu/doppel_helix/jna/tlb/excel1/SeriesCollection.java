
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086C-0000-0000-C000-000000000046}")
public interface SeriesCollection {
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
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Series Add(Object Source,
            XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xe3)</p>
     */
    @ComMethod(name = "Extend", dispId = 0xe3)
    Object Extend(Object Source,
            Object Rowcol,
            Object CategoryLabels);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    Series Item(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste(XlRowCol Rowcol,
            Object SeriesLabels,
            Object CategoryLabels,
            Object Replace,
            Object NewSeries);
            
    /**
     * <p>id(0x45d)</p>
     */
    @ComMethod(name = "NewSeries", dispId = 0x45d)
    Series NewSeries();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    Series _Default(Object Index);
            
    
}