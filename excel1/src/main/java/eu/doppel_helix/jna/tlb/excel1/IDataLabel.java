
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B2-0001-0000-C000-000000000046}")
public interface IDataLabel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code ChartFillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(18)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoText(VARIANT RHS);
            
    /**
     * <p>id(0x87)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoText(Boolean RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(String RHS);
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLinked(VARIANT RHS);
            
    /**
     * <p>id(0xc2)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLinked(Boolean RHS);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLocal(Object RHS);
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowLegendKey(VARIANT RHS);
            
    /**
     * <p>id(0xab)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowLegendKey(Boolean RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Object RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code XlDataLabelPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code XlDataLabelPosition}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(XlDataLabelPosition RHS);
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowSeriesName(VARIANT RHS);
            
    /**
     * <p>id(0x7e6)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowSeriesName(Boolean RHS);
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowCategoryName(VARIANT RHS);
            
    /**
     * <p>id(0x7e7)</p>
     * <p>vtableId(55)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowCategoryName(Boolean RHS);
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowValue(VARIANT RHS);
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowValue(Boolean RHS);
            
    /**
     * <p>id(0x7e9)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowPercentage(VARIANT RHS);
            
    /**
     * <p>id(0x7e9)</p>
     * <p>vtableId(59)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowPercentage(Boolean RHS);
            
    /**
     * <p>id(0x7ea)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowBubbleSize(VARIANT RHS);
            
    /**
     * <p>id(0x7ea)</p>
     * <p>vtableId(61)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowBubbleSize(Boolean RHS);
            
    /**
     * <p>id(0x7eb)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    com.sun.jna.platform.win32.WinNT.HRESULT getSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x7eb)</p>
     * <p>vtableId(63)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    com.sun.jna.platform.win32.WinNT.HRESULT setSeparator(Object RHS);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code ChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc0c)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_Height", dispId = 0xc0c)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Height(VARIANT RHS);
            
    /**
     * <p>id(0xc0d)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "_Width", dispId = 0xc0d)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Width(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(VARIANT RHS);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(70)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x108)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(String RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT RHS);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(72)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x107)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(String RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(73)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(74)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x109)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(String RHS);
            
    /**
     * <p>id(0xc0e)</p>
     * <p>vtableId(75)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowRange(VARIANT RHS);
            
    /**
     * <p>id(0xc0e)</p>
     * <p>vtableId(76)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowRange(Boolean RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(78)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(79)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(80)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    
}