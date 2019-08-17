
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IQuickFilingDialogCallback Interface
 *
 * <p>uuid({627EA7B4-95B5-4980-84C1-9D20DA4460B1})</p>
 */
@ComInterface(iid="{627EA7B4-95B5-4980-84C1-9D20DA4460B1}")
public interface IQuickFilingDialogCallback extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param dialog [in] {@code IQuickFilingDialog}
     */
    @ComMethod(name = "OnDialogClosed", dispId = 0x60020000)
    void OnDialogClosed(IQuickFilingDialog dialog);
            
    
}