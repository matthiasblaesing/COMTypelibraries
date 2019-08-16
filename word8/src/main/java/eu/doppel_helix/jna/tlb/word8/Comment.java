
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093D-0000-0000-C000-000000000046}")
public interface Comment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3eb)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3eb)
    Range getRange();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Reference", dispId = 0x3ec)
    Range getReference();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Scope", dispId = 0x3ed)
    Range getScope();
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Index", dispId = 0x3ee)
    Integer getIndex();
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Author", dispId = 0x3ef)
    String getAuthor();
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Author", dispId = 0x3ef)
    void setAuthor(String param0);
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Initial", dispId = 0x3f0)
    String getInitial();
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Initial", dispId = 0x3f0)
    void setInitial(String param0);
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ShowTip", dispId = 0x3f1)
    Boolean getShowTip();
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowTip", dispId = 0x3f1)
    void setShowTip(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xa)
    void Delete();
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Edit", dispId = 0x3f3)
    void Edit();
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Date", dispId = 0x3f2)
    java.util.Date getDate();
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "IsInk", dispId = 0x3f4)
    Boolean getIsInk();
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Done", dispId = 0x3f5)
    Boolean getDone();
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Done", dispId = 0x3f5)
    void setDone(Boolean param0);
            
    /**
     * <p>id(0x3f6)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Ancestor", dispId = 0x3f6)
    Comment getAncestor();
            
    /**
     * <p>id(0x3f7)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Contact", dispId = 0x3f7)
    CoAuthor getContact();
            
    /**
     * <p>id(0x3f8)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "DeleteRecursively", dispId = 0x3f8)
    void DeleteRecursively();
            
    /**
     * <p>id(0x3f9)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Replies", dispId = 0x3f9)
    Comments getReplies();
            
    
}