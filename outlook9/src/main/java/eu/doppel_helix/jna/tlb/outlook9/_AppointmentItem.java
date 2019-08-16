
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063033-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063033-0000-0000-C000-000000000046}")
public interface _AppointmentItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8215)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "AllDayEvent", dispId = 0x8215)
    Boolean getAllDayEvent();
            
    /**
     * <p>id(0x8215)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllDayEvent", dispId = 0x8215)
    void setAllDayEvent(Boolean param0);
            
    /**
     * <p>id(0x8205)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "BusyStatus", dispId = 0x8205)
    OlBusyStatus getBusyStatus();
            
    /**
     * <p>id(0x8205)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code OlBusyStatus}
     */
    @ComProperty(name = "BusyStatus", dispId = 0x8205)
    void setBusyStatus(OlBusyStatus param0);
            
    /**
     * <p>id(0x8213)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "Duration", dispId = 0x8213)
    Integer getDuration();
            
    /**
     * <p>id(0x8213)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Duration", dispId = 0x8213)
    void setDuration(Integer param0);
            
    /**
     * <p>id(0x820e)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "End", dispId = 0x820e)
    java.util.Date getEnd();
            
    /**
     * <p>id(0x820e)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "End", dispId = 0x820e)
    void setEnd(java.util.Date param0);
            
    /**
     * <p>id(0x8240)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "IsOnlineMeeting", dispId = 0x8240)
    Boolean getIsOnlineMeeting();
            
    /**
     * <p>id(0x8240)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsOnlineMeeting", dispId = 0x8240)
    void setIsOnlineMeeting(Boolean param0);
            
    /**
     * <p>id(0x8223)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "IsRecurring", dispId = 0x8223)
    Boolean getIsRecurring();
            
    /**
     * <p>id(0x8208)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Location", dispId = 0x8208)
    String getLocation();
            
    /**
     * <p>id(0x8208)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Location", dispId = 0x8208)
    void setLocation(String param0);
            
    /**
     * <p>id(0x8217)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "MeetingStatus", dispId = 0x8217)
    OlMeetingStatus getMeetingStatus();
            
    /**
     * <p>id(0x8217)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code OlMeetingStatus}
     */
    @ComProperty(name = "MeetingStatus", dispId = 0x8217)
    void setMeetingStatus(OlMeetingStatus param0);
            
    /**
     * <p>id(0x8244)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "NetMeetingAutoStart", dispId = 0x8244)
    Boolean getNetMeetingAutoStart();
            
    /**
     * <p>id(0x8244)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NetMeetingAutoStart", dispId = 0x8244)
    void setNetMeetingAutoStart(Boolean param0);
            
    /**
     * <p>id(0x8243)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "NetMeetingOrganizerAlias", dispId = 0x8243)
    String getNetMeetingOrganizerAlias();
            
    /**
     * <p>id(0x8243)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetMeetingOrganizerAlias", dispId = 0x8243)
    void setNetMeetingOrganizerAlias(String param0);
            
    /**
     * <p>id(0x8242)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8242)
    String getNetMeetingServer();
            
    /**
     * <p>id(0x8242)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8242)
    void setNetMeetingServer(String param0);
            
    /**
     * <p>id(0x8241)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "NetMeetingType", dispId = 0x8241)
    OlNetMeetingType getNetMeetingType();
            
    /**
     * <p>id(0x8241)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code OlNetMeetingType}
     */
    @ComProperty(name = "NetMeetingType", dispId = 0x8241)
    void setNetMeetingType(OlNetMeetingType param0);
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "OptionalAttendees", dispId = 0xe03)
    String getOptionalAttendees();
            
    /**
     * <p>id(0xe03)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OptionalAttendees", dispId = 0xe03)
    void setOptionalAttendees(String param0);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "Organizer", dispId = 0x42)
    String getOrganizer();
            
    /**
     * <p>id(0xf814)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0xf545)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "RecurrenceState", dispId = 0xf545)
    OlRecurrenceState getRecurrenceState();
            
    /**
     * <p>id(0x8501)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "ReminderMinutesBeforeStart", dispId = 0x8501)
    Integer getReminderMinutesBeforeStart();
            
    /**
     * <p>id(0x8501)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReminderMinutesBeforeStart", dispId = 0x8501)
    void setReminderMinutesBeforeStart(Integer param0);
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    Boolean getReminderOverrideDefault();
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    void setReminderOverrideDefault(Boolean param0);
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    Boolean getReminderPlaySound();
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    void setReminderPlaySound(Boolean param0);
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    Boolean getReminderSet();
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    void setReminderSet(Boolean param0);
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    String getReminderSoundFile();
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    void setReminderSoundFile(String param0);
            
    /**
     * <p>id(0x8220)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "ReplyTime", dispId = 0x8220)
    java.util.Date getReplyTime();
            
    /**
     * <p>id(0x8220)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ReplyTime", dispId = 0x8220)
    void setReplyTime(java.util.Date param0);
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "RequiredAttendees", dispId = 0xe04)
    String getRequiredAttendees();
            
    /**
     * <p>id(0xe04)</p>
     * <p>vtableId(97)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RequiredAttendees", dispId = 0xe04)
    void setRequiredAttendees(String param0);
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "Resources", dispId = 0xe02)
    String getResources();
            
    /**
     * <p>id(0xe02)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Resources", dispId = 0xe02)
    void setResources(String param0);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "ResponseRequested", dispId = 0x63)
    Boolean getResponseRequested();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ResponseRequested", dispId = 0x63)
    void setResponseRequested(Boolean param0);
            
    /**
     * <p>id(0x8218)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "ResponseStatus", dispId = 0x8218)
    OlResponseStatus getResponseStatus();
            
    /**
     * <p>id(0x820d)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "Start", dispId = 0x820d)
    java.util.Date getStart();
            
    /**
     * <p>id(0x820d)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "Start", dispId = 0x820d)
    void setStart(java.util.Date param0);
            
    /**
     * <p>id(0xf0a5)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "ClearRecurrencePattern", dispId = 0xf0a5)
    void ClearRecurrencePattern();
            
    /**
     * <p>id(0xf547)</p>
     * <p>vtableId(106)</p>
     */
    @ComMethod(name = "ForwardAsVcal", dispId = 0xf547)
    MailItem ForwardAsVcal();
            
    /**
     * <p>id(0xf0a4)</p>
     * <p>vtableId(107)</p>
     */
    @ComMethod(name = "GetRecurrencePattern", dispId = 0xf0a4)
    RecurrencePattern GetRecurrencePattern();
            
    /**
     * <p>id(0xf502)</p>
     * <p>vtableId(108)</p>
     * @param Response [in] {@code OlMeetingResponse}
     * @param fNoUI [in, optional] {@code Object}
     * @param fAdditionalTextDialog [in, optional] {@code Object}
     */
    @ComMethod(name = "Respond", dispId = 0xf502)
    MeetingItem Respond(OlMeetingResponse Response,
            Object fNoUI,
            Object fAdditionalTextDialog);
            
    /**
     * <p>id(0xf075)</p>
     * <p>vtableId(109)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0x8247)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "NetMeetingDocPathName", dispId = 0x8247)
    String getNetMeetingDocPathName();
            
    /**
     * <p>id(0x8247)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetMeetingDocPathName", dispId = 0x8247)
    void setNetMeetingDocPathName(String param0);
            
    /**
     * <p>id(0x8248)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "NetShowURL", dispId = 0x8248)
    String getNetShowURL();
            
    /**
     * <p>id(0x8248)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetShowURL", dispId = 0x8248)
    void setNetShowURL(String param0);
            
    /**
     * <p>id(0xf405)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0x8246)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "ConferenceServerAllowExternal", dispId = 0x8246)
    Boolean getConferenceServerAllowExternal();
            
    /**
     * <p>id(0x8246)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ConferenceServerAllowExternal", dispId = 0x8246)
    void setConferenceServerAllowExternal(Boolean param0);
            
    /**
     * <p>id(0x8249)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "ConferenceServerPassword", dispId = 0x8249)
    String getConferenceServerPassword();
            
    /**
     * <p>id(0x8249)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ConferenceServerPassword", dispId = 0x8249)
    void setConferenceServerPassword(String param0);
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0xfa4d)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     * <p>vtableId(121)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    Integer getInternetCodepage();
            
    /**
     * <p>id(0x3fde)</p>
     * <p>vtableId(123)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InternetCodepage", dispId = 0x3fde)
    void setInternetCodepage(Integer param0);
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(125)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0xfaa4)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0x8209)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "MeetingWorkspaceURL", dispId = 0x8209)
    String getMeetingWorkspaceURL();
            
    /**
     * <p>id(0xfaba)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    Account getSendUsingAccount();
            
    /**
     * <p>id(0xfad1)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code Account}
     */
    @ComProperty(name = "SendUsingAccount", dispId = 0xfad1)
    void setSendUsingAccount(Account param0);
            
    /**
     * <p>id(0xfbfd)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "GlobalAppointmentID", dispId = 0xfbfd)
    String getGlobalAppointmentID();
            
    /**
     * <p>id(0xf53a)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "ForceUpdateToAllAttendees", dispId = 0xf53a)
    Boolean getForceUpdateToAllAttendees();
            
    /**
     * <p>id(0xf53a)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ForceUpdateToAllAttendees", dispId = 0xf53a)
    void setForceUpdateToAllAttendees(Boolean param0);
            
    /**
     * <p>id(0x8268)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "StartUTC", dispId = 0x8268)
    java.util.Date getStartUTC();
            
    /**
     * <p>id(0x8268)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "StartUTC", dispId = 0x8268)
    void setStartUTC(java.util.Date param0);
            
    /**
     * <p>id(0x8269)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "EndUTC", dispId = 0x8269)
    java.util.Date getEndUTC();
            
    /**
     * <p>id(0x8269)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "EndUTC", dispId = 0x8269)
    void setEndUTC(java.util.Date param0);
            
    /**
     * <p>id(0x8266)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "StartInStartTimeZone", dispId = 0x8266)
    java.util.Date getStartInStartTimeZone();
            
    /**
     * <p>id(0x8266)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "StartInStartTimeZone", dispId = 0x8266)
    void setStartInStartTimeZone(java.util.Date param0);
            
    /**
     * <p>id(0x8267)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "EndInEndTimeZone", dispId = 0x8267)
    java.util.Date getEndInEndTimeZone();
            
    /**
     * <p>id(0x8267)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "EndInEndTimeZone", dispId = 0x8267)
    void setEndInEndTimeZone(java.util.Date param0);
            
    /**
     * <p>id(0xfc27)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "StartTimeZone", dispId = 0xfc27)
    _TimeZone getStartTimeZone();
            
    /**
     * <p>id(0xfc27)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code _TimeZone}
     */
    @ComProperty(name = "StartTimeZone", dispId = 0xfc27)
    void setStartTimeZone(_TimeZone param0);
            
    /**
     * <p>id(0xfc28)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "EndTimeZone", dispId = 0xfc28)
    _TimeZone getEndTimeZone();
            
    /**
     * <p>id(0xfc28)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code _TimeZone}
     */
    @ComProperty(name = "EndTimeZone", dispId = 0xfc28)
    void setEndTimeZone(_TimeZone param0);
            
    /**
     * <p>id(0xfc54)</p>
     * <p>vtableId(148)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    /**
     * <p>id(0xfb12)</p>
     * <p>vtableId(150)</p>
     * @param DestinationFolder [in] {@code MAPIFolder}
     * @param CopyOptions [in] {@code OlAppointmentCopyOptions}
     */
    @ComMethod(name = "CopyTo", dispId = 0xfb12)
    _AppointmentItem CopyTo(MAPIFolder DestinationFolder,
            OlAppointmentCopyOptions CopyOptions);
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    /**
     * <p>id(0xfc88)</p>
     * <p>vtableId(153)</p>
     */
    @ComMethod(name = "GetOrganizer", dispId = 0xfc88)
    AddressEntry GetOrganizer();
            
    
}