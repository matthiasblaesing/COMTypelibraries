
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03E4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03E4-0000-0000-C000-000000000046}")
public interface PickerResult {
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
    @ComProperty(name = "Id", dispId = 0x1)
    String getId();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x2)
    String getDisplayName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x2)
    void setDisplayName(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    String getType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    void setType(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SIPId", dispId = 0x4)
    String getSIPId();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SIPId", dispId = 0x4)
    void setSIPId(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ItemData", dispId = 0x5)
    Object getItemData();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ItemData", dispId = 0x5)
    void setItemData(Object param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SubItems", dispId = 0x6)
    Object getSubItems();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SubItems", dispId = 0x6)
    void setSubItems(Object param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "DuplicateResults", dispId = 0x7)
    Object getDuplicateResults();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x8)
    PickerFields getFields();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x8)
    void setFields(PickerFields param0);
            
    
}