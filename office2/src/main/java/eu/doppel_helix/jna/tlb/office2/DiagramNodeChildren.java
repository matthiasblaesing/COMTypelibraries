
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C036F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C036F-0000-0000-C000-000000000046}")
public interface DiagramNodeChildren {
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
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    DiagramNode Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "AddNode", dispId = 0xa)
    DiagramNode AddNode(Object Index,
            MsoDiagramNodeType NodeType);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0xb)
    void SelectAll();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Count", dispId = 0x65)
    Integer getCount();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "FirstChild", dispId = 0x67)
    DiagramNode getFirstChild();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "LastChild", dispId = 0x68)
    DiagramNode getLastChild();
            
    
}