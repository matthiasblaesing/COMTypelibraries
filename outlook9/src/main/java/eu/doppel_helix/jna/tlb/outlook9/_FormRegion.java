
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006305A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006305A-0000-0000-C000-000000000046}")
public interface _FormRegion extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfb38)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "IsExpanded", dispId = 0xfb38)
    Boolean getIsExpanded();
            
    /**
     * <p>id(0xfb39)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Form", dispId = 0xfb39)
    com.sun.jna.platform.win32.COM.util.IDispatch getForm();
            
    /**
     * <p>id(0xfb35)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Detail", dispId = 0xfb35)
    String getDetail();
            
    /**
     * <p>id(0xfb35)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Detail", dispId = 0xfb35)
    void setDetail(String param0);
            
    /**
     * <p>id(0xfa60)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Item", dispId = 0xfa60)
    com.sun.jna.platform.win32.COM.util.IDispatch getItem();
            
    /**
     * <p>id(0xf03e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Inspector", dispId = 0xf03e)
    _Inspector getInspector();
            
    /**
     * <p>id(0xfb34)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "FormRegionMode", dispId = 0xfb34)
    OlFormRegionMode getFormRegionMode();
            
    /**
     * <p>id(0xfa41)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    Integer getLanguage();
            
    /**
     * <p>id(0xfb3b)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Reflow", dispId = 0xfb3b)
    void Reflow();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0x2102)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "InternalName", dispId = 0x2102)
    String getInternalName();
            
    /**
     * <p>id(0xfac9)</p>
     * <p>vtableId(22)</p>
     * @param Control [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param PropertyName [in] {@code String}
     */
    @ComMethod(name = "SetControlItemProperty", dispId = 0xfac9)
    void SetControlItemProperty(com.sun.jna.platform.win32.COM.util.IDispatch Control,
            String PropertyName);
            
    /**
     * <p>id(0xfc06)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "SuppressControlReplacement", dispId = 0xfc06)
    Boolean getSuppressControlReplacement();
            
    /**
     * <p>id(0xfc06)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuppressControlReplacement", dispId = 0xfc06)
    void setSuppressControlReplacement(Boolean param0);
            
    /**
     * <p>id(0x2109)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "Select", dispId = 0x2109)
    void Select();
            
    /**
     * <p>id(0xfc1a)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0xfc1a)
    Boolean getEnableAutoLayout();
            
    /**
     * <p>id(0xfc1a)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoLayout", dispId = 0xfc1a)
    void setEnableAutoLayout(Boolean param0);
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    Boolean getVisible();
            
    /**
     * <p>id(0x2103)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x2103)
    void setVisible(Boolean param0);
            
    
}