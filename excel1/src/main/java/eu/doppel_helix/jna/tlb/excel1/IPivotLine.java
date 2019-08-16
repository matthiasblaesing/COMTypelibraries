
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024480-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024480-0001-0000-C000-000000000046}")
public interface IPivotLine extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa7b)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlPivotLineType}
     */
    @ComProperty(name = "LineType", dispId = 0xa7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getLineType(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0xa7c)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code PivotLineCells}
     */
    @ComProperty(name = "PivotLineCells", dispId = 0xa7c)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotLineCells(VARIANT RHS);
            
    /**
     * <p>id(0xc1a)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code PivotLineCells}
     */
    @ComProperty(name = "PivotLineCellsFull", dispId = 0xc1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotLineCellsFull(VARIANT RHS);
            
    
}