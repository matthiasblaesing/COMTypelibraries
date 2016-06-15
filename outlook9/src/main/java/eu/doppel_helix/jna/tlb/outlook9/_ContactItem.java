
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063021-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063021-0000-0000-C000-000000000046}")
public interface _ContactItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3a00)</p>
     */
    @ComProperty(name = "Account", dispId = 0x3a00)
    String getAccount();
            
    /**
     * <p>id(0x3a00)</p>
     */
    @ComProperty(name = "Account", dispId = 0x3a00)
    void setAccount(String param0);
            
    /**
     * <p>id(0x3a41)</p>
     */
    @ComProperty(name = "Anniversary", dispId = 0x3a41)
    java.util.Date getAnniversary();
            
    /**
     * <p>id(0x3a41)</p>
     */
    @ComProperty(name = "Anniversary", dispId = 0x3a41)
    void setAnniversary(java.util.Date param0);
            
    /**
     * <p>id(0x3a30)</p>
     */
    @ComProperty(name = "AssistantName", dispId = 0x3a30)
    String getAssistantName();
            
    /**
     * <p>id(0x3a30)</p>
     */
    @ComProperty(name = "AssistantName", dispId = 0x3a30)
    void setAssistantName(String param0);
            
    /**
     * <p>id(0x3a2e)</p>
     */
    @ComProperty(name = "AssistantTelephoneNumber", dispId = 0x3a2e)
    String getAssistantTelephoneNumber();
            
    /**
     * <p>id(0x3a2e)</p>
     */
    @ComProperty(name = "AssistantTelephoneNumber", dispId = 0x3a2e)
    void setAssistantTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a42)</p>
     */
    @ComProperty(name = "Birthday", dispId = 0x3a42)
    java.util.Date getBirthday();
            
    /**
     * <p>id(0x3a42)</p>
     */
    @ComProperty(name = "Birthday", dispId = 0x3a42)
    void setBirthday(java.util.Date param0);
            
    /**
     * <p>id(0x3a1b)</p>
     */
    @ComProperty(name = "Business2TelephoneNumber", dispId = 0x3a1b)
    String getBusiness2TelephoneNumber();
            
    /**
     * <p>id(0x3a1b)</p>
     */
    @ComProperty(name = "Business2TelephoneNumber", dispId = 0x3a1b)
    void setBusiness2TelephoneNumber(String param0);
            
    /**
     * <p>id(0x801b)</p>
     */
    @ComProperty(name = "BusinessAddress", dispId = 0x801b)
    String getBusinessAddress();
            
    /**
     * <p>id(0x801b)</p>
     */
    @ComProperty(name = "BusinessAddress", dispId = 0x801b)
    void setBusinessAddress(String param0);
            
    /**
     * <p>id(0x8046)</p>
     */
    @ComProperty(name = "BusinessAddressCity", dispId = 0x8046)
    String getBusinessAddressCity();
            
    /**
     * <p>id(0x8046)</p>
     */
    @ComProperty(name = "BusinessAddressCity", dispId = 0x8046)
    void setBusinessAddressCity(String param0);
            
    /**
     * <p>id(0x8049)</p>
     */
    @ComProperty(name = "BusinessAddressCountry", dispId = 0x8049)
    String getBusinessAddressCountry();
            
    /**
     * <p>id(0x8049)</p>
     */
    @ComProperty(name = "BusinessAddressCountry", dispId = 0x8049)
    void setBusinessAddressCountry(String param0);
            
    /**
     * <p>id(0x8048)</p>
     */
    @ComProperty(name = "BusinessAddressPostalCode", dispId = 0x8048)
    String getBusinessAddressPostalCode();
            
    /**
     * <p>id(0x8048)</p>
     */
    @ComProperty(name = "BusinessAddressPostalCode", dispId = 0x8048)
    void setBusinessAddressPostalCode(String param0);
            
    /**
     * <p>id(0x804a)</p>
     */
    @ComProperty(name = "BusinessAddressPostOfficeBox", dispId = 0x804a)
    String getBusinessAddressPostOfficeBox();
            
    /**
     * <p>id(0x804a)</p>
     */
    @ComProperty(name = "BusinessAddressPostOfficeBox", dispId = 0x804a)
    void setBusinessAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x8047)</p>
     */
    @ComProperty(name = "BusinessAddressState", dispId = 0x8047)
    String getBusinessAddressState();
            
    /**
     * <p>id(0x8047)</p>
     */
    @ComProperty(name = "BusinessAddressState", dispId = 0x8047)
    void setBusinessAddressState(String param0);
            
    /**
     * <p>id(0x8045)</p>
     */
    @ComProperty(name = "BusinessAddressStreet", dispId = 0x8045)
    String getBusinessAddressStreet();
            
    /**
     * <p>id(0x8045)</p>
     */
    @ComProperty(name = "BusinessAddressStreet", dispId = 0x8045)
    void setBusinessAddressStreet(String param0);
            
    /**
     * <p>id(0x3a24)</p>
     */
    @ComProperty(name = "BusinessFaxNumber", dispId = 0x3a24)
    String getBusinessFaxNumber();
            
    /**
     * <p>id(0x3a24)</p>
     */
    @ComProperty(name = "BusinessFaxNumber", dispId = 0x3a24)
    void setBusinessFaxNumber(String param0);
            
    /**
     * <p>id(0x3a51)</p>
     */
    @ComProperty(name = "BusinessHomePage", dispId = 0x3a51)
    String getBusinessHomePage();
            
    /**
     * <p>id(0x3a51)</p>
     */
    @ComProperty(name = "BusinessHomePage", dispId = 0x3a51)
    void setBusinessHomePage(String param0);
            
    /**
     * <p>id(0x3a08)</p>
     */
    @ComProperty(name = "BusinessTelephoneNumber", dispId = 0x3a08)
    String getBusinessTelephoneNumber();
            
    /**
     * <p>id(0x3a08)</p>
     */
    @ComProperty(name = "BusinessTelephoneNumber", dispId = 0x3a08)
    void setBusinessTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a02)</p>
     */
    @ComProperty(name = "CallbackTelephoneNumber", dispId = 0x3a02)
    String getCallbackTelephoneNumber();
            
    /**
     * <p>id(0x3a02)</p>
     */
    @ComProperty(name = "CallbackTelephoneNumber", dispId = 0x3a02)
    void setCallbackTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a1e)</p>
     */
    @ComProperty(name = "CarTelephoneNumber", dispId = 0x3a1e)
    String getCarTelephoneNumber();
            
    /**
     * <p>id(0x3a1e)</p>
     */
    @ComProperty(name = "CarTelephoneNumber", dispId = 0x3a1e)
    void setCarTelephoneNumber(String param0);
            
    /**
     * <p>id(0x800c)</p>
     */
    @ComProperty(name = "Children", dispId = 0x800c)
    String getChildren();
            
    /**
     * <p>id(0x800c)</p>
     */
    @ComProperty(name = "Children", dispId = 0x800c)
    void setChildren(String param0);
            
    /**
     * <p>id(0x8018)</p>
     */
    @ComProperty(name = "CompanyAndFullName", dispId = 0x8018)
    String getCompanyAndFullName();
            
    /**
     * <p>id(0x8032)</p>
     */
    @ComProperty(name = "CompanyLastFirstNoSpace", dispId = 0x8032)
    String getCompanyLastFirstNoSpace();
            
    /**
     * <p>id(0x8033)</p>
     */
    @ComProperty(name = "CompanyLastFirstSpaceOnly", dispId = 0x8033)
    String getCompanyLastFirstSpaceOnly();
            
    /**
     * <p>id(0x3a57)</p>
     */
    @ComProperty(name = "CompanyMainTelephoneNumber", dispId = 0x3a57)
    String getCompanyMainTelephoneNumber();
            
    /**
     * <p>id(0x3a57)</p>
     */
    @ComProperty(name = "CompanyMainTelephoneNumber", dispId = 0x3a57)
    void setCompanyMainTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a16)</p>
     */
    @ComProperty(name = "CompanyName", dispId = 0x3a16)
    String getCompanyName();
            
    /**
     * <p>id(0x3a16)</p>
     */
    @ComProperty(name = "CompanyName", dispId = 0x3a16)
    void setCompanyName(String param0);
            
    /**
     * <p>id(0x3a49)</p>
     */
    @ComProperty(name = "ComputerNetworkName", dispId = 0x3a49)
    String getComputerNetworkName();
            
    /**
     * <p>id(0x3a49)</p>
     */
    @ComProperty(name = "ComputerNetworkName", dispId = 0x3a49)
    void setComputerNetworkName(String param0);
            
    /**
     * <p>id(0x3a4a)</p>
     */
    @ComProperty(name = "CustomerID", dispId = 0x3a4a)
    String getCustomerID();
            
    /**
     * <p>id(0x3a4a)</p>
     */
    @ComProperty(name = "CustomerID", dispId = 0x3a4a)
    void setCustomerID(String param0);
            
    /**
     * <p>id(0x3a18)</p>
     */
    @ComProperty(name = "Department", dispId = 0x3a18)
    String getDepartment();
            
    /**
     * <p>id(0x3a18)</p>
     */
    @ComProperty(name = "Department", dispId = 0x3a18)
    void setDepartment(String param0);
            
    /**
     * <p>id(0x8083)</p>
     */
    @ComProperty(name = "Email1Address", dispId = 0x8083)
    String getEmail1Address();
            
    /**
     * <p>id(0x8083)</p>
     */
    @ComProperty(name = "Email1Address", dispId = 0x8083)
    void setEmail1Address(String param0);
            
    /**
     * <p>id(0x8082)</p>
     */
    @ComProperty(name = "Email1AddressType", dispId = 0x8082)
    String getEmail1AddressType();
            
    /**
     * <p>id(0x8082)</p>
     */
    @ComProperty(name = "Email1AddressType", dispId = 0x8082)
    void setEmail1AddressType(String param0);
            
    /**
     * <p>id(0x8080)</p>
     */
    @ComProperty(name = "Email1DisplayName", dispId = 0x8080)
    String getEmail1DisplayName();
            
    /**
     * <p>id(0x8085)</p>
     */
    @ComProperty(name = "Email1EntryID", dispId = 0x8085)
    String getEmail1EntryID();
            
    /**
     * <p>id(0x8093)</p>
     */
    @ComProperty(name = "Email2Address", dispId = 0x8093)
    String getEmail2Address();
            
    /**
     * <p>id(0x8093)</p>
     */
    @ComProperty(name = "Email2Address", dispId = 0x8093)
    void setEmail2Address(String param0);
            
    /**
     * <p>id(0x8092)</p>
     */
    @ComProperty(name = "Email2AddressType", dispId = 0x8092)
    String getEmail2AddressType();
            
    /**
     * <p>id(0x8092)</p>
     */
    @ComProperty(name = "Email2AddressType", dispId = 0x8092)
    void setEmail2AddressType(String param0);
            
    /**
     * <p>id(0x8090)</p>
     */
    @ComProperty(name = "Email2DisplayName", dispId = 0x8090)
    String getEmail2DisplayName();
            
    /**
     * <p>id(0x8095)</p>
     */
    @ComProperty(name = "Email2EntryID", dispId = 0x8095)
    String getEmail2EntryID();
            
    /**
     * <p>id(0x80a3)</p>
     */
    @ComProperty(name = "Email3Address", dispId = 0x80a3)
    String getEmail3Address();
            
    /**
     * <p>id(0x80a3)</p>
     */
    @ComProperty(name = "Email3Address", dispId = 0x80a3)
    void setEmail3Address(String param0);
            
    /**
     * <p>id(0x80a2)</p>
     */
    @ComProperty(name = "Email3AddressType", dispId = 0x80a2)
    String getEmail3AddressType();
            
    /**
     * <p>id(0x80a2)</p>
     */
    @ComProperty(name = "Email3AddressType", dispId = 0x80a2)
    void setEmail3AddressType(String param0);
            
    /**
     * <p>id(0x80a0)</p>
     */
    @ComProperty(name = "Email3DisplayName", dispId = 0x80a0)
    String getEmail3DisplayName();
            
    /**
     * <p>id(0x80a5)</p>
     */
    @ComProperty(name = "Email3EntryID", dispId = 0x80a5)
    String getEmail3EntryID();
            
    /**
     * <p>id(0x8005)</p>
     */
    @ComProperty(name = "FileAs", dispId = 0x8005)
    String getFileAs();
            
    /**
     * <p>id(0x8005)</p>
     */
    @ComProperty(name = "FileAs", dispId = 0x8005)
    void setFileAs(String param0);
            
    /**
     * <p>id(0x3a06)</p>
     */
    @ComProperty(name = "FirstName", dispId = 0x3a06)
    String getFirstName();
            
    /**
     * <p>id(0x3a06)</p>
     */
    @ComProperty(name = "FirstName", dispId = 0x3a06)
    void setFirstName(String param0);
            
    /**
     * <p>id(0x3a4c)</p>
     */
    @ComProperty(name = "FTPSite", dispId = 0x3a4c)
    String getFTPSite();
            
    /**
     * <p>id(0x3a4c)</p>
     */
    @ComProperty(name = "FTPSite", dispId = 0x3a4c)
    void setFTPSite(String param0);
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x3001)
    String getFullName();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x3001)
    void setFullName(String param0);
            
    /**
     * <p>id(0x8019)</p>
     */
    @ComProperty(name = "FullNameAndCompany", dispId = 0x8019)
    String getFullNameAndCompany();
            
    /**
     * <p>id(0x3a4d)</p>
     */
    @ComProperty(name = "Gender", dispId = 0x3a4d)
    OlGender getGender();
            
    /**
     * <p>id(0x3a4d)</p>
     */
    @ComProperty(name = "Gender", dispId = 0x3a4d)
    void setGender(OlGender param0);
            
    /**
     * <p>id(0x3a07)</p>
     */
    @ComProperty(name = "GovernmentIDNumber", dispId = 0x3a07)
    String getGovernmentIDNumber();
            
    /**
     * <p>id(0x3a07)</p>
     */
    @ComProperty(name = "GovernmentIDNumber", dispId = 0x3a07)
    void setGovernmentIDNumber(String param0);
            
    /**
     * <p>id(0x3a43)</p>
     */
    @ComProperty(name = "Hobby", dispId = 0x3a43)
    String getHobby();
            
    /**
     * <p>id(0x3a43)</p>
     */
    @ComProperty(name = "Hobby", dispId = 0x3a43)
    void setHobby(String param0);
            
    /**
     * <p>id(0x3a2f)</p>
     */
    @ComProperty(name = "Home2TelephoneNumber", dispId = 0x3a2f)
    String getHome2TelephoneNumber();
            
    /**
     * <p>id(0x3a2f)</p>
     */
    @ComProperty(name = "Home2TelephoneNumber", dispId = 0x3a2f)
    void setHome2TelephoneNumber(String param0);
            
    /**
     * <p>id(0x801a)</p>
     */
    @ComProperty(name = "HomeAddress", dispId = 0x801a)
    String getHomeAddress();
            
    /**
     * <p>id(0x801a)</p>
     */
    @ComProperty(name = "HomeAddress", dispId = 0x801a)
    void setHomeAddress(String param0);
            
    /**
     * <p>id(0x3a59)</p>
     */
    @ComProperty(name = "HomeAddressCity", dispId = 0x3a59)
    String getHomeAddressCity();
            
    /**
     * <p>id(0x3a59)</p>
     */
    @ComProperty(name = "HomeAddressCity", dispId = 0x3a59)
    void setHomeAddressCity(String param0);
            
    /**
     * <p>id(0x3a5a)</p>
     */
    @ComProperty(name = "HomeAddressCountry", dispId = 0x3a5a)
    String getHomeAddressCountry();
            
    /**
     * <p>id(0x3a5a)</p>
     */
    @ComProperty(name = "HomeAddressCountry", dispId = 0x3a5a)
    void setHomeAddressCountry(String param0);
            
    /**
     * <p>id(0x3a5b)</p>
     */
    @ComProperty(name = "HomeAddressPostalCode", dispId = 0x3a5b)
    String getHomeAddressPostalCode();
            
    /**
     * <p>id(0x3a5b)</p>
     */
    @ComProperty(name = "HomeAddressPostalCode", dispId = 0x3a5b)
    void setHomeAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a5e)</p>
     */
    @ComProperty(name = "HomeAddressPostOfficeBox", dispId = 0x3a5e)
    String getHomeAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a5e)</p>
     */
    @ComProperty(name = "HomeAddressPostOfficeBox", dispId = 0x3a5e)
    void setHomeAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a5c)</p>
     */
    @ComProperty(name = "HomeAddressState", dispId = 0x3a5c)
    String getHomeAddressState();
            
    /**
     * <p>id(0x3a5c)</p>
     */
    @ComProperty(name = "HomeAddressState", dispId = 0x3a5c)
    void setHomeAddressState(String param0);
            
    /**
     * <p>id(0x3a5d)</p>
     */
    @ComProperty(name = "HomeAddressStreet", dispId = 0x3a5d)
    String getHomeAddressStreet();
            
    /**
     * <p>id(0x3a5d)</p>
     */
    @ComProperty(name = "HomeAddressStreet", dispId = 0x3a5d)
    void setHomeAddressStreet(String param0);
            
    /**
     * <p>id(0x3a25)</p>
     */
    @ComProperty(name = "HomeFaxNumber", dispId = 0x3a25)
    String getHomeFaxNumber();
            
    /**
     * <p>id(0x3a25)</p>
     */
    @ComProperty(name = "HomeFaxNumber", dispId = 0x3a25)
    void setHomeFaxNumber(String param0);
            
    /**
     * <p>id(0x3a09)</p>
     */
    @ComProperty(name = "HomeTelephoneNumber", dispId = 0x3a09)
    String getHomeTelephoneNumber();
            
    /**
     * <p>id(0x3a09)</p>
     */
    @ComProperty(name = "HomeTelephoneNumber", dispId = 0x3a09)
    void setHomeTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a0a)</p>
     */
    @ComProperty(name = "Initials", dispId = 0x3a0a)
    String getInitials();
            
    /**
     * <p>id(0x3a0a)</p>
     */
    @ComProperty(name = "Initials", dispId = 0x3a0a)
    void setInitials(String param0);
            
    /**
     * <p>id(0x80d8)</p>
     */
    @ComProperty(name = "InternetFreeBusyAddress", dispId = 0x80d8)
    String getInternetFreeBusyAddress();
            
    /**
     * <p>id(0x80d8)</p>
     */
    @ComProperty(name = "InternetFreeBusyAddress", dispId = 0x80d8)
    void setInternetFreeBusyAddress(String param0);
            
    /**
     * <p>id(0x3a2d)</p>
     */
    @ComProperty(name = "ISDNNumber", dispId = 0x3a2d)
    String getISDNNumber();
            
    /**
     * <p>id(0x3a2d)</p>
     */
    @ComProperty(name = "ISDNNumber", dispId = 0x3a2d)
    void setISDNNumber(String param0);
            
    /**
     * <p>id(0x3a17)</p>
     */
    @ComProperty(name = "JobTitle", dispId = 0x3a17)
    String getJobTitle();
            
    /**
     * <p>id(0x3a17)</p>
     */
    @ComProperty(name = "JobTitle", dispId = 0x3a17)
    void setJobTitle(String param0);
            
    /**
     * <p>id(0x8025)</p>
     */
    @ComProperty(name = "Journal", dispId = 0x8025)
    Boolean getJournal();
            
    /**
     * <p>id(0x8025)</p>
     */
    @ComProperty(name = "Journal", dispId = 0x8025)
    void setJournal(Boolean param0);
            
    /**
     * <p>id(0x3a0c)</p>
     */
    @ComProperty(name = "Language", dispId = 0x3a0c)
    String getLanguage();
            
    /**
     * <p>id(0x3a0c)</p>
     */
    @ComProperty(name = "Language", dispId = 0x3a0c)
    void setLanguage(String param0);
            
    /**
     * <p>id(0x8036)</p>
     */
    @ComProperty(name = "LastFirstAndSuffix", dispId = 0x8036)
    String getLastFirstAndSuffix();
            
    /**
     * <p>id(0x8030)</p>
     */
    @ComProperty(name = "LastFirstNoSpace", dispId = 0x8030)
    String getLastFirstNoSpace();
            
    /**
     * <p>id(0x8034)</p>
     */
    @ComProperty(name = "LastFirstNoSpaceCompany", dispId = 0x8034)
    String getLastFirstNoSpaceCompany();
            
    /**
     * <p>id(0x8031)</p>
     */
    @ComProperty(name = "LastFirstSpaceOnly", dispId = 0x8031)
    String getLastFirstSpaceOnly();
            
    /**
     * <p>id(0x8035)</p>
     */
    @ComProperty(name = "LastFirstSpaceOnlyCompany", dispId = 0x8035)
    String getLastFirstSpaceOnlyCompany();
            
    /**
     * <p>id(0x3a11)</p>
     */
    @ComProperty(name = "LastName", dispId = 0x3a11)
    String getLastName();
            
    /**
     * <p>id(0x3a11)</p>
     */
    @ComProperty(name = "LastName", dispId = 0x3a11)
    void setLastName(String param0);
            
    /**
     * <p>id(0x8017)</p>
     */
    @ComProperty(name = "LastNameAndFirstName", dispId = 0x8017)
    String getLastNameAndFirstName();
            
    /**
     * <p>id(0x3a15)</p>
     */
    @ComProperty(name = "MailingAddress", dispId = 0x3a15)
    String getMailingAddress();
            
    /**
     * <p>id(0x3a15)</p>
     */
    @ComProperty(name = "MailingAddress", dispId = 0x3a15)
    void setMailingAddress(String param0);
            
    /**
     * <p>id(0x3a27)</p>
     */
    @ComProperty(name = "MailingAddressCity", dispId = 0x3a27)
    String getMailingAddressCity();
            
    /**
     * <p>id(0x3a27)</p>
     */
    @ComProperty(name = "MailingAddressCity", dispId = 0x3a27)
    void setMailingAddressCity(String param0);
            
    /**
     * <p>id(0x3a26)</p>
     */
    @ComProperty(name = "MailingAddressCountry", dispId = 0x3a26)
    String getMailingAddressCountry();
            
    /**
     * <p>id(0x3a26)</p>
     */
    @ComProperty(name = "MailingAddressCountry", dispId = 0x3a26)
    void setMailingAddressCountry(String param0);
            
    /**
     * <p>id(0x3a2a)</p>
     */
    @ComProperty(name = "MailingAddressPostalCode", dispId = 0x3a2a)
    String getMailingAddressPostalCode();
            
    /**
     * <p>id(0x3a2a)</p>
     */
    @ComProperty(name = "MailingAddressPostalCode", dispId = 0x3a2a)
    void setMailingAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a2b)</p>
     */
    @ComProperty(name = "MailingAddressPostOfficeBox", dispId = 0x3a2b)
    String getMailingAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a2b)</p>
     */
    @ComProperty(name = "MailingAddressPostOfficeBox", dispId = 0x3a2b)
    void setMailingAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a28)</p>
     */
    @ComProperty(name = "MailingAddressState", dispId = 0x3a28)
    String getMailingAddressState();
            
    /**
     * <p>id(0x3a28)</p>
     */
    @ComProperty(name = "MailingAddressState", dispId = 0x3a28)
    void setMailingAddressState(String param0);
            
    /**
     * <p>id(0x3a29)</p>
     */
    @ComProperty(name = "MailingAddressStreet", dispId = 0x3a29)
    String getMailingAddressStreet();
            
    /**
     * <p>id(0x3a29)</p>
     */
    @ComProperty(name = "MailingAddressStreet", dispId = 0x3a29)
    void setMailingAddressStreet(String param0);
            
    /**
     * <p>id(0x3a4e)</p>
     */
    @ComProperty(name = "ManagerName", dispId = 0x3a4e)
    String getManagerName();
            
    /**
     * <p>id(0x3a4e)</p>
     */
    @ComProperty(name = "ManagerName", dispId = 0x3a4e)
    void setManagerName(String param0);
            
    /**
     * <p>id(0x3a44)</p>
     */
    @ComProperty(name = "MiddleName", dispId = 0x3a44)
    String getMiddleName();
            
    /**
     * <p>id(0x3a44)</p>
     */
    @ComProperty(name = "MiddleName", dispId = 0x3a44)
    void setMiddleName(String param0);
            
    /**
     * <p>id(0x3a1c)</p>
     */
    @ComProperty(name = "MobileTelephoneNumber", dispId = 0x3a1c)
    String getMobileTelephoneNumber();
            
    /**
     * <p>id(0x3a1c)</p>
     */
    @ComProperty(name = "MobileTelephoneNumber", dispId = 0x3a1c)
    void setMobileTelephoneNumber(String param0);
            
    /**
     * <p>id(0x805f)</p>
     */
    @ComProperty(name = "NetMeetingAlias", dispId = 0x805f)
    String getNetMeetingAlias();
            
    /**
     * <p>id(0x805f)</p>
     */
    @ComProperty(name = "NetMeetingAlias", dispId = 0x805f)
    void setNetMeetingAlias(String param0);
            
    /**
     * <p>id(0x8060)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8060)
    String getNetMeetingServer();
            
    /**
     * <p>id(0x8060)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8060)
    void setNetMeetingServer(String param0);
            
    /**
     * <p>id(0x3a4f)</p>
     */
    @ComProperty(name = "NickName", dispId = 0x3a4f)
    String getNickName();
            
    /**
     * <p>id(0x3a4f)</p>
     */
    @ComProperty(name = "NickName", dispId = 0x3a4f)
    void setNickName(String param0);
            
    /**
     * <p>id(0x3a19)</p>
     */
    @ComProperty(name = "OfficeLocation", dispId = 0x3a19)
    String getOfficeLocation();
            
    /**
     * <p>id(0x3a19)</p>
     */
    @ComProperty(name = "OfficeLocation", dispId = 0x3a19)
    void setOfficeLocation(String param0);
            
    /**
     * <p>id(0x3a10)</p>
     */
    @ComProperty(name = "OrganizationalIDNumber", dispId = 0x3a10)
    String getOrganizationalIDNumber();
            
    /**
     * <p>id(0x3a10)</p>
     */
    @ComProperty(name = "OrganizationalIDNumber", dispId = 0x3a10)
    void setOrganizationalIDNumber(String param0);
            
    /**
     * <p>id(0x801c)</p>
     */
    @ComProperty(name = "OtherAddress", dispId = 0x801c)
    String getOtherAddress();
            
    /**
     * <p>id(0x801c)</p>
     */
    @ComProperty(name = "OtherAddress", dispId = 0x801c)
    void setOtherAddress(String param0);
            
    /**
     * <p>id(0x3a5f)</p>
     */
    @ComProperty(name = "OtherAddressCity", dispId = 0x3a5f)
    String getOtherAddressCity();
            
    /**
     * <p>id(0x3a5f)</p>
     */
    @ComProperty(name = "OtherAddressCity", dispId = 0x3a5f)
    void setOtherAddressCity(String param0);
            
    /**
     * <p>id(0x3a60)</p>
     */
    @ComProperty(name = "OtherAddressCountry", dispId = 0x3a60)
    String getOtherAddressCountry();
            
    /**
     * <p>id(0x3a60)</p>
     */
    @ComProperty(name = "OtherAddressCountry", dispId = 0x3a60)
    void setOtherAddressCountry(String param0);
            
    /**
     * <p>id(0x3a61)</p>
     */
    @ComProperty(name = "OtherAddressPostalCode", dispId = 0x3a61)
    String getOtherAddressPostalCode();
            
    /**
     * <p>id(0x3a61)</p>
     */
    @ComProperty(name = "OtherAddressPostalCode", dispId = 0x3a61)
    void setOtherAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a64)</p>
     */
    @ComProperty(name = "OtherAddressPostOfficeBox", dispId = 0x3a64)
    String getOtherAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a64)</p>
     */
    @ComProperty(name = "OtherAddressPostOfficeBox", dispId = 0x3a64)
    void setOtherAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a62)</p>
     */
    @ComProperty(name = "OtherAddressState", dispId = 0x3a62)
    String getOtherAddressState();
            
    /**
     * <p>id(0x3a62)</p>
     */
    @ComProperty(name = "OtherAddressState", dispId = 0x3a62)
    void setOtherAddressState(String param0);
            
    /**
     * <p>id(0x3a63)</p>
     */
    @ComProperty(name = "OtherAddressStreet", dispId = 0x3a63)
    String getOtherAddressStreet();
            
    /**
     * <p>id(0x3a63)</p>
     */
    @ComProperty(name = "OtherAddressStreet", dispId = 0x3a63)
    void setOtherAddressStreet(String param0);
            
    /**
     * <p>id(0x3a23)</p>
     */
    @ComProperty(name = "OtherFaxNumber", dispId = 0x3a23)
    String getOtherFaxNumber();
            
    /**
     * <p>id(0x3a23)</p>
     */
    @ComProperty(name = "OtherFaxNumber", dispId = 0x3a23)
    void setOtherFaxNumber(String param0);
            
    /**
     * <p>id(0x3a1f)</p>
     */
    @ComProperty(name = "OtherTelephoneNumber", dispId = 0x3a1f)
    String getOtherTelephoneNumber();
            
    /**
     * <p>id(0x3a1f)</p>
     */
    @ComProperty(name = "OtherTelephoneNumber", dispId = 0x3a1f)
    void setOtherTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a21)</p>
     */
    @ComProperty(name = "PagerNumber", dispId = 0x3a21)
    String getPagerNumber();
            
    /**
     * <p>id(0x3a21)</p>
     */
    @ComProperty(name = "PagerNumber", dispId = 0x3a21)
    void setPagerNumber(String param0);
            
    /**
     * <p>id(0x3a50)</p>
     */
    @ComProperty(name = "PersonalHomePage", dispId = 0x3a50)
    String getPersonalHomePage();
            
    /**
     * <p>id(0x3a50)</p>
     */
    @ComProperty(name = "PersonalHomePage", dispId = 0x3a50)
    void setPersonalHomePage(String param0);
            
    /**
     * <p>id(0x3a1a)</p>
     */
    @ComProperty(name = "PrimaryTelephoneNumber", dispId = 0x3a1a)
    String getPrimaryTelephoneNumber();
            
    /**
     * <p>id(0x3a1a)</p>
     */
    @ComProperty(name = "PrimaryTelephoneNumber", dispId = 0x3a1a)
    void setPrimaryTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a46)</p>
     */
    @ComProperty(name = "Profession", dispId = 0x3a46)
    String getProfession();
            
    /**
     * <p>id(0x3a46)</p>
     */
    @ComProperty(name = "Profession", dispId = 0x3a46)
    void setProfession(String param0);
            
    /**
     * <p>id(0x3a1d)</p>
     */
    @ComProperty(name = "RadioTelephoneNumber", dispId = 0x3a1d)
    String getRadioTelephoneNumber();
            
    /**
     * <p>id(0x3a1d)</p>
     */
    @ComProperty(name = "RadioTelephoneNumber", dispId = 0x3a1d)
    void setRadioTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a47)</p>
     */
    @ComProperty(name = "ReferredBy", dispId = 0x3a47)
    String getReferredBy();
            
    /**
     * <p>id(0x3a47)</p>
     */
    @ComProperty(name = "ReferredBy", dispId = 0x3a47)
    void setReferredBy(String param0);
            
    /**
     * <p>id(0x8022)</p>
     */
    @ComProperty(name = "SelectedMailingAddress", dispId = 0x8022)
    OlMailingAddress getSelectedMailingAddress();
            
    /**
     * <p>id(0x8022)</p>
     */
    @ComProperty(name = "SelectedMailingAddress", dispId = 0x8022)
    void setSelectedMailingAddress(OlMailingAddress param0);
            
    /**
     * <p>id(0x3a48)</p>
     */
    @ComProperty(name = "Spouse", dispId = 0x3a48)
    String getSpouse();
            
    /**
     * <p>id(0x3a48)</p>
     */
    @ComProperty(name = "Spouse", dispId = 0x3a48)
    void setSpouse(String param0);
            
    /**
     * <p>id(0x3a05)</p>
     */
    @ComProperty(name = "Suffix", dispId = 0x3a05)
    String getSuffix();
            
    /**
     * <p>id(0x3a05)</p>
     */
    @ComProperty(name = "Suffix", dispId = 0x3a05)
    void setSuffix(String param0);
            
    /**
     * <p>id(0x3a2c)</p>
     */
    @ComProperty(name = "TelexNumber", dispId = 0x3a2c)
    String getTelexNumber();
            
    /**
     * <p>id(0x3a2c)</p>
     */
    @ComProperty(name = "TelexNumber", dispId = 0x3a2c)
    void setTelexNumber(String param0);
            
    /**
     * <p>id(0x3a45)</p>
     */
    @ComProperty(name = "Title", dispId = 0x3a45)
    String getTitle();
            
    /**
     * <p>id(0x3a45)</p>
     */
    @ComProperty(name = "Title", dispId = 0x3a45)
    void setTitle(String param0);
            
    /**
     * <p>id(0x3a4b)</p>
     */
    @ComProperty(name = "TTYTDDTelephoneNumber", dispId = 0x3a4b)
    String getTTYTDDTelephoneNumber();
            
    /**
     * <p>id(0x3a4b)</p>
     */
    @ComProperty(name = "TTYTDDTelephoneNumber", dispId = 0x3a4b)
    void setTTYTDDTelephoneNumber(String param0);
            
    /**
     * <p>id(0x804f)</p>
     */
    @ComProperty(name = "User1", dispId = 0x804f)
    String getUser1();
            
    /**
     * <p>id(0x804f)</p>
     */
    @ComProperty(name = "User1", dispId = 0x804f)
    void setUser1(String param0);
            
    /**
     * <p>id(0x8050)</p>
     */
    @ComProperty(name = "User2", dispId = 0x8050)
    String getUser2();
            
    /**
     * <p>id(0x8050)</p>
     */
    @ComProperty(name = "User2", dispId = 0x8050)
    void setUser2(String param0);
            
    /**
     * <p>id(0x8051)</p>
     */
    @ComProperty(name = "User3", dispId = 0x8051)
    String getUser3();
            
    /**
     * <p>id(0x8051)</p>
     */
    @ComProperty(name = "User3", dispId = 0x8051)
    void setUser3(String param0);
            
    /**
     * <p>id(0x8052)</p>
     */
    @ComProperty(name = "User4", dispId = 0x8052)
    String getUser4();
            
    /**
     * <p>id(0x8052)</p>
     */
    @ComProperty(name = "User4", dispId = 0x8052)
    void setUser4(String param0);
            
    /**
     * <p>id(0x8016)</p>
     */
    @ComProperty(name = "UserCertificate", dispId = 0x8016)
    String getUserCertificate();
            
    /**
     * <p>id(0x8016)</p>
     */
    @ComProperty(name = "UserCertificate", dispId = 0x8016)
    void setUserCertificate(String param0);
            
    /**
     * <p>id(0x802b)</p>
     */
    @ComProperty(name = "WebPage", dispId = 0x802b)
    String getWebPage();
            
    /**
     * <p>id(0x802b)</p>
     */
    @ComProperty(name = "WebPage", dispId = 0x802b)
    void setWebPage(String param0);
            
    /**
     * <p>id(0x802e)</p>
     */
    @ComProperty(name = "YomiCompanyName", dispId = 0x802e)
    String getYomiCompanyName();
            
    /**
     * <p>id(0x802e)</p>
     */
    @ComProperty(name = "YomiCompanyName", dispId = 0x802e)
    void setYomiCompanyName(String param0);
            
    /**
     * <p>id(0x802c)</p>
     */
    @ComProperty(name = "YomiFirstName", dispId = 0x802c)
    String getYomiFirstName();
            
    /**
     * <p>id(0x802c)</p>
     */
    @ComProperty(name = "YomiFirstName", dispId = 0x802c)
    void setYomiFirstName(String param0);
            
    /**
     * <p>id(0x802d)</p>
     */
    @ComProperty(name = "YomiLastName", dispId = 0x802d)
    String getYomiLastName();
            
    /**
     * <p>id(0x802d)</p>
     */
    @ComProperty(name = "YomiLastName", dispId = 0x802d)
    void setYomiLastName(String param0);
            
    /**
     * <p>id(0xf8a1)</p>
     */
    @ComMethod(name = "ForwardAsVcard", dispId = 0xf8a1)
    MailItem ForwardAsVcard();
            
    /**
     * <p>id(0xf405)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0xfa09)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0x8038)</p>
     */
    @ComProperty(name = "LastFirstNoSpaceAndSuffix", dispId = 0x8038)
    String getLastFirstNoSpaceAndSuffix();
            
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
     * <p>id(0x8062)</p>
     */
    @ComProperty(name = "IMAddress", dispId = 0x8062)
    String getIMAddress();
            
    /**
     * <p>id(0x8062)</p>
     */
    @ComProperty(name = "IMAddress", dispId = 0x8062)
    void setIMAddress(String param0);
            
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
     * <p>id(0x8080)</p>
     */
    @ComProperty(name = "Email1DisplayName", dispId = 0x8080)
    void setEmail1DisplayName(String param0);
            
    /**
     * <p>id(0x8090)</p>
     */
    @ComProperty(name = "Email2DisplayName", dispId = 0x8090)
    void setEmail2DisplayName(String param0);
            
    /**
     * <p>id(0x80a0)</p>
     */
    @ComProperty(name = "Email3DisplayName", dispId = 0x80a0)
    void setEmail3DisplayName(String param0);
            
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
     * <p>id(0xfabd)</p>
     */
    @ComMethod(name = "AddPicture", dispId = 0xfabd)
    void AddPicture(String Path);
            
    /**
     * <p>id(0xfabe)</p>
     */
    @ComMethod(name = "RemovePicture", dispId = 0xfabe)
    void RemovePicture();
            
    /**
     * <p>id(0xfabf)</p>
     */
    @ComProperty(name = "HasPicture", dispId = 0xfabf)
    Boolean getHasPicture();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfb94)</p>
     */
    @ComMethod(name = "ForwardAsBusinessCard", dispId = 0xfb94)
    MailItem ForwardAsBusinessCard();
            
    /**
     * <p>id(0xfb95)</p>
     */
    @ComMethod(name = "ShowBusinessCardEditor", dispId = 0xfb95)
    void ShowBusinessCardEditor();
            
    /**
     * <p>id(0xfb97)</p>
     */
    @ComMethod(name = "SaveBusinessCardImage", dispId = 0xfb97)
    void SaveBusinessCardImage(String Path);
            
    /**
     * <p>id(0xfbd7)</p>
     */
    @ComMethod(name = "ShowCheckPhoneDialog", dispId = 0xfbd7)
    void ShowCheckPhoneDialog(OlContactPhoneNumber PhoneNumber);
            
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
     * <p>id(0xfc0d)</p>
     */
    @ComProperty(name = "BusinessCardLayoutXml", dispId = 0xfc0d)
    String getBusinessCardLayoutXml();
            
    /**
     * <p>id(0xfc0d)</p>
     */
    @ComProperty(name = "BusinessCardLayoutXml", dispId = 0xfc0d)
    void setBusinessCardLayoutXml(String param0);
            
    /**
     * <p>id(0xfc0e)</p>
     */
    @ComMethod(name = "ResetBusinessCard", dispId = 0xfc0e)
    void ResetBusinessCard();
            
    /**
     * <p>id(0xfc0f)</p>
     */
    @ComMethod(name = "AddBusinessCardLogoPicture", dispId = 0xfc0f)
    void AddBusinessCardLogoPicture(String Path);
            
    /**
     * <p>id(0xfc10)</p>
     */
    @ComProperty(name = "BusinessCardType", dispId = 0xfc10)
    OlBusinessCardType getBusinessCardType();
            
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
            
    /**
     * <p>id(0xfc91)</p>
     */
    @ComMethod(name = "ShowCheckFullNameDialog", dispId = 0xfc91)
    void ShowCheckFullNameDialog();
            
    /**
     * <p>id(0xfc90)</p>
     */
    @ComMethod(name = "ShowCheckAddressDialog", dispId = 0xfc90)
    void ShowCheckAddressDialog(OlMailingAddress MailingAddress);
            
    
}