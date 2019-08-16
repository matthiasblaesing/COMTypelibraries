
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F2-0000-0000-C000-000000000046}")
public interface _NavigationFolder extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfbc4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Folder", dispId = 0xfbc4)
    MAPIFolder getFolder();
            
    /**
     * <p>id(0xfbc5)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "IsSelected", dispId = 0xfbc5)
    Boolean getIsSelected();
            
    /**
     * <p>id(0xfbc5)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsSelected", dispId = 0xfbc5)
    void setIsSelected(Boolean param0);
            
    /**
     * <p>id(0xfbc6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsSideBySide", dispId = 0xfbc6)
    Boolean getIsSideBySide();
            
    /**
     * <p>id(0xfbc6)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsSideBySide", dispId = 0xfbc6)
    void setIsSideBySide(Boolean param0);
            
    /**
     * <p>id(0xfbc7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Position", dispId = 0xfbc7)
    Integer getPosition();
            
    /**
     * <p>id(0xfbc7)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0xfbc7)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0xfbc8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "IsRemovable", dispId = 0xfbc8)
    Boolean getIsRemovable();
            
    /**
     * <p>id(0x2102)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x2102)
    String getDisplayName();
            
    
}