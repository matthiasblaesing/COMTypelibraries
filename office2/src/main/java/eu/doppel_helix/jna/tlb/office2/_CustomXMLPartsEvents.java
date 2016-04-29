
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB0B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB0B-0000-0000-C000-000000000046}")
public interface _CustomXMLPartsEvents {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "PartAfterAdd", dispId = 0x1)
    void PartAfterAdd(CustomXMLPart NewPart);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "PartBeforeDelete", dispId = 0x2)
    void PartBeforeDelete(CustomXMLPart OldPart);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "PartAfterLoad", dispId = 0x3)
    void PartAfterLoad(CustomXMLPart Part);
            
    
}