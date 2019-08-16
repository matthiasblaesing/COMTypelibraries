
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    Shape getShape();
            
    /**
     * <p>id(0x5bf)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    String getSubAddress();
            
    /**
     * <p>id(0x5bf)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SubAddress", dispId = 0x5bf)
    void setSubAddress(String param0);
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Address", dispId = 0xec)
    String getAddress();
            
    /**
     * <p>id(0xec)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Address", dispId = 0xec)
    void setAddress(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x5c4)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    void AddToFavorites();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x650)</p>
     * <p>vtableId(20)</p>
     * @param NewWindow [in, optional] {@code Object}
     * @param AddHistory [in, optional] {@code Object}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code Object}
     * @param HeaderInfo [in, optional] {@code Object}
     */
    @ComMethod(name = "Follow", dispId = 0x650)
    void Follow(Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x75b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    String getEmailSubject();
            
    /**
     * <p>id(0x75b)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EmailSubject", dispId = 0x75b)
    void setEmailSubject(String param0);
            
    /**
     * <p>id(0x759)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    String getScreenTip();
            
    /**
     * <p>id(0x759)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ScreenTip", dispId = 0x759)
    void setScreenTip(String param0);
            
    /**
     * <p>id(0x75a)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    String getTextToDisplay();
            
    /**
     * <p>id(0x75a)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x75a)
    void setTextToDisplay(String param0);
            
    /**
     * <p>id(0x75c)</p>
     * <p>vtableId(27)</p>
     * @param Filename [in] {@code String}
     * @param EditNow [in] {@code Boolean}
     * @param Overwrite [in] {@code Boolean}
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x75c)
    void CreateNewDocument(String Filename,
            Boolean EditNow,
            Boolean Overwrite);
            
    
}