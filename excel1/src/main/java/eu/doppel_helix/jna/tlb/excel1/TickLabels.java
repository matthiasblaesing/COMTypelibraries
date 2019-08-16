
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208C9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208C9-0000-0000-C000-000000000046}")
public interface TickLabels extends IUnknown, IRawDispatchHandle, IDispatch {
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
    Object Delete();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    String getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    Boolean getNumberFormatLinked();
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    void setNumberFormatLinked(Boolean param0);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(Object param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    XlTickLabelOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code XlTickLabelOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(XlTickLabelOrientation param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x762)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Depth", dispId = 0x762)
    Integer getDepth();
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    Integer getOffset();
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Offset", dispId = 0xfe)
    void setOffset(Integer param0);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    Integer getAlignment();
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    void setAlignment(Integer param0);
            
    /**
     * <p>id(0xa5d)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "MultiLevel", dispId = 0xa5d)
    Boolean getMultiLevel();
            
    /**
     * <p>id(0xa5d)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MultiLevel", dispId = 0xa5d)
    void setMultiLevel(Boolean param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}