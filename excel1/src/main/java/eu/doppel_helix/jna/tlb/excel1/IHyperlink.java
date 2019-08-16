
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024431-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024431-0001-0000-C000-000000000046}")
public interface IHyperlink extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT RHS);
            
    /**
     * <p>id(0x5bf)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubAddress(VARIANT RHS);
            
    /**
     * <p>id(0x5bf)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubAddress(String RHS);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Address", dispId = 0xec)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddress(VARIANT RHS);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Address", dispId = 0xec)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddress(String RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x5c4)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    com.sun.jna.platform.win32.WinNT.HRESULT AddToFavorites();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x650)</p>
     * <p>vtableId(20)</p>
     * @param NewWindow [in, optional] {@code Object}
     * @param AddHistory [in, optional] {@code Object}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code Object}
     * @param HeaderInfo [in, optional] {@code Object}
     */
    @ComMethod(name = "Follow", dispId = 0x650)
    com.sun.jna.platform.win32.WinNT.HRESULT Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x75b)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    com.sun.jna.platform.win32.WinNT.HRESULT getEmailSubject(VARIANT RHS);
            
    /**
     * <p>id(0x75b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    com.sun.jna.platform.win32.WinNT.HRESULT setEmailSubject(String RHS);
            
    /**
     * <p>id(0x759)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    com.sun.jna.platform.win32.WinNT.HRESULT getScreenTip(VARIANT RHS);
            
    /**
     * <p>id(0x759)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    com.sun.jna.platform.win32.WinNT.HRESULT setScreenTip(String RHS);
            
    /**
     * <p>id(0x75a)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextToDisplay(VARIANT RHS);
            
    /**
     * <p>id(0x75a)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextToDisplay(String RHS);
            
    /**
     * <p>id(0x75c)</p>
     * <p>vtableId(27)</p>
     * @param Filename [in] {@code String}
     * @param EditNow [in] {@code Boolean}
     * @param Overwrite [in] {@code Boolean}
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x75c)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateNewDocument(String Filename,
            Boolean EditNow,
            Boolean Overwrite);
            
    
}