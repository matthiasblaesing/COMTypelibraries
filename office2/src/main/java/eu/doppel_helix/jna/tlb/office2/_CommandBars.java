
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0302-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0302-0000-0000-C000-000000000046}")
public interface _CommandBars extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "ActionControl", dispId = 0x60030000)
    CommandBarControl getActionControl();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "ActiveMenuBar", dispId = 0x60030001)
    CommandBar getActiveMenuBar();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComMethod(name = "Add", dispId = 0x60030002)
    CommandBar Add(Object Name,
            Object Position,
            Object MenuBar,
            Object Temporary);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030003)
    Integer getCount();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "DisplayTooltips", dispId = 0x60030004)
    Boolean getDisplayTooltips();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "DisplayTooltips", dispId = 0x60030004)
    void setDisplayTooltips(Boolean param0);
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComProperty(name = "DisplayKeysInTooltips", dispId = 0x60030006)
    Boolean getDisplayKeysInTooltips();
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComProperty(name = "DisplayKeysInTooltips", dispId = 0x60030006)
    void setDisplayKeysInTooltips(Boolean param0);
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComMethod(name = "FindControl", dispId = 0x60030008)
    CommandBarControl FindControl(Object Type,
            Object Id,
            Object Tag,
            Object Visible);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    CommandBar getItem(Object Index);
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComProperty(name = "LargeButtons", dispId = 0x6003000a)
    Boolean getLargeButtons();
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComProperty(name = "LargeButtons", dispId = 0x6003000a)
    void setLargeButtons(Boolean param0);
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "MenuAnimationStyle", dispId = 0x6003000c)
    MsoMenuAnimation getMenuAnimationStyle();
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "MenuAnimationStyle", dispId = 0x6003000c)
    void setMenuAnimationStyle(MsoMenuAnimation param0);
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6003000f)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030010)</p>
     */
    @ComMethod(name = "ReleaseFocus", dispId = 0x60030010)
    void ReleaseFocus();
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "IdsString", dispId = 0x60030011)
    Integer getIdsString(Integer ids,
            VARIANT pbstrName);
            
    /**
     * <p>id(0x60030012)</p>
     */
    @ComProperty(name = "TmcGetName", dispId = 0x60030012)
    Integer getTmcGetName(Integer tmc,
            VARIANT pbstrName);
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "AdaptiveMenus", dispId = 0x60030013)
    Boolean getAdaptiveMenus();
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "AdaptiveMenus", dispId = 0x60030013)
    void setAdaptiveMenus(Boolean param0);
            
    /**
     * <p>id(0x60030015)</p>
     */
    @ComMethod(name = "FindControls", dispId = 0x60030015)
    CommandBarControls FindControls(Object Type,
            Object Id,
            Object Tag,
            Object Visible);
            
    /**
     * <p>id(0x60030016)</p>
     */
    @ComMethod(name = "AddEx", dispId = 0x60030016)
    CommandBar AddEx(Object TbidOrName,
            Object Position,
            Object MenuBar,
            Object Temporary,
            Object TbtrProtection);
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComProperty(name = "DisplayFonts", dispId = 0x60030017)
    Boolean getDisplayFonts();
            
    /**
     * <p>id(0x60030017)</p>
     */
    @ComProperty(name = "DisplayFonts", dispId = 0x60030017)
    void setDisplayFonts(Boolean param0);
            
    /**
     * <p>id(0x60030019)</p>
     */
    @ComProperty(name = "DisableCustomize", dispId = 0x60030019)
    Boolean getDisableCustomize();
            
    /**
     * <p>id(0x60030019)</p>
     */
    @ComProperty(name = "DisableCustomize", dispId = 0x60030019)
    void setDisableCustomize(Boolean param0);
            
    /**
     * <p>id(0x6003001b)</p>
     */
    @ComProperty(name = "DisableAskAQuestionDropdown", dispId = 0x6003001b)
    Boolean getDisableAskAQuestionDropdown();
            
    /**
     * <p>id(0x6003001b)</p>
     */
    @ComProperty(name = "DisableAskAQuestionDropdown", dispId = 0x6003001b)
    void setDisableAskAQuestionDropdown(Boolean param0);
            
    /**
     * <p>id(0x6003001d)</p>
     */
    @ComMethod(name = "ExecuteMso", dispId = 0x6003001d)
    void ExecuteMso(String idMso);
            
    /**
     * <p>id(0x6003001e)</p>
     */
    @ComMethod(name = "GetEnabledMso", dispId = 0x6003001e)
    Boolean GetEnabledMso(String idMso);
            
    /**
     * <p>id(0x6003001f)</p>
     */
    @ComMethod(name = "GetVisibleMso", dispId = 0x6003001f)
    Boolean GetVisibleMso(String idMso);
            
    /**
     * <p>id(0x60030020)</p>
     */
    @ComMethod(name = "GetPressedMso", dispId = 0x60030020)
    Boolean GetPressedMso(String idMso);
            
    /**
     * <p>id(0x60030021)</p>
     */
    @ComMethod(name = "GetLabelMso", dispId = 0x60030021)
    String GetLabelMso(String idMso);
            
    /**
     * <p>id(0x60030022)</p>
     */
    @ComMethod(name = "GetScreentipMso", dispId = 0x60030022)
    String GetScreentipMso(String idMso);
            
    /**
     * <p>id(0x60030023)</p>
     */
    @ComMethod(name = "GetSupertipMso", dispId = 0x60030023)
    String GetSupertipMso(String idMso);
            
    /**
     * <p>id(0x60030024)</p>
     */
    @ComMethod(name = "GetImageMso", dispId = 0x60030024)
    eu.doppel_helix.jna.tlb.stdole2.Picture GetImageMso(String idMso,
            Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x60030025)</p>
     */
    @ComMethod(name = "CommitRenderingTransaction", dispId = 0x60030025)
    void CommitRenderingTransaction(Integer hwnd);
            
    
}