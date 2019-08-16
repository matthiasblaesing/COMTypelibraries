
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C8-0000-0000-C000-000000000046}")
public interface Slicer extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0xba7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    Boolean getDisableMoveResizeUI();
            
    /**
     * <p>id(0xba7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisableMoveResizeUI", dispId = 0xba7)
    void setDisableMoveResizeUI(Boolean param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    Double getRowHeight();
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "RowHeight", dispId = 0x110)
    void setRowHeight(Double param0);
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    Double getColumnWidth();
            
    /**
     * <p>id(0xf2)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "ColumnWidth", dispId = 0xf2)
    void setColumnWidth(Double param0);
            
    /**
     * <p>id(0xba8)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    Integer getNumberOfColumns();
            
    /**
     * <p>id(0xba8)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0xba8)
    void setNumberOfColumns(Integer param0);
            
    /**
     * <p>id(0xba9)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    Boolean getDisplayHeader();
            
    /**
     * <p>id(0xba9)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayHeader", dispId = 0xba9)
    void setDisplayHeader(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0xbaa)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "SlicerCache", dispId = 0xbaa)
    SlicerCache getSlicerCache();
            
    /**
     * <p>id(0xbab)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "SlicerCacheLevel", dispId = 0xbab)
    SlicerCacheLevel getSlicerCacheLevel();
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    Shape getShape();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Style", dispId = 0x104)
    Object getStyle();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0x104)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(39)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    void Cut();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy();
            
    /**
     * <p>id(0xbac)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ActiveItem", dispId = 0xbac)
    SlicerItem getActiveItem();
            
    /**
     * <p>id(0xc2c)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "TimelineViewState", dispId = 0xc2c)
    TimelineViewState getTimelineViewState();
            
    /**
     * <p>id(0xc27)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "SlicerCacheType", dispId = 0xc27)
    XlSlicerCacheType getSlicerCacheType();
            
    
}