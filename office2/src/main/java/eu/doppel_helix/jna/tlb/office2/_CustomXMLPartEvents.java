
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB07-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB07-0000-0000-C000-000000000046}")
public interface _CustomXMLPartEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "NodeAfterInsert", dispId = 0x1)
    void NodeAfterInsert(CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "NodeAfterDelete", dispId = 0x2)
    void NodeAfterDelete(CustomXMLNode OldNode,
            CustomXMLNode OldParentNode,
            CustomXMLNode OldNextSibling,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "NodeAfterReplace", dispId = 0x3)
    void NodeAfterReplace(CustomXMLNode OldNode,
            CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    
}