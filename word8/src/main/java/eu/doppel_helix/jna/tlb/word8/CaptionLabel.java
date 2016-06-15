
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020979-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020979-0000-0000-C000-000000000046}")
public interface CaptionLabel extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x1)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ID", dispId = 0x2)
    WdCaptionLabelID getID();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    Boolean getIncludeChapterNumber();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    void setIncludeChapterNumber(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    WdCaptionNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    void setNumberStyle(WdCaptionNumberStyle param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ChapterStyleLevel", dispId = 0x5)
    Integer getChapterStyleLevel();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ChapterStyleLevel", dispId = 0x5)
    void setChapterStyleLevel(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x6)
    WdSeparatorType getSeparator();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x6)
    void setSeparator(WdSeparatorType param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Position", dispId = 0x7)
    WdCaptionPosition getPosition();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Position", dispId = 0x7)
    void setPosition(WdCaptionPosition param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    
}