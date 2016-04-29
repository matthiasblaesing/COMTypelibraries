
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020935-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020935-0000-0000-C000-000000000046}")
public interface System {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "OperatingSystem", dispId = 0x1)
    String getOperatingSystem();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ProcessorType", dispId = 0x2)
    String getProcessorType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Version", dispId = 0x3)
    String getVersion();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "FreeDiskSpace", dispId = 0x4)
    Integer getFreeDiskSpace();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Country", dispId = 0x5)
    WdCountry getCountry();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "LanguageDesignation", dispId = 0x6)
    String getLanguageDesignation();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HorizontalResolution", dispId = 0x7)
    Integer getHorizontalResolution();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "VerticalResolution", dispId = 0x8)
    Integer getVerticalResolution();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ProfileString", dispId = 0x9)
    String getProfileString(String Section,
            String Key);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ProfileString", dispId = 0x9)
    void setProfileString(String Section,
            String Key,
            String param2);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PrivateProfileString", dispId = 0xa)
    String getPrivateProfileString(String FileName,
            String Section,
            String Key);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PrivateProfileString", dispId = 0xa)
    void setPrivateProfileString(String FileName,
            String Section,
            String Key,
            String param3);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "MathCoprocessorInstalled", dispId = 0xb)
    Boolean getMathCoprocessorInstalled();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "ComputerType", dispId = 0xc)
    String getComputerType();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "MacintoshName", dispId = 0xe)
    String getMacintoshName();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "QuickDrawInstalled", dispId = 0xf)
    Boolean getQuickDrawInstalled();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Cursor", dispId = 0x10)
    WdCursorType getCursor();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Cursor", dispId = 0x10)
    void setCursor(WdCursorType param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "MSInfo", dispId = 0x65)
    void MSInfo();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Connect", dispId = 0x66)
    void Connect(String Path,
            Object Drive,
            Object Password);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CountryRegion", dispId = 0x67)
    WdCountry getCountryRegion();
            
    
}