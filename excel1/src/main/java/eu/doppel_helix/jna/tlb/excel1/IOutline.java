
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AB-0001-0000-C000-000000000046}")
public interface IOutline {
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
     * <p>id(0x3bf)</p>
     */
    @ComProperty(name = "AutomaticStyles", dispId = 0x3bf)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutomaticStyles(VARIANT RHS);
            
    /**
     * <p>id(0x3bf)</p>
     */
    @ComProperty(name = "AutomaticStyles", dispId = 0x3bf)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutomaticStyles(Boolean RHS);
            
    /**
     * <p>id(0x3c0)</p>
     */
    @ComMethod(name = "ShowLevels", dispId = 0x3c0)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowLevels(Object RowLevels,
            Object ColumnLevels,
            VARIANT RHS);
            
    /**
     * <p>id(0x3c1)</p>
     */
    @ComProperty(name = "SummaryColumn", dispId = 0x3c1)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummaryColumn(VARIANT RHS);
            
    /**
     * <p>id(0x3c1)</p>
     */
    @ComProperty(name = "SummaryColumn", dispId = 0x3c1)
    com.sun.jna.platform.win32.WinNT.HRESULT setSummaryColumn(XlSummaryColumn RHS);
            
    /**
     * <p>id(0x386)</p>
     */
    @ComProperty(name = "SummaryRow", dispId = 0x386)
    com.sun.jna.platform.win32.WinNT.HRESULT getSummaryRow(VARIANT RHS);
            
    /**
     * <p>id(0x386)</p>
     */
    @ComProperty(name = "SummaryRow", dispId = 0x386)
    com.sun.jna.platform.win32.WinNT.HRESULT setSummaryRow(XlSummaryRow RHS);
            
    
}