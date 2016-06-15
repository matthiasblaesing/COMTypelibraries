
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630CE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630CE-0000-0000-C000-000000000046}")
public interface _RuleActions extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     */
    @ComMethod(name = "Item", dispId = 0x51)
    _RuleAction Item(Integer Index);
            
    /**
     * <p>id(0xfb12)</p>
     */
    @ComProperty(name = "CopyToFolder", dispId = 0xfb12)
    MoveOrCopyRuleAction getCopyToFolder();
            
    /**
     * <p>id(0xfb13)</p>
     */
    @ComProperty(name = "DeletePermanently", dispId = 0xfb13)
    RuleAction getDeletePermanently();
            
    /**
     * <p>id(0xf045)</p>
     */
    @ComProperty(name = "Delete", dispId = 0xf045)
    RuleAction getDelete();
            
    /**
     * <p>id(0xfb17)</p>
     */
    @ComProperty(name = "DesktopAlert", dispId = 0xfb17)
    RuleAction getDesktopAlert();
            
    /**
     * <p>id(0xfb16)</p>
     */
    @ComProperty(name = "NotifyDelivery", dispId = 0xfb16)
    RuleAction getNotifyDelivery();
            
    /**
     * <p>id(0xfb15)</p>
     */
    @ComProperty(name = "NotifyRead", dispId = 0xfb15)
    RuleAction getNotifyRead();
            
    /**
     * <p>id(0xfb14)</p>
     */
    @ComProperty(name = "Stop", dispId = 0xfb14)
    RuleAction getStop();
            
    /**
     * <p>id(0xfb18)</p>
     */
    @ComProperty(name = "MoveToFolder", dispId = 0xfb18)
    MoveOrCopyRuleAction getMoveToFolder();
            
    /**
     * <p>id(0xfb19)</p>
     */
    @ComProperty(name = "CC", dispId = 0xfb19)
    SendRuleAction getCC();
            
    /**
     * <p>id(0xfb1a)</p>
     */
    @ComProperty(name = "Forward", dispId = 0xfb1a)
    SendRuleAction getForward();
            
    /**
     * <p>id(0xfb1b)</p>
     */
    @ComProperty(name = "ForwardAsAttachment", dispId = 0xfb1b)
    SendRuleAction getForwardAsAttachment();
            
    /**
     * <p>id(0xfb1c)</p>
     */
    @ComProperty(name = "Redirect", dispId = 0xfb1c)
    SendRuleAction getRedirect();
            
    /**
     * <p>id(0xfb22)</p>
     */
    @ComProperty(name = "AssignToCategory", dispId = 0xfb22)
    AssignToCategoryRuleAction getAssignToCategory();
            
    /**
     * <p>id(0xfb23)</p>
     */
    @ComProperty(name = "PlaySound", dispId = 0xfb23)
    PlaySoundRuleAction getPlaySound();
            
    /**
     * <p>id(0xfb26)</p>
     */
    @ComProperty(name = "MarkAsTask", dispId = 0xfb26)
    MarkAsTaskRuleAction getMarkAsTask();
            
    /**
     * <p>id(0xfb28)</p>
     */
    @ComProperty(name = "NewItemAlert", dispId = 0xfb28)
    NewItemAlertRuleAction getNewItemAlert();
            
    /**
     * <p>id(0xfc12)</p>
     */
    @ComProperty(name = "ClearCategories", dispId = 0xfc12)
    RuleAction getClearCategories();
            
    
}