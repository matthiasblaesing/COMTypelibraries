
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03A5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03A5-0000-0000-C000-000000000046}")
public interface ThemeFontScheme {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Load", dispId = 0x2)
    void Load(String FileName);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "Save", dispId = 0x3)
    void Save(String FileName);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "MinorFont", dispId = 0x4)
    ThemeFonts getMinorFont();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "MajorFont", dispId = 0x5)
    ThemeFonts getMajorFont();
            
    
}