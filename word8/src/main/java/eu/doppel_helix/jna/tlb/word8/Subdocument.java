
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020989-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020989-0000-0000-C000-000000000046}")
public interface Subdocument extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x1)
    Boolean getLocked();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x1)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Range", dispId = 0x2)
    Range getRange();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Path", dispId = 0x4)
    String getPath();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "HasFile", dispId = 0x5)
    Boolean getHasFile();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Level", dispId = 0x6)
    Integer getLevel();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Split", dispId = 0x65)
    void Split(Range Range);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Open", dispId = 0x66)
    Document Open();
            
    
}