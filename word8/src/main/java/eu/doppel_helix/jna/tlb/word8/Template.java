
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002096A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002096A-0000-0000-C000-000000000046}")
public interface Template extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
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
    @ComProperty(name = "Path", dispId = 0x1)
    String getPath();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "AutoTextEntries", dispId = 0x2)
    AutoTextEntries getAutoTextEntries();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x4)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x4)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x5)
    Boolean getSaved();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x5)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6)
    WdTemplateType getType();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x7)
    String getFullName();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "BuiltInDocumentProperties", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltInDocumentProperties();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ListTemplates", dispId = 0xa)
    ListTemplates getListTemplates();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0xb)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0xb)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x63)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0xc)
    Boolean getKerningByAlgorithm();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0xc)
    void setKerningByAlgorithm(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0xd)
    WdJustificationMode getJustificationMode();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0xd)
    void setJustificationMode(WdJustificationMode param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0xe)
    WdFarEastLineBreakLevel getFarEastLineBreakLevel();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0xe)
    void setFarEastLineBreakLevel(WdFarEastLineBreakLevel param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0xf)
    String getNoLineBreakBefore();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0xf)
    void setNoLineBreakBefore(String param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x10)
    String getNoLineBreakAfter();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x10)
    void setNoLineBreakAfter(String param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "OpenAsDocument", dispId = 0x64)
    Document OpenAsDocument();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Save", dispId = 0x65)
    void Save();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x11)
    Integer getNoProofing();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x11)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x12)
    WdFarEastLineBreakLanguageID getFarEastLineBreakLanguage();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x12)
    void setFarEastLineBreakLanguage(WdFarEastLineBreakLanguageID param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "BuildingBlockEntries", dispId = 0x13)
    BuildingBlockEntries getBuildingBlockEntries();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "BuildingBlockTypes", dispId = 0x14)
    BuildingBlockTypes getBuildingBlockTypes();
            
    
}