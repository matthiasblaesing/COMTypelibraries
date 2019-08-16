
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x1)
    Boolean getLocked();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x1)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Range", dispId = 0x2)
    Range getRange();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Path", dispId = 0x4)
    String getPath();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "HasFile", dispId = 0x5)
    Boolean getHasFile();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Level", dispId = 0x6)
    Integer getLevel();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(18)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "Split", dispId = 0x65)
    void Split(Range Range);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Open", dispId = 0x66)
    Document Open();
            
    
}