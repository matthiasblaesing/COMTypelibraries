
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
     * <p>id(0x353)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    void AddItem(String Text,
            Object Index);
            
    /**
     * <p>id(0x355)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    void RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    void RemoveItem(Integer Index,
            Object Count);
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    Integer getDropDownLines();
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    void setDropDownLines(Integer param0);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    Integer getLargeChange();
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    void setLargeChange(Integer param0);
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    String getLinkedCell();
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComMethod(name = "List", dispId = 0x35d)
    Object List(Object Index);
            
    /**
     * <p>id(0x351)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    Integer getListCount();
            
    /**
     * <p>id(0x351)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    void setListCount(Integer param0);
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    String getListFillRange();
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    Integer getListIndex();
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    void setListIndex(Integer param0);
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    Boolean getLockedText();
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    void setLockedText(Boolean param0);
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    Integer getMax();
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    void setMax(Integer param0);
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    Integer getMin();
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    void setMin(Integer param0);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    Integer getMultiSelect();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    void setMultiSelect(Integer param0);
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    Integer getSmallChange();
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    void setSmallChange(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Integer get_Default();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Integer getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Integer param0);
            
    
}