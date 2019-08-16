
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Path", dispId = 0x1)
    String getPath();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AutoTextEntries", dispId = 0x2)
    AutoTextEntries getAutoTextEntries();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x4)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x4)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x5)
    Boolean getSaved();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Saved", dispId = 0x5)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6)
    WdTemplateType getType();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x7)
    String getFullName();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "BuiltInDocumentProperties", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltInDocumentProperties();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x9)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ListTemplates", dispId = 0xa)
    ListTemplates getListTemplates();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0xb)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0xb)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x63)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0xc)
    Boolean getKerningByAlgorithm();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KerningByAlgorithm", dispId = 0xc)
    void setKerningByAlgorithm(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "JustificationMode", dispId = 0xd)
    WdJustificationMode getJustificationMode();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code WdJustificationMode}
     */
    @ComProperty(name = "JustificationMode", dispId = 0xd)
    void setJustificationMode(WdJustificationMode param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0xe)
    WdFarEastLineBreakLevel getFarEastLineBreakLevel();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code WdFarEastLineBreakLevel}
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0xe)
    void setFarEastLineBreakLevel(WdFarEastLineBreakLevel param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0xf)
    String getNoLineBreakBefore();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NoLineBreakBefore", dispId = 0xf)
    void setNoLineBreakBefore(String param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x10)
    String getNoLineBreakAfter();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NoLineBreakAfter", dispId = 0x10)
    void setNoLineBreakAfter(String param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "OpenAsDocument", dispId = 0x64)
    Document OpenAsDocument();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "Save", dispId = 0x65)
    void Save();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x11)
    Integer getNoProofing();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoProofing", dispId = 0x11)
    void setNoProofing(Integer param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x12)
    WdFarEastLineBreakLanguageID getFarEastLineBreakLanguage();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code WdFarEastLineBreakLanguageID}
     */
    @ComProperty(name = "FarEastLineBreakLanguage", dispId = 0x12)
    void setFarEastLineBreakLanguage(WdFarEastLineBreakLanguageID param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "BuildingBlockEntries", dispId = 0x13)
    BuildingBlockEntries getBuildingBlockEntries();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "BuildingBlockTypes", dispId = 0x14)
    BuildingBlockTypes getBuildingBlockTypes();
            
    
}