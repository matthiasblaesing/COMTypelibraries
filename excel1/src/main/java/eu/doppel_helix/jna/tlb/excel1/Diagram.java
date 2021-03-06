
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446F-0000-0000-C000-000000000046}")
public interface Diagram extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6a5)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x6a5)
    eu.doppel_helix.jna.tlb.office2.DiagramNodes getNodes();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoDiagramType getType();
            
    /**
     * <p>id(0x8c3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoLayout();
            
    /**
     * <p>id(0x8c3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoLayout", dispId = 0x8c3)
    void setAutoLayout(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x8c4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getReverse();
            
    /**
     * <p>id(0x8c4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Reverse", dispId = 0x8c4)
    void setReverse(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoFormat();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoFormat", dispId = 0x72)
    void setAutoFormat(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x416)</p>
     * <p>vtableId(18)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     */
    @ComMethod(name = "Convert", dispId = 0x416)
    void Convert(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type);
            
    /**
     * <p>id(0x900)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "FitText", dispId = 0x900)
    void FitText();
            
    
}