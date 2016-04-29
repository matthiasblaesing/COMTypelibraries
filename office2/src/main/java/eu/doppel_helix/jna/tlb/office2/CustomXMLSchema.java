
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB01-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB01-0000-0000-C000-000000000046}")
public interface CustomXMLSchema {
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
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Location", dispId = 0x60030001)
    String getLocation();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x60030002)
    String getNamespaceURI();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030003)
    void Delete();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComMethod(name = "Reload", dispId = 0x60030004)
    void Reload();
            
    
}