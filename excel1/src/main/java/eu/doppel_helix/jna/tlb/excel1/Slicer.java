
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C8-0000-0000-C000-000000000046}")
public interface Slicer {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0xba7)</p>
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    Boolean getDisableMoveResizeUI();
            
    /**
     * <p>id(0xba7)</p>
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    void setDisableMoveResizeUI(Boolean param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    Double getRowHeight();
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    void setRowHeight(Double param0);
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    Double getColumnWidth();
            
    /**
     * <p>id(0xf2)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    void setColumnWidth(Double param0);
            
    /**
     * <p>id(0xba8)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    Integer getNumberOfColumns();
            
    /**
     * <p>id(0xba8)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    void setNumberOfColumns(Integer param0);
            
    /**
     * <p>id(0xba9)</p>
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    Boolean getDisplayHeader();
            
    /**
     * <p>id(0xba9)</p>
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    void setDisplayHeader(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xbaa)</p>
     */
    @ComProperty(name = "SlicerCache", dispId = 0xbaa)
    SlicerCache getSlicerCache();
            
    /**
     * <p>id(0xbab)</p>
     */
    @ComProperty(name = "SlicerCacheLevel", dispId = 0xbab)
    SlicerCacheLevel getSlicerCacheLevel();
            
    /**
     * <p>id(0x62e)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    Shape getShape();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    Object getStyle();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    void Cut();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy();
            
    /**
     * <p>id(0xbac)</p>
     */
    @ComProperty(name = "ActiveItem", dispId = 0xbac)
    SlicerItem getActiveItem();
            
    /**
     * <p>id(0xc2c)</p>
     */
    @ComProperty(name = "TimelineViewState", dispId = 0xc2c)
    TimelineViewState getTimelineViewState();
            
    /**
     * <p>id(0xc27)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    XlSlicerCacheType getSlicerCacheType();
            
    
}