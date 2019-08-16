
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0358-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0358-0000-0000-C000-000000000046}")
public interface HTMLProjectItem extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "IsOpen", dispId = 0x4)
    Boolean getIsOpen();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadFromFile", dispId = 0x5)
    void LoadFromFile(String FileName);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param OpenKind [in, optional] {@code MsoHTMLProjectOpen}
     */
    @ComMethod(name = "Open", dispId = 0x6)
    void Open(MsoHTMLProjectOpen OpenKind);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "SaveCopyAs", dispId = 0x7)
    void SaveCopyAs(String FileName);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8)
    String getText();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8)
    void setText(String param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}