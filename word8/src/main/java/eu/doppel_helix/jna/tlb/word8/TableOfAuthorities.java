
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020911-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020911-0000-0000-C000-000000000046}")
public interface TableOfAuthorities {
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
    @ComProperty(name = "Passim", dispId = 0x1)
    Boolean getPassim();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Passim", dispId = 0x1)
    void setPassim(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "KeepEntryFormatting", dispId = 0x2)
    Boolean getKeepEntryFormatting();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "KeepEntryFormatting", dispId = 0x2)
    void setKeepEntryFormatting(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3)
    Integer getCategory();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3)
    void setCategory(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0x4)
    String getBookmark();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0x4)
    void setBookmark(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x5)
    String getSeparator();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x5)
    void setSeparator(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "IncludeSequenceName", dispId = 0x6)
    String getIncludeSequenceName();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "IncludeSequenceName", dispId = 0x6)
    void setIncludeSequenceName(String param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "EntrySeparator", dispId = 0x7)
    String getEntrySeparator();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "EntrySeparator", dispId = 0x7)
    void setEntrySeparator(String param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "PageRangeSeparator", dispId = 0x8)
    String getPageRangeSeparator();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "PageRangeSeparator", dispId = 0x8)
    void setPageRangeSeparator(String param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "IncludeCategoryHeader", dispId = 0x9)
    Boolean getIncludeCategoryHeader();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "IncludeCategoryHeader", dispId = 0x9)
    void setIncludeCategoryHeader(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PageNumberSeparator", dispId = 0xa)
    String getPageNumberSeparator();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PageNumberSeparator", dispId = 0xa)
    void setPageNumberSeparator(String param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Range", dispId = 0xb)
    Range getRange();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Update", dispId = 0x65)
    void Update();
            
    
}