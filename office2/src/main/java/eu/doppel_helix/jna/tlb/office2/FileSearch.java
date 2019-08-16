
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0332-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0332-0000-0000-C000-000000000046}")
public interface FileSearch extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "SearchSubFolders", dispId = 0x1)
    Boolean getSearchSubFolders();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SearchSubFolders", dispId = 0x1)
    void setSearchSubFolders(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "MatchTextExactly", dispId = 0x2)
    Boolean getMatchTextExactly();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchTextExactly", dispId = 0x2)
    void setMatchTextExactly(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0x3)
    Boolean getMatchAllWordForms();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchAllWordForms", dispId = 0x3)
    void setMatchAllWordForms(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FileName", dispId = 0x4)
    String getFileName();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FileName", dispId = 0x4)
    void setFileName(String param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "FileType", dispId = 0x5)
    MsoFileType getFileType();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code MsoFileType}
     */
    @ComProperty(name = "FileType", dispId = 0x5)
    void setFileType(MsoFileType param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "LastModified", dispId = 0x6)
    MsoLastModified getLastModified();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code MsoLastModified}
     */
    @ComProperty(name = "LastModified", dispId = 0x6)
    void setLastModified(MsoLastModified param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "TextOrProperty", dispId = 0x7)
    String getTextOrProperty();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextOrProperty", dispId = 0x7)
    void setTextOrProperty(String param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "LookIn", dispId = 0x8)
    String getLookIn();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LookIn", dispId = 0x8)
    void setLookIn(String param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     * @param SortBy [in, optional] {@code MsoSortBy}
     * @param SortOrder [in, optional] {@code MsoSortOrder}
     * @param AlwaysAccurate [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Execute", dispId = 0x9)
    Integer Execute(MsoSortBy SortBy,
            MsoSortOrder SortOrder,
            Boolean AlwaysAccurate);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "NewSearch", dispId = 0xa)
    void NewSearch();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FoundFiles", dispId = 0xb)
    FoundFiles getFoundFiles();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "PropertyTests", dispId = 0xc)
    PropertyTests getPropertyTests();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "SearchScopes", dispId = 0xd)
    SearchScopes getSearchScopes();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "SearchFolders", dispId = 0xe)
    SearchFolders getSearchFolders();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "FileTypes", dispId = 0x10)
    FileTypes getFileTypes();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "RefreshScopes", dispId = 0x11)
    void RefreshScopes();
            
    
}