
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C030A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C030A-0000-0000-C000-000000000046}")
public interface CommandBarPopup extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xffffec78)</p>
     */
    @ComProperty(name = "accParent", dispId = 0xffffec78)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccParent();
            
    /**
     * <p>id(0xffffec77)</p>
     */
    @ComProperty(name = "accChildCount", dispId = 0xffffec77)
    Integer getAccChildCount();
            
    /**
     * <p>id(0xffffec76)</p>
     */
    @ComProperty(name = "accChild", dispId = 0xffffec76)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccChild(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    String getAccName(Object varChild);
            
    /**
     * <p>id(0xffffec74)</p>
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    String getAccValue(Object varChild);
            
    /**
     * <p>id(0xffffec73)</p>
     */
    @ComProperty(name = "accDescription", dispId = 0xffffec73)
    String getAccDescription(Object varChild);
            
    /**
     * <p>id(0xffffec72)</p>
     */
    @ComProperty(name = "accRole", dispId = 0xffffec72)
    Object getAccRole(Object varChild);
            
    /**
     * <p>id(0xffffec71)</p>
     */
    @ComProperty(name = "accState", dispId = 0xffffec71)
    Object getAccState(Object varChild);
            
    /**
     * <p>id(0xffffec70)</p>
     */
    @ComProperty(name = "accHelp", dispId = 0xffffec70)
    String getAccHelp(Object varChild);
            
    /**
     * <p>id(0xffffec6f)</p>
     */
    @ComProperty(name = "accHelpTopic", dispId = 0xffffec6f)
    Integer getAccHelpTopic(VARIANT pszHelpFile,
            Object varChild);
            
    /**
     * <p>id(0xffffec6e)</p>
     */
    @ComProperty(name = "accKeyboardShortcut", dispId = 0xffffec6e)
    String getAccKeyboardShortcut(Object varChild);
            
    /**
     * <p>id(0xffffec6d)</p>
     */
    @ComProperty(name = "accFocus", dispId = 0xffffec6d)
    Object getAccFocus();
            
    /**
     * <p>id(0xffffec6c)</p>
     */
    @ComProperty(name = "accSelection", dispId = 0xffffec6c)
    Object getAccSelection();
            
    /**
     * <p>id(0xffffec6b)</p>
     */
    @ComProperty(name = "accDefaultAction", dispId = 0xffffec6b)
    String getAccDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec6a)</p>
     */
    @ComMethod(name = "accSelect", dispId = 0xffffec6a)
    void accSelect(Integer flagsSelect,
            Object varChild);
            
    /**
     * <p>id(0xffffec69)</p>
     */
    @ComMethod(name = "accLocation", dispId = 0xffffec69)
    void accLocation(VARIANT pxLeft,
            VARIANT pyTop,
            VARIANT pcxWidth,
            VARIANT pcyHeight,
            Object varChild);
            
    /**
     * <p>id(0xffffec68)</p>
     */
    @ComMethod(name = "accNavigate", dispId = 0xffffec68)
    Object accNavigate(Integer navDir,
            Object varStart);
            
    /**
     * <p>id(0xffffec67)</p>
     */
    @ComMethod(name = "accHitTest", dispId = 0xffffec67)
    Object accHitTest(Integer xLeft,
            Integer yTop);
            
    /**
     * <p>id(0xffffec66)</p>
     */
    @ComMethod(name = "accDoDefaultAction", dispId = 0xffffec66)
    void accDoDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    void setAccName(Object varChild,
            String param1);
            
    /**
     * <p>id(0xffffec74)</p>
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    void setAccValue(Object varChild,
            String param1);
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60030001)
    Integer getCreator();
            
    /**
     * <p>id(0x60040000)</p>
     */
    @ComProperty(name = "BeginGroup", dispId = 0x60040000)
    Boolean getBeginGroup();
            
    /**
     * <p>id(0x60040000)</p>
     */
    @ComProperty(name = "BeginGroup", dispId = 0x60040000)
    void setBeginGroup(Boolean param0);
            
    /**
     * <p>id(0x60040002)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x60040002)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x60040003)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60040003)
    String getCaption();
            
    /**
     * <p>id(0x60040003)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60040003)
    void setCaption(String param0);
            
    /**
     * <p>id(0x60040005)</p>
     */
    @ComProperty(name = "Control", dispId = 0x60040005)
    com.sun.jna.platform.win32.COM.util.IDispatch getControl();
            
    /**
     * <p>id(0x60040006)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x60040006)
    CommandBarControl Copy(Object Bar,
            Object Before);
            
    /**
     * <p>id(0x60040007)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60040007)
    void Delete(Object Temporary);
            
    /**
     * <p>id(0x60040008)</p>
     */
    @ComProperty(name = "DescriptionText", dispId = 0x60040008)
    String getDescriptionText();
            
    /**
     * <p>id(0x60040008)</p>
     */
    @ComProperty(name = "DescriptionText", dispId = 0x60040008)
    void setDescriptionText(String param0);
            
    /**
     * <p>id(0x6004000a)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x6004000a)
    Boolean getEnabled();
            
    /**
     * <p>id(0x6004000a)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x6004000a)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x6004000c)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x6004000c)
    void Execute();
            
    /**
     * <p>id(0x6004000d)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6004000d)
    Integer getHeight();
            
    /**
     * <p>id(0x6004000d)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6004000d)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6004000f)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0x6004000f)
    Integer getHelpContextId();
            
    /**
     * <p>id(0x6004000f)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0x6004000f)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0x60040011)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x60040011)
    String getHelpFile();
            
    /**
     * <p>id(0x60040011)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x60040011)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x60040013)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60040013)
    Integer getId();
            
    /**
     * <p>id(0x60040014)</p>
     */
    @ComProperty(name = "Index", dispId = 0x60040014)
    Integer getIndex();
            
    /**
     * <p>id(0x60040015)</p>
     */
    @ComProperty(name = "InstanceId", dispId = 0x60040015)
    Integer getInstanceId();
            
    /**
     * <p>id(0x60040016)</p>
     */
    @ComMethod(name = "Move", dispId = 0x60040016)
    CommandBarControl Move(Object Bar,
            Object Before);
            
    /**
     * <p>id(0x60040017)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60040017)
    Integer getLeft();
            
    /**
     * <p>id(0x60040018)</p>
     */
    @ComProperty(name = "OLEUsage", dispId = 0x60040018)
    MsoControlOLEUsage getOLEUsage();
            
    /**
     * <p>id(0x60040018)</p>
     */
    @ComProperty(name = "OLEUsage", dispId = 0x60040018)
    void setOLEUsage(MsoControlOLEUsage param0);
            
    /**
     * <p>id(0x6004001a)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x6004001a)
    String getOnAction();
            
    /**
     * <p>id(0x6004001a)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x6004001a)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x6004001c)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6004001c)
    CommandBar getParent();
            
    /**
     * <p>id(0x6004001d)</p>
     */
    @ComProperty(name = "Parameter", dispId = 0x6004001d)
    String getParameter();
            
    /**
     * <p>id(0x6004001d)</p>
     */
    @ComProperty(name = "Parameter", dispId = 0x6004001d)
    void setParameter(String param0);
            
    /**
     * <p>id(0x6004001f)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x6004001f)
    Integer getPriority();
            
    /**
     * <p>id(0x6004001f)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x6004001f)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0x60040021)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60040021)
    void Reset();
            
    /**
     * <p>id(0x60040022)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x60040022)
    void SetFocus();
            
    /**
     * <p>id(0x60040023)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x60040023)
    String getTag();
            
    /**
     * <p>id(0x60040023)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x60040023)
    void setTag(String param0);
            
    /**
     * <p>id(0x60040025)</p>
     */
    @ComProperty(name = "TooltipText", dispId = 0x60040025)
    String getTooltipText();
            
    /**
     * <p>id(0x60040025)</p>
     */
    @ComProperty(name = "TooltipText", dispId = 0x60040025)
    void setTooltipText(String param0);
            
    /**
     * <p>id(0x60040027)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60040027)
    Integer getTop();
            
    /**
     * <p>id(0x60040028)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60040028)
    MsoControlType getType();
            
    /**
     * <p>id(0x60040029)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60040029)
    Boolean getVisible();
            
    /**
     * <p>id(0x60040029)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60040029)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x6004002b)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6004002b)
    Integer getWidth();
            
    /**
     * <p>id(0x6004002b)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6004002b)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x6004002d)</p>
     */
    @ComProperty(name = "IsPriorityDropped", dispId = 0x6004002d)
    Boolean getIsPriorityDropped();
            
    /**
     * <p>id(0x6004002e)</p>
     */
    @ComMethod(name = "Reserved1", dispId = 0x6004002e)
    void Reserved1();
            
    /**
     * <p>id(0x6004002f)</p>
     */
    @ComMethod(name = "Reserved2", dispId = 0x6004002f)
    void Reserved2();
            
    /**
     * <p>id(0x60040030)</p>
     */
    @ComMethod(name = "Reserved3", dispId = 0x60040030)
    void Reserved3();
            
    /**
     * <p>id(0x60040031)</p>
     */
    @ComMethod(name = "Reserved4", dispId = 0x60040031)
    void Reserved4();
            
    /**
     * <p>id(0x60040032)</p>
     */
    @ComMethod(name = "Reserved5", dispId = 0x60040032)
    void Reserved5();
            
    /**
     * <p>id(0x60040033)</p>
     */
    @ComMethod(name = "Reserved6", dispId = 0x60040033)
    void Reserved6();
            
    /**
     * <p>id(0x60040034)</p>
     */
    @ComMethod(name = "Reserved7", dispId = 0x60040034)
    void Reserved7();
            
    /**
     * <p>id(0x60050000)</p>
     */
    @ComProperty(name = "CommandBar", dispId = 0x60050000)
    CommandBar getCommandBar();
            
    /**
     * <p>id(0x60050001)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x60050001)
    CommandBarControls getControls();
            
    /**
     * <p>id(0x60050002)</p>
     */
    @ComProperty(name = "OLEMenuGroup", dispId = 0x60050002)
    MsoOLEMenuGroup getOLEMenuGroup();
            
    /**
     * <p>id(0x60050002)</p>
     */
    @ComProperty(name = "OLEMenuGroup", dispId = 0x60050002)
    void setOLEMenuGroup(MsoOLEMenuGroup param0);
            
    /**
     * <p>id(0x60050004)</p>
     */
    @ComProperty(name = "InstanceIdPtr", dispId = 0x60050004)
    Object getInstanceIdPtr();
            
    
}