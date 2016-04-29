
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063005-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063005-0000-0000-C000-000000000046}")
public interface _Inspector {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2100)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x2100)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x2102)</p>
     */
    @ComProperty(name = "CurrentItem", dispId = 0x2102)
    com.sun.jna.platform.win32.COM.util.IDispatch getCurrentItem();
            
    /**
     * <p>id(0x2110)</p>
     */
    @ComProperty(name = "EditorType", dispId = 0x2110)
    OlEditorType getEditorType();
            
    /**
     * <p>id(0x2106)</p>
     */
    @ComProperty(name = "ModifiedFormPages", dispId = 0x2106)
    com.sun.jna.platform.win32.COM.util.IDispatch getModifiedFormPages();
            
    /**
     * <p>id(0x2103)</p>
     */
    @ComMethod(name = "Close", dispId = 0x2103)
    void Close(OlInspectorClose SaveMode);
            
    /**
     * <p>id(0x2104)</p>
     */
    @ComMethod(name = "Display", dispId = 0x2104)
    void Display(Object Modal);
            
    /**
     * <p>id(0x2108)</p>
     */
    @ComMethod(name = "HideFormPage", dispId = 0x2108)
    void HideFormPage(String PageName);
            
    /**
     * <p>id(0x2105)</p>
     */
    @ComMethod(name = "IsWordMail", dispId = 0x2105)
    Boolean IsWordMail();
            
    /**
     * <p>id(0x210c)</p>
     */
    @ComMethod(name = "SetCurrentFormPage", dispId = 0x210c)
    void SetCurrentFormPage(String PageName);
            
    /**
     * <p>id(0x2109)</p>
     */
    @ComMethod(name = "ShowFormPage", dispId = 0x2109)
    void ShowFormPage(String PageName);
            
    /**
     * <p>id(0x210e)</p>
     */
    @ComProperty(name = "HTMLEditor", dispId = 0x210e)
    com.sun.jna.platform.win32.COM.util.IDispatch getHTMLEditor();
            
    /**
     * <p>id(0x210f)</p>
     */
    @ComProperty(name = "WordEditor", dispId = 0x210f)
    com.sun.jna.platform.win32.COM.util.IDispatch getWordEditor();
            
    /**
     * <p>id(0x2111)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x2111)
    String getCaption();
            
    /**
     * <p>id(0x2114)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    Integer getHeight();
            
    /**
     * <p>id(0x2114)</p>
     */
    @ComProperty(name = "Height", dispId = 0x2114)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x2115)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    Integer getLeft();
            
    /**
     * <p>id(0x2115)</p>
     */
    @ComProperty(name = "Left", dispId = 0x2115)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x2116)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    Integer getTop();
            
    /**
     * <p>id(0x2116)</p>
     */
    @ComProperty(name = "Top", dispId = 0x2116)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x2117)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    Integer getWidth();
            
    /**
     * <p>id(0x2117)</p>
     */
    @ComProperty(name = "Width", dispId = 0x2117)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x2112)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    OlWindowState getWindowState();
            
    /**
     * <p>id(0x2112)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x2112)
    void setWindowState(OlWindowState param0);
            
    /**
     * <p>id(0x2113)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x2113)
    void Activate();
            
    /**
     * <p>id(0xfac9)</p>
     */
    @ComMethod(name = "SetControlItemProperty", dispId = 0xfac9)
    void SetControlItemProperty(com.sun.jna.platform.win32.COM.util.IDispatch Control,
            String PropertyName);
            
    /**
     * <p>id(0xfbed)</p>
     */
    @ComMethod(name = "NewFormRegion", dispId = 0xfbed)
    com.sun.jna.platform.win32.COM.util.IDispatch NewFormRegion();
            
    /**
     * <p>id(0xfbff)</p>
     */
    @ComMethod(name = "OpenFormRegion", dispId = 0xfbff)
    com.sun.jna.platform.win32.COM.util.IDispatch OpenFormRegion(String Path);
            
    /**
     * <p>id(0xfc00)</p>
     */
    @ComMethod(name = "SaveFormRegion", dispId = 0xfc00)
    void SaveFormRegion(com.sun.jna.platform.win32.COM.util.IDispatch Page,
            String FileName);
            
    /**
     * <p>id(0xfc78)</p>
     */
    @ComProperty(name = "AttachmentSelection", dispId = 0xfc78)
    _AttachmentSelection getAttachmentSelection();
            
    /**
     * <p>id(0xfc87)</p>
     */
    @ComMethod(name = "SetSchedulingStartTime", dispId = 0xfc87)
    void SetSchedulingStartTime(java.util.Date Start);
            
    
}