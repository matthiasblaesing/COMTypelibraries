
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DD947D72-F33C-4198-9BDF-F86181D05E41})</p>
 */
@ComInterface(iid="{DD947D72-F33C-4198-9BDF-F86181D05E41}")
public interface Editor extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "ID", dispId = 0x64)
    String getID();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Name", dispId = 0x65)
    String getName();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Range", dispId = 0x66)
    Range getRange();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "NextRange", dispId = 0x67)
    Range getNextRange();
            
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
     * <p>id(0x1f4)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x1f4)
    void Delete();
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x1f5)
    void DeleteAll();
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComMethod(name = "SelectAll", dispId = 0x1f6)
    void SelectAll();
            
    
}