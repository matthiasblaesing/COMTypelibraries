
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020876-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020876-0000-0000-C000-000000000046}")
public interface PivotItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
    PivotField getParent();
            
    /**
     * <p>id(0x2da)</p>
     * <p>vtableId(10)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    Object getChildItems(Object Index);
            
    /**
     * <p>id(0x2d0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    Range getDataRange();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x2cf)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    Range getLabelRange();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x2e5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ParentItem", dispId = 0x2e5)
    PivotItem getParentItem();
            
    /**
     * <p>id(0x2e3)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ParentShowDetail", dispId = 0x2e3)
    Boolean getParentShowDetail();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Integer getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    Boolean getShowDetail();
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    void setShowDetail(Boolean param0);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    Object getSourceName();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x5e8)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    Boolean getIsCalculated();
            
    /**
     * <p>id(0x5c6)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    Integer getRecordCount();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    Boolean getDrilledDown();
            
    /**
     * <p>id(0x73a)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    void setDrilledDown(Boolean param0);
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    String getStandardFormula();
            
    /**
     * <p>id(0x824)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    void setStandardFormula(String param0);
            
    /**
     * <p>id(0x864)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    String getSourceNameStandard();
            
    /**
     * <p>id(0xa14)</p>
     * <p>vtableId(40)</p>
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    void DrillTo(String Field);
            
    
}