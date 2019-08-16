
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020935-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020935-0000-0000-C000-000000000046}")
public interface System extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "OperatingSystem", dispId = 0x1)
    String getOperatingSystem();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ProcessorType", dispId = 0x2)
    String getProcessorType();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Version", dispId = 0x3)
    String getVersion();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FreeDiskSpace", dispId = 0x4)
    Integer getFreeDiskSpace();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Country", dispId = 0x5)
    WdCountry getCountry();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "LanguageDesignation", dispId = 0x6)
    String getLanguageDesignation();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HorizontalResolution", dispId = 0x7)
    Integer getHorizontalResolution();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "VerticalResolution", dispId = 0x8)
    Integer getVerticalResolution();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(18)</p>
     * @param Section [in] {@code String}
     * @param Key [in] {@code String}
     */
    @ComProperty(name = "ProfileString", dispId = 0x9)
    String getProfileString(String Section,
            String Key);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(19)</p>
     * @param Section [in] {@code String}
     * @param Key [in] {@code String}
     * @param param2 [in] {@code String}
     */
    @ComProperty(name = "ProfileString", dispId = 0x9)
    void setProfileString(String Section,
            String Key,
            String param2);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     * @param FileName [in] {@code String}
     * @param Section [in] {@code String}
     * @param Key [in] {@code String}
     */
    @ComProperty(name = "PrivateProfileString", dispId = 0xa)
    String getPrivateProfileString(String FileName,
            String Section,
            String Key);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(21)</p>
     * @param FileName [in] {@code String}
     * @param Section [in] {@code String}
     * @param Key [in] {@code String}
     * @param param3 [in] {@code String}
     */
    @ComProperty(name = "PrivateProfileString", dispId = 0xa)
    void setPrivateProfileString(String FileName,
            String Section,
            String Key,
            String param3);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "MathCoprocessorInstalled", dispId = 0xb)
    Boolean getMathCoprocessorInstalled();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ComputerType", dispId = 0xc)
    String getComputerType();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MacintoshName", dispId = 0xe)
    String getMacintoshName();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "QuickDrawInstalled", dispId = 0xf)
    Boolean getQuickDrawInstalled();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Cursor", dispId = 0x10)
    WdCursorType getCursor();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code WdCursorType}
     */
    @ComProperty(name = "Cursor", dispId = 0x10)
    void setCursor(WdCursorType param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "MSInfo", dispId = 0x65)
    void MSInfo();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(29)</p>
     * @param Path [in] {@code String}
     * @param Drive [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Connect", dispId = 0x66)
    void Connect(String Path,
            Object Drive,
            Object Password);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "CountryRegion", dispId = 0x67)
    WdCountry getCountryRegion();
            
    
}