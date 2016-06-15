
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020913-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020913-0000-0000-C000-000000000046}")
public interface TableOfContents extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "UseHeadingStyles", dispId = 0x1)
    Boolean getUseHeadingStyles();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "UseHeadingStyles", dispId = 0x1)
    void setUseHeadingStyles(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "UseFields", dispId = 0x2)
    Boolean getUseFields();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "UseFields", dispId = 0x2)
    void setUseFields(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x3)
    Integer getUpperHeadingLevel();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x3)
    void setUpperHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x4)
    Integer getLowerHeadingLevel();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x4)
    void setLowerHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "TableID", dispId = 0x5)
    String getTableID();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "TableID", dispId = 0x5)
    void setTableID(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "HeadingStyles", dispId = 0x6)
    HeadingStyles getHeadingStyles();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x7)
    Boolean getRightAlignPageNumbers();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x7)
    void setRightAlignPageNumbers(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x8)
    Boolean getIncludePageNumbers();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x8)
    void setIncludePageNumbers(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Range", dispId = 0x9)
    Range getRange();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xa)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xa)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "UpdatePageNumbers", dispId = 0x65)
    void UpdatePageNumbers();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Update", dispId = 0x66)
    void Update();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xb)
    Boolean getUseHyperlinks();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xb)
    void setUseHyperlinks(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xc)
    Boolean getHidePageNumbersInWeb();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xc)
    void setHidePageNumbersInWeb(Boolean param0);
            
    
}