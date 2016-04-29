
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0328-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0328-0000-0000-C000-000000000046}")
public interface BalloonCheckbox {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030001)
    String getName();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030002)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x60030003)
    void setChecked(Boolean param0);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "Checked", dispId = 0x60030003)
    Boolean getChecked();
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60030005)
    void setText(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60030005)
    String getText();
            
    
}