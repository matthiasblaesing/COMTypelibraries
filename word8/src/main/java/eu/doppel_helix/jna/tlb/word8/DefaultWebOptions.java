
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E3-0000-0000-C000-000000000046}")
public interface DefaultWebOptions {
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
    @ComProperty(name = "UpdateLinksOnSave", dispId = 0x5)
    Boolean getUpdateLinksOnSave();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "UpdateLinksOnSave", dispId = 0x5)
    void setUpdateLinksOnSave(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x6)
    Boolean getUseLongFileNames();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x6)
    void setUseLongFileNames(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "CheckIfOfficeIsHTMLEditor", dispId = 0x7)
    Boolean getCheckIfOfficeIsHTMLEditor();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "CheckIfOfficeIsHTMLEditor", dispId = 0x7)
    void setCheckIfOfficeIsHTMLEditor(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "CheckIfWordIsDefaultHTMLEditor", dispId = 0x8)
    Boolean getCheckIfWordIsDefaultHTMLEditor();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "CheckIfWordIsDefaultHTMLEditor", dispId = 0x8)
    void setCheckIfWordIsDefaultHTMLEditor(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x9)
    Boolean getRelyOnVML();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "RelyOnVML", dispId = 0x9)
    void setRelyOnVML(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0xa)
    Boolean getAllowPNG();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "AllowPNG", dispId = 0xa)
    void setAllowPNG(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0xb)
    eu.doppel_helix.jna.tlb.office2.MsoScreenSize getScreenSize();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ScreenSize", dispId = 0xb)
    void setScreenSize(eu.doppel_helix.jna.tlb.office2.MsoScreenSize param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0xc)
    Integer getPixelsPerInch();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "PixelsPerInch", dispId = 0xc)
    void setPixelsPerInch(Integer param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0xd)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getEncoding();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0xd)
    void setEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "AlwaysSaveInDefaultEncoding", dispId = 0xe)
    Boolean getAlwaysSaveInDefaultEncoding();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "AlwaysSaveInDefaultEncoding", dispId = 0xe)
    void setAlwaysSaveInDefaultEncoding(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Fonts", dispId = 0xf)
    eu.doppel_helix.jna.tlb.office2.WebPageFonts getFonts();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "FolderSuffix", dispId = 0x10)
    String getFolderSuffix();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x11)
    eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser getTargetBrowser();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x11)
    void setTargetBrowser(eu.doppel_helix.jna.tlb.office2.MsoTargetBrowser param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "SaveNewWebPagesAsWebArchives", dispId = 0x12)
    Boolean getSaveNewWebPagesAsWebArchives();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "SaveNewWebPagesAsWebArchives", dispId = 0x12)
    void setSaveNewWebPagesAsWebArchives(Boolean param0);
            
    
}