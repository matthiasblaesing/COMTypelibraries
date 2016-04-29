
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020876-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020876-0000-0000-C000-000000000046}")
public interface PivotItem {
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
    PivotField getParent();
            
    /**
     * <p>id(0x2da)</p>
     */
    @ComProperty(name = "ChildItems", dispId = 0x2da)
    Object getChildItems(Object Index);
            
    /**
     * <p>id(0x2d0)</p>
     */
    @ComProperty(name = "DataRange", dispId = 0x2d0)
    Range getDataRange();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x2cf)</p>
     */
    @ComProperty(name = "LabelRange", dispId = 0x2cf)
    Range getLabelRange();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x2e5)</p>
     */
    @ComProperty(name = "ParentItem", dispId = 0x2e5)
    PivotItem getParentItem();
            
    /**
     * <p>id(0x2e3)</p>
     */
    @ComProperty(name = "ParentShowDetail", dispId = 0x2e3)
    Boolean getParentShowDetail();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    Integer getPosition();
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    Boolean getShowDetail();
            
    /**
     * <p>id(0x249)</p>
     */
    @ComProperty(name = "ShowDetail", dispId = 0x249)
    void setShowDetail(Boolean param0);
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    Object getSourceName();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x5e8)</p>
     */
    @ComProperty(name = "IsCalculated", dispId = 0x5e8)
    Boolean getIsCalculated();
            
    /**
     * <p>id(0x5c6)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    Integer getRecordCount();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    Boolean getDrilledDown();
            
    /**
     * <p>id(0x73a)</p>
     */
    @ComProperty(name = "DrilledDown", dispId = 0x73a)
    void setDrilledDown(Boolean param0);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    String getStandardFormula();
            
    /**
     * <p>id(0x824)</p>
     */
    @ComProperty(name = "StandardFormula", dispId = 0x824)
    void setStandardFormula(String param0);
            
    /**
     * <p>id(0x864)</p>
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    String getSourceNameStandard();
            
    /**
     * <p>id(0xa14)</p>
     */
    @ComMethod(name = "DrillTo", dispId = 0xa14)
    void DrillTo(String Field);
            
    
}