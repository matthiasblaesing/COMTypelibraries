
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0358-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0358-0000-0000-C000-000000000046}")
public interface HTMLProjectItem {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "IsOpen", dispId = 0x4)
    Boolean getIsOpen();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "LoadFromFile", dispId = 0x5)
    void LoadFromFile(String FileName);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Open", dispId = 0x6)
    void Open(MsoHTMLProjectOpen OpenKind);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "SaveCopyAs", dispId = 0x7)
    void SaveCopyAs(String FileName);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8)
    String getText();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8)
    void setText(String param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}