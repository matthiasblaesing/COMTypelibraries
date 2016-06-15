
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020988-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020988-0000-0000-C000-000000000046}")
public interface Subdocuments extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Expanded", dispId = 0x2)
    Boolean getExpanded();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Expanded", dispId = 0x2)
    void setExpanded(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Subdocument Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "AddFromFile", dispId = 0x64)
    Subdocument AddFromFile(Object Name,
            Object ConfirmConversions,
            Object ReadOnly,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "AddFromRange", dispId = 0x65)
    Subdocument AddFromRange(Range Range);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Merge", dispId = 0x66)
    void Merge(Object FirstSubdocument,
            Object LastSubdocument);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Select", dispId = 0x68)
    void Select();
            
    
}