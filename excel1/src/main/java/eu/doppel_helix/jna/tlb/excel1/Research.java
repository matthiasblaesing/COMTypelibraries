
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AC-0000-0000-C000-000000000046}")
public interface Research extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xabf)</p>
     */
    @ComMethod(name = "Query", dispId = 0xabf)
    Object Query(String ServiceID,
            Object QueryString,
            Object QueryLanguage,
            Object UseSelection,
            Object LaunchQuery);
            
    /**
     * <p>id(0xac5)</p>
     */
    @ComMethod(name = "IsResearchService", dispId = 0xac5)
    Boolean IsResearchService(String ServiceID);
            
    /**
     * <p>id(0xac6)</p>
     */
    @ComMethod(name = "SetLanguagePair", dispId = 0xac6)
    Object SetLanguagePair(Integer LanguageFrom,
            Integer LanguageTo);
            
    
}