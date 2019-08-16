
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006309D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006309D-0000-0000-C000-000000000046}")
public interface _ViewFont extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfb81)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Bold", dispId = 0xfb81)
    Boolean getBold();
            
    /**
     * <p>id(0xfb81)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Bold", dispId = 0xfb81)
    void setBold(Boolean param0);
            
    /**
     * <p>id(0xfb83)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Italic", dispId = 0xfb83)
    Boolean getItalic();
            
    /**
     * <p>id(0xfb83)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Italic", dispId = 0xfb83)
    void setItalic(Boolean param0);
            
    /**
     * <p>id(0xfb84)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Name", dispId = 0xfb84)
    String getName();
            
    /**
     * <p>id(0xfb84)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0xfb84)
    void setName(String param0);
            
    /**
     * <p>id(0xfb85)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Size", dispId = 0xfb85)
    Integer getSize();
            
    /**
     * <p>id(0xfb85)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Size", dispId = 0xfb85)
    void setSize(Integer param0);
            
    /**
     * <p>id(0xfb86)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0xfb86)
    Boolean getStrikethrough();
            
    /**
     * <p>id(0xfb86)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Strikethrough", dispId = 0xfb86)
    void setStrikethrough(Boolean param0);
            
    /**
     * <p>id(0xfb87)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Underline", dispId = 0xfb87)
    Boolean getUnderline();
            
    /**
     * <p>id(0xfb87)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Underline", dispId = 0xfb87)
    void setUnderline(Boolean param0);
            
    /**
     * <p>id(0xfb8b)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Color", dispId = 0xfb8b)
    OlColor getColor();
            
    /**
     * <p>id(0xfb8b)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code OlColor}
     */
    @ComProperty(name = "Color", dispId = 0xfb8b)
    void setColor(OlColor param0);
            
    /**
     * <p>id(0xfc7e)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ExtendedColor", dispId = 0xfc7e)
    OlCategoryColor getExtendedColor();
            
    /**
     * <p>id(0xfc7e)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code OlCategoryColor}
     */
    @ComProperty(name = "ExtendedColor", dispId = 0xfc7e)
    void setExtendedColor(OlCategoryColor param0);
            
    
}