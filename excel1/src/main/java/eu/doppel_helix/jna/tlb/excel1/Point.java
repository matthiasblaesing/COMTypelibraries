
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086A-0000-0000-C000-000000000046}")
public interface Point extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x97)</p>
     * <p>vtableId(10)</p>
     * @param Type [in, optional] {@code XlDataLabelsType}
     * @param LegendKey [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param HasLeaderLines [in, optional] {@code Object}
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    Object _ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0x9e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    DataLabel getDataLabel();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    Integer getExplosion();
            
    /**
     * <p>id(0xb6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    void setExplosion(Integer param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    Boolean getHasDataLabel();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    void setHasDataLabel(Boolean param0);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Boolean getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    Integer getMarkerBackgroundColor();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    void setMarkerBackgroundColor(Integer param0);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    XlColorIndex getMarkerBackgroundColorIndex();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    void setMarkerBackgroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    Integer getMarkerForegroundColor();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    void setMarkerForegroundColor(Integer param0);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    XlColorIndex getMarkerForegroundColorIndex();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code XlColorIndex}
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    void setMarkerForegroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    Integer getMarkerSize();
            
    /**
     * <p>id(0xe7)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    void setMarkerSize(Integer param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    XlMarkerStyle getMarkerStyle();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code XlMarkerStyle}
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    void setMarkerStyle(XlMarkerStyle param0);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    XlChartPictureType getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code XlChartPictureType}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(XlChartPictureType param0);
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Integer getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Integer param0);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    Boolean getApplyPictToSides();
            
    /**
     * <p>id(0x67b)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    void setApplyPictToSides(Boolean param0);
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    Boolean getApplyPictToFront();
            
    /**
     * <p>id(0x67c)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    void setApplyPictToFront(Boolean param0);
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    Boolean getApplyPictToEnd();
            
    /**
     * <p>id(0x67d)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    void setApplyPictToEnd(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    Boolean getSecondaryPlot();
            
    /**
     * <p>id(0x67e)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    void setSecondaryPlot(Boolean param0);
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x782)</p>
     * <p>vtableId(52)</p>
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
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    Boolean getHas3DEffect();
            
    /**
     * <p>id(0x681)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    void setHas3DEffect(Boolean param0);
            
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
     * <p>id(0x74)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xb61)</p>
     * <p>vtableId(63)</p>
     * @param loc [in] {@code XlPieSliceLocation}
     * @param Index [in, optional] {@code XlPieSliceIndex}
     */
    @ComMethod(name = "PieSliceLocation", dispId = 0xb61)
    Double PieSliceLocation(XlPieSliceLocation loc,
            XlPieSliceIndex Index);
            
    
}