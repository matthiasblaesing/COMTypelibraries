
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({8A342FA0-5831-4B5E-82E1-003D0A0C635D})</p>
 */
@ComInterface(iid="{8A342FA0-5831-4B5E-82E1-003D0A0C635D}")
public interface Point extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    ChartBorder getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    DataLabel getDataLabel();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    Integer getExplosion();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    void setExplosion(Integer param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    Boolean getHasDataLabel();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    void setHasDataLabel(Boolean param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Boolean getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    Integer getMarkerBackgroundColor();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    void setMarkerBackgroundColor(Integer param0);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    XlColorIndex getMarkerBackgroundColorIndex();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    void setMarkerBackgroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    Integer getMarkerForegroundColor();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    void setMarkerForegroundColor(Integer param0);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    XlColorIndex getMarkerForegroundColorIndex();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    void setMarkerForegroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    Integer getMarkerSize();
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    void setMarkerSize(Integer param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    XlMarkerStyle getMarkerStyle();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    void setMarkerStyle(XlMarkerStyle param0);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    XlChartPictureType getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(XlChartPictureType param0);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Double getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Double param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    Boolean getApplyPictToSides();
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    void setApplyPictToSides(Boolean param0);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    Boolean getApplyPictToFront();
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    void setApplyPictToFront(Boolean param0);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    Boolean getApplyPictToEnd();
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    void setApplyPictToEnd(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    Boolean getSecondaryPlot();
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    void setSecondaryPlot(Boolean param0);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(49)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param LegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     * @param ShowSeriesName [in, optional] {@code Object}
     * @param ShowCategoryName [in, optional] {@code Object}
     * @param ShowValue [in, optional] {@code Object}
     * @param ShowPercentage [in, optional] {@code Object}
     * @param ShowBubbleSize [in, optional] {@code Object}
     * @param Separator [in, optional] {@code Object}
     */
    @ComMethod(name = "ApplyDataLabels", dispId = 0x782)
    Object ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines,
            Object ShowSeriesName,
            Object ShowCategoryName,
            Object ShowValue,
            Object ShowPercentage,
            Object ShowBubbleSize,
            Object Separator);
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    Boolean getHas3DEffect();
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    void setHas3DEffect(Boolean param0);
            
    /**
     * <p>id(0x6002002e)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Format", dispId = 0x6002002e)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    Double getPictureUnit2();
            
    /**
     * <p>id(0xa59)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    void setPictureUnit2(Double param0);
            
    /**
     * <p>id(0xa5c)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Height", dispId = 0xa5c)
    Double getHeight();
            
    /**
     * <p>id(0xa5d)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Width", dispId = 0xa5d)
    Double getWidth();
            
    /**
     * <p>id(0xa5f)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Top", dispId = 0xa5f)
    Double getTop();
            
    /**
     * <p>id(0xa5e)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Left", dispId = 0xa5e)
    Double getLeft();
            
    /**
     * <p>id(0xa5b)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Name", dispId = 0xa5b)
    String getName();
            
    /**
     * <p>id(0xa60)</p>
     * <p>vtableId(62)</p>
     * @param loc [in] {@code XlPieSliceLocation}
     * @param Index [in, optional] {@code XlPieSliceIndex}
     */
    @ComMethod(name = "PieSliceLocation", dispId = 0xa60)
    Double PieSliceLocation(XlPieSliceLocation loc,
            XlPieSliceIndex Index);
            
    
}