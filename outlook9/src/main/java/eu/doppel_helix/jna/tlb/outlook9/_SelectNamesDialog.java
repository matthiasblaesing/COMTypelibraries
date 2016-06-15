
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C8-0000-0000-C000-000000000046}")
public interface _SelectNamesDialog extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfae2)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfae2)
    String getCaption();
            
    /**
     * <p>id(0xfae2)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfae2)
    void setCaption(String param0);
            
    /**
     * <p>id(0xf021)</p>
     */
    @ComMethod(name = "Display", dispId = 0xf021)
    Boolean Display();
            
    /**
     * <p>id(0xf814)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0xf814)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    void setRecipients(Recipients param0);
            
    /**
     * <p>id(0xfae3)</p>
     */
    @ComProperty(name = "BccLabel", dispId = 0xfae3)
    String getBccLabel();
            
    /**
     * <p>id(0xfae3)</p>
     */
    @ComProperty(name = "BccLabel", dispId = 0xfae3)
    void setBccLabel(String param0);
            
    /**
     * <p>id(0xfae4)</p>
     */
    @ComProperty(name = "CcLabel", dispId = 0xfae4)
    String getCcLabel();
            
    /**
     * <p>id(0xfae4)</p>
     */
    @ComProperty(name = "CcLabel", dispId = 0xfae4)
    void setCcLabel(String param0);
            
    /**
     * <p>id(0xfae5)</p>
     */
    @ComProperty(name = "ToLabel", dispId = 0xfae5)
    String getToLabel();
            
    /**
     * <p>id(0xfae5)</p>
     */
    @ComProperty(name = "ToLabel", dispId = 0xfae5)
    void setToLabel(String param0);
            
    /**
     * <p>id(0xfae6)</p>
     */
    @ComProperty(name = "AllowMultipleSelection", dispId = 0xfae6)
    Boolean getAllowMultipleSelection();
            
    /**
     * <p>id(0xfae6)</p>
     */
    @ComProperty(name = "AllowMultipleSelection", dispId = 0xfae6)
    void setAllowMultipleSelection(Boolean param0);
            
    /**
     * <p>id(0xfae7)</p>
     */
    @ComProperty(name = "ForceResolution", dispId = 0xfae7)
    Boolean getForceResolution();
            
    /**
     * <p>id(0xfae7)</p>
     */
    @ComProperty(name = "ForceResolution", dispId = 0xfae7)
    void setForceResolution(Boolean param0);
            
    /**
     * <p>id(0xfae8)</p>
     */
    @ComProperty(name = "ShowOnlyInitialAddressList", dispId = 0xfae8)
    Boolean getShowOnlyInitialAddressList();
            
    /**
     * <p>id(0xfae8)</p>
     */
    @ComProperty(name = "ShowOnlyInitialAddressList", dispId = 0xfae8)
    void setShowOnlyInitialAddressList(Boolean param0);
            
    /**
     * <p>id(0xfae9)</p>
     */
    @ComProperty(name = "NumberOfRecipientSelectors", dispId = 0xfae9)
    OlRecipientSelectors getNumberOfRecipientSelectors();
            
    /**
     * <p>id(0xfae9)</p>
     */
    @ComProperty(name = "NumberOfRecipientSelectors", dispId = 0xfae9)
    void setNumberOfRecipientSelectors(OlRecipientSelectors param0);
            
    /**
     * <p>id(0xfaea)</p>
     */
    @ComProperty(name = "InitialAddressList", dispId = 0xfaea)
    AddressList getInitialAddressList();
            
    /**
     * <p>id(0xfaea)</p>
     */
    @ComProperty(name = "InitialAddressList", dispId = 0xfaea)
    void setInitialAddressList(AddressList param0);
            
    /**
     * <p>id(0xfaeb)</p>
     */
    @ComMethod(name = "SetDefaultDisplayMode", dispId = 0xfaeb)
    void SetDefaultDisplayMode(OlDefaultSelectNamesDisplayMode defaultMode);
            
    
}