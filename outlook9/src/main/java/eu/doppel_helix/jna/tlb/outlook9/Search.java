
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300B-0000-0000-C000-000000000046}")
public interface Search extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfa64)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Filter", dispId = 0xfa64)
    String getFilter();
            
    /**
     * <p>id(0xfa68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IsSynchronous", dispId = 0xfa68)
    Boolean getIsSynchronous();
            
    /**
     * <p>id(0xfa69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Results", dispId = 0xfa69)
    _Results getResults();
            
    /**
     * <p>id(0xfa66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "SearchSubFolders", dispId = 0xfa66)
    Boolean getSearchSubFolders();
            
    /**
     * <p>id(0xfa67)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Stop", dispId = 0xfa67)
    void Stop();
            
    /**
     * <p>id(0xfa6d)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Tag", dispId = 0xfa6d)
    String getTag();
            
    /**
     * <p>id(0xfaa5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Scope", dispId = 0xfaa5)
    String getScope();
            
    /**
     * <p>id(0xfaad)</p>
     * <p>vtableId(18)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "Save", dispId = 0xfaad)
    MAPIFolder Save(String Name);
            
    /**
     * <p>id(0xfb1d)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "GetTable", dispId = 0xfb1d)
    Table GetTable();
            
    
}