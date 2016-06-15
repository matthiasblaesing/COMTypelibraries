
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B4-0000-0000-C000-000000000046}")
public interface Version extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "SavedBy", dispId = 0x3eb)
    String getSavedBy();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x3ec)
    String getComment();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "Date", dispId = 0x3ed)
    java.util.Date getDate();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Index", dispId = 0x2)
    Integer getIndex();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "OpenOld", dispId = 0x65)
    void OpenOld();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x66)
    void Delete();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Open", dispId = 0x67)
    Document Open();
            
    
}