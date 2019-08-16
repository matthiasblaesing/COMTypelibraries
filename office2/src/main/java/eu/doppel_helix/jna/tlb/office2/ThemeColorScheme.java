
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03A2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03A2-0000-0000-C000-000000000046}")
public interface ThemeColorScheme extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code MsoThemeColorSchemeIndex}
     */
    @ComMethod(name = "Colors", dispId = 0x0)
    ThemeColor Colors(MsoThemeColorSchemeIndex Index);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Load", dispId = 0x3)
    void Load(String FileName);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Save", dispId = 0x4)
    void Save(String FileName);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "GetCustomColor", dispId = 0x5)
    Integer GetCustomColor(String Name);
            
    
}