
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
    @ComProperty(name = "AutoUpdate", dispId = 0x1)
    Boolean getAutoUpdate();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x1)
    void setAutoUpdate(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x4)
    String getSourceName();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SourcePath", dispId = 0x5)
    String getSourcePath();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Locked", dispId = 0xd)
    Boolean getLocked();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0xd)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Type", dispId = 0x10)
    WdLinkType getType();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SourceFullName", dispId = 0x15)
    String getSourceFullName();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceFullName", dispId = 0x15)
    void setSourceFullName(String param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SavePictureWithDocument", dispId = 0x16)
    Boolean getSavePictureWithDocument();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SavePictureWithDocument", dispId = 0x16)
    void setSavePictureWithDocument(Boolean param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "BreakLink", dispId = 0x68)
    void BreakLink();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Update", dispId = 0x69)
    void Update();
            
    
}