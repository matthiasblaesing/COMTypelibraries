
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024480-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024480-0001-0000-C000-000000000046}")
public interface IPivotLine {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xa7b)</p>
     */
    @ComProperty(name = "LineType", dispId = 0xa7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getLineType(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0xa7c)</p>
     */
    @ComProperty(name = "PivotLineCells", dispId = 0xa7c)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotLineCells(VARIANT RHS);
            
    /**
     * <p>id(0xc1a)</p>
     */
    @ComProperty(name = "PivotLineCellsFull", dispId = 0xc1a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPivotLineCellsFull(VARIANT RHS);
            
    
}