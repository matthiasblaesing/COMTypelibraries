
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006309D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006309D-0000-0000-C000-000000000046}")
public interface _ViewFont {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfb81)</p>
     */
    @ComProperty(name = "Bold", dispId = 0xfb81)
    Boolean getBold();
            
    /**
     * <p>id(0xfb81)</p>
     */
    @ComProperty(name = "Bold", dispId = 0xfb81)
    void setBold(Boolean param0);
            
    /**
     * <p>id(0xfb83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0xfb83)
    Boolean getItalic();
            
    /**
     * <p>id(0xfb83)</p>
     */
    @ComProperty(name = "Italic", dispId = 0xfb83)
    void setItalic(Boolean param0);
            
    /**
     * <p>id(0xfb84)</p>
     */
    @ComProperty(name = "Name", dispId = 0xfb84)
    String getName();
            
    /**
     * <p>id(0xfb84)</p>
     */
    @ComProperty(name = "Name", dispId = 0xfb84)
    void setName(String param0);
            
    /**
     * <p>id(0xfb85)</p>
     */
    @ComProperty(name = "Size", dispId = 0xfb85)
    Integer getSize();
            
    /**
     * <p>id(0xfb85)</p>
     */
    @ComProperty(name = "Size", dispId = 0xfb85)
    void setSize(Integer param0);
            
    /**
     * <p>id(0xfb86)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0xfb86)
    Boolean getStrikethrough();
            
    /**
     * <p>id(0xfb86)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0xfb86)
    void setStrikethrough(Boolean param0);
            
    /**
     * <p>id(0xfb87)</p>
     */
    @ComProperty(name = "Underline", dispId = 0xfb87)
    Boolean getUnderline();
            
    /**
     * <p>id(0xfb87)</p>
     */
    @ComProperty(name = "Underline", dispId = 0xfb87)
    void setUnderline(Boolean param0);
            
    /**
     * <p>id(0xfb8b)</p>
     */
    @ComProperty(name = "Color", dispId = 0xfb8b)
    OlColor getColor();
            
    /**
     * <p>id(0xfb8b)</p>
     */
    @ComProperty(name = "Color", dispId = 0xfb8b)
    void setColor(OlColor param0);
            
    /**
     * <p>id(0xfc7e)</p>
     */
    @ComProperty(name = "ExtendedColor", dispId = 0xfc7e)
    OlCategoryColor getExtendedColor();
            
    /**
     * <p>id(0xfc7e)</p>
     */
    @ComProperty(name = "ExtendedColor", dispId = 0xfc7e)
    void setExtendedColor(OlCategoryColor param0);
            
    
}