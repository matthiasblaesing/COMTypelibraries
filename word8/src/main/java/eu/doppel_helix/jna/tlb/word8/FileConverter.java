
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020999-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020999-0000-0000-C000-000000000046}")
public interface FileConverter {
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
    @ComProperty(name = "FormatName", dispId = 0x0)
    String getFormatName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ClassName", dispId = 0x1)
    String getClassName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "SaveFormat", dispId = 0x2)
    Integer getSaveFormat();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "OpenFormat", dispId = 0x3)
    Integer getOpenFormat();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "CanSave", dispId = 0x4)
    Boolean getCanSave();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "CanOpen", dispId = 0x5)
    Boolean getCanOpen();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Path", dispId = 0x6)
    String getPath();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x7)
    String getName();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Extensions", dispId = 0x8)
    String getExtensions();
            
    
}