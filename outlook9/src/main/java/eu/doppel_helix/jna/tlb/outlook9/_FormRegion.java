
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006305A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006305A-0000-0000-C000-000000000046}")
public interface _FormRegion {
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
     * <p>id(0xfb38)</p>
     */
    @ComProperty(name = "IsExpanded", dispId = 0xfb38)
    Boolean getIsExpanded();
            
    /**
     * <p>id(0xfb39)</p>
     */
    @ComProperty(name = "Form", dispId = 0xfb39)
    com.sun.jna.platform.win32.COM.util.IDispatch getForm();
            
    /**
     * <p>id(0xfb35)</p>
     */
    @ComProperty(name = "Detail", dispId = 0xfb35)
    String getDetail();
            
    /**
     * <p>id(0xfb35)</p>
     */
    @ComProperty(name = "Detail", dispId = 0xfb35)
    void setDetail(String param0);
            
    /**
     * <p>id(0xfa60)</p>
     */
    @ComProperty(name = "Item", dispId = 0xfa60)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem();
            
    /**
     * <p>id(0xf03e)</p>
     */
    @ComProperty(name = "Inspector", dispId = 0xf03e)
    _Inspector getInspector();
            
    /**
     * <p>id(0xfb34)</p>
     */
    @ComProperty(name = "FormRegionMode", dispId = 0xfb34)
    OlFormRegionMode getFormRegionMode();
            
    /**
     * <p>id(0xfa41)</p>
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    Integer getLanguage();
            
    /**
     * <p>id(0xfb3b)</p>
     */
    @ComMethod(name = "Reflow", dispId = 0xfb3b)
    void Reflow();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "InternalName", dispId = 0x2102)
    String getInternalName();
            
    /**
     * <p>id(0xfac9)</p>
     */
    @ComMethod(name = "SetControlItemProperty", dispId = 0xfac9)
    void SetControlItemProperty(com.sun.jna.platform.win32.COM.util.IDispatch Control,
            String PropertyName);
            
    /**
     * <p>id(0xfc06)</p>
     */
    @ComProperty(name = "SuppressControlReplacement", dispId = 0xfc06)
    Boolean getSuppressControlReplacement();
            
    /**
     * <p>id(0xfc06)</p>
     */
    @ComProperty(name = "SuppressControlReplacement", dispId = 0xfc06)
    void setSuppressControlReplacement(Boolean param0);
            
    /**
     * <p>id(0x2109)</p>
     */
    @ComMethod(name = "Select", dispId = 0x2109)
    void Select();
            
    /**
     * <p>id(0xfc1a)</p>
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0xfc1a)
    Boolean getEnableAutoLayout();
            
    /**
     * <p>id(0xfc1a)</p>
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0xfc1a)
    void setEnableAutoLayout(Boolean param0);
            
    /**
     * <p>id(0x2103)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    Boolean getVisible();
            
    /**
     * <p>id(0x2103)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    void setVisible(Boolean param0);
            
    
}