
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0337-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0337-0000-0000-C000-000000000046}")
public interface IFind {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "SearchPath", dispId = 0x0)
    String getSearchPath();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020001)
    String getName();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "SubDir", dispId = 0x60020002)
    Boolean getSubDir();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Title", dispId = 0x60020003)
    String getTitle();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "Author", dispId = 0x60020004)
    String getAuthor();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x60020005)
    String getKeywords();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x60020006)
    String getSubject();
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComProperty(name = "Options", dispId = 0x60020007)
    MsoFileFindOptions getOptions();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x60020008)
    Boolean getMatchCase();
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60020009)
    String getText();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "PatternMatch", dispId = 0x6002000a)
    Boolean getPatternMatch();
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "DateSavedFrom", dispId = 0x6002000b)
    Object getDateSavedFrom();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "DateSavedTo", dispId = 0x6002000c)
    Object getDateSavedTo();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "SavedBy", dispId = 0x6002000d)
    String getSavedBy();
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "DateCreatedFrom", dispId = 0x6002000e)
    Object getDateCreatedFrom();
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "DateCreatedTo", dispId = 0x6002000f)
    Object getDateCreatedTo();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "View", dispId = 0x60020010)
    MsoFileFindView getView();
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComProperty(name = "SortBy", dispId = 0x60020011)
    MsoFileFindSortBy getSortBy();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "ListBy", dispId = 0x60020012)
    MsoFileFindListBy getListBy();
            
    /**
     * <p>id(0x60020013)</p>
     */
    @ComProperty(name = "SelectedFile", dispId = 0x60020013)
    Integer getSelectedFile();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "Results", dispId = 0x60020014)
    IFoundFiles getResults();
            
    /**
     * <p>id(0x60020015)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60020015)
    Integer Show();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "SearchPath", dispId = 0x0)
    void setSearchPath(String param0);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020001)
    void setName(String param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "SubDir", dispId = 0x60020002)
    void setSubDir(Boolean param0);
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Title", dispId = 0x60020003)
    void setTitle(String param0);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "Author", dispId = 0x60020004)
    void setAuthor(String param0);
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x60020005)
    void setKeywords(String param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x60020006)
    void setSubject(String param0);
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComProperty(name = "Options", dispId = 0x60020007)
    void setOptions(MsoFileFindOptions param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "MatchCase", dispId = 0x60020008)
    void setMatchCase(Boolean param0);
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComProperty(name = "Text", dispId = 0x60020009)
    void setText(String param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "PatternMatch", dispId = 0x6002000a)
    void setPatternMatch(Boolean param0);
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "DateSavedFrom", dispId = 0x6002000b)
    void setDateSavedFrom(Object param0);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "DateSavedTo", dispId = 0x6002000c)
    void setDateSavedTo(Object param0);
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "SavedBy", dispId = 0x6002000d)
    void setSavedBy(String param0);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "DateCreatedFrom", dispId = 0x6002000e)
    void setDateCreatedFrom(Object param0);
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "DateCreatedTo", dispId = 0x6002000f)
    void setDateCreatedTo(Object param0);
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "View", dispId = 0x60020010)
    void setView(MsoFileFindView param0);
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComProperty(name = "SortBy", dispId = 0x60020011)
    void setSortBy(MsoFileFindSortBy param0);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "ListBy", dispId = 0x60020012)
    void setListBy(MsoFileFindListBy param0);
            
    /**
     * <p>id(0x60020013)</p>
     */
    @ComProperty(name = "SelectedFile", dispId = 0x60020013)
    void setSelectedFile(Integer param0);
            
    /**
     * <p>id(0x6002002a)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x6002002a)
    void Execute();
            
    /**
     * <p>id(0x6002002b)</p>
     */
    @ComMethod(name = "Load", dispId = 0x6002002b)
    void Load(String bstrQueryName);
            
    /**
     * <p>id(0x6002002c)</p>
     */
    @ComMethod(name = "Save", dispId = 0x6002002c)
    void Save(String bstrQueryName);
            
    /**
     * <p>id(0x6002002d)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6002002d)
    void Delete(String bstrQueryName);
            
    /**
     * <p>id(0x6002002e)</p>
     */
    @ComProperty(name = "FileType", dispId = 0x6002002e)
    Integer getFileType();
            
    /**
     * <p>id(0x6002002e)</p>
     */
    @ComProperty(name = "FileType", dispId = 0x6002002e)
    void setFileType(Integer param0);
            
    
}