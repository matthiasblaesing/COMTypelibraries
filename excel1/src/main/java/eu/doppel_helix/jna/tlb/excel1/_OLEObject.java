
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
     */
    @ComProperty(name = "Application", dispId = 0x80010094)
    Application getApplication();
            
    /**
     * <p>id(0x80010095)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x80010095)
    XlCreator getCreator();
            
    /**
     * <p>id(0x80010096)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x80010096)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80010267)</p>
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x80010267)
    Range getBottomRightCell();
            
    /**
     * <p>id(0x8001025a)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x8001025a)
    Object BringToFront();
            
    /**
     * <p>id(0x80010227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x80010227)
    Object Copy();
            
    /**
     * <p>id(0x800100d5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0x800100d5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x80010235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x80010235)
    Object Cut();
            
    /**
     * <p>id(0x80010075)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80010075)
    Object Delete();
            
    /**
     * <p>id(0x8001040f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x8001040f)
    com.sun.jna.platform.win32.COM.util.IDispatch Duplicate();
            
    /**
     * <p>id(0x80010258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x80010258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x8001007b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    Double getHeight();
            
    /**
     * <p>id(0x8001007b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x800101e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x800101e6)
    Integer getIndex();
            
    /**
     * <p>id(0x8001007f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    Double getLeft();
            
    /**
     * <p>id(0x8001007f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x8001010d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    Boolean getLocked();
            
    /**
     * <p>id(0x8001010d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x8001006e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    String getName();
            
    /**
     * <p>id(0x8001006e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    void setName(String param0);
            
    /**
     * <p>id(0x80010254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    String getOnAction();
            
    /**
     * <p>id(0x80010254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x80010269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    Object getPlacement();
            
    /**
     * <p>id(0x80010269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    void setPlacement(Object param0);
            
    /**
     * <p>id(0x8001026a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x8001026a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0x800100eb)</p>
     */
    @ComMethod(name = "Select", dispId = 0x800100eb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x8001025d)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x8001025d)
    Object SendToBack();
            
    /**
     * <p>id(0x8001007e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    Double getTop();
            
    /**
     * <p>id(0x8001007e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x8001026c)</p>
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x8001026c)
    Range getTopLeftCell();
            
    /**
     * <p>id(0x8001022e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    Boolean getVisible();
            
    /**
     * <p>id(0x8001022e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x8001007a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    Double getWidth();
            
    /**
     * <p>id(0x8001007a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x8001026e)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x8001026e)
    Integer getZOrder();
            
    /**
     * <p>id(0x800105f8)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x800105f8)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x80010080)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80010080)
    Border getBorder();
            
    /**
     * <p>id(0x80010081)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x80010081)
    Interior getInterior();
            
    /**
     * <p>id(0x80010067)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    Boolean getShadow();
            
    /**
     * <p>id(0x80010067)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x80010130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x80010130)
    Object Activate();
            
    /**
     * <p>id(0x800104a2)</p>
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    Boolean getAutoLoad();
            
    /**
     * <p>id(0x800104a2)</p>
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    void setAutoLoad(Boolean param0);
            
    /**
     * <p>id(0x80010418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    Boolean getAutoUpdate();
            
    /**
     * <p>id(0x80010418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    void setAutoUpdate(Boolean param0);
            
    /**
     * <p>id(0x80010419)</p>
     */
    @ComProperty(name = "Object", dispId = 0x80010419)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x8001041e)</p>
     */
    @ComProperty(name = "OLEType", dispId = 0x8001041e)
    Object getOLEType();
            
    /**
     * <p>id(0x800102d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    String getSourceName();
            
    /**
     * <p>id(0x800102d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    void setSourceName(String param0);
            
    /**
     * <p>id(0x800102a8)</p>
     */
    @ComMethod(name = "Update", dispId = 0x800102a8)
    Object Update();
            
    /**
     * <p>id(0x8001025e)</p>
     */
    @ComMethod(name = "Verb", dispId = 0x8001025e)
    Object Verb(XlOLEVerb Verb);
            
    /**
     * <p>id(0x80010422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    String getLinkedCell();
            
    /**
     * <p>id(0x80010422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x8001034f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    String getListFillRange();
            
    /**
     * <p>id(0x8001034f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x800105f3)</p>
     */
    @ComProperty(name = "progID", dispId = 0x800105f3)
    String getProgID();
            
    /**
     * <p>id(0x8001073d)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    String getAltHTML();
            
    /**
     * <p>id(0x8001073d)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    void setAltHTML(String param0);
            
    
}