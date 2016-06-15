
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1720-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1720-0000-0000-C000-000000000046}")
public interface IMsoDataLabel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoText(VARIANT RHS);
            
    /**
     * <p>id(0x87)</p>
     */
    @ComProperty(name = "AutoText", dispId = 0x87)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoText(Boolean RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(String RHS);
            
    /**
     * <p>id(0xc2)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLinked(VARIANT RHS);
            
    /**
     * <p>id(0xc2)</p>
     */
    @ComProperty(name = "NumberFormatLinked", dispId = 0xc2)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLinked(Boolean RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormatLocal(VARIANT RHS);
            
    /**
     * <p>id(0x449)</p>
     */
    @ComProperty(name = "NumberFormatLocal", dispId = 0x449)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormatLocal(Object RHS);
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowLegendKey(VARIANT RHS);
            
    /**
     * <p>id(0xab)</p>
     */
    @ComProperty(name = "ShowLegendKey", dispId = 0xab)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowLegendKey(Boolean RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(Object RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(XlDataLabelPosition RHS);
            
    /**
     * <p>id(0x7e6)</p>
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowSeriesName(VARIANT RHS);
            
    /**
     * <p>id(0x7e6)</p>
     */
    @ComProperty(name = "ShowSeriesName", dispId = 0x7e6)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowSeriesName(Boolean RHS);
            
    /**
     * <p>id(0x7e7)</p>
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowCategoryName(VARIANT RHS);
            
    /**
     * <p>id(0x7e7)</p>
     */
    @ComProperty(name = "ShowCategoryName", dispId = 0x7e7)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowCategoryName(Boolean RHS);
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowValue(VARIANT RHS);
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowValue(Boolean RHS);
            
    /**
     * <p>id(0x7e9)</p>
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowPercentage(VARIANT RHS);
            
    /**
     * <p>id(0x7e9)</p>
     */
    @ComProperty(name = "ShowPercentage", dispId = 0x7e9)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowPercentage(Boolean RHS);
            
    /**
     * <p>id(0x7ea)</p>
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowBubbleSize(VARIANT RHS);
            
    /**
     * <p>id(0x7ea)</p>
     */
    @ComProperty(name = "ShowBubbleSize", dispId = 0x7ea)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowBubbleSize(Boolean RHS);
            
    /**
     * <p>id(0x7eb)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    com.sun.jna.platform.win32.WinNT.HRESULT getSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x7eb)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x7eb)
    com.sun.jna.platform.win32.WinNT.HRESULT setSeparator(Object RHS);
            
    /**
     * <p>id(0x60020037)</p>
     */
    @ComProperty(name = "Format", dispId = 0x60020037)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT ppChartFormat);
            
    /**
     * <p>id(0x60020038)</p>
     */
    @ComProperty(name = "_Height", dispId = 0x60020038)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Height(VARIANT pval);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0x7ee)</p>
     */
    @ComProperty(name = "_Width", dispId = 0x7ee)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Width(VARIANT pval);
            
    /**
     * <p>id(0x7ef)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x7ef)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String pbstr);
            
    /**
     * <p>id(0x7ef)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x7ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT pbstr);
            
    /**
     * <p>id(0x7f0)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x7f0)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1(String pbstr);
            
    /**
     * <p>id(0x7f0)</p>
     */
    @ComProperty(name = "FormulaR1C1", dispId = 0x7f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1(VARIANT pbstr);
            
    /**
     * <p>id(0x7f1)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x7f1)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaLocal(String pbstr);
            
    /**
     * <p>id(0x7f1)</p>
     */
    @ComProperty(name = "FormulaLocal", dispId = 0x7f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaLocal(VARIANT pbstr);
            
    /**
     * <p>id(0x7f2)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x7f2)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormulaR1C1Local(String pbstr);
            
    /**
     * <p>id(0x7f2)</p>
     */
    @ComProperty(name = "FormulaR1C1Local", dispId = 0x7f2)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormulaR1C1Local(VARIANT pbstr);
            
    /**
     * <p>id(0x7f3)</p>
     */
    @ComProperty(name = "ShowRange", dispId = 0x7f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowRange(VARIANT RHS);
            
    /**
     * <p>id(0x7f3)</p>
     */
    @ComProperty(name = "ShowRange", dispId = 0x7f3)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowRange(Boolean RHS);
            
    /**
     * <p>id(0x7f4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7f4)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT pHeight);
            
    /**
     * <p>id(0x7f4)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7f4)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double pHeight);
            
    /**
     * <p>id(0x7f5)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT pWidth);
            
    /**
     * <p>id(0x7f5)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double pWidth);
            
    
}