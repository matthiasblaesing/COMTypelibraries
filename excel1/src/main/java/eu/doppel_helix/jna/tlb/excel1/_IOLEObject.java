
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208A2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208A2-0001-0000-C000-000000000046}")
public interface _IOLEObject {
    /**
     * <p>id(0x80010094)</p>
     */
    @ComProperty(name = "Application", dispId = 0x80010094)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x80010095)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x80010095)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x80010096)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x80010096)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x80010267)</p>
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x80010267)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomRightCell(VARIANT RHS);
            
    /**
     * <p>id(0x8001025a)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x8001025a)
    com.sun.jna.platform.win32.WinNT.HRESULT BringToFront(VARIANT RHS);
            
    /**
     * <p>id(0x80010227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x80010227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0x800100d5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0x800100d5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x80010235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x80010235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(VARIANT RHS);
            
    /**
     * <p>id(0x80010075)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80010075)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x8001040f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x8001040f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x80010258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x80010258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x8001007b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x8001007b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x800101e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x800101e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x8001007f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x8001007f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x8001010d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x8001010d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x8001006e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x8001006e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x80010254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x80010254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x80010269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x80010269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(Object RHS);
            
    /**
     * <p>id(0x8001026a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x8001026a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0x800100eb)</p>
     */
    @ComMethod(name = "Select", dispId = 0x800100eb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x8001025d)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x8001025d)
    com.sun.jna.platform.win32.WinNT.HRESULT SendToBack(VARIANT RHS);
            
    /**
     * <p>id(0x8001007e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x8001007e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x8001026c)</p>
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x8001026c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopLeftCell(VARIANT RHS);
            
    /**
     * <p>id(0x8001022e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x8001022e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x8001007a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x8001007a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x8001026e)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x8001026e)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrder(VARIANT RHS);
            
    /**
     * <p>id(0x800105f8)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x800105f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeRange(VARIANT RHS);
            
    /**
     * <p>id(0x80010080)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80010080)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x80010081)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x80010081)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x80010067)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x80010067)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x80010130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x80010130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x800104a2)</p>
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoLoad(VARIANT RHS);
            
    /**
     * <p>id(0x800104a2)</p>
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoLoad(Boolean RHS);
            
    /**
     * <p>id(0x80010418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoUpdate(VARIANT RHS);
            
    /**
     * <p>id(0x80010418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoUpdate(Boolean RHS);
            
    /**
     * <p>id(0x80010419)</p>
     */
    @ComProperty(name = "Object", dispId = 0x80010419)
    com.sun.jna.platform.win32.WinNT.HRESULT getObject(VARIANT RHS);
            
    /**
     * <p>id(0x8001041e)</p>
     */
    @ComProperty(name = "OLEType", dispId = 0x8001041e)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLEType(VARIANT RHS);
            
    /**
     * <p>id(0x800102d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x800102d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceName(String RHS);
            
    /**
     * <p>id(0x800102a8)</p>
     */
    @ComMethod(name = "Update", dispId = 0x800102a8)
    com.sun.jna.platform.win32.WinNT.HRESULT Update(VARIANT RHS);
            
    /**
     * <p>id(0x8001025e)</p>
     */
    @ComMethod(name = "Verb", dispId = 0x8001025e)
    com.sun.jna.platform.win32.WinNT.HRESULT Verb(XlOLEVerb Verb,
            VARIANT RHS);
            
    /**
     * <p>id(0x80010422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedCell(VARIANT RHS);
            
    /**
     * <p>id(0x80010422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkedCell(String RHS);
            
    /**
     * <p>id(0x8001034f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    com.sun.jna.platform.win32.WinNT.HRESULT getListFillRange(VARIANT RHS);
            
    /**
     * <p>id(0x8001034f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    com.sun.jna.platform.win32.WinNT.HRESULT setListFillRange(String RHS);
            
    /**
     * <p>id(0x800105f3)</p>
     */
    @ComProperty(name = "progID", dispId = 0x800105f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getProgID(VARIANT RHS);
            
    /**
     * <p>id(0x8001073d)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAltHTML(VARIANT RHS);
            
    /**
     * <p>id(0x8001073d)</p>
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAltHTML(String RHS);
            
    
}