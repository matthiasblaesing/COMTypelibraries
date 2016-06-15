
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0341-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0341-0000-0000-C000-000000000046}")
public interface Script extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Extended", dispId = 0x60030001)
    String getExtended();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Extended", dispId = 0x60030001)
    void setExtended(String param0);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60030003)
    String getId();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60030003)
    void setId(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Language", dispId = 0x60030005)
    MsoScriptLanguage getLanguage();
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Language", dispId = 0x60030005)
    void setLanguage(MsoScriptLanguage param0);
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "Location", dispId = 0x60030007)
    MsoScriptLocation getLocation();
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030008)
    void Delete();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x60030009)
    com.sun.jna.platform.win32.COM.util.IDispatch getShape();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "ScriptText", dispId = 0x0)
    String getScriptText();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "ScriptText", dispId = 0x0)
    void setScriptText(String param0);
            
    
}