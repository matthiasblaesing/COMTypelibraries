
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
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Expanded", dispId = 0x2)
    Boolean getExpanded();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Expanded", dispId = 0x2)
    void setExpanded(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Subdocument Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     * @param Name [in] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param Revert [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
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
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "AddFromRange", dispId = 0x65)
    Subdocument AddFromRange(Range Range);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     * @param FirstSubdocument [in, optional] {@code Object}
     * @param LastSubdocument [in, optional] {@code Object}
     */
    @ComMethod(name = "Merge", dispId = 0x66)
    void Merge(Object FirstSubdocument,
            Object LastSubdocument);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Select", dispId = 0x68)
    void Select();
            
    
}