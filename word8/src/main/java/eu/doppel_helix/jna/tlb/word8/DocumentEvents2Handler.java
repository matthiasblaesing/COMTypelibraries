
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A02-0000-0000-C000-000000000046})</p>
 */
public abstract class DocumentEvents2Handler extends AbstractComEventCallbackListener implements DocumentEvents2 {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x4)</p>
     */
    @Override
    public void New(){
    }
            
    /**
     * <p>id(0x5)</p>
     */
    @Override
    public void Open(){
    }
            
    /**
     * <p>id(0x6)</p>
     */
    @Override
    public void Close(){
    }
            
    /**
     * <p>id(0x7)</p>
     */
    @Override
    public void Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType){
    }
            
    /**
     * <p>id(0x8)</p>
     */
    @Override
    public void XMLAfterInsert(XMLNode NewXMLNode,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0x9)</p>
     */
    @Override
    public void XMLBeforeDelete(Range DeletedRange,
            XMLNode OldXMLNode,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0xc)</p>
     */
    @Override
    public void ContentControlAfterAdd(ContentControl NewContentControl,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0xd)</p>
     */
    @Override
    public void ContentControlBeforeDelete(ContentControl OldContentControl,
            Boolean InUndoRedo){
    }
            
    /**
     * <p>id(0xe)</p>
     */
    @Override
    public void ContentControlOnExit(ContentControl ContentControl,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf)</p>
     */
    @Override
    public void ContentControlOnEnter(ContentControl ContentControl){
    }
            
    /**
     * <p>id(0x10)</p>
     */
    @Override
    public void ContentControlBeforeStoreUpdate(ContentControl ContentControl,
            VARIANT Content){
    }
            
    /**
     * <p>id(0x11)</p>
     */
    @Override
    public void ContentControlBeforeContentUpdate(ContentControl ContentControl,
            VARIANT Content){
    }
            
    /**
     * <p>id(0x12)</p>
     */
    @Override
    public void BuildingBlockInsert(Range Range,
            String Name,
            String Category,
            String BlockType,
            String Template){
    }
            
    
}