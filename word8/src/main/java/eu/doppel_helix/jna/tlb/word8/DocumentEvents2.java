
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A02-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020A02-0000-0000-C000-000000000046}")
public interface DocumentEvents2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "New", dispId = 0x4)
    void New();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Open", dispId = 0x5)
    void Open();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Close", dispId = 0x6)
    void Close();
            
    /**
     * <p>id(0x7)</p>
     * @param SyncEventType [] {@code eu.doppel_helix.jna.tlb.office2.MsoSyncEventType}
     */
    @ComMethod(name = "Sync", dispId = 0x7)
    void Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8)</p>
     * @param NewXMLNode [in] {@code XMLNode}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "XMLAfterInsert", dispId = 0x8)
    void XMLAfterInsert(XMLNode NewXMLNode,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x9)</p>
     * @param DeletedRange [in] {@code Range}
     * @param OldXMLNode [in] {@code XMLNode}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "XMLBeforeDelete", dispId = 0x9)
    void XMLBeforeDelete(Range DeletedRange,
            XMLNode OldXMLNode,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0xc)</p>
     * @param NewContentControl [in] {@code ContentControl}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "ContentControlAfterAdd", dispId = 0xc)
    void ContentControlAfterAdd(ContentControl NewContentControl,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0xd)</p>
     * @param OldContentControl [in] {@code ContentControl}
     * @param InUndoRedo [in] {@code Boolean}
     */
    @ComMethod(name = "ContentControlBeforeDelete", dispId = 0xd)
    void ContentControlBeforeDelete(ContentControl OldContentControl,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0xe)</p>
     * @param ContentControl [in] {@code ContentControl}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ContentControlOnExit", dispId = 0xe)
    void ContentControlOnExit(ContentControl ContentControl,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf)</p>
     * @param ContentControl [in] {@code ContentControl}
     */
    @ComMethod(name = "ContentControlOnEnter", dispId = 0xf)
    void ContentControlOnEnter(ContentControl ContentControl);
            
    /**
     * <p>id(0x10)</p>
     * @param ContentControl [in] {@code ContentControl}
     * @param Content [inout] {@code String}
     */
    @ComMethod(name = "ContentControlBeforeStoreUpdate", dispId = 0x10)
    void ContentControlBeforeStoreUpdate(ContentControl ContentControl,
            VARIANT Content);
            
    /**
     * <p>id(0x11)</p>
     * @param ContentControl [in] {@code ContentControl}
     * @param Content [inout] {@code String}
     */
    @ComMethod(name = "ContentControlBeforeContentUpdate", dispId = 0x11)
    void ContentControlBeforeContentUpdate(ContentControl ContentControl,
            VARIANT Content);
            
    /**
     * <p>id(0x12)</p>
     * @param Range [in] {@code Range}
     * @param Name [in] {@code String}
     * @param Category [in] {@code String}
     * @param BlockType [in] {@code String}
     * @param Template [in] {@code String}
     */
    @ComMethod(name = "BuildingBlockInsert", dispId = 0x12)
    void BuildingBlockInsert(Range Range,
            String Name,
            String Category,
            String BlockType,
            String Template);
            
    
}