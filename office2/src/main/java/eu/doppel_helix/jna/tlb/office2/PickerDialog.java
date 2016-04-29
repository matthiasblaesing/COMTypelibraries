
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03E6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03E6-0000-0000-C000-000000000046}")
public interface PickerDialog {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "DataHandlerId", dispId = 0x1)
    String getDataHandlerId();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "DataHandlerId", dispId = 0x1)
    void setDataHandlerId(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Title", dispId = 0x2)
    String getTitle();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Title", dispId = 0x2)
    void setTitle(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x3)
    PickerProperties getProperties();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "CreatePickerResults", dispId = 0x4)
    PickerResults CreatePickerResults();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Show", dispId = 0x5)
    PickerResults Show(Boolean IsMultiSelect,
            PickerResults ExistingResults);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Resolve", dispId = 0x6)
    PickerResults Resolve(String TokenText,
            Integer duplicateDlgMode);
            
    
}