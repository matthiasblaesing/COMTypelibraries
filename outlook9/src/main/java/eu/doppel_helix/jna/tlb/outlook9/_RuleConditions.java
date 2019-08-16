
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x50)
    Integer getCount();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x51)
    _RuleCondition Item(Integer Index);
            
    /**
     * <p>id(0xfb2c)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CC", dispId = 0xfb2c)
    RuleCondition getCC();
            
    /**
     * <p>id(0xfb2d)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "HasAttachment", dispId = 0xfb2d)
    RuleCondition getHasAttachment();
            
    /**
     * <p>id(0xfb2b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Importance", dispId = 0xfb2b)
    ImportanceRuleCondition getImportance();
            
    /**
     * <p>id(0xfb2e)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MeetingInviteOrUpdate", dispId = 0xfb2e)
    RuleCondition getMeetingInviteOrUpdate();
            
    /**
     * <p>id(0xfb2f)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "NotTo", dispId = 0xfb2f)
    RuleCondition getNotTo();
            
    /**
     * <p>id(0xfb30)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "OnlyToMe", dispId = 0xfb30)
    RuleCondition getOnlyToMe();
            
    /**
     * <p>id(0xfb31)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ToMe", dispId = 0xfb31)
    RuleCondition getToMe();
            
    /**
     * <p>id(0xfb32)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ToOrCc", dispId = 0xfb32)
    RuleCondition getToOrCc();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Account", dispId = 0xfad1)
    AccountRuleCondition getAccount();
            
    /**
     * <p>id(0xfb48)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Body", dispId = 0xfb48)
    TextRuleCondition getBody();
            
    /**
     * <p>id(0xfb49)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "BodyOrSubject", dispId = 0xfb49)
    TextRuleCondition getBodyOrSubject();
            
    /**
     * <p>id(0xfb4a)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Category", dispId = 0xfb4a)
    CategoryRuleCondition getCategory();
            
    /**
     * <p>id(0xfb4b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "FormName", dispId = 0xfb4b)
    FormNameRuleCondition getFormName();
            
    /**
     * <p>id(0xfb4c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "From", dispId = 0xfb4c)
    ToOrFromRuleCondition getFrom();
            
    /**
     * <p>id(0xfb4e)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "MessageHeader", dispId = 0xfb4e)
    TextRuleCondition getMessageHeader();
            
    /**
     * <p>id(0xfb52)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "RecipientAddress", dispId = 0xfb52)
    AddressRuleCondition getRecipientAddress();
            
    /**
     * <p>id(0xfb4f)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "SenderAddress", dispId = 0xfb4f)
    AddressRuleCondition getSenderAddress();
            
    /**
     * <p>id(0xfb50)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "SenderInAddressList", dispId = 0xfb50)
    SenderInAddressListRuleCondition getSenderInAddressList();
            
    /**
     * <p>id(0xfb51)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Subject", dispId = 0xfb51)
    TextRuleCondition getSubject();
            
    /**
     * <p>id(0xfb53)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "SentTo", dispId = 0xfb53)
    ToOrFromRuleCondition getSentTo();
            
    /**
     * <p>id(0xfb54)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "OnLocalMachine", dispId = 0xfb54)
    RuleCondition getOnLocalMachine();
            
    /**
     * <p>id(0xfbd9)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "OnOtherMachine", dispId = 0xfbd9)
    RuleCondition getOnOtherMachine();
            
    /**
     * <p>id(0xfc13)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "AnyCategory", dispId = 0xfc13)
    RuleCondition getAnyCategory();
            
    /**
     * <p>id(0xfc16)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "FromAnyRSSFeed", dispId = 0xfc16)
    RuleCondition getFromAnyRSSFeed();
            
    /**
     * <p>id(0xfc17)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "FromRssFeed", dispId = 0xfc17)
    FromRssFeedRuleCondition getFromRssFeed();
            
    
}