
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209EC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209EC-0000-0000-C000-000000000046}")
public interface Diagram extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x65)
    DiagramNodes getNodes();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.MsoDiagramType getType();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoLayout();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoLayout", dispId = 0x67)
    void setAutoLayout(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getReverse();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Reverse", dispId = 0x68)
    void setReverse(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getAutoFormat();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "AutoFormat", dispId = 0x69)
    void setAutoFormat(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(18)</p>
     * @param Type [in] {@code eu.doppel_helix.jna.tlb.office2.MsoDiagramType}
     */
    @ComMethod(name = "Convert", dispId = 0xa)
    void Convert(eu.doppel_helix.jna.tlb.office2.MsoDiagramType Type);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "FitText", dispId = 0xb)
    void FitText();
            
    
}