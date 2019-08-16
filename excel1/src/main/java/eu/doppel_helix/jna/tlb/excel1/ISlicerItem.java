
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244C9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244C9-0001-0000-C000-000000000046}")
public interface ISlicerItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param RHS [out] {@code SlicerCache}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x2d1)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceName(VARIANT RHS);
            
    /**
     * <p>id(0x864)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceNameStandard", dispId = 0x864)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceNameStandard(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelected(VARIANT RHS);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT setSelected(Boolean RHS);
            
    /**
     * <p>id(0xbad)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "HasData", dispId = 0xbad)
    com.sun.jna.platform.win32.WinNT.HRESULT getHasData(VARIANT RHS);
            
    
}