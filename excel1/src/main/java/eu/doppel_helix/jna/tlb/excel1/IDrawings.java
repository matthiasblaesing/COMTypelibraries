
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208A9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208A9-0001-0000-C000-000000000046}")
public interface IDrawings extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x10003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "_Dummy3", dispId = 0x10003)
    void _Dummy3();
            
    /**
     * <p>id(0x25a)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "BringToFront", dispId = 0x25a)
    com.sun.jna.platform.win32.WinNT.HRESULT BringToFront(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(13)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x1000c)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x1000f)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "_Dummy15", dispId = 0x1000f)
    void _Dummy15();
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(Object RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(33)</p>
     * @param Replace [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x25d)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SendToBack", dispId = 0x25d)
    com.sun.jna.platform.win32.WinNT.HRESULT SendToBack(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(36)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x10016)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "_Dummy22", dispId = 0x10016)
    void _Dummy22();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ZOrder", dispId = 0x26e)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrder(VARIANT RHS);
            
    /**
     * <p>id(0x5f8)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code ShapeRange}
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeRange(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddIndent(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddIndent(Boolean RHS);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoScaleFont(VARIANT RHS);
            
    /**
     * <p>id(0x5f5)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "AutoScaleFont", dispId = 0x5f5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoScaleFont(Object RHS);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSize(VARIANT RHS);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoSize(Boolean RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(52)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(53)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockedText(VARIANT RHS);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockedText(Boolean RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(64)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(66)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(69)</p>
     * @param RHS [out] {@code Border}
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(71)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(72)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x1002c)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "_Dummy44", dispId = 0x1002c)
    void _Dummy44();
            
    /**
     * <p>id(0x25c)</p>
     * <p>vtableId(74)</p>
     * @param Vertex [in] {@code Integer}
     * @param Insert [in] {@code Boolean}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Reshape", dispId = 0x25c)
    com.sun.jna.platform.win32.WinNT.HRESULT Reshape(Integer Vertex,
            Boolean Insert,
            Object Left,
            Object Top,
            VARIANT RHS);
            
    /**
     * <p>id(0x1002e)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "_Dummy46", dispId = 0x1002e)
    void _Dummy46();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(76)</p>
     * @param X1 [in] {@code Double}
     * @param Y1 [in] {@code Double}
     * @param X2 [in] {@code Double}
     * @param Y2 [in] {@code Double}
     * @param Closed [in] {@code Boolean}
     * @param RHS [out] {@code Drawing}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(Double X1,
            Double Y1,
            Double X2,
            Double Y2,
            Boolean Closed,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(77)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(78)</p>
     * @param RHS [out] {@code GroupObject}
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(79)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    
}