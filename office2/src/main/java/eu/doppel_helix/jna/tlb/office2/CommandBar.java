
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0304-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0304-0000-0000-C000-000000000046}")
public interface CommandBar extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "BuiltIn", dispId = 0x60040000)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x60040001)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Context", dispId = 0x60040001)
    String getContext();
            
    /**
     * <p>id(0x60040001)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Context", dispId = 0x60040001)
    void setContext(String param0);
            
    /**
     * <p>id(0x60040003)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x60040003)
    CommandBarControls getControls();
            
    /**
     * <p>id(0x60040004)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60040004)
    void Delete();
            
    /**
     * <p>id(0x60040005)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x60040005)
    Boolean getEnabled();
            
    /**
     * <p>id(0x60040005)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x60040005)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x60040007)</p>
     * <p>vtableId(37)</p>
     * @param Type [in, optional] {@code Object}
     * @param Id [in, optional] {@code Object}
     * @param Tag [in, optional] {@code Object}
     * @param Visible [in, optional] {@code Object}
     * @param Recursive [in, optional] {@code Object}
     */
    @ComMethod(name = "FindControl", dispId = 0x60040007)
    CommandBarControl FindControl(Object Type,
            Object Id,
            Object Tag,
            Object Visible,
            Object Recursive);
            
    /**
     * <p>id(0x60040008)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60040008)
    Integer getHeight();
            
    /**
     * <p>id(0x60040008)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x60040008)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6004000a)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Index", dispId = 0x6004000a)
    Integer getIndex();
            
    /**
     * <p>id(0x6004000b)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "InstanceId", dispId = 0x6004000b)
    Integer getInstanceId();
            
    /**
     * <p>id(0x6004000c)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6004000c)
    Integer getLeft();
            
    /**
     * <p>id(0x6004000c)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x6004000c)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x6004000e)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6004000e)
    String getName();
            
    /**
     * <p>id(0x6004000e)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6004000e)
    void setName(String param0);
            
    /**
     * <p>id(0x60040010)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x60040010)
    String getNameLocal();
            
    /**
     * <p>id(0x60040010)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NameLocal", dispId = 0x60040010)
    void setNameLocal(String param0);
            
    /**
     * <p>id(0x60040012)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60040012)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60040013)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Position", dispId = 0x60040013)
    MsoBarPosition getPosition();
            
    /**
     * <p>id(0x60040013)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code MsoBarPosition}
     */
    @ComProperty(name = "Position", dispId = 0x60040013)
    void setPosition(MsoBarPosition param0);
            
    /**
     * <p>id(0x60040015)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x60040015)
    Integer getRowIndex();
            
    /**
     * <p>id(0x60040015)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RowIndex", dispId = 0x60040015)
    void setRowIndex(Integer param0);
            
    /**
     * <p>id(0x60040017)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "Protection", dispId = 0x60040017)
    MsoBarProtection getProtection();
            
    /**
     * <p>id(0x60040017)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code MsoBarProtection}
     */
    @ComProperty(name = "Protection", dispId = 0x60040017)
    void setProtection(MsoBarProtection param0);
            
    /**
     * <p>id(0x60040019)</p>
     * <p>vtableId(55)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60040019)
    void Reset();
            
    /**
     * <p>id(0x6004001a)</p>
     * <p>vtableId(56)</p>
     * @param x [in, optional] {@code Object}
     * @param y [in, optional] {@code Object}
     */
    @ComMethod(name = "ShowPopup", dispId = 0x6004001a)
    void ShowPopup(Object x,
            Object y);
            
    /**
     * <p>id(0x6004001b)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6004001b)
    Integer getTop();
            
    /**
     * <p>id(0x6004001b)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x6004001b)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x6004001d)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6004001d)
    MsoBarType getType();
            
    /**
     * <p>id(0x6004001e)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6004001e)
    Boolean getVisible();
            
    /**
     * <p>id(0x6004001e)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x6004001e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x60040020)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60040020)
    Integer getWidth();
            
    /**
     * <p>id(0x60040020)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x60040020)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x60040022)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "AdaptiveMenu", dispId = 0x60040022)
    Boolean getAdaptiveMenu();
            
    /**
     * <p>id(0x60040022)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AdaptiveMenu", dispId = 0x60040022)
    void setAdaptiveMenu(Boolean param0);
            
    /**
     * <p>id(0x60040024)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60040024)
    Integer getId();
            
    /**
     * <p>id(0x60040025)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "InstanceIdPtr", dispId = 0x60040025)
    Object getInstanceIdPtr();
            
    
}