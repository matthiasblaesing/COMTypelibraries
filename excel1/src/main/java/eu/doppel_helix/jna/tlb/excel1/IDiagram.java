
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446F-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446F-0001-0000-C000-000000000046}")
public interface IDiagram extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6a5)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getNodes(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x8c3)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoLayout(VARIANT RHS);
            
    /**
     * <p>id(0x8c3)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoLayout(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x8c4)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getReverse(VARIANT RHS);
            
    /**
     * <p>id(0x8c4)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    com.sun.jna.platform.win32.WinNT.HRESULT setReverse(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFormat(VARIANT RHS);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoFormat(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x416)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x416)
    com.sun.jna.platform.win32.WinNT.HRESULT Convert(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type);
            
    /**
     * <p>id(0x900)</p>
     */
    @ComMethod(name = "FitText", dispId = 0x900)
    com.sun.jna.platform.win32.WinNT.HRESULT FitText();
            
    
}