
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024447-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024447-0001-0000-C000-000000000046}")
public interface IPhonetics extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x260)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Start", dispId = 0x260)
    com.sun.jna.platform.win32.WinNT.HRESULT getStart(VARIANT RHS);
            
    /**
     * <p>id(0x261)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Length", dispId = 0x261)
    com.sun.jna.platform.win32.WinNT.HRESULT getLength(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x68a)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacterType(VARIANT RHS);
            
    /**
     * <p>id(0x68a)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "CharacterType", dispId = 0x68a)
    com.sun.jna.platform.win32.WinNT.HRESULT setCharacterType(Integer RHS);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Alignment", dispId = 0x1c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlignment(Integer RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(20)</p>
     * @param Index [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Integer Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(22)</p>
     * @param Start [in] {@code Integer}
     * @param Length [in] {@code Integer}
     * @param Text [in] {@code String}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(Integer Start,
            Integer Length,
            String Text);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(25)</p>
     * @param Index [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Integer Index,
            VARIANT RHS);
            
    
}