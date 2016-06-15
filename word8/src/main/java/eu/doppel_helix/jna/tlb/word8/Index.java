
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002097D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002097D-0000-0000-C000-000000000046}")
public interface Index extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "HeadingSeparator", dispId = 0x1)
    WdHeadingSeparator getHeadingSeparator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "HeadingSeparator", dispId = 0x1)
    void setHeadingSeparator(WdHeadingSeparator param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x2)
    Boolean getRightAlignPageNumbers();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x2)
    void setRightAlignPageNumbers(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    WdIndexType getType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    void setType(WdIndexType param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0x4)
    Integer getNumberOfColumns();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberOfColumns", dispId = 0x4)
    void setNumberOfColumns(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Range", dispId = 0x5)
    Range getRange();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0x6)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0x6)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "AccentedLetters", dispId = 0x7)
    Boolean getAccentedLetters();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "AccentedLetters", dispId = 0x7)
    void setAccentedLetters(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "SortBy", dispId = 0x8)
    WdIndexSortBy getSortBy();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "SortBy", dispId = 0x8)
    void setSortBy(WdIndexSortBy param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x9)
    WdIndexFilter getFilter();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x9)
    void setFilter(WdIndexFilter param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Update", dispId = 0x66)
    void Update();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "IndexLanguage", dispId = 0xa)
    WdLanguageID getIndexLanguage();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "IndexLanguage", dispId = 0xa)
    void setIndexLanguage(WdLanguageID param0);
            
    
}