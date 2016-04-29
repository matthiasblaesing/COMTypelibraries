
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DA936B64-AC8B-11D1-B6E5-00A0C90F2744})</p>
 */
@ComInterface(iid="{DA936B64-AC8B-11D1-B6E5-00A0C90F2744}")
public interface AddIn {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Description", dispId = 0x0)
    String getDescription();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Description", dispId = 0x0)
    void setDescription(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x1)
    VBE getVBE();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Collection", dispId = 0x2)
    Addins getCollection();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ProgId", dispId = 0x3)
    String getProgId();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Guid", dispId = 0x4)
    String getGuid();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x6)
    Boolean getConnect();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Connect", dispId = 0x6)
    void setConnect(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Object", dispId = 0x7)
    com.sun.jna.platform.win32.COM.util.IDispatch getObject();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Object", dispId = 0x7)
    void setObject(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    
}