
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
    @ComProperty(name = "OptimizeForBrowser", dispId = 0x1)
    Boolean getOptimizeForBrowser();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OptimizeForBrowser", dispId = 0x1)
    void setOptimizeForBrowser(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BrowserLevel", dispId = 0x2)
    WdBrowserLevel getBrowserLevel();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdBrowserLevel}
     */
    @ComProperty(name = "BrowserLevel", dispId = 0x2)
    void setBrowserLevel(WdBrowserLevel param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x3)
    Boolean getRelyOnCSS();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RelyOnCSS", dispId = 0x3)
    void setRelyOnCSS(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x4)
    Boolean getOrganizeInFolder();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x4)
    void setOrganizeInFolder(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x5)
    Boolean getUseLongFileNames();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x5)
    void setUseLongFileNames(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x6)
    Boolean getRelyOnVML();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x6)
    void setRelyOnVML(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0x7)
    Boolean getAllowPNG();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowPNG", dispId = 0x7)
    void setAllowPNG(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0x8)
    eu.doppel_helix.jna.tlb.office2.MsoScreenSize getScreenSize();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoScreenSize}
     */
    @ComProperty(name = "ScreenSize", dispId = 0x8)
    void setScreenSize(eu.doppel_helix.jna.tlb.office2.MsoScreenSize param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x9)
    Integer getPixelsPerInch();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0x9)
    void setPixelsPerInch(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0xa)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getEncoding();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComProperty(name = "Encoding", dispId = 0xa)
    void setEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "FolderSuffix", dispId = 0xb)
    String getFolderSuffix();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "UseDefaultFolderSuffix", dispId = 0x65)
    void UseDefaultFolderSuffix();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0xc)
    eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser getTargetBrowser();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser}
     */
    @ComProperty(name = "TargetBrowser", dispId = 0xc)
    void setTargetBrowser(eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser param0);
            
    
}