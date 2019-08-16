
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B3-0000-0000-C000-000000000046}")
public interface DataLabels extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x10009)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "_Dummy9", dispId = 0x10009)
    void _Dummy9();
            
    /**
     * <p>id(0x1000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "_Dummy10", dispId = 0x1000a)
    void _Dummy10();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x1000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "_Dummy13", dispId = 0x1000d)
    void _Dummy13();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x10010)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "_Dummy16", dispId = 0x10010)
    void _Dummy16();
            
    /**
     * <p>id(0x10011)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "_Dummy17", dispId = 0x10011)
    void _Dummy17();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    Object getAutoScaleFont();
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    void setAutoScaleFont(Object param0);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    Boolean getAutoText();
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    void setAutoText(Boolean param0);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    String getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    Boolean getNumberFormatLinked();
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    void setNumberFormatLinked(Boolean param0);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    Object getNumberFormatLocal();
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    void setNumberFormatLocal(Object param0);
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    Boolean getShowLegendKey();
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    void setShowLegendKey(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Object getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(Object param0);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    XlDataLabelPosition getPosition();
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code XlDataLabelPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    void setPosition(XlDataLabelPosition param0);
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    Boolean getShowSeriesName();
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    void setShowSeriesName(Boolean param0);
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    Boolean getShowCategoryName();
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    void setShowCategoryName(Boolean param0);
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    Boolean getShowValue();
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    void setShowValue(Boolean param0);
            
    /**
     * <p>id(0x7e9)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    Boolean getShowPercentage();
            
    /**
     * <p>id(0x7e9)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    void setShowPercentage(Boolean param0);
            
    /**
     * <p>id(0x7ea)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    Boolean getShowBubbleSize();
            
    /**
     * <p>id(0x7ea)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    void setShowBubbleSize(Boolean param0);
            
    /**
     * <p>id(0x7eb)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    Object getSeparator();
            
    /**
     * <p>id(0x7eb)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    void setSeparator(Object param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(61)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    DataLabel Item(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(63)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    DataLabel _Default(Object Index);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    /**
     * <p>id(0xc0f)</p>
     * <p>vtableId(65)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Propagate", dispId = 0xc0f)
    void Propagate(Object Index);
            
    /**
     * <p>id(0xc0e)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    Boolean getShowRange();
            
    /**
     * <p>id(0xc0e)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    void setShowRange(Boolean param0);
            
    
}