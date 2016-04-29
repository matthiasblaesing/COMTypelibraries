
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C036D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C036D-0000-0000-C000-000000000046}")
public interface IMsoDiagram {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Nodes", dispId = 0x65)
    DiagramNodes getNodes();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Type", dispId = 0x66)
    MsoDiagramType getType();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x67)
    MsoTriState getAutoLayout();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "AutoLayout", dispId = 0x67)
    void setAutoLayout(MsoTriState param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x68)
    MsoTriState getReverse();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Reverse", dispId = 0x68)
    void setReverse(MsoTriState param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x69)
    MsoTriState getAutoFormat();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "AutoFormat", dispId = 0x69)
    void setAutoFormat(MsoTriState param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Convert", dispId = 0xa)
    void Convert(MsoDiagramType Type);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "FitText", dispId = 0xb)
    void FitText();
            
    
}