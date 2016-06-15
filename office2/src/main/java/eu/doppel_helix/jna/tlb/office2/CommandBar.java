
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
    @ComProperty(name = "BuiltIn", dispId = 0x60040000)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0x60040001)</p>
     */
    @ComProperty(name = "Context", dispId = 0x60040001)
    String getContext();
            
    /**
     * <p>id(0x60040001)</p>
     */
    @ComProperty(name = "Context", dispId = 0x60040001)
    void setContext(String param0);
            
    /**
     * <p>id(0x60040003)</p>
     */
    @ComProperty(name = "Controls", dispId = 0x60040003)
    CommandBarControls getControls();
            
    /**
     * <p>id(0x60040004)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60040004)
    void Delete();
            
    /**
     * <p>id(0x60040005)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x60040005)
    Boolean getEnabled();
            
    /**
     * <p>id(0x60040005)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x60040005)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x60040007)</p>
     */
    @ComMethod(name = "FindControl", dispId = 0x60040007)
    CommandBarControl FindControl(Object Type,
            Object Id,
            Object Tag,
            Object Visible,
            Object Recursive);
            
    /**
     * <p>id(0x60040008)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60040008)
    Integer getHeight();
            
    /**
     * <p>id(0x60040008)</p>
     */
    @ComProperty(name = "Height", dispId = 0x60040008)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x6004000a)</p>
     */
    @ComProperty(name = "Index", dispId = 0x6004000a)
    Integer getIndex();
            
    /**
     * <p>id(0x6004000b)</p>
     */
    @ComProperty(name = "InstanceId", dispId = 0x6004000b)
    Integer getInstanceId();
            
    /**
     * <p>id(0x6004000c)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6004000c)
    Integer getLeft();
            
    /**
     * <p>id(0x6004000c)</p>
     */
    @ComProperty(name = "Left", dispId = 0x6004000c)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x6004000e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6004000e)
    String getName();
            
    /**
     * <p>id(0x6004000e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6004000e)
    void setName(String param0);
            
    /**
     * <p>id(0x60040010)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x60040010)
    String getNameLocal();
            
    /**
     * <p>id(0x60040010)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x60040010)
    void setNameLocal(String param0);
            
    /**
     * <p>id(0x60040012)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60040012)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60040013)</p>
     */
    @ComProperty(name = "Position", dispId = 0x60040013)
    MsoBarPosition getPosition();
            
    /**
     * <p>id(0x60040013)</p>
     */
    @ComProperty(name = "Position", dispId = 0x60040013)
    void setPosition(MsoBarPosition param0);
            
    /**
     * <p>id(0x60040015)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x60040015)
    Integer getRowIndex();
            
    /**
     * <p>id(0x60040015)</p>
     */
    @ComProperty(name = "RowIndex", dispId = 0x60040015)
    void setRowIndex(Integer param0);
            
    /**
     * <p>id(0x60040017)</p>
     */
    @ComProperty(name = "Protection", dispId = 0x60040017)
    MsoBarProtection getProtection();
            
    /**
     * <p>id(0x60040017)</p>
     */
    @ComProperty(name = "Protection", dispId = 0x60040017)
    void setProtection(MsoBarProtection param0);
            
    /**
     * <p>id(0x60040019)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x60040019)
    void Reset();
            
    /**
     * <p>id(0x6004001a)</p>
     */
    @ComMethod(name = "ShowPopup", dispId = 0x6004001a)
    void ShowPopup(Object x,
            Object y);
            
    /**
     * <p>id(0x6004001b)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6004001b)
    Integer getTop();
            
    /**
     * <p>id(0x6004001b)</p>
     */
    @ComProperty(name = "Top", dispId = 0x6004001b)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x6004001d)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6004001d)
    MsoBarType getType();
            
    /**
     * <p>id(0x6004001e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6004001e)
    Boolean getVisible();
            
    /**
     * <p>id(0x6004001e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6004001e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x60040020)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60040020)
    Integer getWidth();
            
    /**
     * <p>id(0x60040020)</p>
     */
    @ComProperty(name = "Width", dispId = 0x60040020)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x60040022)</p>
     */
    @ComProperty(name = "AdaptiveMenu", dispId = 0x60040022)
    Boolean getAdaptiveMenu();
            
    /**
     * <p>id(0x60040022)</p>
     */
    @ComProperty(name = "AdaptiveMenu", dispId = 0x60040022)
    void setAdaptiveMenu(Boolean param0);
            
    /**
     * <p>id(0x60040024)</p>
     */
    @ComProperty(name = "Id", dispId = 0x60040024)
    Integer getId();
            
    /**
     * <p>id(0x60040025)</p>
     */
    @ComProperty(name = "InstanceIdPtr", dispId = 0x60040025)
    Object getInstanceIdPtr();
            
    
}