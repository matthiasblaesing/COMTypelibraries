
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024460-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024460-0001-0000-C000-000000000046}")
public interface ISmartTag extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8a4)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "DownloadURL", dispId = 0x8a4)
    com.sun.jna.platform.win32.WinNT.HRESULT getDownloadURL(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x8a5)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "XML", dispId = 0x8a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getXML(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x8a6)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code SmartTagActions}
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x8a6)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartTagActions(VARIANT RHS);
            
    /**
     * <p>id(0x857)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code CustomProperties}
     */
    @ComProperty(name = "Properties", dispId = 0x857)
    com.sun.jna.platform.win32.WinNT.HRESULT getProperties(VARIANT RHS);
            
    
}