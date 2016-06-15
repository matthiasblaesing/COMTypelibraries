
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020931-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020931-0000-0000-C000-000000000046}")
public interface LinkFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "AutoUpdate", dispId = 0x1)
    Boolean getAutoUpdate();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x1)
    void setAutoUpdate(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x4)
    String getSourceName();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0x5)
    String getSourcePath();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xd)
    Boolean getLocked();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xd)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x10)
    WdLinkType getType();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "SourceFullName", dispId = 0x15)
    String getSourceFullName();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "SourceFullName", dispId = 0x15)
    void setSourceFullName(String param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "SavePictureWithDocument", dispId = 0x16)
    Boolean getSavePictureWithDocument();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "SavePictureWithDocument", dispId = 0x16)
    void setSavePictureWithDocument(Boolean param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "BreakLink", dispId = 0x68)
    void BreakLink();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Update", dispId = 0x69)
    void Update();
            
    
}