
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB07-0000-0000-C000-000000000046})</p>
 */
public abstract class _CustomXMLPartEventsHandler extends AbstractComEventCallbackListener implements _CustomXMLPartEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void NodeAfterInsert(CustomXMLNode NewNode,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void NodeAfterDelete(CustomXMLNode OldNode,
            CustomXMLNode OldParentNode,
            CustomXMLNode OldNextSibling,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0x3)</p>
     */
    @Override
    public void NodeAfterReplace(CustomXMLNode OldNode,
            CustomXMLNode NewNode,
            Boolean InUndoRedo){
    }
            
    
}