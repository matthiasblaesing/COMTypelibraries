
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0353-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0353-0000-0000-C000-000000000046}")
public interface LanguageSettings {
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
    @ComProperty(name = "LanguageID", dispId = 0x1)
    Integer getLanguageID(MsoAppLanguageID Id);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LanguagePreferredForEditing", dispId = 0x2)
    Boolean getLanguagePreferredForEditing(MsoLanguageID lid);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}