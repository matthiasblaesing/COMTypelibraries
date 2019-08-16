
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "accParent", dispId = 0xffffec78)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccParent();
            
    /**
     * <p>id(0xffffec77)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "accChildCount", dispId = 0xffffec77)
    Integer getAccChildCount();
            
    /**
     * <p>id(0xffffec76)</p>
     * <p>vtableId(9)</p>
     * @param varChild [in] {@code Object}
     */
    @ComProperty(name = "accChild", dispId = 0xffffec76)
    com.sun.jna.platform.win32.COM.util.IDispatch getAccChild(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     * <p>vtableId(10)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    String getAccName(Object varChild);
            
    /**
     * <p>id(0xffffec74)</p>
     * <p>vtableId(11)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    String getAccValue(Object varChild);
            
    /**
     * <p>id(0xffffec73)</p>
     * <p>vtableId(12)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accDescription", dispId = 0xffffec73)
    String getAccDescription(Object varChild);
            
    /**
     * <p>id(0xffffec72)</p>
     * <p>vtableId(13)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accRole", dispId = 0xffffec72)
    Object getAccRole(Object varChild);
            
    /**
     * <p>id(0xffffec71)</p>
     * <p>vtableId(14)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accState", dispId = 0xffffec71)
    Object getAccState(Object varChild);
            
    /**
     * <p>id(0xffffec70)</p>
     * <p>vtableId(15)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accHelp", dispId = 0xffffec70)
    String getAccHelp(Object varChild);
            
    /**
     * <p>id(0xffffec6f)</p>
     * <p>vtableId(16)</p>
     * @param pszHelpFile [out] {@code String}
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accHelpTopic", dispId = 0xffffec6f)
    Integer getAccHelpTopic(VARIANT pszHelpFile,
            Object varChild);
            
    /**
     * <p>id(0xffffec6e)</p>
     * <p>vtableId(17)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accKeyboardShortcut", dispId = 0xffffec6e)
    String getAccKeyboardShortcut(Object varChild);
            
    /**
     * <p>id(0xffffec6d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "accFocus", dispId = 0xffffec6d)
    Object getAccFocus();
            
    /**
     * <p>id(0xffffec6c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "accSelection", dispId = 0xffffec6c)
    Object getAccSelection();
            
    /**
     * <p>id(0xffffec6b)</p>
     * <p>vtableId(20)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComProperty(name = "accDefaultAction", dispId = 0xffffec6b)
    String getAccDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec6a)</p>
     * <p>vtableId(21)</p>
     * @param flagsSelect [in] {@code Integer}
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accSelect", dispId = 0xffffec6a)
    void accSelect(Integer flagsSelect,
            Object varChild);
            
    /**
     * <p>id(0xffffec69)</p>
     * <p>vtableId(22)</p>
     * @param pxLeft [out] {@code Integer}
     * @param pyTop [out] {@code Integer}
     * @param pcxWidth [out] {@code Integer}
     * @param pcyHeight [out] {@code Integer}
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accLocation", dispId = 0xffffec69)
    void accLocation(VARIANT pxLeft,
            VARIANT pyTop,
            VARIANT pcxWidth,
            VARIANT pcyHeight,
            Object varChild);
            
    /**
     * <p>id(0xffffec68)</p>
     * <p>vtableId(23)</p>
     * @param navDir [in] {@code Integer}
     * @param varStart [in, optional] {@code Object}
     */
    @ComMethod(name = "accNavigate", dispId = 0xffffec68)
    Object accNavigate(Integer navDir,
            Object varStart);
            
    /**
     * <p>id(0xffffec67)</p>
     * <p>vtableId(24)</p>
     * @param xLeft [in] {@code Integer}
     * @param yTop [in] {@code Integer}
     */
    @ComMethod(name = "accHitTest", dispId = 0xffffec67)
    Object accHitTest(Integer xLeft,
            Integer yTop);
            
    /**
     * <p>id(0xffffec66)</p>
     * <p>vtableId(25)</p>
     * @param varChild [in, optional] {@code Object}
     */
    @ComMethod(name = "accDoDefaultAction", dispId = 0xffffec66)
    void accDoDefaultAction(Object varChild);
            
    /**
     * <p>id(0xffffec75)</p>
     * <p>vtableId(26)</p>
     * @param varChild [in, optional] {@code Object}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "accName", dispId = 0xffffec75)
    void setAccName(Object varChild,
            String param1);
            
    /**
     * <p>id(0xffffec74)</p>
     * <p>vtableId(27)</p>
     * @param varChild [in, optional] {@code Object}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "accValue", dispId = 0xffffec74)
    void setAccValue(Object varChild,
            String param1);
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60030001)
    Integer getCreator();
            
    /**
     * <p>id(0x60040000)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "BeginGroup", dispId = 0x60040000)
    Boolean getBeginGroup();
            
    /**
     * <p>id(0x60040000)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BeginGroup", dispId = 0x60040000)
    void setBeginGroup(Boolean param0);
            
    /**
     * <p>id(0x60040002)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x60040002)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x60040003)
    String getCaption();
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x60040003)
    void setCaption(String param0);
            
    /**
     * <p>id(0x60040005)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Control", dispId = 0x60040005)
    com.sun.jna.platform.win32.COM.util.IDispatch getControl();
            
    /**
     * <p>id(0x60040006)</p>
     * <p>vtableId(36)</p>
     * @param Bar [in, optional] {@code Object}
     * @param Before [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x60040006)
    CommandBarControl Copy(Object Bar,
            Object Before);
            
    /**
     * <p>id(0x60040007)</p>
     * <p>vtableId(37)</p>
     * @param Temporary [in, optional] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x60040007)
    void Delete(Object Temporary);
            
    /**
     * <p>id(0x60040008)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "DescriptionText", dispId = 0x60040008)
    String getDescriptionText();
            
    /**
     * <p>id(0x60040008)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DescriptionText", dispId = 0x60040008)
    void setDescriptionText(String param0);
            
    /**
     * <p>id(0x6004000a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x6004000a)
    Boolean getEnabled();
            
    /**
     * <p>id(0x6004000a)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x6004000a)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x6004000c)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x6004000c)
    void Execute();
            
    /**
     * <p>id(0x6004000d)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6004000d)
    Integer getHeight();
            
    /**
     * <p>id(0x6004000d)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x6004000d)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6004000f)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "HelpContextId", dispId = 0x6004000f)
    Integer getHelpContextId();
            
    /**
     * <p>id(0x6004000f)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HelpContextId", dispId = 0x6004000f)
    void setHelpContextId(Integer param0);
            
    /**
     * <p>id(0x60040011)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x60040011)
    String getHelpFile();
            
    /**
     * <p>id(0x60040011)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HelpFile", dispId = 0x60040011)
    void setHelpFile(String param0);
            
    /**
     * <p>id(0x60040013)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60040013)
    Integer getId();
            
    /**
     * <p>id(0x60040014)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "Index", dispId = 0x60040014)
    Integer getIndex();
            
    /**
     * <p>id(0x60040015)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "InstanceId", dispId = 0x60040015)
    Integer getInstanceId();
            
    /**
     * <p>id(0x60040016)</p>
     * <p>vtableId(52)</p>
     * @param Bar [in, optional] {@code Object}
     * @param Before [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x60040016)
    CommandBarControl Move(Object Bar,
            Object Before);
            
    /**
     * <p>id(0x60040017)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Left", dispId = 0x60040017)
    Integer getLeft();
            
    /**
     * <p>id(0x60040018)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "OLEUsage", dispId = 0x60040018)
    MsoControlOLEUsage getOLEUsage();
            
    /**
     * <p>id(0x60040018)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code MsoControlOLEUsage}
     */
    @ComProperty(name = "OLEUsage", dispId = 0x60040018)
    void setOLEUsage(MsoControlOLEUsage param0);
            
    /**
     * <p>id(0x6004001a)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x6004001a)
    String getOnAction();
            
    /**
     * <p>id(0x6004001a)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x6004001a)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x6004001c)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6004001c)
    CommandBar getParent();
            
    /**
     * <p>id(0x6004001d)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Parameter", dispId = 0x6004001d)
    String getParameter();
            
    /**
     * <p>id(0x6004001d)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Parameter", dispId = 0x6004001d)
    void setParameter(String param0);
            
    /**
     * <p>id(0x6004001f)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x6004001f)
    Integer getPriority();
            
    /**
     * <p>id(0x6004001f)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x6004001f)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0x60040021)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60040021)
    void Reset();
            
    /**
     * <p>id(0x60040022)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "SetFocus", dispId = 0x60040022)
    void SetFocus();
            
    /**
     * <p>id(0x60040023)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x60040023)
    String getTag();
            
    /**
     * <p>id(0x60040023)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x60040023)
    void setTag(String param0);
            
    /**
     * <p>id(0x60040025)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "TooltipText", dispId = 0x60040025)
    String getTooltipText();
            
    /**
     * <p>id(0x60040025)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TooltipText", dispId = 0x60040025)
    void setTooltipText(String param0);
            
    /**
     * <p>id(0x60040027)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Top", dispId = 0x60040027)
    Integer getTop();
            
    /**
     * <p>id(0x60040028)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60040028)
    MsoControlType getType();
            
    /**
     * <p>id(0x60040029)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60040029)
    Boolean getVisible();
            
    /**
     * <p>id(0x60040029)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x60040029)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x6004002b)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6004002b)
    Integer getWidth();
            
    /**
     * <p>id(0x6004002b)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x6004002b)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x6004002d)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "IsPriorityDropped", dispId = 0x6004002d)
    Boolean getIsPriorityDropped();
            
    /**
     * <p>id(0x6004002e)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "Reserved1", dispId = 0x6004002e)
    void Reserved1();
            
    /**
     * <p>id(0x6004002f)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "Reserved2", dispId = 0x6004002f)
    void Reserved2();
            
    /**
     * <p>id(0x60040030)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "Reserved3", dispId = 0x60040030)
    void Reserved3();
            
    /**
     * <p>id(0x60040031)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "Reserved4", dispId = 0x60040031)
    void Reserved4();
            
    /**
     * <p>id(0x60040032)</p>
     * <p>vtableId(80)</p>
     */
    @ComMethod(name = "Reserved5", dispId = 0x60040032)
    void Reserved5();
            
    /**
     * <p>id(0x60040033)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "Reserved6", dispId = 0x60040033)
    void Reserved6();
            
    /**
     * <p>id(0x60040034)</p>
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "Reserved7", dispId = 0x60040034)
    void Reserved7();
            
    /**
     * <p>id(0x60050000)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "CommandBar", dispId = 0x60050000)
    CommandBar getCommandBar();
            
    /**
     * <p>id(0x60050001)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x60050001)
    CommandBarControls getControls();
            
    /**
     * <p>id(0x60050002)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "OLEMenuGroup", dispId = 0x60050002)
    MsoOLEMenuGroup getOLEMenuGroup();
            
    /**
     * <p>id(0x60050002)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code MsoOLEMenuGroup}
     */
    @ComProperty(name = "OLEMenuGroup", dispId = 0x60050002)
    void setOLEMenuGroup(MsoOLEMenuGroup param0);
            
    /**
     * <p>id(0x60050004)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "InstanceIdPtr", dispId = 0x60050004)
    Object getInstanceIdPtr();
            
    
}