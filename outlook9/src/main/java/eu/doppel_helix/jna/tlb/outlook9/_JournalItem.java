
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063022-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063022-0000-0000-C000-000000000046}")
public interface _JournalItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xe04)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "ContactNames", dispId = 0xe04)
    String getContactNames();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ContactNames", dispId = 0xe04)
    void setContactNames(String param0);
            
    /**
     * <p>id(0x8711)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "DocPosted", dispId = 0x8711)
    Boolean getDocPosted();
            
    /**
     * <p>id(0x8711)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DocPosted", dispId = 0x8711)
    void setDocPosted(Boolean param0);
            
    /**
     * <p>id(0x870e)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "DocPrinted", dispId = 0x870e)
    Boolean getDocPrinted();
            
    /**
     * <p>id(0x870e)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DocPrinted", dispId = 0x870e)
    void setDocPrinted(Boolean param0);
            
    /**
     * <p>id(0x8710)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "DocRouted", dispId = 0x8710)
    Boolean getDocRouted();
            
    /**
     * <p>id(0x8710)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DocRouted", dispId = 0x8710)
    void setDocRouted(Boolean param0);
            
    /**
     * <p>id(0x870f)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "DocSaved", dispId = 0x870f)
    Boolean getDocSaved();
            
    /**
     * <p>id(0x870f)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DocSaved", dispId = 0x870f)
    void setDocSaved(Boolean param0);
            
    /**
     * <p>id(0x8707)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Duration", dispId = 0x8707)
    Integer getDuration();
            
    /**
     * <p>id(0x8707)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Duration", dispId = 0x8707)
    void setDuration(Integer param0);
            
    /**
     * <p>id(0x8708)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "End", dispId = 0x8708)
    java.util.Date getEnd();
            
    /**
     * <p>id(0x8708)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "End", dispId = 0x8708)
    void setEnd(java.util.Date param0);
            
    /**
     * <p>id(0x8700)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "Type", dispId = 0x8700)
    String getType();
            
    /**
     * <p>id(0x8700)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Type", dispId = 0x8700)
    void setType(String param0);
            
    /**
     * <p>id(0xf814)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0x8706)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Start", dispId = 0x8706)
    java.util.Date getStart();
            
    /**
     * <p>id(0x8706)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "Start", dispId = 0x8706)
    void setStart(java.util.Date param0);
            
    /**
     * <p>id(0xf813)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "Forward", dispId = 0xf813)
    MailItem Forward();
            
    /**
     * <p>id(0xf810)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "Reply", dispId = 0xf810)
    MailItem Reply();
            
    /**
     * <p>id(0xf811)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0xf811)
    MailItem ReplyAll();
            
    /**
     * <p>id(0xf725)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "StartTimer", dispId = 0xf725)
    void StartTimer();
            
    /**
     * <p>id(0xf726)</p>
     * <p>vtableId(79)</p>
     */
    @ComMethod(name = "StopTimer", dispId = 0xf726)
    void StopTimer();
            
    /**
     * <p>id(0xf405)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0xfa4d)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfaba)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfc54)</p>
     * <p>vtableId(90)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    
}