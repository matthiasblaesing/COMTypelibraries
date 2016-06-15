
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002092C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002092C-0000-0000-C000-000000000046}")
public interface Style extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "NameLocal", dispId = 0x0)
    String getNameLocal();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x0)
    void setNameLocal(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "BaseStyle", dispId = 0x1)
    Object getBaseStyle();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "BaseStyle", dispId = 0x1)
    void setBaseStyle(Object param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Description", dispId = 0x2)
    String getDescription();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    WdStyleType getType();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x4)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "NextParagraphStyle", dispId = 0x5)
    Object getNextParagraphStyle();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "NextParagraphStyle", dispId = 0x5)
    void setNextParagraphStyle(Object param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "InUse", dispId = 0x6)
    Boolean getInUse();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Shading", dispId = 0x7)
    Shading getShading();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x8)
    Borders getBorders();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x8)
    void setBorders(Borders param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x9)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0x9)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Font", dispId = 0xa)
    Font getFont();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Font", dispId = 0xa)
    void setFont(Font param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Frame", dispId = 0xb)
    Frame getFrame();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0xc)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0xc)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "AutomaticallyUpdate", dispId = 0xd)
    Boolean getAutomaticallyUpdate();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "AutomaticallyUpdate", dispId = 0xd)
    void setAutomaticallyUpdate(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ListTemplate", dispId = 0xe)
    ListTemplate getListTemplate();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ListLevelNumber", dispId = 0xf)
    Integer getListLevelNumber();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x10)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x10)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x11)
    Boolean getHidden();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x11)
    void setHidden(Boolean param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "LinkToListTemplate", dispId = 0x65)
    void LinkToListTemplate(ListTemplate ListTemplate,
            Object ListLevelNumber);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x12)
    Integer getNoProofing();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x12)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "LinkStyle", dispId = 0x68)
    Object getLinkStyle();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "LinkStyle", dispId = 0x68)
    void setLinkStyle(Object param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Visibility", dispId = 0x13)
    Boolean getVisibility();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Visibility", dispId = 0x13)
    void setVisibility(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "NoSpaceBetweenParagraphsOfSameStyle", dispId = 0x14)
    Boolean getNoSpaceBetweenParagraphsOfSameStyle();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "NoSpaceBetweenParagraphsOfSameStyle", dispId = 0x14)
    void setNoSpaceBetweenParagraphsOfSameStyle(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Table", dispId = 0x15)
    TableStyle getTable();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x16)
    Boolean getLocked();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x16)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x17)
    Integer getPriority();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x17)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "UnhideWhenUsed", dispId = 0x18)
    Boolean getUnhideWhenUsed();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "UnhideWhenUsed", dispId = 0x18)
    void setUnhideWhenUsed(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "QuickStyle", dispId = 0x19)
    Boolean getQuickStyle();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "QuickStyle", dispId = 0x19)
    void setQuickStyle(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "Linked", dispId = 0x1a)
    Boolean getLinked();
            
    
}