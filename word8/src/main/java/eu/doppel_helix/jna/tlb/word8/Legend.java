
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B3A1E8C6-E1CE-4A46-8D12-E017157B03D7})</p>
 */
@ComInterface(iid="{B3A1E8C6-E1CE-4A46-8D12-E017157B03D7}")
public interface Legend extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    ChartFont getFont();
            
    /**
     * <p>id(0xad)</p>
     * <p>vtableId(13)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "LegendEntries", dispId = 0xad)
    com.sun.jna.platform.win32.COM.util.IDispatch LegendEntries(Object Index);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    XlLegendPosition getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code XlLegendPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(XlLegendPosition param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x6f)
    Object Clear();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    Boolean getIncludeInLayout();
            
    /**
     * <p>id(0x972)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeInLayout", dispId = 0x972)
    void setIncludeInLayout(Boolean param0);
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002001a)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    
}