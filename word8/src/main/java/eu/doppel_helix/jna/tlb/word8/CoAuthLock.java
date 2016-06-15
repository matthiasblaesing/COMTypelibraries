
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({99755F80-FE96-4F7D-B636-B8E800E54F44})</p>
 */
@ComInterface(iid="{99755F80-FE96-4F7D-B636-B8E800E54F44}")
public interface CoAuthLock extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Type", dispId = 0x1)
    WdLockType getType();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Owner", dispId = 0x2)
    CoAuthor getOwner();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3)
    Range getRange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HeaderFooter", dispId = 0x4)
    Boolean getHeaderFooter();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Unlock", dispId = 0x6)
    void Unlock();
            
    
}