
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630D8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630D8-0000-0000-C000-000000000046}")
public interface _RuleConditions extends IUnknown, IRawDispatchHandle, IDispatch {
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
    _RuleCondition Item(Integer Index);
            
    /**
     * <p>id(0xfb2c)</p>
     */
    @ComProperty(name = "CC", dispId = 0xfb2c)
    RuleCondition getCC();
            
    /**
     * <p>id(0xfb2d)</p>
     */
    @ComProperty(name = "HasAttachment", dispId = 0xfb2d)
    RuleCondition getHasAttachment();
            
    /**
     * <p>id(0xfb2b)</p>
     */
    @ComProperty(name = "Importance", dispId = 0xfb2b)
    ImportanceRuleCondition getImportance();
            
    /**
     * <p>id(0xfb2e)</p>
     */
    @ComProperty(name = "MeetingInviteOrUpdate", dispId = 0xfb2e)
    RuleCondition getMeetingInviteOrUpdate();
            
    /**
     * <p>id(0xfb2f)</p>
     */
    @ComProperty(name = "NotTo", dispId = 0xfb2f)
    RuleCondition getNotTo();
            
    /**
     * <p>id(0xfb30)</p>
     */
    @ComProperty(name = "OnlyToMe", dispId = 0xfb30)
    RuleCondition getOnlyToMe();
            
    /**
     * <p>id(0xfb31)</p>
     */
    @ComProperty(name = "ToMe", dispId = 0xfb31)
    RuleCondition getToMe();
            
    /**
     * <p>id(0xfb32)</p>
     */
    @ComProperty(name = "ToOrCc", dispId = 0xfb32)
    RuleCondition getToOrCc();
            
    /**
     * <p>id(0xfad1)</p>
     */
    @ComProperty(name = "Account", dispId = 0xfad1)
    AccountRuleCondition getAccount();
            
    /**
     * <p>id(0xfb48)</p>
     */
    @ComProperty(name = "Body", dispId = 0xfb48)
    TextRuleCondition getBody();
            
    /**
     * <p>id(0xfb49)</p>
     */
    @ComProperty(name = "BodyOrSubject", dispId = 0xfb49)
    TextRuleCondition getBodyOrSubject();
            
    /**
     * <p>id(0xfb4a)</p>
     */
    @ComProperty(name = "Category", dispId = 0xfb4a)
    CategoryRuleCondition getCategory();
            
    /**
     * <p>id(0xfb4b)</p>
     */
    @ComProperty(name = "FormName", dispId = 0xfb4b)
    FormNameRuleCondition getFormName();
            
    /**
     * <p>id(0xfb4c)</p>
     */
    @ComProperty(name = "From", dispId = 0xfb4c)
    ToOrFromRuleCondition getFrom();
            
    /**
     * <p>id(0xfb4e)</p>
     */
    @ComProperty(name = "MessageHeader", dispId = 0xfb4e)
    TextRuleCondition getMessageHeader();
            
    /**
     * <p>id(0xfb52)</p>
     */
    @ComProperty(name = "RecipientAddress", dispId = 0xfb52)
    AddressRuleCondition getRecipientAddress();
            
    /**
     * <p>id(0xfb4f)</p>
     */
    @ComProperty(name = "SenderAddress", dispId = 0xfb4f)
    AddressRuleCondition getSenderAddress();
            
    /**
     * <p>id(0xfb50)</p>
     */
    @ComProperty(name = "SenderInAddressList", dispId = 0xfb50)
    SenderInAddressListRuleCondition getSenderInAddressList();
            
    /**
     * <p>id(0xfb51)</p>
     */
    @ComProperty(name = "Subject", dispId = 0xfb51)
    TextRuleCondition getSubject();
            
    /**
     * <p>id(0xfb53)</p>
     */
    @ComProperty(name = "SentTo", dispId = 0xfb53)
    ToOrFromRuleCondition getSentTo();
            
    /**
     * <p>id(0xfb54)</p>
     */
    @ComProperty(name = "OnLocalMachine", dispId = 0xfb54)
    RuleCondition getOnLocalMachine();
            
    /**
     * <p>id(0xfbd9)</p>
     */
    @ComProperty(name = "OnOtherMachine", dispId = 0xfbd9)
    RuleCondition getOnOtherMachine();
            
    /**
     * <p>id(0xfc13)</p>
     */
    @ComProperty(name = "AnyCategory", dispId = 0xfc13)
    RuleCondition getAnyCategory();
            
    /**
     * <p>id(0xfc16)</p>
     */
    @ComProperty(name = "FromAnyRSSFeed", dispId = 0xfc16)
    RuleCondition getFromAnyRSSFeed();
            
    /**
     * <p>id(0xfc17)</p>
     */
    @ComProperty(name = "FromRssFeed", dispId = 0xfc17)
    FromRssFeedRuleCondition getFromRssFeed();
            
    
}