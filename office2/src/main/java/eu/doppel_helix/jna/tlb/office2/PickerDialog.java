
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03E6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03E6-0000-0000-C000-000000000046}")
public interface PickerDialog extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "DataHandlerId", dispId = 0x1)
    String getDataHandlerId();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DataHandlerId", dispId = 0x1)
    void setDataHandlerId(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Title", dispId = 0x2)
    String getTitle();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x2)
    void setTitle(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x3)
    PickerProperties getProperties();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "CreatePickerResults", dispId = 0x4)
    PickerResults CreatePickerResults();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param IsMultiSelect [in, optional] {@code Boolean}
     * @param ExistingResults [in, optional] {@code PickerResults}
     */
    @ComMethod(name = "Show", dispId = 0x5)
    PickerResults Show(Boolean IsMultiSelect,
            PickerResults ExistingResults);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param TokenText [in] {@code String}
     * @param duplicateDlgMode [in] {@code Integer}
     */
    @ComMethod(name = "Resolve", dispId = 0x6)
    PickerResults Resolve(String TokenText,
            Integer duplicateDlgMode);
            
    
}