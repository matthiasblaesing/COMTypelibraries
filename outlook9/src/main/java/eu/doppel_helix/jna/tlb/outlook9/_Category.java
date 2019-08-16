
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630E3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630E3-0000-0000-C000-000000000046}")
public interface _Category extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2102)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    String getName();
            
    /**
     * <p>id(0x2102)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x2102)
    void setName(String param0);
            
    /**
     * <p>id(0xfba3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Color", dispId = 0xfba3)
    OlCategoryColor getColor();
            
    /**
     * <p>id(0xfba3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code OlCategoryColor}
     */
    @ComProperty(name = "Color", dispId = 0xfba3)
    void setColor(OlCategoryColor param0);
            
    /**
     * <p>id(0xfba4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ShortcutKey", dispId = 0xfba4)
    OlCategoryShortcutKey getShortcutKey();
            
    /**
     * <p>id(0xfba4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code OlCategoryShortcutKey}
     */
    @ComProperty(name = "ShortcutKey", dispId = 0xfba4)
    void setShortcutKey(OlCategoryShortcutKey param0);
            
    /**
     * <p>id(0xfbd0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "CategoryID", dispId = 0xfbd0)
    String getCategoryID();
            
    /**
     * <p>id(0xfc1b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CategoryBorderColor", dispId = 0xfc1b)
    Integer getCategoryBorderColor();
            
    /**
     * <p>id(0xfc1c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "CategoryGradientTopColor", dispId = 0xfc1c)
    Integer getCategoryGradientTopColor();
            
    /**
     * <p>id(0xfc1d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "CategoryGradientBottomColor", dispId = 0xfc1d)
    Integer getCategoryGradientBottomColor();
            
    
}