
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024440-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024440-0000-0000-C000-000000000046}")
public interface ControlFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x353)</p>
     * <p>vtableId(10)</p>
     * @param Text [in] {@code String}
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    void AddItem(String Text,
            Object Index);
            
    /**
     * <p>id(0x355)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    void RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    void RemoveItem(Integer Index,
            Object Count);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    Integer getDropDownLines();
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    void setDropDownLines(Integer param0);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x34d)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    Integer getLargeChange();
            
    /**
     * <p>id(0x34d)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    void setLargeChange(Integer param0);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    String getLinkedCell();
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(21)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "List", dispId = 0x35d)
    Object List(Object Index);
            
    /**
     * <p>id(0x351)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    Integer getListCount();
            
    /**
     * <p>id(0x351)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    void setListCount(Integer param0);
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    String getListFillRange();
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    Integer getListIndex();
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    void setListIndex(Integer param0);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    Boolean getLockedText();
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    void setLockedText(Boolean param0);
            
    /**
     * <p>id(0x34a)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    Integer getMax();
            
    /**
     * <p>id(0x34a)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    void setMax(Integer param0);
            
    /**
     * <p>id(0x34b)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    Integer getMin();
            
    /**
     * <p>id(0x34b)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    void setMin(Integer param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    Integer getMultiSelect();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    void setMultiSelect(Integer param0);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0x34c)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    Integer getSmallChange();
            
    /**
     * <p>id(0x34c)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    void setSmallChange(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Integer get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Integer getValue();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Integer param0);
            
    
}