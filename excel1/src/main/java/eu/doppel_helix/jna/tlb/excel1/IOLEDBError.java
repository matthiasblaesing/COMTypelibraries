
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024445-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024445-0001-0000-C000-000000000046}")
public interface IOLEDBError extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x643)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SqlState", dispId = 0x643)
    com.sun.jna.platform.win32.WinNT.HRESULT getSqlState(VARIANT RHS);
            
    /**
     * <p>id(0x5d2)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ErrorString", dispId = 0x5d2)
    com.sun.jna.platform.win32.WinNT.HRESULT getErrorString(VARIANT RHS);
            
    /**
     * <p>id(0x769)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Native", dispId = 0x769)
    com.sun.jna.platform.win32.WinNT.HRESULT getNative(VARIANT RHS);
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Number", dispId = 0x1c3)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumber(VARIANT RHS);
            
    /**
     * <p>id(0x76a)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Stage", dispId = 0x76a)
    com.sun.jna.platform.win32.WinNT.HRESULT getStage(VARIANT RHS);
            
    
}