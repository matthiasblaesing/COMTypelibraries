
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C170C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C170C-0000-0000-C000-000000000046}")
public interface ChartPoint extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x97)</p>
     * <p>vtableId(8)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param IMsoLegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    com.sun.jna.platform.win32.WinNT.HRESULT _ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
            Object AutoText,
            Object HasLeaderLines,
            VARIANT RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code IMsoBorder}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearFormats(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code IMsoDataLabel}
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataLabel(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT getExplosion(VARIANT RHS);
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    com.sun.jna.platform.win32.WinNT.HRESULT setExplosion(Integer RHS);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasDataLabel(VARIANT RHS);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    com.sun.jna.platform.win32.WinNT.HRESULT setHasDataLabel(Boolean RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code IMsoInterior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Boolean RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColor(Integer RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerBackgroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerBackgroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColor(VARIANT RHS);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColor(Integer RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerForegroundColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerForegroundColorIndex(XlColorIndex RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerSize(VARIANT RHS);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerSize(Integer RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT getMarkerStyle(VARIANT RHS);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    com.sun.jna.platform.win32.WinNT.HRESULT setMarkerStyle(XlMarkerStyle RHS);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(33)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureType(VARIANT RHS);
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureType(XlChartPictureType RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit(VARIANT RHS);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit(Double RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(VARIANT RHS);
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToSides(VARIANT RHS);
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToSides(Boolean RHS);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToFront(VARIANT RHS);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToFront(Boolean RHS);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplyPictToEnd(VARIANT RHS);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(44)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    com.sun.jna.platform.win32.WinNT.HRESULT setApplyPictToEnd(Boolean RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(46)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(47)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSecondaryPlot(VARIANT RHS);
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(48)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSecondaryPlot(Boolean RHS);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code ChartFillFormat}
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFill(VARIANT RHS);
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(50)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param IMsoLegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     * @param ShowSeriesName [in, optional] {@code Object}
     * @param ShowCategoryName [in, optional] {@code Object}
     * @param ShowValue [in, optional] {@code Object}
     * @param ShowPercentage [in, optional] {@code Object}
     * @param ShowBubbleSize [in, optional] {@code Object}
     * @param Separator [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyDataLabels(XlDataLabelsType Type,
            Object IMsoLegendKey,
            Object AutoText,
            Object HasLeaderLines,
            Object ShowSeriesName,
            Object ShowCategoryName,
            Object ShowValue,
            Object ShowPercentage,
            Object ShowBubbleSize,
            Object Separator,
            VARIANT RHS);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(51)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT getHas3DEffect(VARIANT RHS);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(52)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    com.sun.jna.platform.win32.WinNT.HRESULT setHas3DEffect(Boolean RHS);
            
    /**
     * <p>id(0x6002002e)</p>
     * <p>vtableId(53)</p>
     * @param ppChartFormat [out] {@code IMsoChartFormat}
     */
    @ComProperty(name = "Format", dispId = 0x6002002e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormat(VARIANT ppChartFormat);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(54)</p>
     * @param ppval [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(55)</p>
     * @param pval [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT getPictureUnit2(VARIANT RHS);
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    com.sun.jna.platform.win32.WinNT.HRESULT setPictureUnit2(Double RHS);
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0xa5b)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xa5c)</p>
     * <p>vtableId(59)</p>
     * @param pval [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0xa5c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT pval);
            
    /**
     * <p>id(0xa5d)</p>
     * <p>vtableId(60)</p>
     * @param pval [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0xa5d)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT pval);
            
    /**
     * <p>id(0xa5e)</p>
     * <p>vtableId(61)</p>
     * @param pval [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0xa5e)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT pval);
            
    /**
     * <p>id(0xa5f)</p>
     * <p>vtableId(62)</p>
     * @param pval [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0xa5f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT pval);
            
    /**
     * <p>id(0xa60)</p>
     * <p>vtableId(63)</p>
     * @param loc [in] {@code XlPieSliceLocation}
     * @param Index [in, optional] {@code XlPieSliceIndex}
     * @param pval [out] {@code Double}
     */
    @ComMethod(name = "PieSliceLocation", dispId = 0xa60)
    com.sun.jna.platform.win32.WinNT.HRESULT PieSliceLocation(XlPieSliceLocation loc,
            XlPieSliceIndex Index,
            VARIANT pval);
            
    
}