
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630FE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630FE-0000-0000-C000-000000000046}")
public interface _MobileItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xf817)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Actions", dispId = 0xf817)
    Actions getActions();
            
    /**
     * <p>id(0xf815)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Attachments", dispId = 0xf815)
    Attachments getAttachments();
            
    /**
     * <p>id(0x8535)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BillingInformation", dispId = 0x8535)
    String getBillingInformation();
            
    /**
     * <p>id(0x8535)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BillingInformation", dispId = 0x8535)
    void setBillingInformation(String param0);
            
    /**
     * <p>id(0xfc4b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Body", dispId = 0xfc4b)
    String getBody();
            
    /**
     * <p>id(0xfc4b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Body", dispId = 0xfc4b)
    void setBody(String param0);
            
    /**
     * <p>id(0x9001)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    String getCategories();
            
    /**
     * <p>id(0x9001)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    void setCategories(String param0);
            
    /**
     * <p>id(0x853b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Companies", dispId = 0x853b)
    String getCompanies();
            
    /**
     * <p>id(0x853b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Companies", dispId = 0x853b)
    void setCompanies(String param0);
            
    /**
     * <p>id(0xfac0)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ConversationIndex", dispId = 0xfac0)
    String getConversationIndex();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ConversationTopic", dispId = 0x70)
    String getConversationTopic();
            
    /**
     * <p>id(0x3007)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "CreationTime", dispId = 0x3007)
    java.util.Date getCreationTime();
            
    /**
     * <p>id(0xf01e)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0xf095)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "FormDescription", dispId = 0xf095)
    FormDescription getFormDescription();
            
    /**
     * <p>id(0xf03e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "GetInspector", dispId = 0xf03e)
    _Inspector getGetInspector();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Importance", dispId = 0x17)
    OlImportance getImportance();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code OlImportance}
     */
    @ComProperty(name = "Importance", dispId = 0x17)
    void setImportance(OlImportance param0);
            
    /**
     * <p>id(0x3008)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "LastModificationTime", dispId = 0x3008)
    java.util.Date getLastModificationTime();
            
    /**
     * <p>id(0xf100)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    void setMessageClass(String param0);
            
    /**
     * <p>id(0x8534)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Mileage", dispId = 0x8534)
    String getMileage();
            
    /**
     * <p>id(0x8534)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Mileage", dispId = 0x8534)
    void setMileage(String param0);
            
    /**
     * <p>id(0x850e)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "NoAging", dispId = 0x850e)
    Boolean getNoAging();
            
    /**
     * <p>id(0x850e)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoAging", dispId = 0x850e)
    void setNoAging(Boolean param0);
            
    /**
     * <p>id(0x8552)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "OutlookInternalVersion", dispId = 0x8552)
    Integer getOutlookInternalVersion();
            
    /**
     * <p>id(0x8554)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "OutlookVersion", dispId = 0x8554)
    String getOutlookVersion();
            
    /**
     * <p>id(0xf0a3)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Saved", dispId = 0xf0a3)
    Boolean getSaved();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Sensitivity", dispId = 0x36)
    OlSensitivity getSensitivity();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code OlSensitivity}
     */
    @ComProperty(name = "Sensitivity", dispId = 0x36)
    void setSensitivity(OlSensitivity param0);
            
    /**
     * <p>id(0xfc57)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Size", dispId = 0xfc57)
    Integer getSize();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x37)
    String getSubject();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x37)
    void setSubject(String param0);
            
    /**
     * <p>id(0xf01c)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "UnRead", dispId = 0xf01c)
    Boolean getUnRead();
            
    /**
     * <p>id(0xf01c)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UnRead", dispId = 0xf01c)
    void setUnRead(Boolean param0);
            
    /**
     * <p>id(0xf816)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "UserProperties", dispId = 0xf816)
    UserProperties getUserProperties();
            
    /**
     * <p>id(0xf023)</p>
     * <p>vtableId(48)</p>
     * @param SaveMode [in] {@code OlInspectorClose}
     */
    @ComMethod(name = "Close", dispId = 0xf023)
    void Close(OlInspectorClose SaveMode);
            
    /**
     * <p>id(0xf032)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "Copy", dispId = 0xf032)
    com.sun.jna.platform.win32.COM.util.IDispatch Copy();
            
    /**
     * <p>id(0xf04a)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf04a)
    void Delete();
            
    /**
     * <p>id(0xf0a6)</p>
     * <p>vtableId(51)</p>
     * @param Modal [in, optional] {@code Object}
     */
    @ComMethod(name = "Display", dispId = 0xf0a6)
    void Display(Object Modal);
            
    /**
     * <p>id(0xf034)</p>
     * <p>vtableId(52)</p>
     * @param DestFldr [in] {@code MAPIFolder}
     */
    @ComMethod(name = "Move", dispId = 0xf034)
    com.sun.jna.platform.win32.COM.util.IDispatch Move(MAPIFolder DestFldr);
            
    /**
     * <p>id(0xf033)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0xf033)
    void PrintOut();
            
    /**
     * <p>id(0xf048)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save();
            
    /**
     * <p>id(0xf051)</p>
     * <p>vtableId(55)</p>
     * @param Path [in] {@code String}
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAs", dispId = 0xf051)
    void SaveAs(String Path,
            Object Type);
            
    /**
     * <p>id(0xf404)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    String getHTMLBody();
            
    /**
     * <p>id(0xf404)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    void setHTMLBody(String param0);
            
    /**
     * <p>id(0xfc4c)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "MobileFormat", dispId = 0xfc4c)
    OlMobileFormat getMobileFormat();
            
    /**
     * <p>id(0xfc4d)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "SMILBody", dispId = 0xfc4d)
    String getSMILBody();
            
    /**
     * <p>id(0xfc4d)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SMILBody", dispId = 0xfc4d)
    void setSMILBody(String param0);
            
    /**
     * <p>id(0xf810)</p>
     * <p>vtableId(61)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xf810)
    MobileItem Reply();
            
    /**
     * <p>id(0xf811)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xf811)
    MobileItem ReplyAll();
            
    /**
     * <p>id(0xfc55)</p>
     * <p>vtableId(63)</p>
     * @param ForceSend [in] {@code Boolean}
     */
    @ComMethod(name = "Send", dispId = 0xfc55)
    void Send(Boolean ForceSend);
            
    /**
     * <p>id(0xf814)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "To", dispId = 0xe04)
    String getTo();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "To", dispId = 0xe04)
    void setTo(String param0);
            
    /**
     * <p>id(0xf813)</p>
     * <p>vtableId(67)</p>
     */
    @ComMethod(name = "Forward", dispId = 0xf813)
    MobileItem Forward();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "ReplyRecipientNames", dispId = 0x50)
    String getReplyRecipientNames();
            
    /**
     * <p>id(0xf013)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "ReplyRecipients", dispId = 0xf013)
    Recipients getReplyRecipients();
            
    /**
     * <p>id(0xfc56)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Count", dispId = 0xfc56)
    Integer getCount();
            
    /**
     * <p>id(0xf403)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "Submitted", dispId = 0xf403)
    Boolean getSubmitted();
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0xe06)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "ReceivedTime", dispId = 0xe06)
    java.util.Date getReceivedTime();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    Account getSendUsingAccount();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Account}
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    void setSendUsingAccount(Account param0);
            
    /**
     * <p>id(0xf402)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "Sent", dispId = 0xf402)
    Boolean getSent();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "SentOn", dispId = 0x39)
    java.util.Date getSentOn();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "ReceivedByEntryID", dispId = 0x3f)
    String getReceivedByEntryID();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "ReceivedByName", dispId = 0x40)
    String getReceivedByName();
            
    /**
     * <p>id(0xc1f)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "SenderEmailAddress", dispId = 0xc1f)
    String getSenderEmailAddress();
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "SenderEmailType", dispId = 0xc1e)
    String getSenderEmailType();
            
    /**
     * <p>id(0xc1a)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "SenderName", dispId = 0xc1a)
    String getSenderName();
            
    
}