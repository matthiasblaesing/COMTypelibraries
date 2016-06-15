
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063035-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063035-0000-0000-C000-000000000046}")
public interface _TaskItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8110)</p>
     */
    @ComProperty(name = "ActualWork", dispId = 0x8110)
    Integer getActualWork();
            
    /**
     * <p>id(0x8110)</p>
     */
    @ComProperty(name = "ActualWork", dispId = 0x8110)
    void setActualWork(Integer param0);
            
    /**
     * <p>id(0x812b)</p>
     */
    @ComProperty(name = "CardData", dispId = 0x812b)
    String getCardData();
            
    /**
     * <p>id(0x812b)</p>
     */
    @ComProperty(name = "CardData", dispId = 0x812b)
    void setCardData(String param0);
            
    /**
     * <p>id(0x811c)</p>
     */
    @ComProperty(name = "Complete", dispId = 0x811c)
    Boolean getComplete();
            
    /**
     * <p>id(0x811c)</p>
     */
    @ComProperty(name = "Complete", dispId = 0x811c)
    void setComplete(Boolean param0);
            
    /**
     * <p>id(0x853a)</p>
     */
    @ComProperty(name = "Contacts", dispId = 0x853a)
    String getContacts();
            
    /**
     * <p>id(0x853a)</p>
     */
    @ComProperty(name = "Contacts", dispId = 0x853a)
    void setContacts(String param0);
            
    /**
     * <p>id(0x853c)</p>
     */
    @ComProperty(name = "ContactNames", dispId = 0x853c)
    String getContactNames();
            
    /**
     * <p>id(0x853c)</p>
     */
    @ComProperty(name = "ContactNames", dispId = 0x853c)
    void setContactNames(String param0);
            
    /**
     * <p>id(0x810f)</p>
     */
    @ComProperty(name = "DateCompleted", dispId = 0x810f)
    java.util.Date getDateCompleted();
            
    /**
     * <p>id(0x810f)</p>
     */
    @ComProperty(name = "DateCompleted", dispId = 0x810f)
    void setDateCompleted(java.util.Date param0);
            
    /**
     * <p>id(0x812a)</p>
     */
    @ComProperty(name = "DelegationState", dispId = 0x812a)
    OlTaskDelegationState getDelegationState();
            
    /**
     * <p>id(0x8121)</p>
     */
    @ComProperty(name = "Delegator", dispId = 0x8121)
    String getDelegator();
            
    /**
     * <p>id(0x8105)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x8105)
    java.util.Date getDueDate();
            
    /**
     * <p>id(0x8105)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x8105)
    void setDueDate(java.util.Date param0);
            
    /**
     * <p>id(0xf617)</p>
     */
    @ComProperty(name = "IsRecurring", dispId = 0xf617)
    Boolean getIsRecurring();
            
    /**
     * <p>id(0x8123)</p>
     */
    @ComProperty(name = "Ordinal", dispId = 0x8123)
    Integer getOrdinal();
            
    /**
     * <p>id(0x8123)</p>
     */
    @ComProperty(name = "Ordinal", dispId = 0x8123)
    void setOrdinal(Integer param0);
            
    /**
     * <p>id(0x811f)</p>
     */
    @ComProperty(name = "Owner", dispId = 0x811f)
    String getOwner();
            
    /**
     * <p>id(0x811f)</p>
     */
    @ComProperty(name = "Owner", dispId = 0x811f)
    void setOwner(String param0);
            
    /**
     * <p>id(0x8129)</p>
     */
    @ComProperty(name = "Ownership", dispId = 0x8129)
    OlTaskOwnership getOwnership();
            
    /**
     * <p>id(0xf61f)</p>
     */
    @ComProperty(name = "PercentComplete", dispId = 0xf61f)
    Integer getPercentComplete();
            
    /**
     * <p>id(0xf61f)</p>
     */
    @ComProperty(name = "PercentComplete", dispId = 0xf61f)
    void setPercentComplete(Integer param0);
            
    /**
     * <p>id(0xf814)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
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
     * <p>id(0xf623)</p>
     */
    @ComProperty(name = "ResponseState", dispId = 0xf623)
    OlTaskResponse getResponseState();
            
    /**
     * <p>id(0x8127)</p>
     */
    @ComProperty(name = "Role", dispId = 0x8127)
    String getRole();
            
    /**
     * <p>id(0x8127)</p>
     */
    @ComProperty(name = "Role", dispId = 0x8127)
    void setRole(String param0);
            
    /**
     * <p>id(0x812f)</p>
     */
    @ComProperty(name = "SchedulePlusPriority", dispId = 0x812f)
    String getSchedulePlusPriority();
            
    /**
     * <p>id(0x812f)</p>
     */
    @ComProperty(name = "SchedulePlusPriority", dispId = 0x812f)
    void setSchedulePlusPriority(String param0);
            
    /**
     * <p>id(0x8104)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0x8104)
    java.util.Date getStartDate();
            
    /**
     * <p>id(0x8104)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0x8104)
    void setStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x8101)</p>
     */
    @ComProperty(name = "Status", dispId = 0x8101)
    OlTaskStatus getStatus();
            
    /**
     * <p>id(0x8101)</p>
     */
    @ComProperty(name = "Status", dispId = 0x8101)
    void setStatus(OlTaskStatus param0);
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "StatusOnCompletionRecipients", dispId = 0xe02)
    String getStatusOnCompletionRecipients();
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "StatusOnCompletionRecipients", dispId = 0xe02)
    void setStatusOnCompletionRecipients(String param0);
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "StatusUpdateRecipients", dispId = 0xe03)
    String getStatusUpdateRecipients();
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "StatusUpdateRecipients", dispId = 0xe03)
    void setStatusUpdateRecipients(String param0);
            
    /**
     * <p>id(0x8103)</p>
     */
    @ComProperty(name = "TeamTask", dispId = 0x8103)
    Boolean getTeamTask();
            
    /**
     * <p>id(0x8103)</p>
     */
    @ComProperty(name = "TeamTask", dispId = 0x8103)
    void setTeamTask(Boolean param0);
            
    /**
     * <p>id(0x8111)</p>
     */
    @ComProperty(name = "TotalWork", dispId = 0x8111)
    Integer getTotalWork();
            
    /**
     * <p>id(0x8111)</p>
     */
    @ComProperty(name = "TotalWork", dispId = 0x8111)
    void setTotalWork(Integer param0);
            
    /**
     * <p>id(0xf620)</p>
     */
    @ComMethod(name = "Assign", dispId = 0xf620)
    TaskItem Assign();
            
    /**
     * <p>id(0xf622)</p>
     */
    @ComMethod(name = "CancelResponseState", dispId = 0xf622)
    void CancelResponseState();
            
    /**
     * <p>id(0xf0a5)</p>
     */
    @ComMethod(name = "ClearRecurrencePattern", dispId = 0xf0a5)
    void ClearRecurrencePattern();
            
    /**
     * <p>id(0xf0a4)</p>
     */
    @ComMethod(name = "GetRecurrencePattern", dispId = 0xf0a4)
    RecurrencePattern GetRecurrencePattern();
            
    /**
     * <p>id(0xf60d)</p>
     */
    @ComMethod(name = "MarkComplete", dispId = 0xf60d)
    void MarkComplete();
            
    /**
     * <p>id(0xf621)</p>
     */
    @ComMethod(name = "Respond", dispId = 0xf621)
    TaskItem Respond(OlTaskResponse Response,
            Object fNoUI,
            Object fAdditionalTextDialog);
            
    /**
     * <p>id(0xf075)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0xf624)</p>
     */
    @ComMethod(name = "SkipRecurrence", dispId = 0xf624)
    Boolean SkipRecurrence();
            
    /**
     * <p>id(0xf612)</p>
     */
    @ComMethod(name = "StatusReport", dispId = 0xf612)
    com.sun.jna.platform.win32.COM.util.IDispatch StatusReport();
            
    /**
     * <p>id(0xf405)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
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
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
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
     * <p>id(0xfaba)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
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
     * <p>id(0xfc84)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    
}