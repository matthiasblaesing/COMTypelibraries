
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
     * <p>id(0x9100)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Body", dispId = 0x9100)
    String getBody();
            
    /**
     * <p>id(0x9100)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Body", dispId = 0x9100)
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
     * <p>id(0xe08)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "Size", dispId = 0xe08)
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
     * <p>id(0xfbef)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "Allow", dispId = 0xfbef)
    void Allow();
            
    /**
     * <p>id(0xfbfb)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "Deny", dispId = 0xfbfb)
    SharingItem Deny();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfbea)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "RemoteName", dispId = 0xfbea)
    String getRemoteName();
            
    /**
     * <p>id(0xfbeb)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "RemoteID", dispId = 0xfbeb)
    String getRemoteID();
            
    /**
     * <p>id(0xfbec)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "RemotePath", dispId = 0xfbec)
    String getRemotePath();
            
    /**
     * <p>id(0xfbee)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "SharingProviderGuid", dispId = 0xfbee)
    String getSharingProviderGuid();
            
    /**
     * <p>id(0xfbf2)</p>
     * <p>vtableId(63)</p>
     */
    @ComMethod(name = "OpenSharedFolder", dispId = 0xfbf2)
    MAPIFolder OpenSharedFolder();
            
    /**
     * <p>id(0xfbf5)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "SharingProvider", dispId = 0xfbf5)
    OlSharingProvider getSharingProvider();
            
    /**
     * <p>id(0xfbf8)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "AllowWriteAccess", dispId = 0xfbf8)
    Boolean getAllowWriteAccess();
            
    /**
     * <p>id(0xfbf8)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowWriteAccess", dispId = 0xfbf8)
    void setAllowWriteAccess(Boolean param0);
            
    /**
     * <p>id(0xfbf9)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Type", dispId = 0xfbf9)
    OlSharingMsgType getType();
            
    /**
     * <p>id(0xfbf9)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code OlSharingMsgType}
     */
    @ComProperty(name = "Type", dispId = 0xfbf9)
    void setType(OlSharingMsgType param0);
            
    /**
     * <p>id(0xfbfa)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "RequestedFolder", dispId = 0xfbfa)
    OlDefaultFolders getRequestedFolder();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    Account getSendUsingAccount();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Account}
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    void setSendUsingAccount(Account param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "AlternateRecipientAllowed", dispId = 0x2)
    Boolean getAlternateRecipientAllowed();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlternateRecipientAllowed", dispId = 0x2)
    void setAlternateRecipientAllowed(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "AutoForwarded", dispId = 0x5)
    Boolean getAutoForwarded();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoForwarded", dispId = 0x5)
    void setAutoForwarded(Boolean param0);
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "BCC", dispId = 0xe02)
    String getBCC();
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BCC", dispId = 0xe02)
    void setBCC(String param0);
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "CC", dispId = 0xe03)
    String getCC();
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CC", dispId = 0xe03)
    void setCC(String param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "DeferredDeliveryTime", dispId = 0xf)
    java.util.Date getDeferredDeliveryTime();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "DeferredDeliveryTime", dispId = 0xf)
    void setDeferredDeliveryTime(java.util.Date param0);
            
    /**
     * <p>id(0xe01)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "DeleteAfterSubmit", dispId = 0xe01)
    Boolean getDeleteAfterSubmit();
            
    /**
     * <p>id(0xe01)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DeleteAfterSubmit", dispId = 0xe01)
    void setDeleteAfterSubmit(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "ExpiryTime", dispId = 0x15)
    java.util.Date getExpiryTime();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ExpiryTime", dispId = 0x15)
    void setExpiryTime(java.util.Date param0);
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "FlagDueBy", dispId = 0x30)
    java.util.Date getFlagDueBy();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "FlagDueBy", dispId = 0x30)
    void setFlagDueBy(java.util.Date param0);
            
    /**
     * <p>id(0x8530)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "FlagRequest", dispId = 0x8530)
    String getFlagRequest();
            
    /**
     * <p>id(0x8530)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FlagRequest", dispId = 0x8530)
    void setFlagRequest(String param0);
            
    /**
     * <p>id(0x1090)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "FlagStatus", dispId = 0x1090)
    OlFlagStatus getFlagStatus();
            
    /**
     * <p>id(0x1090)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code OlFlagStatus}
     */
    @ComProperty(name = "FlagStatus", dispId = 0x1090)
    void setFlagStatus(OlFlagStatus param0);
            
    /**
     * <p>id(0xf404)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    String getHTMLBody();
            
    /**
     * <p>id(0xf404)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HTMLBody", dispId = 0xf404)
    void setHTMLBody(String param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "OriginatorDeliveryReportRequested", dispId = 0x23)
    Boolean getOriginatorDeliveryReportRequested();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OriginatorDeliveryReportRequested", dispId = 0x23)
    void setOriginatorDeliveryReportRequested(Boolean param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "ReadReceiptRequested", dispId = 0x29)
    Boolean getReadReceiptRequested();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReadReceiptRequested", dispId = 0x29)
    void setReadReceiptRequested(Boolean param0);
            
    /**
     * <p>id(0x3f)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "ReceivedByEntryID", dispId = 0x3f)
    String getReceivedByEntryID();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "ReceivedByName", dispId = 0x40)
    String getReceivedByName();
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "ReceivedOnBehalfOfEntryID", dispId = 0x43)
    String getReceivedOnBehalfOfEntryID();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "ReceivedOnBehalfOfName", dispId = 0x44)
    String getReceivedOnBehalfOfName();
            
    /**
     * <p>id(0xe06)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "ReceivedTime", dispId = 0xe06)
    java.util.Date getReceivedTime();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "RecipientReassignmentProhibited", dispId = 0x2b)
    Boolean getRecipientReassignmentProhibited();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RecipientReassignmentProhibited", dispId = 0x2b)
    void setRecipientReassignmentProhibited(Boolean param0);
            
    /**
     * <p>id(0xf814)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    Boolean getReminderOverrideDefault();
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    void setReminderOverrideDefault(Boolean param0);
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    Boolean getReminderPlaySound();
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(109)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    void setReminderPlaySound(Boolean param0);
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    Boolean getReminderSet();
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    void setReminderSet(Boolean param0);
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    String getReminderSoundFile();
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    void setReminderSoundFile(String param0);
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    java.util.Date getReminderTime();
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    void setReminderTime(java.util.Date param0);
            
    /**
     * <p>id(0x8511)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "RemoteStatus", dispId = 0x8511)
    OlRemoteStatus getRemoteStatus();
            
    /**
     * <p>id(0x8511)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "RemoteStatus", dispId = 0x8511)
    void setRemoteStatus(OlRemoteStatus param0);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "ReplyRecipientNames", dispId = 0x50)
    String getReplyRecipientNames();
            
    /**
     * <p>id(0xf013)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "ReplyRecipients", dispId = 0xf013)
    Recipients getReplyRecipients();
            
    /**
     * <p>id(0xf401)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "SaveSentMessageFolder", dispId = 0xf401)
    MAPIFolder getSaveSentMessageFolder();
            
    /**
     * <p>id(0xc1a)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "SenderName", dispId = 0xc1a)
    String getSenderName();
            
    /**
     * <p>id(0xf402)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "Sent", dispId = 0xf402)
    Boolean getSent();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "SentOn", dispId = 0x39)
    java.util.Date getSentOn();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "SentOnBehalfOfName", dispId = 0x42)
    String getSentOnBehalfOfName();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SentOnBehalfOfName", dispId = 0x42)
    void setSentOnBehalfOfName(String param0);
            
    /**
     * <p>id(0xf403)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "Submitted", dispId = 0xf403)
    Boolean getSubmitted();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "To", dispId = 0xe04)
    String getTo();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(129)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "To", dispId = 0xe04)
    void setTo(String param0);
            
    /**
     * <p>id(0xf822)</p>
     * <p>vtableId(130)</p>
     */
    @ComMethod(name = "ClearConversationIndex", dispId = 0xf822)
    void ClearConversationIndex();
            
    /**
     * <p>id(0xf813)</p>
     * <p>vtableId(131)</p>
     */
    @ComMethod(name = "Forward", dispId = 0xf813)
    SharingItem Forward();
            
    /**
     * <p>id(0xf810)</p>
     * <p>vtableId(132)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xf810)
    MailItem Reply();
            
    /**
     * <p>id(0xf811)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xf811)
    MailItem ReplyAll();
            
    /**
     * <p>id(0xf075)</p>
     * <p>vtableId(134)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0xfa49)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "BodyFormat", dispId = 0xfa49)
    OlBodyFormat getBodyFormat();
            
    /**
     * <p>id(0xfa49)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code OlBodyFormat}
     */
    @ComProperty(name = "BodyFormat", dispId = 0xfa49)
    void setBodyFormat(OlBodyFormat param0);
            
    /**
     * <p>id(0xfa4d)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     * <p>vtableId(139)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    Integer getInternetCodepage();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    void setInternetCodepage(Integer param0);
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfb96)</p>
     * <p>vtableId(145)</p>
     * @param contact [in] {@code ContactItem}
     */
    @ComMethod(name = "AddBusinessCard", dispId = 0xfb96)
    void AddBusinessCard(ContactItem contact);
            
    /**
     * <p>id(0xfc1f)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    String getTaskSubject();
            
    /**
     * <p>id(0xfc1f)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    void setTaskSubject(String param0);
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    java.util.Date getTaskDueDate();
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    void setTaskDueDate(java.util.Date param0);
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    java.util.Date getTaskStartDate();
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    void setTaskStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    java.util.Date getTaskCompletedDate();
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    void setTaskCompletedDate(java.util.Date param0);
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(154)</p>
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    java.util.Date getToDoTaskOrdinal();
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(155)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    void setToDoTaskOrdinal(java.util.Date param0);
            
    /**
     * <p>id(0xfacc)</p>
     * <p>vtableId(156)</p>
     */
    @ComProperty(name = "FlagIcon", dispId = 0xfacc)
    OlFlagIcon getFlagIcon();
            
    /**
     * <p>id(0xfacc)</p>
     * <p>vtableId(157)</p>
     * @param param0 [in] {@code OlFlagIcon}
     */
    @ComProperty(name = "FlagIcon", dispId = 0xfacc)
    void setFlagIcon(OlFlagIcon param0);
            
    /**
     * <p>id(0xfabb)</p>
     * <p>vtableId(158)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xc1f)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "SenderEmailAddress", dispId = 0xc1f)
    String getSenderEmailAddress();
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(160)</p>
     */
    @ComProperty(name = "SenderEmailType", dispId = 0xc1e)
    String getSenderEmailType();
            
    /**
     * <p>id(0xfac4)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "EnableSharedAttachments", dispId = 0xfac4)
    Boolean getEnableSharedAttachments();
            
    /**
     * <p>id(0xfac4)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableSharedAttachments", dispId = 0xfac4)
    void setEnableSharedAttachments(Boolean param0);
            
    /**
     * <p>id(0xfac6)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "Permission", dispId = 0xfac6)
    OlPermission getPermission();
            
    /**
     * <p>id(0xfac6)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code OlPermission}
     */
    @ComProperty(name = "Permission", dispId = 0xfac6)
    void setPermission(OlPermission param0);
            
    /**
     * <p>id(0xfacb)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "PermissionService", dispId = 0xfacb)
    OlPermissionService getPermissionService();
            
    /**
     * <p>id(0xfacb)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code OlPermissionService}
     */
    @ComProperty(name = "PermissionService", dispId = 0xfacb)
    void setPermissionService(OlPermissionService param0);
            
    /**
     * <p>id(0xfbfe)</p>
     * <p>vtableId(167)</p>
     * @param MarkInterval [in] {@code OlMarkInterval}
     */
    @ComMethod(name = "MarkAsTask", dispId = 0xfbfe)
    void MarkAsTask(OlMarkInterval MarkInterval);
            
    /**
     * <p>id(0xfc09)</p>
     * <p>vtableId(168)</p>
     */
    @ComMethod(name = "ClearTaskFlag", dispId = 0xfc09)
    void ClearTaskFlag();
            
    /**
     * <p>id(0xfc0a)</p>
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "IsMarkedAsTask", dispId = 0xfc0a)
    Boolean getIsMarkedAsTask();
            
    /**
     * <p>id(0xfc54)</p>
     * <p>vtableId(170)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    /**
     * <p>id(0xfc7d)</p>
     * <p>vtableId(172)</p>
     */
    @ComProperty(name = "PermissionTemplateGuid", dispId = 0xfc7d)
    String getPermissionTemplateGuid();
            
    /**
     * <p>id(0xfc7d)</p>
     * <p>vtableId(173)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PermissionTemplateGuid", dispId = 0xfc7d)
    void setPermissionTemplateGuid(String param0);
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(174)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(175)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    /**
     * <p>id(0xfc8b)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "RetentionPolicyName", dispId = 0xfc8b)
    String getRetentionPolicyName();
            
    /**
     * <p>id(0xfc8a)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "RetentionExpirationDate", dispId = 0xfc8a)
    java.util.Date getRetentionExpirationDate();
            
    
}