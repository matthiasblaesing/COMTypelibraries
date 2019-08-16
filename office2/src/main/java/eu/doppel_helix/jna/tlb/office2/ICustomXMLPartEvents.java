
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB06-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param NewNode [in] {@code CustomXMLNode}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "NodeAfterInsert", dispId = 0x1)
    void NodeAfterInsert(CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param OldNode [in] {@code CustomXMLNode}
     * @param OldParentNode [in] {@code CustomXMLNode}
     * @param OldNextSibling [in] {@code CustomXMLNode}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "NodeAfterDelete", dispId = 0x2)
    void NodeAfterDelete(CustomXMLNode OldNode,
            CustomXMLNode OldParentNode,
            CustomXMLNode OldNextSibling,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param OldNode [in] {@code CustomXMLNode}
     * @param NewNode [in] {@code CustomXMLNode}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "NodeAfterReplace", dispId = 0x3)
    void NodeAfterReplace(CustomXMLNode OldNode,
            CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    
}