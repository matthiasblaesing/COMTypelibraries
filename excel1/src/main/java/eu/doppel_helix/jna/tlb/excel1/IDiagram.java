
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
     * <p>id(0x6a5)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.DiagramNodes}
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    com.sun.jna.platform.win32.WinNT.HRESULT getNodes(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x8c3)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoLayout(VARIANT RHS);
            
    /**
     * <p>id(0x8c3)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoLayout(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x8c4)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getReverse(VARIANT RHS);
            
    /**
     * <p>id(0x8c4)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    com.sun.jna.platform.win32.WinNT.HRESULT setReverse(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFormat(VARIANT RHS);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoFormat(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    /**
     * <p>id(0x416)</p>
     * <p>vtableId(18)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     */
    @ComMethod(name = "Convert", dispId = 0x416)
    com.sun.jna.platform.win32.WinNT.HRESULT Convert(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type);
            
    /**
     * <p>id(0x900)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "FitText", dispId = 0x900)
    com.sun.jna.platform.win32.WinNT.HRESULT FitText();
            
    
}