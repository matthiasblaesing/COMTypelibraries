
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002091E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002091E-0000-0000-C000-000000000046}")
public interface MailMergeField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdFieldType getType();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x3)
    Boolean getLocked();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x3)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Code", dispId = 0x5)
    Range getCode();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Range}
     */
    @ComProperty(name = "Code", dispId = 0x5)
    void setCode(Range param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Next", dispId = 0x8)
    MailMergeField getNext();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x9)
    MailMergeField getPrevious();
            
    /**
     * <p>id(0xffff)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x69)
    void Copy();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x6a)
    void Cut();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6b)
    void Delete();
            
    
}