
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB0A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param NewPart [in] {@code CustomXMLPart}
     */
    @ComMethod(name = "PartAfterAdd", dispId = 0x1)
    void PartAfterAdd(CustomXMLPart NewPart);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param OldPart [in] {@code CustomXMLPart}
     */
    @ComMethod(name = "PartBeforeDelete", dispId = 0x2)
    void PartBeforeDelete(CustomXMLPart OldPart);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param Part [in] {@code CustomXMLPart}
     */
    @ComMethod(name = "PartAfterLoad", dispId = 0x3)
    void PartAfterLoad(CustomXMLPart Part);
            
    
}