
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B3-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B3-0001-0000-C000-000000000046}")
public interface IDataLabels extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
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
     * <p>id(0x10009)</p>
     */
    @ComMethod(name = "_Dummy9", dispId = 0x10009)
    void _Dummy9();
            
    /**
     * <p>id(0x1000a)</p>
     */
    @ComMethod(name = "_Dummy10", dispId = 0x1000a)
    void _Dummy10();
            
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
     * <p>id(0x1000d)</p>
     */
    @ComMethod(name = "_Dummy13", dispId = 0x1000d)
    void _Dummy13();
            
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
     * <p>id(0x10010)</p>
     */
    @ComMethod(name = "_Dummy16", dispId = 0x10010)
    void _Dummy16();
            
    /**
     * <p>id(0x10011)</p>
     */
    @ComMethod(name = "_Dummy17", dispId = 0x10011)
    void _Dummy17();
            
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
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT _Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc0f)</p>
     */
    @ComMethod(name = "Propagate", dispId = 0xc0f)
    com.sun.jna.platform.win32.WinNT.HRESULT Propagate(Object Index);
            
    /**
     * <p>id(0xc0e)</p>
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowRange(VARIANT RHS);
            
    /**
     * <p>id(0xc0e)</p>
     */
    @ComProperty(name = "ShowRange", dispId = 0xc0e)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowRange(Boolean RHS);
            
    
}