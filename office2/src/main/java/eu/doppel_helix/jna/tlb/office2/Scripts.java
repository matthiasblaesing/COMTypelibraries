
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0340-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0340-0000-0000-C000-000000000046}")
public interface Scripts {
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
    @ComProperty(name = "Count", dispId = 0x60030001)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Script Item(Object Index);
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComMethod(name = "Add", dispId = 0x60030004)
    Script Add(com.sun.jna.platform.win32.COM.util.IDispatch Anchor,
            MsoScriptLocation Location,
            MsoScriptLanguage Language,
            String Id,
            String Extended,
            String ScriptText);
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030005)
    void Delete();
            
    
}