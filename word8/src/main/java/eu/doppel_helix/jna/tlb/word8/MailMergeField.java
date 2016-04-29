
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002091E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002091E-0000-0000-C000-000000000046}")
public interface MailMergeField {
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
    @ComProperty(name = "Type", dispId = 0x0)
    WdFieldType getType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x3)
    Boolean getLocked();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x3)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Code", dispId = 0x5)
    Range getCode();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Code", dispId = 0x5)
    void setCode(Range param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Next", dispId = 0x8)
    MailMergeField getNext();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x9)
    MailMergeField getPrevious();
            
    /**
     * <p>id(0xffff)</p>
     */
    @ComMethod(name = "Select", dispId = 0xffff)
    void Select();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x69)
    void Copy();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x6a)
    void Cut();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6b)
    void Delete();
            
    
}