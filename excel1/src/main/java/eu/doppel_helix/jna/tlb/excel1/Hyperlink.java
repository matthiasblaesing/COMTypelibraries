
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024431-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024431-0000-0000-C000-000000000046}")
public interface Hyperlink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x62e)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    Shape getShape();
            
    /**
     * <p>id(0x5bf)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    String getSubAddress();
            
    /**
     * <p>id(0x5bf)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    void setSubAddress(String param0);
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    String getAddress();
            
    /**
     * <p>id(0xec)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    void setAddress(String param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x5c4)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    void AddToFavorites();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x650)</p>
     */
    @ComMethod(name = "Follow", dispId = 0x650)
    void Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x75b)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    String getEmailSubject();
            
    /**
     * <p>id(0x75b)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    void setEmailSubject(String param0);
            
    /**
     * <p>id(0x759)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    String getScreenTip();
            
    /**
     * <p>id(0x759)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    void setScreenTip(String param0);
            
    /**
     * <p>id(0x75a)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    String getTextToDisplay();
            
    /**
     * <p>id(0x75a)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    void setTextToDisplay(String param0);
            
    /**
     * <p>id(0x75c)</p>
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x75c)
    void CreateNewDocument(String Filename,
            Boolean EditNow,
            Boolean Overwrite);
            
    
}