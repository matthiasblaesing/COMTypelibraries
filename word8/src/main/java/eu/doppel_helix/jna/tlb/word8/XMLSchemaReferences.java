
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({356B06EC-4908-42A4-81FC-4B5A51F3483B})</p>
 */
@ComInterface(iid="{356B06EC-4908-42A4-81FC-4B5A51F3483B}")
public interface XMLSchemaReferences extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AutomaticValidation", dispId = 0x3)
    Boolean getAutomaticValidation();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutomaticValidation", dispId = 0x3)
    void setAutomaticValidation(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AllowSaveAsXMLWithoutValidation", dispId = 0x4)
    Boolean getAllowSaveAsXMLWithoutValidation();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowSaveAsXMLWithoutValidation", dispId = 0x4)
    void setAllowSaveAsXMLWithoutValidation(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HideValidationErrors", dispId = 0x5)
    Boolean getHideValidationErrors();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideValidationErrors", dispId = 0x5)
    void setHideValidationErrors(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "IgnoreMixedContent", dispId = 0x6)
    Boolean getIgnoreMixedContent();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreMixedContent", dispId = 0x6)
    void setIgnoreMixedContent(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ShowPlaceholderText", dispId = 0x7)
    Boolean getShowPlaceholderText();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPlaceholderText", dispId = 0x7)
    void setShowPlaceholderText(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(22)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    XMLSchemaReference Item(Object Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "Validate", dispId = 0x64)
    void Validate();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(24)</p>
     * @param NamespaceURI [in, optional] {@code Object}
     * @param Alias [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param InstallForAllUsers [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    XMLSchemaReference Add(Object NamespaceURI,
            Object Alias,
            Object FileName,
            Boolean InstallForAllUsers);
            
    
}