
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302F-0000-0000-C000-000000000046}")
public interface _SharingItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xf817)</p>
     */
    @ComProperty(name = "Actions", dispId = 0xf817)
    Actions getActions();
            
    /**
     * <p>id(0xf815)</p>
     */
    @ComProperty(name = "Attachments", dispId = 0xf815)
    Attachments getAttachments();
            
    /**
     * <p>id(0x8535)</p>
     */
    @ComProperty(name = "BillingInformation", dispId = 0x8535)
    String getBillingInformation();
            
    /**
     * <p>id(0x8535)</p>
     */
    @ComProperty(name = "BillingInformation", dispId = 0x8535)
    void setBillingInformation(String param0);
            
    /**
     * <p>id(0x9100)</p>
     */
    @ComProperty(name = "Body", dispId = 0x9100)
    String getBody();
            
    /**
     * <p>id(0x9100)</p>
     */
    @ComProperty(name = "Body", dispId = 0x9100)
    void setBody(String param0);
            
    /**
     * <p>id(0x9001)</p>
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    String getCategories();
            
    /**
     * <p>id(0x9001)</p>
     */
    @ComProperty(name = "Categories", dispId = 0x9001)
    void setCategories(String param0);
            
    /**
     * <p>id(0x853b)</p>
     */
    @ComProperty(name = "Companies", dispId = 0x853b)
    String getCompanies();
            
    /**
     * <p>id(0x853b)</p>
     */
    @ComProperty(name = "Companies", dispId = 0x853b)
    void setCompanies(String param0);
            
    /**
     * <p>id(0xfac0)</p>
     */
    @ComProperty(name = "ConversationIndex", dispId = 0xfac0)
    String getConversationIndex();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "ConversationTopic", dispId = 0x70)
    String getConversationTopic();
            
    /**
     * <p>id(0x3007)</p>
     */
    @ComProperty(name = "CreationTime", dispId = 0x3007)
    java.util.Date getCreationTime();
            
    /**
     * <p>id(0xf01e)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0xf095)</p>
     */
    @ComProperty(name = "FormDescription", dispId = 0xf095)
    FormDescription getFormDescription();
            
    /**
     * <p>id(0xf03e)</p>
     */
    @ComProperty(name = "GetInspector", dispId = 0xf03e)
    _Inspector getGetInspector();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Importance", dispId = 0x17)
    OlImportance getImportance();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Importance", dispId = 0x17)
    void setImportance(OlImportance param0);
            
    /**
     * <p>id(0x3008)</p>
     */
    @ComProperty(name = "LastModificationTime", dispId = 0x3008)
    java.util.Date getLastModificationTime();
            
    /**
     * <p>id(0xf100)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    void setMessageClass(String param0);
            
    /**
     * <p>id(0x8534)</p>
     */
    @ComProperty(name = "Mileage", dispId = 0x8534)
    String getMileage();
            
    /**
     * <p>id(0x8534)</p>
     */
    @ComProperty(name = "Mileage", dispId = 0x8534)
    void setMileage(String param0);
            
    /**
     * <p>id(0x850e)</p>
     */
    @ComProperty(name = "NoAging", dispId = 0x850e)
    Boolean getNoAging();
            
    /**
     * <p>id(0x850e)</p>
     */
    @ComProperty(name = "NoAging", dispId = 0x850e)
    void setNoAging(Boolean param0);
            
    /**
     * <p>id(0x8552)</p>
     */
    @ComProperty(name = "OutlookInternalVersion", dispId = 0x8552)
    Integer getOutlookInternalVersion();
            
    /**
     * <p>id(0x8554)</p>
     */
    @ComProperty(name = "OutlookVersion", dispId = 0x8554)
    String getOutlookVersion();
            
    /**
     * <p>id(0xf0a3)</p>
     */
    @ComProperty(name = "Saved", dispId = 0xf0a3)
    Boolean getSaved();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "Sensitivity", dispId = 0x36)
    OlSensitivity getSensitivity();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "Sensitivity", dispId = 0x36)
    void setSensitivity(OlSensitivity param0);
            
    /**
     * <p>id(0xe08)</p>
     */
    @ComProperty(name = "Size", dispId = 0xe08)
    Integer getSize();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x37)
    String getSubject();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x37)
    void setSubject(String param0);
            
    /**
     * <p>id(0xf01c)</p>
     */
    @ComProperty(name = "UnRead", dispId = 0xf01c)
    Boolean getUnRead();
            
    /**
     * <p>id(0xf01c)</p>
     */
    @ComProperty(name = "UnRead", dispId = 0xf01c)
    void setUnRead(Boolean param0);
            
    /**
     * <p>id(0xf816)</p>
     */
    @ComProperty(name = "UserProperties", dispId = 0xf816)
    UserProperties getUserProperties();
            
    /**
     * <p>id(0xf023)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf023)
    void Close(OlInspectorClose SaveMode);
            
    /**
     * <p>id(0xf032)</p>
     */
    @ComMethod(name = "Copy", dispId = 0xf032)
    com.sun.jna.platform.win32.COM.util.IDispatch Copy();
            
    /**
     * <p>id(0xf04a)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf04a)
    void Delete();
            
    /**
     * <p>id(0xf0a6)</p>
     */
    @ComMethod(name = "Display", dispId = 0xf0a6)
    void Display(Object Modal);
            
    /**
     * <p>id(0xf034)</p>
     */
    @ComMethod(name = "Move", dispId = 0xf034)
    com.sun.jna.platform.win32.COM.util.IDispatch Move(MAPIFolder DestFldr);
            
    /**
     * <p>id(0xf033)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0xf033)
    void PrintOut();
            
    /**
     * <p>id(0xf048)</p>
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save();
            
    /**
     * <p>id(0xf051)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0xf051)
    void SaveAs(String Path,
            Object Type);
            
    /**
     * <p>id(0xfbef)</p>
     */
    @ComMethod(name = "Allow", dispId = 0xfbef)
    void Allow();
            
    /**
     * <p>id(0xfbfb)</p>
     */
    @ComMethod(name = "Deny", dispId = 0xfbfb)
    SharingItem Deny();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfbea)</p>
     */
    @ComProperty(name = "RemoteName", dispId = 0xfbea)
    String getRemoteName();
            
    /**
     * <p>id(0xfbeb)</p>
     */
    @ComProperty(name = "RemoteID", dispId = 0xfbeb)
    String getRemoteID();
            
    /**
     * <p>id(0xfbec)</p>
     */
    @ComProperty(name = "RemotePath", dispId = 0xfbec)
    String getRemotePath();
            
    /**
     * <p>id(0xfbee)</p>
     */
    @ComProperty(name = "SharingProviderGuid", dispId = 0xfbee)
    String getSharingProviderGuid();
            
    /**
     * <p>id(0xfbf2)</p>
     */
    @ComMethod(name = "OpenSharedFolder", dispId = 0xfbf2)
    MAPIFolder OpenSharedFolder();
            
    /**
     * <p>id(0xfbf5)</p>
     */
    @ComProperty(name = "SharingProvider", dispId = 0xfbf5)
    OlSharingProvider getSharingProvider();
            
    /**
     * <p>id(0xfbf8)</p>
     */
    @ComProperty(name = "AllowWriteAccess", dispId = 0xfbf8)
    Boolean getAllowWriteAccess();
            
    /**
     * <p>id(0xfbf8)</p>
     */
    @ComProperty(name = "AllowWriteAccess", dispId = 0xfbf8)
    void setAllowWriteAccess(Boolean param0);
            
    /**
     * <p>id(0xfbf9)</p>
     */
    @ComProperty(name = "Type", dispId = 0xfbf9)
    OlSharingMsgType getType();
            
    /**
     * <p>id(0xfbf9)</p>
     */
    @ComProperty(name = "Type", dispId = 0xfbf9)
    void setType(OlSharingMsgType param0);
            
    /**
     * <p>id(0xfbfa)</p>
     */
    @ComProperty(name = "RequestedFolder", dispId = 0xfbfa)
    OlDefaultFolders getRequestedFolder();
            
    /**
     * <p>id(0xfad1)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    Account getSendUsingAccount();
            
    /**
     * <p>id(0xfad1)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    void setSendUsingAccount(Account param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "AlternateRecipientAllowed", dispId = 0x2)
    Boolean getAlternateRecipientAllowed();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "AlternateRecipientAllowed", dispId = 0x2)
    void setAlternateRecipientAllowed(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "AutoForwarded", dispId = 0x5)
    Boolean getAutoForwarded();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "AutoForwarded", dispId = 0x5)
    void setAutoForwarded(Boolean param0);
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "BCC", dispId = 0xe02)
    String getBCC();
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "BCC", dispId = 0xe02)
    void setBCC(String param0);
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "CC", dispId = 0xe03)
    String getCC();
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "CC", dispId = 0xe03)
    void setCC(String param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "DeferredDeliveryTime", dispId = 0xf)
    java.util.Date getDeferredDeliveryTime();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "DeferredDeliveryTime", dispId = 0xf)
    void setDeferredDeliveryTime(java.util.Date param0);
            
    /**
     * <p>id(0xe01)</p>
     */
    @ComProperty(name = "DeleteAfterSubmit", dispId = 0xe01)
    Boolean getDeleteAfterSubmit();
            
    /**
     * <p>id(0xe01)</p>
     */
    @ComProperty(name = "DeleteAfterSubmit", dispId = 0xe01)
    void setDeleteAfterSubmit(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "ExpiryTime", dispId = 0x15)
    java.util.Date getExpiryTime();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "ExpiryTime", dispId = 0x15)
    void setExpiryTime(java.util.Date param0);
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "FlagDueBy", dispId = 0x30)
    java.util.Date getFlagDueBy();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "FlagDueBy", dispId = 0x30)
    void setFlagDueBy(java.util.Date param0);
            
    /**
     * <p>id(0x8530)</p>
     */
    @ComProperty(name = "FlagRequest", dispId = 0x8530)
    String getFlagRequest();
            
    /**
     * <p>id(0x8530)</p>
     */
    @ComProperty(name = "FlagRequest", dispId = 0x8530)
    void setFlagRequest(String param0);
            
    /**
     * <p>id(0x1090)</p>
     */
    @ComProperty(name = "FlagStatus", dispId = 0x1090)
    OlFlagStatus getFlagStatus();
            
    /**
     * <p>id(0x1090)</p>
     */
    @ComProperty(name = "FlagStatus", dispId = 0x1090)
    void setFlagStatus(OlFlagStatus param0);
            
    /**
     * <p>id(0xf404)</p>
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    String getHTMLBody();
            
    /**
     * <p>id(0xf404)</p>
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    void setHTMLBody(String param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "OriginatorDeliveryReportRequested", dispId = 0x23)
    Boolean getOriginatorDeliveryReportRequested();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "OriginatorDeliveryReportRequested", dispId = 0x23)
    void setOriginatorDeliveryReportRequested(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ReadReceiptRequested", dispId = 0x29)
    Boolean getReadReceiptRequested();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "ReadReceiptRequested", dispId = 0x29)
    void setReadReceiptRequested(Boolean param0);
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "ReceivedByEntryID", dispId = 0x3f)
    String getReceivedByEntryID();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "ReceivedByName", dispId = 0x40)
    String getReceivedByName();
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "ReceivedOnBehalfOfEntryID", dispId = 0x43)
    String getReceivedOnBehalfOfEntryID();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "ReceivedOnBehalfOfName", dispId = 0x44)
    String getReceivedOnBehalfOfName();
            
    /**
     * <p>id(0xe06)</p>
     */
    @ComProperty(name = "ReceivedTime", dispId = 0xe06)
    java.util.Date getReceivedTime();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "RecipientReassignmentProhibited", dispId = 0x2b)
    Boolean getRecipientReassignmentProhibited();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "RecipientReassignmentProhibited", dispId = 0x2b)
    void setRecipientReassignmentProhibited(Boolean param0);
            
    /**
     * <p>id(0xf814)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0x851c)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    Boolean getReminderOverrideDefault();
            
    /**
     * <p>id(0x851c)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    void setReminderOverrideDefault(Boolean param0);
            
    /**
     * <p>id(0x851e)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    Boolean getReminderPlaySound();
            
    /**
     * <p>id(0x851e)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    void setReminderPlaySound(Boolean param0);
            
    /**
     * <p>id(0x8503)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    Boolean getReminderSet();
            
    /**
     * <p>id(0x8503)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    void setReminderSet(Boolean param0);
            
    /**
     * <p>id(0x851f)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    String getReminderSoundFile();
            
    /**
     * <p>id(0x851f)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    void setReminderSoundFile(String param0);
            
    /**
     * <p>id(0x8502)</p>
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    java.util.Date getReminderTime();
            
    /**
     * <p>id(0x8502)</p>
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    void setReminderTime(java.util.Date param0);
            
    /**
     * <p>id(0x8511)</p>
     */
    @ComProperty(name = "RemoteStatus", dispId = 0x8511)
    OlRemoteStatus getRemoteStatus();
            
    /**
     * <p>id(0x8511)</p>
     */
    @ComProperty(name = "RemoteStatus", dispId = 0x8511)
    void setRemoteStatus(OlRemoteStatus param0);
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "ReplyRecipientNames", dispId = 0x50)
    String getReplyRecipientNames();
            
    /**
     * <p>id(0xf013)</p>
     */
    @ComProperty(name = "ReplyRecipients", dispId = 0xf013)
    Recipients getReplyRecipients();
            
    /**
     * <p>id(0xf401)</p>
     */
    @ComProperty(name = "SaveSentMessageFolder", dispId = 0xf401)
    MAPIFolder getSaveSentMessageFolder();
            
    /**
     * <p>id(0xf401)</p>
     */
    @ComProperty(name = "SaveSentMessageFolder", dispId = 0xf401)
    void setSaveSentMessageFolder(MAPIFolder param0);
            
    /**
     * <p>id(0xc1a)</p>
     */
    @ComProperty(name = "SenderName", dispId = 0xc1a)
    String getSenderName();
            
    /**
     * <p>id(0xf402)</p>
     */
    @ComProperty(name = "Sent", dispId = 0xf402)
    Boolean getSent();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "SentOn", dispId = 0x39)
    java.util.Date getSentOn();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "SentOnBehalfOfName", dispId = 0x42)
    String getSentOnBehalfOfName();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "SentOnBehalfOfName", dispId = 0x42)
    void setSentOnBehalfOfName(String param0);
            
    /**
     * <p>id(0xf403)</p>
     */
    @ComProperty(name = "Submitted", dispId = 0xf403)
    Boolean getSubmitted();
            
    /**
     * <p>id(0xe04)</p>
     */
    @ComProperty(name = "To", dispId = 0xe04)
    String getTo();
            
    /**
     * <p>id(0xe04)</p>
     */
    @ComProperty(name = "To", dispId = 0xe04)
    void setTo(String param0);
            
    /**
     * <p>id(0xf822)</p>
     */
    @ComMethod(name = "ClearConversationIndex", dispId = 0xf822)
    void ClearConversationIndex();
            
    /**
     * <p>id(0xf813)</p>
     */
    @ComMethod(name = "Forward", dispId = 0xf813)
    SharingItem Forward();
            
    /**
     * <p>id(0xf810)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xf810)
    MailItem Reply();
            
    /**
     * <p>id(0xf811)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xf811)
    MailItem ReplyAll();
            
    /**
     * <p>id(0xf075)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0xfa49)</p>
     */
    @ComProperty(name = "BodyFormat", dispId = 0xfa49)
    OlBodyFormat getBodyFormat();
            
    /**
     * <p>id(0xfa49)</p>
     */
    @ComProperty(name = "BodyFormat", dispId = 0xfa49)
    void setBodyFormat(OlBodyFormat param0);
            
    /**
     * <p>id(0xfa4d)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0x3fde)</p>
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    Integer getInternetCodepage();
            
    /**
     * <p>id(0x3fde)</p>
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    void setInternetCodepage(Integer param0);
            
    /**
     * <p>id(0x8571)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfb96)</p>
     */
    @ComMethod(name = "AddBusinessCard", dispId = 0xfb96)
    void AddBusinessCard(ContactItem contact);
            
    /**
     * <p>id(0xfc1f)</p>
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    String getTaskSubject();
            
    /**
     * <p>id(0xfc1f)</p>
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    void setTaskSubject(String param0);
            
    /**
     * <p>id(0x8105)</p>
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    java.util.Date getTaskDueDate();
            
    /**
     * <p>id(0x8105)</p>
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    void setTaskDueDate(java.util.Date param0);
            
    /**
     * <p>id(0x8104)</p>
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    java.util.Date getTaskStartDate();
            
    /**
     * <p>id(0x8104)</p>
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    void setTaskStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x810f)</p>
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    java.util.Date getTaskCompletedDate();
            
    /**
     * <p>id(0x810f)</p>
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    void setTaskCompletedDate(java.util.Date param0);
            
    /**
     * <p>id(0x85a0)</p>
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    java.util.Date getToDoTaskOrdinal();
            
    /**
     * <p>id(0x85a0)</p>
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    void setToDoTaskOrdinal(java.util.Date param0);
            
    /**
     * <p>id(0xfacc)</p>
     */
    @ComProperty(name = "FlagIcon", dispId = 0xfacc)
    OlFlagIcon getFlagIcon();
            
    /**
     * <p>id(0xfacc)</p>
     */
    @ComProperty(name = "FlagIcon", dispId = 0xfacc)
    void setFlagIcon(OlFlagIcon param0);
            
    /**
     * <p>id(0xfabb)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xc1f)</p>
     */
    @ComProperty(name = "SenderEmailAddress", dispId = 0xc1f)
    String getSenderEmailAddress();
            
    /**
     * <p>id(0xc1e)</p>
     */
    @ComProperty(name = "SenderEmailType", dispId = 0xc1e)
    String getSenderEmailType();
            
    /**
     * <p>id(0xfac4)</p>
     */
    @ComProperty(name = "EnableSharedAttachments", dispId = 0xfac4)
    Boolean getEnableSharedAttachments();
            
    /**
     * <p>id(0xfac4)</p>
     */
    @ComProperty(name = "EnableSharedAttachments", dispId = 0xfac4)
    void setEnableSharedAttachments(Boolean param0);
            
    /**
     * <p>id(0xfac6)</p>
     */
    @ComProperty(name = "Permission", dispId = 0xfac6)
    OlPermission getPermission();
            
    /**
     * <p>id(0xfac6)</p>
     */
    @ComProperty(name = "Permission", dispId = 0xfac6)
    void setPermission(OlPermission param0);
            
    /**
     * <p>id(0xfacb)</p>
     */
    @ComProperty(name = "PermissionService", dispId = 0xfacb)
    OlPermissionService getPermissionService();
            
    /**
     * <p>id(0xfacb)</p>
     */
    @ComProperty(name = "PermissionService", dispId = 0xfacb)
    void setPermissionService(OlPermissionService param0);
            
    /**
     * <p>id(0xfbfe)</p>
     */
    @ComMethod(name = "MarkAsTask", dispId = 0xfbfe)
    void MarkAsTask(OlMarkInterval MarkInterval);
            
    /**
     * <p>id(0xfc09)</p>
     */
    @ComMethod(name = "ClearTaskFlag", dispId = 0xfc09)
    void ClearTaskFlag();
            
    /**
     * <p>id(0xfc0a)</p>
     */
    @ComProperty(name = "IsMarkedAsTask", dispId = 0xfc0a)
    Boolean getIsMarkedAsTask();
            
    /**
     * <p>id(0xfc54)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    /**
     * <p>id(0xfc7d)</p>
     */
    @ComProperty(name = "PermissionTemplateGuid", dispId = 0xfc7d)
    String getPermissionTemplateGuid();
            
    /**
     * <p>id(0xfc7d)</p>
     */
    @ComProperty(name = "PermissionTemplateGuid", dispId = 0xfc7d)
    void setPermissionTemplateGuid(String param0);
            
    /**
     * <p>id(0xfc84)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    /**
     * <p>id(0xfc8b)</p>
     */
    @ComProperty(name = "RetentionPolicyName", dispId = 0xfc8b)
    String getRetentionPolicyName();
            
    /**
     * <p>id(0xfc8a)</p>
     */
    @ComProperty(name = "RetentionExpirationDate", dispId = 0xfc8a)
    java.util.Date getRetentionExpirationDate();
            
    
}