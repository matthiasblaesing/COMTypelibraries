
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E4-0000-0000-C000-000000000046}")
public interface WebOptions extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "OptimizeForBrowser", dispId = 0x1)
    Boolean getOptimizeForBrowser();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "OptimizeForBrowser", dispId = 0x1)
    void setOptimizeForBrowser(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "BrowserLevel", dispId = 0x2)
    WdBrowserLevel getBrowserLevel();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "BrowserLevel", dispId = 0x2)
    void setBrowserLevel(WdBrowserLevel param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x3)
    Boolean getRelyOnCSS();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x3)
    void setRelyOnCSS(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x4)
    Boolean getOrganizeInFolder();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x4)
    void setOrganizeInFolder(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x5)
    Boolean getUseLongFileNames();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x5)
    void setUseLongFileNames(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x6)
    Boolean getRelyOnVML();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x6)
    void setRelyOnVML(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0x7)
    Boolean getAllowPNG();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0x7)
    void setAllowPNG(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0x8)
    eu.doppel_helix.jna.tlb.office2.MsoScreenSize getScreenSize();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0x8)
    void setScreenSize(eu.doppel_helix.jna.tlb.office2.MsoScreenSize param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x9)
    Integer getPixelsPerInch();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x9)
    void setPixelsPerInch(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0xa)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getEncoding();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0xa)
    void setEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "FolderSuffix", dispId = 0xb)
    String getFolderSuffix();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "UseDefaultFolderSuffix", dispId = 0x65)
    void UseDefaultFolderSuffix();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0xc)
    eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser getTargetBrowser();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0xc)
    void setTargetBrowser(eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser param0);
            
    
}