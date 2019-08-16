
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({919AA22C-B9AD-11D3-8D59-0050048384E3})</p>
 */
@ComInterface(iid="{919AA22C-B9AD-11D3-8D59-0050048384E3}")
public interface ILicValidator extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Products", dispId = 0x1)
    Object getProducts();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x2)
    Integer getSelection();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Selection", dispId = 0x2)
    void setSelection(Integer param0);
            
    
}