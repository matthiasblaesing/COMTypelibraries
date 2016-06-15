
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024449-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024449-0000-0000-C000-000000000046}")
public interface WebOptions extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x76b)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x76b)
    Boolean getRelyOnCSS();
            
    /**
     * <p>id(0x76b)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x76b)
    void setRelyOnCSS(Boolean param0);
            
    /**
     * <p>id(0x76e)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x76e)
    Boolean getOrganizeInFolder();
            
    /**
     * <p>id(0x76e)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x76e)
    void setOrganizeInFolder(Boolean param0);
            
    /**
     * <p>id(0x770)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x770)
    Boolean getUseLongFileNames();
            
    /**
     * <p>id(0x770)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x770)
    void setUseLongFileNames(Boolean param0);
            
    /**
     * <p>id(0x772)</p>
     */
    @ComProperty(name = "DownloadComponents", dispId = 0x772)
    Boolean getDownloadComponents();
            
    /**
     * <p>id(0x772)</p>
     */
    @ComProperty(name = "DownloadComponents", dispId = 0x772)
    void setDownloadComponents(Boolean param0);
            
    /**
     * <p>id(0x773)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x773)
    Boolean getRelyOnVML();
            
    /**
     * <p>id(0x773)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x773)
    void setRelyOnVML(Boolean param0);
            
    /**
     * <p>id(0x774)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0x774)
    Boolean getAllowPNG();
            
    /**
     * <p>id(0x774)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0x774)
    void setAllowPNG(Boolean param0);
            
    /**
     * <p>id(0x775)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0x775)
    eu.doppel_helix.jna.tlb.office2.MsoScreenSize getScreenSize();
            
    /**
     * <p>id(0x775)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0x775)
    void setScreenSize(eu.doppel_helix.jna.tlb.office2.MsoScreenSize param0);
            
    /**
     * <p>id(0x776)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x776)
    Integer getPixelsPerInch();
            
    /**
     * <p>id(0x776)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x776)
    void setPixelsPerInch(Integer param0);
            
    /**
     * <p>id(0x777)</p>
     */
    @ComProperty(name = "LocationOfComponents", dispId = 0x777)
    String getLocationOfComponents();
            
    /**
     * <p>id(0x777)</p>
     */
    @ComProperty(name = "LocationOfComponents", dispId = 0x777)
    void setLocationOfComponents(String param0);
            
    /**
     * <p>id(0x71e)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0x71e)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getEncoding();
            
    /**
     * <p>id(0x71e)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0x71e)
    void setEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x77a)</p>
     */
    @ComProperty(name = "FolderSuffix", dispId = 0x77a)
    String getFolderSuffix();
            
    /**
     * <p>id(0x77b)</p>
     */
    @ComMethod(name = "UseDefaultFolderSuffix", dispId = 0x77b)
    void UseDefaultFolderSuffix();
            
    /**
     * <p>id(0x883)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x883)
    eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser getTargetBrowser();
            
    /**
     * <p>id(0x883)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x883)
    void setTargetBrowser(eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser param0);
            
    
}