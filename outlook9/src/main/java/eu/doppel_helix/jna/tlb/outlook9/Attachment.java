
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063007-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063007-0000-0000-C000-000000000046}")
public interface Attachment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x71)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x71)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    void setDisplayName(String param0);
            
    /**
     * <p>id(0x3704)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x3704)
    String getFileName();
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Index", dispId = 0x5b)
    Integer getIndex();
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0x3708)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PathName", dispId = 0x3708)
    String getPathName();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Position", dispId = 0x72)
    Integer getPosition();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x72)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x3705)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3705)
    OlAttachmentType getType();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x69)
    void Delete();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(21)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "SaveAsFile", dispId = 0x68)
    void SaveAsFile(String Path);
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfbe9)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Size", dispId = 0xfbe9)
    Integer getSize();
            
    /**
     * <p>id(0xfc18)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "BlockLevel", dispId = 0xfc18)
    OlAttachmentBlockLevel getBlockLevel();
            
    /**
     * <p>id(0xfc7a)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "GetTemporaryFilePath", dispId = 0xfc7a)
    String GetTemporaryFilePath();
            
    
}