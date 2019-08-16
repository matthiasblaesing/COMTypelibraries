
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002099D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002099D-0000-0000-C000-000000000046}")
public interface Hyperlink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3eb)
    String getName();
            
    /**
     * <p>id(0x3ec)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AddressOld", dispId = 0x3ec)
    String getAddressOld();
            
    /**
     * <p>id(0x3ed)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3ed)
    eu.doppel_helix.jna.tlb.office2.MsoHyperlinkType getType();
            
    /**
     * <p>id(0x3ee)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3ee)
    Range getRange();
            
    /**
     * <p>id(0x3ef)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x3ef)
    Shape getShape();
            
    /**
     * <p>id(0x3f0)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SubAddressOld", dispId = 0x3f0)
    String getSubAddressOld();
            
    /**
     * <p>id(0x3f1)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ExtraInfoRequired", dispId = 0x3f1)
    Boolean getExtraInfoRequired();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     * @param NewWindow [in, optional] {@code Object}
     * @param AddHistory [in, optional] {@code Object}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code Object}
     * @param HeaderInfo [in, optional] {@code Object}
     */
    @ComMethod(name = "Follow", dispId = 0x68)
    void Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x69)
    void AddToFavorites();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(20)</p>
     * @param FileName [in] {@code String}
     * @param EditNow [in] {@code Boolean}
     * @param Overwrite [in] {@code Boolean}
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x6a)
    void CreateNewDocument(String FileName,
            Boolean EditNow,
            Boolean Overwrite);
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Address", dispId = 0x44c)
    String getAddress();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Address", dispId = 0x44c)
    void setAddress(String param0);
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x44d)
    String getSubAddress();
            
    /**
     * <p>id(0x44d)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SubAddress", dispId = 0x44d)
    void setSubAddress(String param0);
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x3f2)
    String getEmailSubject();
            
    /**
     * <p>id(0x3f2)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EmailSubject", dispId = 0x3f2)
    void setEmailSubject(String param0);
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x3f3)
    String getScreenTip();
            
    /**
     * <p>id(0x3f3)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ScreenTip", dispId = 0x3f3)
    void setScreenTip(String param0);
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x3f4)
    String getTextToDisplay();
            
    /**
     * <p>id(0x3f4)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x3f4)
    void setTextToDisplay(String param0);
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Target", dispId = 0x3f5)
    String getTarget();
            
    /**
     * <p>id(0x3f5)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Target", dispId = 0x3f5)
    void setTarget(String param0);
            
    
}