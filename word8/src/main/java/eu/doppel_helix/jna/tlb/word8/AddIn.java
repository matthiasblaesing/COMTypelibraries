
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002097E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002097E-0000-0000-C000-000000000046}")
public interface AddIn {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Path", dispId = 0x3)
    String getPath();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Installed", dispId = 0x4)
    Boolean getInstalled();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Installed", dispId = 0x4)
    void setInstalled(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Compiled", dispId = 0x5)
    Boolean getCompiled();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Autoload", dispId = 0x6)
    Boolean getAutoload();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    
}