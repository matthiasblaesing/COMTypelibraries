
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CC-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CC-0001-0000-C000-000000000046}")
public interface IProtectedViewWindows extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code ProtectedViewWindow}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code ProtectedViewWindow}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x783)</p>
     * <p>vtableId(14)</p>
     * @param Filename [in] {@code String}
     * @param Password [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param RepairMode [in, optional] {@code Object}
     * @param RHS [out] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "Open", dispId = 0x783)
    com.sun.jna.platform.win32.WinNT.HRESULT Open(String Filename,
            Object Password,
            Object AddToMru,
            Object RepairMode,
            VARIANT RHS);
            
    
}