
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
     * <p>id(0x8110)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "ActualWork", dispId = 0x8110)
    Integer getActualWork();
            
    /**
     * <p>id(0x8110)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ActualWork", dispId = 0x8110)
    void setActualWork(Integer param0);
            
    /**
     * <p>id(0x812b)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "CardData", dispId = 0x812b)
    String getCardData();
            
    /**
     * <p>id(0x812b)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CardData", dispId = 0x812b)
    void setCardData(String param0);
            
    /**
     * <p>id(0x811c)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Complete", dispId = 0x811c)
    Boolean getComplete();
            
    /**
     * <p>id(0x811c)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Complete", dispId = 0x811c)
    void setComplete(Boolean param0);
            
    /**
     * <p>id(0x853a)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Contacts", dispId = 0x853a)
    String getContacts();
            
    /**
     * <p>id(0x853a)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Contacts", dispId = 0x853a)
    void setContacts(String param0);
            
    /**
     * <p>id(0x853c)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "ContactNames", dispId = 0x853c)
    String getContactNames();
            
    /**
     * <p>id(0x853c)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ContactNames", dispId = 0x853c)
    void setContactNames(String param0);
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "DateCompleted", dispId = 0x810f)
    java.util.Date getDateCompleted();
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "DateCompleted", dispId = 0x810f)
    void setDateCompleted(java.util.Date param0);
            
    /**
     * <p>id(0x812a)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "DelegationState", dispId = 0x812a)
    OlTaskDelegationState getDelegationState();
            
    /**
     * <p>id(0x8121)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Delegator", dispId = 0x8121)
    String getDelegator();
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x8105)
    java.util.Date getDueDate();
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "DueDate", dispId = 0x8105)
    void setDueDate(java.util.Date param0);
            
    /**
     * <p>id(0xf617)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "IsRecurring", dispId = 0xf617)
    Boolean getIsRecurring();
            
    /**
     * <p>id(0x8123)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "Ordinal", dispId = 0x8123)
    Integer getOrdinal();
            
    /**
     * <p>id(0x8123)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Ordinal", dispId = 0x8123)
    void setOrdinal(Integer param0);
            
    /**
     * <p>id(0x811f)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Owner", dispId = 0x811f)
    String getOwner();
            
    /**
     * <p>id(0x811f)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Owner", dispId = 0x811f)
    void setOwner(String param0);
            
    /**
     * <p>id(0x8129)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Ownership", dispId = 0x8129)
    OlTaskOwnership getOwnership();
            
    /**
     * <p>id(0xf61f)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "PercentComplete", dispId = 0xf61f)
    Integer getPercentComplete();
            
    /**
     * <p>id(0xf61f)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PercentComplete", dispId = 0xf61f)
    void setPercentComplete(Integer param0);
            
    /**
     * <p>id(0xf814)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    java.util.Date getReminderTime();
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(82)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    void setReminderTime(java.util.Date param0);
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    Boolean getReminderOverrideDefault();
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    void setReminderOverrideDefault(Boolean param0);
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    Boolean getReminderPlaySound();
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    void setReminderPlaySound(Boolean param0);
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    Boolean getReminderSet();
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    void setReminderSet(Boolean param0);
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    String getReminderSoundFile();
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    void setReminderSoundFile(String param0);
            
    /**
     * <p>id(0xf623)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "ResponseState", dispId = 0xf623)
    OlTaskResponse getResponseState();
            
    /**
     * <p>id(0x8127)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "Role", dispId = 0x8127)
    String getRole();
            
    /**
     * <p>id(0x8127)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Role", dispId = 0x8127)
    void setRole(String param0);
            
    /**
     * <p>id(0x812f)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "SchedulePlusPriority", dispId = 0x812f)
    String getSchedulePlusPriority();
            
    /**
     * <p>id(0x812f)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SchedulePlusPriority", dispId = 0x812f)
    void setSchedulePlusPriority(String param0);
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0x8104)
    java.util.Date getStartDate();
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "StartDate", dispId = 0x8104)
    void setStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x8101)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "Status", dispId = 0x8101)
    OlTaskStatus getStatus();
            
    /**
     * <p>id(0x8101)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code OlTaskStatus}
     */
    @ComProperty(name = "Status", dispId = 0x8101)
    void setStatus(OlTaskStatus param0);
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "StatusOnCompletionRecipients", dispId = 0xe02)
    String getStatusOnCompletionRecipients();
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusOnCompletionRecipients", dispId = 0xe02)
    void setStatusOnCompletionRecipients(String param0);
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "StatusUpdateRecipients", dispId = 0xe03)
    String getStatusUpdateRecipients();
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(103)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusUpdateRecipients", dispId = 0xe03)
    void setStatusUpdateRecipients(String param0);
            
    /**
     * <p>id(0x8103)</p>
     * <p>vtableId(104)</p>
     */
    @ComProperty(name = "TeamTask", dispId = 0x8103)
    Boolean getTeamTask();
            
    /**
     * <p>id(0x8103)</p>
     * <p>vtableId(105)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TeamTask", dispId = 0x8103)
    void setTeamTask(Boolean param0);
            
    /**
     * <p>id(0x8111)</p>
     * <p>vtableId(106)</p>
     */
    @ComProperty(name = "TotalWork", dispId = 0x8111)
    Integer getTotalWork();
            
    /**
     * <p>id(0x8111)</p>
     * <p>vtableId(107)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TotalWork", dispId = 0x8111)
    void setTotalWork(Integer param0);
            
    /**
     * <p>id(0xf620)</p>
     * <p>vtableId(108)</p>
     */
    @ComMethod(name = "Assign", dispId = 0xf620)
    TaskItem Assign();
            
    /**
     * <p>id(0xf622)</p>
     * <p>vtableId(109)</p>
     */
    @ComMethod(name = "CancelResponseState", dispId = 0xf622)
    void CancelResponseState();
            
    /**
     * <p>id(0xf0a5)</p>
     * <p>vtableId(110)</p>
     */
    @ComMethod(name = "ClearRecurrencePattern", dispId = 0xf0a5)
    void ClearRecurrencePattern();
            
    /**
     * <p>id(0xf0a4)</p>
     * <p>vtableId(111)</p>
     */
    @ComMethod(name = "GetRecurrencePattern", dispId = 0xf0a4)
    RecurrencePattern GetRecurrencePattern();
            
    /**
     * <p>id(0xf60d)</p>
     * <p>vtableId(112)</p>
     */
    @ComMethod(name = "MarkComplete", dispId = 0xf60d)
    void MarkComplete();
            
    /**
     * <p>id(0xf621)</p>
     * <p>vtableId(113)</p>
     * @param Response [in] {@code OlTaskResponse}
     * @param fNoUI [in] {@code Object}
     * @param fAdditionalTextDialog [in] {@code Object}
     */
    @ComMethod(name = "Respond", dispId = 0xf621)
    TaskItem Respond(OlTaskResponse Response,
            Object fNoUI,
            Object fAdditionalTextDialog);
            
    /**
     * <p>id(0xf075)</p>
     * <p>vtableId(114)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0xf624)</p>
     * <p>vtableId(115)</p>
     */
    @ComMethod(name = "SkipRecurrence", dispId = 0xf624)
    Boolean SkipRecurrence();
            
    /**
     * <p>id(0xf612)</p>
     * <p>vtableId(116)</p>
     */
    @ComMethod(name = "StatusReport", dispId = 0xf612)
    com.sun.jna.platform.win32.COM.util.IDispatch StatusReport();
            
    /**
     * <p>id(0xf405)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0xfa4d)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     * <p>vtableId(119)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    Integer getInternetCodepage();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    void setInternetCodepage(Integer param0);
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfaba)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    Account getSendUsingAccount();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Account}
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    void setSendUsingAccount(Account param0);
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    java.util.Date getToDoTaskOrdinal();
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    void setToDoTaskOrdinal(java.util.Date param0);
            
    /**
     * <p>id(0xfc54)</p>
     * <p>vtableId(133)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    
}