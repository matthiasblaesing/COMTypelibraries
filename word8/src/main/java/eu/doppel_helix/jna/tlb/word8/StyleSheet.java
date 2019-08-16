
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209EF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209EF-0000-0000-C000-000000000046}")
public interface StyleSheet extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x64)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x64)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x1)
    String getFullName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Index", dispId = 0x2)
    Integer getIndex();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Path", dispId = 0x4)
    String getPath();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Type", dispId = 0x5)
    WdStyleSheetLinkType getType();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code WdStyleSheetLinkType}
     */
    @ComProperty(name = "Type", dispId = 0x5)
    void setType(WdStyleSheetLinkType param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Title", dispId = 0x6)
    String getTitle();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x6)
    void setTitle(String param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param Precedence [in] {@code WdStyleSheetPrecedence}
     */
    @ComMethod(name = "Move", dispId = 0x7)
    void Move(WdStyleSheetPrecedence Precedence);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x8)
    void Delete();
            
    
}