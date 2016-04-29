
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002099D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002099D-0000-0000-C000-000000000046}")
public interface Hyperlink {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3eb)
    String getName();
            
    /**
     * <p>id(0x3ec)</p>
     */
    @ComProperty(name = "AddressOld", dispId = 0x3ec)
    String getAddressOld();
            
    /**
     * <p>id(0x3ed)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3ed)
    eu.doppel_helix.jna.tlb.office2.MsoHyperlinkType getType();
            
    /**
     * <p>id(0x3ee)</p>
     */
    @ComProperty(name = "Range", dispId = 0x3ee)
    Range getRange();
            
    /**
     * <p>id(0x3ef)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x3ef)
    Shape getShape();
            
    /**
     * <p>id(0x3f0)</p>
     */
    @ComProperty(name = "SubAddressOld", dispId = 0x3f0)
    String getSubAddressOld();
            
    /**
     * <p>id(0x3f1)</p>
     */
    @ComProperty(name = "ExtraInfoRequired", dispId = 0x3f1)
    Boolean getExtraInfoRequired();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x67)
    void Delete();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Follow", dispId = 0x68)
    void Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x69)
    void AddToFavorites();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x6a)
    void CreateNewDocument(String FileName,
            Boolean EditNow,
            Boolean Overwrite);
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Address", dispId = 0x44c)
    String getAddress();
            
    /**
     * <p>id(0x44c)</p>
     */
    @ComProperty(name = "Address", dispId = 0x44c)
    void setAddress(String param0);
            
    /**
     * <p>id(0x44d)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x44d)
    String getSubAddress();
            
    /**
     * <p>id(0x44d)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x44d)
    void setSubAddress(String param0);
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x3f2)
    String getEmailSubject();
            
    /**
     * <p>id(0x3f2)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x3f2)
    void setEmailSubject(String param0);
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x3f3)
    String getScreenTip();
            
    /**
     * <p>id(0x3f3)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x3f3)
    void setScreenTip(String param0);
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x3f4)
    String getTextToDisplay();
            
    /**
     * <p>id(0x3f4)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x3f4)
    void setTextToDisplay(String param0);
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "Target", dispId = 0x3f5)
    String getTarget();
            
    /**
     * <p>id(0x3f5)</p>
     */
    @ComProperty(name = "Target", dispId = 0x3f5)
    void setTarget(String param0);
            
    
}