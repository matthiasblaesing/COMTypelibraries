
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024473-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024473-0000-0000-C000-000000000046}")
public interface ListColumn extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x911)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ListDataFormat", dispId = 0x911)
    ListDataFormat getListDataFormat();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    XlTotalsCalculation getTotalsCalculation();
            
    /**
     * <p>id(0x912)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code XlTotalsCalculation}
     */
    @ComProperty(name = "TotalsCalculation", dispId = 0x912)
    void setTotalsCalculation(XlTotalsCalculation param0);
            
    /**
     * <p>id(0x8d2)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x8d2)
    XPath getXPath();
            
    /**
     * <p>id(0x913)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "SharePointFormula", dispId = 0x913)
    String getSharePointFormula();
            
    /**
     * <p>id(0x2c1)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "DataBodyRange", dispId = 0x2c1)
    Range getDataBodyRange();
            
    /**
     * <p>id(0xa79)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Total", dispId = 0xa79)
    Range getTotal();
            
    
}