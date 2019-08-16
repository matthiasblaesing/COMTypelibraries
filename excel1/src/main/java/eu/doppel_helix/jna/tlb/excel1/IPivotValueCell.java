
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244CF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244CF-0001-0000-C000-000000000046}")
public interface IPivotValueCell extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x7dd)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code PivotCell}
     */
    @ComProperty(name = "PivotCell", dispId = 0x7dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotCell(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x249)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "ShowDetail", dispId = 0x249)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowDetail();
            
    /**
     * <p>id(0x9bb)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Actions}
     */
    @ComProperty(name = "ServerActions", dispId = 0x9bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerActions(VARIANT RHS);
            
    
}