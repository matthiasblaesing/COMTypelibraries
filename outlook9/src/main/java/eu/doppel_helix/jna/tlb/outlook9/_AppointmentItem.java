
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
     * <p>id(0x8215)</p>
     */
    @ComProperty(name = "AllDayEvent", dispId = 0x8215)
    Boolean getAllDayEvent();
            
    /**
     * <p>id(0x8215)</p>
     */
    @ComProperty(name = "AllDayEvent", dispId = 0x8215)
    void setAllDayEvent(Boolean param0);
            
    /**
     * <p>id(0x8205)</p>
     */
    @ComProperty(name = "BusyStatus", dispId = 0x8205)
    OlBusyStatus getBusyStatus();
            
    /**
     * <p>id(0x8205)</p>
     */
    @ComProperty(name = "BusyStatus", dispId = 0x8205)
    void setBusyStatus(OlBusyStatus param0);
            
    /**
     * <p>id(0x8213)</p>
     */
    @ComProperty(name = "Duration", dispId = 0x8213)
    Integer getDuration();
            
    /**
     * <p>id(0x8213)</p>
     */
    @ComProperty(name = "Duration", dispId = 0x8213)
    void setDuration(Integer param0);
            
    /**
     * <p>id(0x820e)</p>
     */
    @ComProperty(name = "End", dispId = 0x820e)
    java.util.Date getEnd();
            
    /**
     * <p>id(0x820e)</p>
     */
    @ComProperty(name = "End", dispId = 0x820e)
    void setEnd(java.util.Date param0);
            
    /**
     * <p>id(0x8240)</p>
     */
    @ComProperty(name = "IsOnlineMeeting", dispId = 0x8240)
    Boolean getIsOnlineMeeting();
            
    /**
     * <p>id(0x8240)</p>
     */
    @ComProperty(name = "IsOnlineMeeting", dispId = 0x8240)
    void setIsOnlineMeeting(Boolean param0);
            
    /**
     * <p>id(0x8223)</p>
     */
    @ComProperty(name = "IsRecurring", dispId = 0x8223)
    Boolean getIsRecurring();
            
    /**
     * <p>id(0x8208)</p>
     */
    @ComProperty(name = "Location", dispId = 0x8208)
    String getLocation();
            
    /**
     * <p>id(0x8208)</p>
     */
    @ComProperty(name = "Location", dispId = 0x8208)
    void setLocation(String param0);
            
    /**
     * <p>id(0x8217)</p>
     */
    @ComProperty(name = "MeetingStatus", dispId = 0x8217)
    OlMeetingStatus getMeetingStatus();
            
    /**
     * <p>id(0x8217)</p>
     */
    @ComProperty(name = "MeetingStatus", dispId = 0x8217)
    void setMeetingStatus(OlMeetingStatus param0);
            
    /**
     * <p>id(0x8244)</p>
     */
    @ComProperty(name = "NetMeetingAutoStart", dispId = 0x8244)
    Boolean getNetMeetingAutoStart();
            
    /**
     * <p>id(0x8244)</p>
     */
    @ComProperty(name = "NetMeetingAutoStart", dispId = 0x8244)
    void setNetMeetingAutoStart(Boolean param0);
            
    /**
     * <p>id(0x8243)</p>
     */
    @ComProperty(name = "NetMeetingOrganizerAlias", dispId = 0x8243)
    String getNetMeetingOrganizerAlias();
            
    /**
     * <p>id(0x8243)</p>
     */
    @ComProperty(name = "NetMeetingOrganizerAlias", dispId = 0x8243)
    void setNetMeetingOrganizerAlias(String param0);
            
    /**
     * <p>id(0x8242)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8242)
    String getNetMeetingServer();
            
    /**
     * <p>id(0x8242)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8242)
    void setNetMeetingServer(String param0);
            
    /**
     * <p>id(0x8241)</p>
     */
    @ComProperty(name = "NetMeetingType", dispId = 0x8241)
    OlNetMeetingType getNetMeetingType();
            
    /**
     * <p>id(0x8241)</p>
     */
    @ComProperty(name = "NetMeetingType", dispId = 0x8241)
    void setNetMeetingType(OlNetMeetingType param0);
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "OptionalAttendees", dispId = 0xe03)
    String getOptionalAttendees();
            
    /**
     * <p>id(0xe03)</p>
     */
    @ComProperty(name = "OptionalAttendees", dispId = 0xe03)
    void setOptionalAttendees(String param0);
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "Organizer", dispId = 0x42)
    String getOrganizer();
            
    /**
     * <p>id(0xf814)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0xf814)
    Recipients getRecipients();
            
    /**
     * <p>id(0xf545)</p>
     */
    @ComProperty(name = "RecurrenceState", dispId = 0xf545)
    OlRecurrenceState getRecurrenceState();
            
    /**
     * <p>id(0x8501)</p>
     */
    @ComProperty(name = "ReminderMinutesBeforeStart", dispId = 0x8501)
    Integer getReminderMinutesBeforeStart();
            
    /**
     * <p>id(0x8501)</p>
     */
    @ComProperty(name = "ReminderMinutesBeforeStart", dispId = 0x8501)
    void setReminderMinutesBeforeStart(Integer param0);
            
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
     * <p>id(0x8220)</p>
     */
    @ComProperty(name = "ReplyTime", dispId = 0x8220)
    java.util.Date getReplyTime();
            
    /**
     * <p>id(0x8220)</p>
     */
    @ComProperty(name = "ReplyTime", dispId = 0x8220)
    void setReplyTime(java.util.Date param0);
            
    /**
     * <p>id(0xe04)</p>
     */
    @ComProperty(name = "RequiredAttendees", dispId = 0xe04)
    String getRequiredAttendees();
            
    /**
     * <p>id(0xe04)</p>
     */
    @ComProperty(name = "RequiredAttendees", dispId = 0xe04)
    void setRequiredAttendees(String param0);
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "Resources", dispId = 0xe02)
    String getResources();
            
    /**
     * <p>id(0xe02)</p>
     */
    @ComProperty(name = "Resources", dispId = 0xe02)
    void setResources(String param0);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "ResponseRequested", dispId = 0x63)
    Boolean getResponseRequested();
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "ResponseRequested", dispId = 0x63)
    void setResponseRequested(Boolean param0);
            
    /**
     * <p>id(0x8218)</p>
     */
    @ComProperty(name = "ResponseStatus", dispId = 0x8218)
    OlResponseStatus getResponseStatus();
            
    /**
     * <p>id(0x820d)</p>
     */
    @ComProperty(name = "Start", dispId = 0x820d)
    java.util.Date getStart();
            
    /**
     * <p>id(0x820d)</p>
     */
    @ComProperty(name = "Start", dispId = 0x820d)
    void setStart(java.util.Date param0);
            
    /**
     * <p>id(0xf0a5)</p>
     */
    @ComMethod(name = "ClearRecurrencePattern", dispId = 0xf0a5)
    void ClearRecurrencePattern();
            
    /**
     * <p>id(0xf547)</p>
     */
    @ComMethod(name = "ForwardAsVcal", dispId = 0xf547)
    MailItem ForwardAsVcal();
            
    /**
     * <p>id(0xf0a4)</p>
     */
    @ComMethod(name = "GetRecurrencePattern", dispId = 0xf0a4)
    RecurrencePattern GetRecurrencePattern();
            
    /**
     * <p>id(0xf502)</p>
     */
    @ComMethod(name = "Respond", dispId = 0xf502)
    MeetingItem Respond(OlMeetingResponse Response,
            Object fNoUI,
            Object fAdditionalTextDialog);
            
    /**
     * <p>id(0xf075)</p>
     */
    @ComMethod(name = "Send", dispId = 0xf075)
    void Send();
            
    /**
     * <p>id(0x8247)</p>
     */
    @ComProperty(name = "NetMeetingDocPathName", dispId = 0x8247)
    String getNetMeetingDocPathName();
            
    /**
     * <p>id(0x8247)</p>
     */
    @ComProperty(name = "NetMeetingDocPathName", dispId = 0x8247)
    void setNetMeetingDocPathName(String param0);
            
    /**
     * <p>id(0x8248)</p>
     */
    @ComProperty(name = "NetShowURL", dispId = 0x8248)
    String getNetShowURL();
            
    /**
     * <p>id(0x8248)</p>
     */
    @ComProperty(name = "NetShowURL", dispId = 0x8248)
    void setNetShowURL(String param0);
            
    /**
     * <p>id(0xf405)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0x8246)</p>
     */
    @ComProperty(name = "ConferenceServerAllowExternal", dispId = 0x8246)
    Boolean getConferenceServerAllowExternal();
            
    /**
     * <p>id(0x8246)</p>
     */
    @ComProperty(name = "ConferenceServerAllowExternal", dispId = 0x8246)
    void setConferenceServerAllowExternal(Boolean param0);
            
    /**
     * <p>id(0x8249)</p>
     */
    @ComProperty(name = "ConferenceServerPassword", dispId = 0x8249)
    String getConferenceServerPassword();
            
    /**
     * <p>id(0x8249)</p>
     */
    @ComProperty(name = "ConferenceServerPassword", dispId = 0x8249)
    void setConferenceServerPassword(String param0);
            
    /**
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
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
     * <p>id(0x8209)</p>
     */
    @ComProperty(name = "MeetingWorkspaceURL", dispId = 0x8209)
    String getMeetingWorkspaceURL();
            
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
     * <p>id(0xfbfd)</p>
     */
    @ComProperty(name = "GlobalAppointmentID", dispId = 0xfbfd)
    String getGlobalAppointmentID();
            
    /**
     * <p>id(0xf53a)</p>
     */
    @ComProperty(name = "ForceUpdateToAllAttendees", dispId = 0xf53a)
    Boolean getForceUpdateToAllAttendees();
            
    /**
     * <p>id(0xf53a)</p>
     */
    @ComProperty(name = "ForceUpdateToAllAttendees", dispId = 0xf53a)
    void setForceUpdateToAllAttendees(Boolean param0);
            
    /**
     * <p>id(0x8268)</p>
     */
    @ComProperty(name = "StartUTC", dispId = 0x8268)
    java.util.Date getStartUTC();
            
    /**
     * <p>id(0x8268)</p>
     */
    @ComProperty(name = "StartUTC", dispId = 0x8268)
    void setStartUTC(java.util.Date param0);
            
    /**
     * <p>id(0x8269)</p>
     */
    @ComProperty(name = "EndUTC", dispId = 0x8269)
    java.util.Date getEndUTC();
            
    /**
     * <p>id(0x8269)</p>
     */
    @ComProperty(name = "EndUTC", dispId = 0x8269)
    void setEndUTC(java.util.Date param0);
            
    /**
     * <p>id(0x8266)</p>
     */
    @ComProperty(name = "StartInStartTimeZone", dispId = 0x8266)
    java.util.Date getStartInStartTimeZone();
            
    /**
     * <p>id(0x8266)</p>
     */
    @ComProperty(name = "StartInStartTimeZone", dispId = 0x8266)
    void setStartInStartTimeZone(java.util.Date param0);
            
    /**
     * <p>id(0x8267)</p>
     */
    @ComProperty(name = "EndInEndTimeZone", dispId = 0x8267)
    java.util.Date getEndInEndTimeZone();
            
    /**
     * <p>id(0x8267)</p>
     */
    @ComProperty(name = "EndInEndTimeZone", dispId = 0x8267)
    void setEndInEndTimeZone(java.util.Date param0);
            
    /**
     * <p>id(0xfc27)</p>
     */
    @ComProperty(name = "StartTimeZone", dispId = 0xfc27)
    _TimeZone getStartTimeZone();
            
    /**
     * <p>id(0xfc27)</p>
     */
    @ComProperty(name = "StartTimeZone", dispId = 0xfc27)
    void setStartTimeZone(_TimeZone param0);
            
    /**
     * <p>id(0xfc28)</p>
     */
    @ComProperty(name = "EndTimeZone", dispId = 0xfc28)
    _TimeZone getEndTimeZone();
            
    /**
     * <p>id(0xfc28)</p>
     */
    @ComProperty(name = "EndTimeZone", dispId = 0xfc28)
    void setEndTimeZone(_TimeZone param0);
            
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
     * <p>id(0xfb12)</p>
     */
    @ComMethod(name = "CopyTo", dispId = 0xfb12)
    _AppointmentItem CopyTo(MAPIFolder DestinationFolder,
            OlAppointmentCopyOptions CopyOptions);
            
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
     * <p>id(0xfc88)</p>
     */
    @ComMethod(name = "GetOrganizer", dispId = 0xfc88)
    AddressEntry GetOrganizer();
            
    
}