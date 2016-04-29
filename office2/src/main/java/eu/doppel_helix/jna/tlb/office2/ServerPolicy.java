
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0390-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0390-0000-0000-C000-000000000046}")
public interface ServerPolicy {
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
    PolicyItem getItem(Object Index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Id", dispId = 0x1)
    String getId();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Description", dispId = 0x3)
    String getDescription();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Statement", dispId = 0x4)
    String getStatement();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Count", dispId = 0x5)
    Integer getCount();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "BlockPreview", dispId = 0x6)
    Boolean getBlockPreview();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x7)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}