
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020911-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020911-0000-0000-C000-000000000046}")
public interface TableOfAuthorities extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Passim", dispId = 0x1)
    Boolean getPassim();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Passim", dispId = 0x1)
    void setPassim(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "KeepEntryFormatting", dispId = 0x2)
    Boolean getKeepEntryFormatting();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeepEntryFormatting", dispId = 0x2)
    void setKeepEntryFormatting(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3)
    Integer getCategory();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Category", dispId = 0x3)
    void setCategory(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Bookmark", dispId = 0x4)
    String getBookmark();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Bookmark", dispId = 0x4)
    void setBookmark(String param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x5)
    String getSeparator();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Separator", dispId = 0x5)
    void setSeparator(String param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "IncludeSequenceName", dispId = 0x6)
    String getIncludeSequenceName();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "IncludeSequenceName", dispId = 0x6)
    void setIncludeSequenceName(String param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "EntrySeparator", dispId = 0x7)
    String getEntrySeparator();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EntrySeparator", dispId = 0x7)
    void setEntrySeparator(String param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "PageRangeSeparator", dispId = 0x8)
    String getPageRangeSeparator();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PageRangeSeparator", dispId = 0x8)
    void setPageRangeSeparator(String param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "IncludeCategoryHeader", dispId = 0x9)
    Boolean getIncludeCategoryHeader();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeCategoryHeader", dispId = 0x9)
    void setIncludeCategoryHeader(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "PageNumberSeparator", dispId = 0xa)
    String getPageNumberSeparator();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PageNumberSeparator", dispId = 0xa)
    void setPageNumberSeparator(String param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Range", dispId = 0xb)
    Range getRange();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code WdTabLeader}
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Update", dispId = 0x65)
    void Update();
            
    
}