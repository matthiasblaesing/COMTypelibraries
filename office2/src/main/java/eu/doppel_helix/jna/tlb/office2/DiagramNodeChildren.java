
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C036F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C036F-0000-0000-C000-000000000046}")
public interface DiagramNodeChildren extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    DiagramNode Item(Object Index);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     * @param NodeType [in, optional] {@code MsoDiagramNodeType}
     */
    @ComMethod(name = "AddNode", dispId = 0xa)
    DiagramNode AddNode(Object Index,
            MsoDiagramNodeType NodeType);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0xb)
    void SelectAll();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Count", dispId = 0x65)
    Integer getCount();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FirstChild", dispId = 0x67)
    DiagramNode getFirstChild();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "LastChild", dispId = 0x68)
    DiagramNode getLastChild();
            
    
}