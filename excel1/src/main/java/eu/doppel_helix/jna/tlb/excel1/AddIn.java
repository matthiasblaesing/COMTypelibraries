
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020857-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020857-0000-0000-C000-000000000046}")
public interface AddIn extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x23e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    String getAuthor();
            
    /**
     * <p>id(0x23f)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    String getComments();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x121)
    String getFullName();
            
    /**
     * <p>id(0x226)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Installed", dispId = 0x226)
    Boolean getInstalled();
            
    /**
     * <p>id(0x226)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Installed", dispId = 0x226)
    void setInstalled(Boolean param0);
            
    /**
     * <p>id(0x241)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    String getKeywords();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    String getPath();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    String getSubject();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0x5f3)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "progID", dispId = 0x5f3)
    String getProgID();
            
    /**
     * <p>id(0x7fb)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "CLSID", dispId = 0x7fb)
    String getCLSID();
            
    /**
     * <p>id(0xb31)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "IsOpen", dispId = 0xb31)
    Boolean getIsOpen();
            
    
}