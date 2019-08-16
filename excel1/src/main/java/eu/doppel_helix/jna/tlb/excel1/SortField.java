
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A9-0000-0000-C000-000000000046}")
public interface SortField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xab5)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "SortOn", dispId = 0xab5)
    XlSortOn getSortOn();
            
    /**
     * <p>id(0xab5)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlSortOn}
     */
    @ComProperty(name = "SortOn", dispId = 0xab5)
    void setSortOn(XlSortOn param0);
            
    /**
     * <p>id(0xab6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SortOnValue", dispId = 0xab6)
    com.sun.jna.platform.win32.COM.util.IDispatch getSortOnValue();
            
    /**
     * <p>id(0x9b)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Key", dispId = 0x9b)
    Range getKey();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    XlSortOrder getOrder();
            
    /**
     * <p>id(0xc0)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code XlSortOrder}
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    void setOrder(XlSortOrder param0);
            
    /**
     * <p>id(0xab7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CustomOrder", dispId = 0xab7)
    Object getCustomOrder();
            
    /**
     * <p>id(0xab7)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CustomOrder", dispId = 0xab7)
    void setCustomOrder(Object param0);
            
    /**
     * <p>id(0xab8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DataOption", dispId = 0xab8)
    XlSortDataOption getDataOption();
            
    /**
     * <p>id(0xab8)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code XlSortDataOption}
     */
    @ComProperty(name = "DataOption", dispId = 0xab8)
    void setDataOption(XlSortDataOption param0);
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    Integer getPriority();
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xab9)</p>
     * <p>vtableId(23)</p>
     * @param Key [in] {@code Range}
     */
    @ComMethod(name = "ModifyKey", dispId = 0xab9)
    void ModifyKey(Range Key);
            
    /**
     * <p>id(0xaba)</p>
     * <p>vtableId(24)</p>
     * @param Icon [in] {@code Icon}
     */
    @ComMethod(name = "SetIcon", dispId = 0xaba)
    void SetIcon(Icon Icon);
            
    
}