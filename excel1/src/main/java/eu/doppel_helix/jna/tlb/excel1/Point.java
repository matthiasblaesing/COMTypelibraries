
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
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x97)</p>
     */
    @ComMethod(name = "_ApplyDataLabels", dispId = 0x97)
    Object _ApplyDataLabels(XlDataLabelsType Type,
            Object LegendKey,
            Object AutoText,
            Object HasLeaderLines);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0x9e)</p>
     */
    @ComProperty(name = "DataLabel", dispId = 0x9e)
    DataLabel getDataLabel();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    Integer getExplosion();
            
    /**
     * <p>id(0xb6)</p>
     */
    @ComProperty(name = "Explosion", dispId = 0xb6)
    void setExplosion(Integer param0);
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    Boolean getHasDataLabel();
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "HasDataLabel", dispId = 0x4d)
    void setHasDataLabel(Boolean param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Boolean getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    Integer getMarkerBackgroundColor();
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "MarkerBackgroundColor", dispId = 0x49)
    void setMarkerBackgroundColor(Integer param0);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    XlColorIndex getMarkerBackgroundColorIndex();
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "MarkerBackgroundColorIndex", dispId = 0x4a)
    void setMarkerBackgroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    Integer getMarkerForegroundColor();
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "MarkerForegroundColor", dispId = 0x4b)
    void setMarkerForegroundColor(Integer param0);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    XlColorIndex getMarkerForegroundColorIndex();
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "MarkerForegroundColorIndex", dispId = 0x4c)
    void setMarkerForegroundColorIndex(XlColorIndex param0);
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    Integer getMarkerSize();
            
    /**
     * <p>id(0xe7)</p>
     */
    @ComProperty(name = "MarkerSize", dispId = 0xe7)
    void setMarkerSize(Integer param0);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    XlMarkerStyle getMarkerStyle();
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "MarkerStyle", dispId = 0x48)
    void setMarkerStyle(XlMarkerStyle param0);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    Object Paste();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    XlChartPictureType getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(XlChartPictureType param0);
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Integer getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Integer param0);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    Boolean getApplyPictToSides();
            
    /**
     * <p>id(0x67b)</p>
     */
    @ComProperty(name = "ApplyPictToSides", dispId = 0x67b)
    void setApplyPictToSides(Boolean param0);
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    Boolean getApplyPictToFront();
            
    /**
     * <p>id(0x67c)</p>
     */
    @ComProperty(name = "ApplyPictToFront", dispId = 0x67c)
    void setApplyPictToFront(Boolean param0);
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    Boolean getApplyPictToEnd();
            
    /**
     * <p>id(0x67d)</p>
     */
    @ComProperty(name = "ApplyPictToEnd", dispId = 0x67d)
    void setApplyPictToEnd(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x67e)</p>
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    Boolean getSecondaryPlot();
            
    /**
     * <p>id(0x67e)</p>
     */
    @ComProperty(name = "SecondaryPlot", dispId = 0x67e)
    void setSecondaryPlot(Boolean param0);
            
    /**
     * <p>id(0x67f)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0x782)</p>
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
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    Boolean getHas3DEffect();
            
    /**
     * <p>id(0x681)</p>
     */
    @ComProperty(name = "Has3DEffect", dispId = 0x681)
    void setHas3DEffect(Boolean param0);
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    Double getPictureUnit2();
            
    /**
     * <p>id(0xa59)</p>
     */
    @ComProperty(name = "PictureUnit2", dispId = 0xa59)
    void setPictureUnit2(Double param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xb61)</p>
     */
    @ComMethod(name = "PieSliceLocation", dispId = 0xb61)
    Double PieSliceLocation(XlPieSliceLocation loc,
            XlPieSliceIndex Index);
            
    
}