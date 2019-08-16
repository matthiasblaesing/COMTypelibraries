
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208A2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208A2-0000-0000-C000-000000000046}")
public interface _OLEObject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x80010094)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x80010094)
    Application getApplication();
            
    /**
     * <p>id(0x80010095)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x80010095)
    XlCreator getCreator();
            
    /**
     * <p>id(0x80010096)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x80010096)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80010267)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x80010267)
    Range getBottomRightCell();
            
    /**
     * <p>id(0x8001025a)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x8001025a)
    Object BringToFront();
            
    /**
     * <p>id(0x80010227)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x80010227)
    Object Copy();
            
    /**
     * <p>id(0x800100d5)</p>
     * <p>vtableId(13)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     */
    @ComMethod(name = "CopyPicture", dispId = 0x800100d5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x80010235)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x80010235)
    Object Cut();
            
    /**
     * <p>id(0x80010075)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80010075)
    Object Delete();
            
    /**
     * <p>id(0x8001040f)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x8001040f)
    com.sun.jna.platform.win32.COM.util.IDispatch Duplicate();
            
    /**
     * <p>id(0x80010258)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x80010258)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x8001007b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    Double getHeight();
            
    /**
     * <p>id(0x8001007b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x800101e6)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Index", dispId = 0x800101e6)
    Integer getIndex();
            
    /**
     * <p>id(0x8001007f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    Double getLeft();
            
    /**
     * <p>id(0x8001007f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x8001010d)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    Boolean getLocked();
            
    /**
     * <p>id(0x8001010d)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x8001006e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    String getName();
            
    /**
     * <p>id(0x8001006e)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    void setName(String param0);
            
    /**
     * <p>id(0x80010254)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    String getOnAction();
            
    /**
     * <p>id(0x80010254)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x80010269)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    Object getPlacement();
            
    /**
     * <p>id(0x80010269)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    void setPlacement(Object param0);
            
    /**
     * <p>id(0x8001026a)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x8001026a)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0x800100eb)</p>
     * <p>vtableId(34)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0x800100eb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x8001025d)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x8001025d)
    Object SendToBack();
            
    /**
     * <p>id(0x8001007e)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    Double getTop();
            
    /**
     * <p>id(0x8001007e)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x8001026c)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x8001026c)
    Range getTopLeftCell();
            
    /**
     * <p>id(0x8001022e)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    Boolean getVisible();
            
    /**
     * <p>id(0x8001022e)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x8001007a)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    Double getWidth();
            
    /**
     * <p>id(0x8001007a)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x8001026e)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x8001026e)
    Integer getZOrder();
            
    /**
     * <p>id(0x800105f8)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x800105f8)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x80010080)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80010080)
    Border getBorder();
            
    /**
     * <p>id(0x80010081)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x80010081)
    Interior getInterior();
            
    /**
     * <p>id(0x80010067)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    Boolean getShadow();
            
    /**
     * <p>id(0x80010067)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x80010130)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x80010130)
    Object Activate();
            
    /**
     * <p>id(0x800104a2)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    Boolean getAutoLoad();
            
    /**
     * <p>id(0x800104a2)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    void setAutoLoad(Boolean param0);
            
    /**
     * <p>id(0x80010418)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    Boolean getAutoUpdate();
            
    /**
     * <p>id(0x80010418)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    void setAutoUpdate(Boolean param0);
            
    /**
     * <p>id(0x80010419)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Object", dispId = 0x80010419)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x8001041e)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "OLEType", dispId = 0x8001041e)
    Object getOLEType();
            
    /**
     * <p>id(0x800102d1)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    String getSourceName();
            
    /**
     * <p>id(0x800102d1)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    void setSourceName(String param0);
            
    /**
     * <p>id(0x800102a8)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "Update", dispId = 0x800102a8)
    Object Update();
            
    /**
     * <p>id(0x8001025e)</p>
     * <p>vtableId(59)</p>
     * @param Verb [in, optional] {@code XlOLEVerb}
     */
    @ComMethod(name = "Verb", dispId = 0x8001025e)
    Object Verb(XlOLEVerb Verb);
            
    /**
     * <p>id(0x80010422)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    String getLinkedCell();
            
    /**
     * <p>id(0x80010422)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x8001034f)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    String getListFillRange();
            
    /**
     * <p>id(0x8001034f)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x800105f3)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "progID", dispId = 0x800105f3)
    String getProgID();
            
    /**
     * <p>id(0x8001073d)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    String getAltHTML();
            
    /**
     * <p>id(0x8001073d)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    void setAltHTML(String param0);
            
    
}