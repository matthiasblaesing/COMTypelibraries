
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209AD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209AD-0000-0000-C000-000000000046}")
public interface Dictionary extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Path", dispId = 0x1)
    String getPath();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x2)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x2)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x3)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Type", dispId = 0x4)
    WdDictionaryType getType();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LanguageSpecific", dispId = 0x5)
    Boolean getLanguageSpecific();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LanguageSpecific", dispId = 0x5)
    void setLanguageSpecific(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    
}