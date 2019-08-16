
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208A2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208A2-0001-0000-C000-000000000046}")
public interface _IOLEObject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x80010094)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x80010094)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x80010095)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x80010095)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x80010096)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x80010096)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x80010267)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x80010267)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomRightCell(VARIANT RHS);
            
    /**
     * <p>id(0x8001025a)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "BringToFront", dispId = 0x8001025a)
    com.sun.jna.platform.win32.WinNT.HRESULT BringToFront(VARIANT RHS);
            
    /**
     * <p>id(0x80010227)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x80010227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0x800100d5)</p>
     * <p>vtableId(13)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0x800100d5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x80010235)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Cut", dispId = 0x80010235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(VARIANT RHS);
            
    /**
     * <p>id(0x80010075)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x80010075)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x8001040f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Duplicate", dispId = 0x8001040f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x80010258)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x80010258)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x80010258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x8001007b)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x8001007b)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x8001007b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x800101e6)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x800101e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x8001007f)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x8001007f)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x8001007f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x8001010d)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x8001010d)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x8001010d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x8001006e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x8001006e)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x8001006e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x80010254)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x80010254)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x80010254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x80010269)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x80010269)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x80010269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(Object RHS);
            
    /**
     * <p>id(0x8001026a)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x8001026a)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x8001026a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0x800100eb)</p>
     * <p>vtableId(34)</p>
     * @param Replace [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0x800100eb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x8001025d)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SendToBack", dispId = 0x8001025d)
    com.sun.jna.platform.win32.WinNT.HRESULT SendToBack(VARIANT RHS);
            
    /**
     * <p>id(0x8001007e)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x8001007e)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x8001007e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x8001026c)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x8001026c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopLeftCell(VARIANT RHS);
            
    /**
     * <p>id(0x8001022e)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x8001022e)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x8001022e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x8001007a)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x8001007a)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x8001007a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x8001026e)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ZOrder", dispId = 0x8001026e)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrder(VARIANT RHS);
            
    /**
     * <p>id(0x800105f8)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code ShapeRange}
     */
    @ComProperty(name = "ShapeRange", dispId = 0x800105f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeRange(VARIANT RHS);
            
    /**
     * <p>id(0x80010080)</p>
     * <p>vtableId(45)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80010080)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x80010081)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x80010081)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x80010067)</p>
     * <p>vtableId(47)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x80010067)</p>
     * <p>vtableId(48)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x80010067)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x80010130)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Activate", dispId = 0x80010130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(VARIANT RHS);
            
    /**
     * <p>id(0x800104a2)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoLoad(VARIANT RHS);
            
    /**
     * <p>id(0x800104a2)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoLoad", dispId = 0x800104a2)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoLoad(Boolean RHS);
            
    /**
     * <p>id(0x80010418)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoUpdate(VARIANT RHS);
            
    /**
     * <p>id(0x80010418)</p>
     * <p>vtableId(53)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x80010418)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoUpdate(Boolean RHS);
            
    /**
     * <p>id(0x80010419)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Object", dispId = 0x80010419)
    com.sun.jna.platform.win32.WinNT.HRESULT getObject(VARIANT RHS);
            
    /**
     * <p>id(0x8001041e)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "OLEType", dispId = 0x8001041e)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLEType(VARIANT RHS);
            
    /**
     * <p>id(0x800102d1)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x800102d1)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceName", dispId = 0x800102d1)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceName(String RHS);
            
    /**
     * <p>id(0x800102a8)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Update", dispId = 0x800102a8)
    com.sun.jna.platform.win32.WinNT.HRESULT Update(VARIANT RHS);
            
    /**
     * <p>id(0x8001025e)</p>
     * <p>vtableId(59)</p>
     * @param Verb [in, optional] {@code XlOLEVerb}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Verb", dispId = 0x8001025e)
    com.sun.jna.platform.win32.WinNT.HRESULT Verb(XlOLEVerb Verb,
            VARIANT RHS);
            
    /**
     * <p>id(0x80010422)</p>
     * <p>vtableId(60)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedCell(VARIANT RHS);
            
    /**
     * <p>id(0x80010422)</p>
     * <p>vtableId(61)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x80010422)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkedCell(String RHS);
            
    /**
     * <p>id(0x8001034f)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    com.sun.jna.platform.win32.WinNT.HRESULT getListFillRange(VARIANT RHS);
            
    /**
     * <p>id(0x8001034f)</p>
     * <p>vtableId(63)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x8001034f)
    com.sun.jna.platform.win32.WinNT.HRESULT setListFillRange(String RHS);
            
    /**
     * <p>id(0x800105f3)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "progID", dispId = 0x800105f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getProgID(VARIANT RHS);
            
    /**
     * <p>id(0x8001073d)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    com.sun.jna.platform.win32.WinNT.HRESULT getAltHTML(VARIANT RHS);
            
    /**
     * <p>id(0x8001073d)</p>
     * <p>vtableId(66)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "AltHTML", dispId = 0x8001073d)
    com.sun.jna.platform.win32.WinNT.HRESULT setAltHTML(String RHS);
            
    
}