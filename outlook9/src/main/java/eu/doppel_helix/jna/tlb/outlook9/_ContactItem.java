
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
     * <p>id(0x3a00)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Account", dispId = 0x3a00)
    String getAccount();
            
    /**
     * <p>id(0x3a00)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Account", dispId = 0x3a00)
    void setAccount(String param0);
            
    /**
     * <p>id(0x3a41)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Anniversary", dispId = 0x3a41)
    java.util.Date getAnniversary();
            
    /**
     * <p>id(0x3a41)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "Anniversary", dispId = 0x3a41)
    void setAnniversary(java.util.Date param0);
            
    /**
     * <p>id(0x3a30)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "AssistantName", dispId = 0x3a30)
    String getAssistantName();
            
    /**
     * <p>id(0x3a30)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AssistantName", dispId = 0x3a30)
    void setAssistantName(String param0);
            
    /**
     * <p>id(0x3a2e)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "AssistantTelephoneNumber", dispId = 0x3a2e)
    String getAssistantTelephoneNumber();
            
    /**
     * <p>id(0x3a2e)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AssistantTelephoneNumber", dispId = 0x3a2e)
    void setAssistantTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a42)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Birthday", dispId = 0x3a42)
    java.util.Date getBirthday();
            
    /**
     * <p>id(0x3a42)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "Birthday", dispId = 0x3a42)
    void setBirthday(java.util.Date param0);
            
    /**
     * <p>id(0x3a1b)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Business2TelephoneNumber", dispId = 0x3a1b)
    String getBusiness2TelephoneNumber();
            
    /**
     * <p>id(0x3a1b)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Business2TelephoneNumber", dispId = 0x3a1b)
    void setBusiness2TelephoneNumber(String param0);
            
    /**
     * <p>id(0x801b)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "BusinessAddress", dispId = 0x801b)
    String getBusinessAddress();
            
    /**
     * <p>id(0x801b)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddress", dispId = 0x801b)
    void setBusinessAddress(String param0);
            
    /**
     * <p>id(0x8046)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "BusinessAddressCity", dispId = 0x8046)
    String getBusinessAddressCity();
            
    /**
     * <p>id(0x8046)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressCity", dispId = 0x8046)
    void setBusinessAddressCity(String param0);
            
    /**
     * <p>id(0x8049)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "BusinessAddressCountry", dispId = 0x8049)
    String getBusinessAddressCountry();
            
    /**
     * <p>id(0x8049)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressCountry", dispId = 0x8049)
    void setBusinessAddressCountry(String param0);
            
    /**
     * <p>id(0x8048)</p>
     * <p>vtableId(74)</p>
     */
    @ComProperty(name = "BusinessAddressPostalCode", dispId = 0x8048)
    String getBusinessAddressPostalCode();
            
    /**
     * <p>id(0x8048)</p>
     * <p>vtableId(75)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressPostalCode", dispId = 0x8048)
    void setBusinessAddressPostalCode(String param0);
            
    /**
     * <p>id(0x804a)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "BusinessAddressPostOfficeBox", dispId = 0x804a)
    String getBusinessAddressPostOfficeBox();
            
    /**
     * <p>id(0x804a)</p>
     * <p>vtableId(77)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressPostOfficeBox", dispId = 0x804a)
    void setBusinessAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x8047)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "BusinessAddressState", dispId = 0x8047)
    String getBusinessAddressState();
            
    /**
     * <p>id(0x8047)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressState", dispId = 0x8047)
    void setBusinessAddressState(String param0);
            
    /**
     * <p>id(0x8045)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "BusinessAddressStreet", dispId = 0x8045)
    String getBusinessAddressStreet();
            
    /**
     * <p>id(0x8045)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessAddressStreet", dispId = 0x8045)
    void setBusinessAddressStreet(String param0);
            
    /**
     * <p>id(0x3a24)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "BusinessFaxNumber", dispId = 0x3a24)
    String getBusinessFaxNumber();
            
    /**
     * <p>id(0x3a24)</p>
     * <p>vtableId(83)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessFaxNumber", dispId = 0x3a24)
    void setBusinessFaxNumber(String param0);
            
    /**
     * <p>id(0x3a51)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "BusinessHomePage", dispId = 0x3a51)
    String getBusinessHomePage();
            
    /**
     * <p>id(0x3a51)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessHomePage", dispId = 0x3a51)
    void setBusinessHomePage(String param0);
            
    /**
     * <p>id(0x3a08)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "BusinessTelephoneNumber", dispId = 0x3a08)
    String getBusinessTelephoneNumber();
            
    /**
     * <p>id(0x3a08)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessTelephoneNumber", dispId = 0x3a08)
    void setBusinessTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a02)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "CallbackTelephoneNumber", dispId = 0x3a02)
    String getCallbackTelephoneNumber();
            
    /**
     * <p>id(0x3a02)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CallbackTelephoneNumber", dispId = 0x3a02)
    void setCallbackTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a1e)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "CarTelephoneNumber", dispId = 0x3a1e)
    String getCarTelephoneNumber();
            
    /**
     * <p>id(0x3a1e)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CarTelephoneNumber", dispId = 0x3a1e)
    void setCarTelephoneNumber(String param0);
            
    /**
     * <p>id(0x800c)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "Children", dispId = 0x800c)
    String getChildren();
            
    /**
     * <p>id(0x800c)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Children", dispId = 0x800c)
    void setChildren(String param0);
            
    /**
     * <p>id(0x8018)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "CompanyAndFullName", dispId = 0x8018)
    String getCompanyAndFullName();
            
    /**
     * <p>id(0x8032)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "CompanyLastFirstNoSpace", dispId = 0x8032)
    String getCompanyLastFirstNoSpace();
            
    /**
     * <p>id(0x8033)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "CompanyLastFirstSpaceOnly", dispId = 0x8033)
    String getCompanyLastFirstSpaceOnly();
            
    /**
     * <p>id(0x3a57)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "CompanyMainTelephoneNumber", dispId = 0x3a57)
    String getCompanyMainTelephoneNumber();
            
    /**
     * <p>id(0x3a57)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CompanyMainTelephoneNumber", dispId = 0x3a57)
    void setCompanyMainTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a16)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "CompanyName", dispId = 0x3a16)
    String getCompanyName();
            
    /**
     * <p>id(0x3a16)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CompanyName", dispId = 0x3a16)
    void setCompanyName(String param0);
            
    /**
     * <p>id(0x3a49)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "ComputerNetworkName", dispId = 0x3a49)
    String getComputerNetworkName();
            
    /**
     * <p>id(0x3a49)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ComputerNetworkName", dispId = 0x3a49)
    void setComputerNetworkName(String param0);
            
    /**
     * <p>id(0x3a4a)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "CustomerID", dispId = 0x3a4a)
    String getCustomerID();
            
    /**
     * <p>id(0x3a4a)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CustomerID", dispId = 0x3a4a)
    void setCustomerID(String param0);
            
    /**
     * <p>id(0x3a18)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "Department", dispId = 0x3a18)
    String getDepartment();
            
    /**
     * <p>id(0x3a18)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Department", dispId = 0x3a18)
    void setDepartment(String param0);
            
    /**
     * <p>id(0x8083)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "Email1Address", dispId = 0x8083)
    String getEmail1Address();
            
    /**
     * <p>id(0x8083)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email1Address", dispId = 0x8083)
    void setEmail1Address(String param0);
            
    /**
     * <p>id(0x8082)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "Email1AddressType", dispId = 0x8082)
    String getEmail1AddressType();
            
    /**
     * <p>id(0x8082)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email1AddressType", dispId = 0x8082)
    void setEmail1AddressType(String param0);
            
    /**
     * <p>id(0x8080)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "Email1DisplayName", dispId = 0x8080)
    String getEmail1DisplayName();
            
    /**
     * <p>id(0x8085)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "Email1EntryID", dispId = 0x8085)
    String getEmail1EntryID();
            
    /**
     * <p>id(0x8093)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "Email2Address", dispId = 0x8093)
    String getEmail2Address();
            
    /**
     * <p>id(0x8093)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email2Address", dispId = 0x8093)
    void setEmail2Address(String param0);
            
    /**
     * <p>id(0x8092)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "Email2AddressType", dispId = 0x8092)
    String getEmail2AddressType();
            
    /**
     * <p>id(0x8092)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email2AddressType", dispId = 0x8092)
    void setEmail2AddressType(String param0);
            
    /**
     * <p>id(0x8090)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "Email2DisplayName", dispId = 0x8090)
    String getEmail2DisplayName();
            
    /**
     * <p>id(0x8095)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "Email2EntryID", dispId = 0x8095)
    String getEmail2EntryID();
            
    /**
     * <p>id(0x80a3)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "Email3Address", dispId = 0x80a3)
    String getEmail3Address();
            
    /**
     * <p>id(0x80a3)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email3Address", dispId = 0x80a3)
    void setEmail3Address(String param0);
            
    /**
     * <p>id(0x80a2)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "Email3AddressType", dispId = 0x80a2)
    String getEmail3AddressType();
            
    /**
     * <p>id(0x80a2)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email3AddressType", dispId = 0x80a2)
    void setEmail3AddressType(String param0);
            
    /**
     * <p>id(0x80a0)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "Email3DisplayName", dispId = 0x80a0)
    String getEmail3DisplayName();
            
    /**
     * <p>id(0x80a5)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "Email3EntryID", dispId = 0x80a5)
    String getEmail3EntryID();
            
    /**
     * <p>id(0x8005)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "FileAs", dispId = 0x8005)
    String getFileAs();
            
    /**
     * <p>id(0x8005)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FileAs", dispId = 0x8005)
    void setFileAs(String param0);
            
    /**
     * <p>id(0x3a06)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "FirstName", dispId = 0x3a06)
    String getFirstName();
            
    /**
     * <p>id(0x3a06)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FirstName", dispId = 0x3a06)
    void setFirstName(String param0);
            
    /**
     * <p>id(0x3a4c)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "FTPSite", dispId = 0x3a4c)
    String getFTPSite();
            
    /**
     * <p>id(0x3a4c)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FTPSite", dispId = 0x3a4c)
    void setFTPSite(String param0);
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x3001)
    String getFullName();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FullName", dispId = 0x3001)
    void setFullName(String param0);
            
    /**
     * <p>id(0x8019)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "FullNameAndCompany", dispId = 0x8019)
    String getFullNameAndCompany();
            
    /**
     * <p>id(0x3a4d)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "Gender", dispId = 0x3a4d)
    OlGender getGender();
            
    /**
     * <p>id(0x3a4d)</p>
     * <p>vtableId(135)</p>
     * @param param0 [in] {@code OlGender}
     */
    @ComProperty(name = "Gender", dispId = 0x3a4d)
    void setGender(OlGender param0);
            
    /**
     * <p>id(0x3a07)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "GovernmentIDNumber", dispId = 0x3a07)
    String getGovernmentIDNumber();
            
    /**
     * <p>id(0x3a07)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "GovernmentIDNumber", dispId = 0x3a07)
    void setGovernmentIDNumber(String param0);
            
    /**
     * <p>id(0x3a43)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "Hobby", dispId = 0x3a43)
    String getHobby();
            
    /**
     * <p>id(0x3a43)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Hobby", dispId = 0x3a43)
    void setHobby(String param0);
            
    /**
     * <p>id(0x3a2f)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "Home2TelephoneNumber", dispId = 0x3a2f)
    String getHome2TelephoneNumber();
            
    /**
     * <p>id(0x3a2f)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Home2TelephoneNumber", dispId = 0x3a2f)
    void setHome2TelephoneNumber(String param0);
            
    /**
     * <p>id(0x801a)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "HomeAddress", dispId = 0x801a)
    String getHomeAddress();
            
    /**
     * <p>id(0x801a)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddress", dispId = 0x801a)
    void setHomeAddress(String param0);
            
    /**
     * <p>id(0x3a59)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "HomeAddressCity", dispId = 0x3a59)
    String getHomeAddressCity();
            
    /**
     * <p>id(0x3a59)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressCity", dispId = 0x3a59)
    void setHomeAddressCity(String param0);
            
    /**
     * <p>id(0x3a5a)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "HomeAddressCountry", dispId = 0x3a5a)
    String getHomeAddressCountry();
            
    /**
     * <p>id(0x3a5a)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressCountry", dispId = 0x3a5a)
    void setHomeAddressCountry(String param0);
            
    /**
     * <p>id(0x3a5b)</p>
     * <p>vtableId(148)</p>
     */
    @ComProperty(name = "HomeAddressPostalCode", dispId = 0x3a5b)
    String getHomeAddressPostalCode();
            
    /**
     * <p>id(0x3a5b)</p>
     * <p>vtableId(149)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressPostalCode", dispId = 0x3a5b)
    void setHomeAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a5e)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "HomeAddressPostOfficeBox", dispId = 0x3a5e)
    String getHomeAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a5e)</p>
     * <p>vtableId(151)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressPostOfficeBox", dispId = 0x3a5e)
    void setHomeAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a5c)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "HomeAddressState", dispId = 0x3a5c)
    String getHomeAddressState();
            
    /**
     * <p>id(0x3a5c)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressState", dispId = 0x3a5c)
    void setHomeAddressState(String param0);
            
    /**
     * <p>id(0x3a5d)</p>
     * <p>vtableId(154)</p>
     */
    @ComProperty(name = "HomeAddressStreet", dispId = 0x3a5d)
    String getHomeAddressStreet();
            
    /**
     * <p>id(0x3a5d)</p>
     * <p>vtableId(155)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeAddressStreet", dispId = 0x3a5d)
    void setHomeAddressStreet(String param0);
            
    /**
     * <p>id(0x3a25)</p>
     * <p>vtableId(156)</p>
     */
    @ComProperty(name = "HomeFaxNumber", dispId = 0x3a25)
    String getHomeFaxNumber();
            
    /**
     * <p>id(0x3a25)</p>
     * <p>vtableId(157)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeFaxNumber", dispId = 0x3a25)
    void setHomeFaxNumber(String param0);
            
    /**
     * <p>id(0x3a09)</p>
     * <p>vtableId(158)</p>
     */
    @ComProperty(name = "HomeTelephoneNumber", dispId = 0x3a09)
    String getHomeTelephoneNumber();
            
    /**
     * <p>id(0x3a09)</p>
     * <p>vtableId(159)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "HomeTelephoneNumber", dispId = 0x3a09)
    void setHomeTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a0a)</p>
     * <p>vtableId(160)</p>
     */
    @ComProperty(name = "Initials", dispId = 0x3a0a)
    String getInitials();
            
    /**
     * <p>id(0x3a0a)</p>
     * <p>vtableId(161)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Initials", dispId = 0x3a0a)
    void setInitials(String param0);
            
    /**
     * <p>id(0x80d8)</p>
     * <p>vtableId(162)</p>
     */
    @ComProperty(name = "InternetFreeBusyAddress", dispId = 0x80d8)
    String getInternetFreeBusyAddress();
            
    /**
     * <p>id(0x80d8)</p>
     * <p>vtableId(163)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InternetFreeBusyAddress", dispId = 0x80d8)
    void setInternetFreeBusyAddress(String param0);
            
    /**
     * <p>id(0x3a2d)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "ISDNNumber", dispId = 0x3a2d)
    String getISDNNumber();
            
    /**
     * <p>id(0x3a2d)</p>
     * <p>vtableId(165)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ISDNNumber", dispId = 0x3a2d)
    void setISDNNumber(String param0);
            
    /**
     * <p>id(0x3a17)</p>
     * <p>vtableId(166)</p>
     */
    @ComProperty(name = "JobTitle", dispId = 0x3a17)
    String getJobTitle();
            
    /**
     * <p>id(0x3a17)</p>
     * <p>vtableId(167)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "JobTitle", dispId = 0x3a17)
    void setJobTitle(String param0);
            
    /**
     * <p>id(0x8025)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "Journal", dispId = 0x8025)
    Boolean getJournal();
            
    /**
     * <p>id(0x8025)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Journal", dispId = 0x8025)
    void setJournal(Boolean param0);
            
    /**
     * <p>id(0x3a0c)</p>
     * <p>vtableId(170)</p>
     */
    @ComProperty(name = "Language", dispId = 0x3a0c)
    String getLanguage();
            
    /**
     * <p>id(0x3a0c)</p>
     * <p>vtableId(171)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Language", dispId = 0x3a0c)
    void setLanguage(String param0);
            
    /**
     * <p>id(0x8036)</p>
     * <p>vtableId(172)</p>
     */
    @ComProperty(name = "LastFirstAndSuffix", dispId = 0x8036)
    String getLastFirstAndSuffix();
            
    /**
     * <p>id(0x8030)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "LastFirstNoSpace", dispId = 0x8030)
    String getLastFirstNoSpace();
            
    /**
     * <p>id(0x8034)</p>
     * <p>vtableId(174)</p>
     */
    @ComProperty(name = "LastFirstNoSpaceCompany", dispId = 0x8034)
    String getLastFirstNoSpaceCompany();
            
    /**
     * <p>id(0x8031)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "LastFirstSpaceOnly", dispId = 0x8031)
    String getLastFirstSpaceOnly();
            
    /**
     * <p>id(0x8035)</p>
     * <p>vtableId(176)</p>
     */
    @ComProperty(name = "LastFirstSpaceOnlyCompany", dispId = 0x8035)
    String getLastFirstSpaceOnlyCompany();
            
    /**
     * <p>id(0x3a11)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "LastName", dispId = 0x3a11)
    String getLastName();
            
    /**
     * <p>id(0x3a11)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LastName", dispId = 0x3a11)
    void setLastName(String param0);
            
    /**
     * <p>id(0x8017)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "LastNameAndFirstName", dispId = 0x8017)
    String getLastNameAndFirstName();
            
    /**
     * <p>id(0x3a15)</p>
     * <p>vtableId(180)</p>
     */
    @ComProperty(name = "MailingAddress", dispId = 0x3a15)
    String getMailingAddress();
            
    /**
     * <p>id(0x3a15)</p>
     * <p>vtableId(181)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddress", dispId = 0x3a15)
    void setMailingAddress(String param0);
            
    /**
     * <p>id(0x3a27)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "MailingAddressCity", dispId = 0x3a27)
    String getMailingAddressCity();
            
    /**
     * <p>id(0x3a27)</p>
     * <p>vtableId(183)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressCity", dispId = 0x3a27)
    void setMailingAddressCity(String param0);
            
    /**
     * <p>id(0x3a26)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "MailingAddressCountry", dispId = 0x3a26)
    String getMailingAddressCountry();
            
    /**
     * <p>id(0x3a26)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressCountry", dispId = 0x3a26)
    void setMailingAddressCountry(String param0);
            
    /**
     * <p>id(0x3a2a)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "MailingAddressPostalCode", dispId = 0x3a2a)
    String getMailingAddressPostalCode();
            
    /**
     * <p>id(0x3a2a)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressPostalCode", dispId = 0x3a2a)
    void setMailingAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a2b)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "MailingAddressPostOfficeBox", dispId = 0x3a2b)
    String getMailingAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a2b)</p>
     * <p>vtableId(189)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressPostOfficeBox", dispId = 0x3a2b)
    void setMailingAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a28)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "MailingAddressState", dispId = 0x3a28)
    String getMailingAddressState();
            
    /**
     * <p>id(0x3a28)</p>
     * <p>vtableId(191)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressState", dispId = 0x3a28)
    void setMailingAddressState(String param0);
            
    /**
     * <p>id(0x3a29)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "MailingAddressStreet", dispId = 0x3a29)
    String getMailingAddressStreet();
            
    /**
     * <p>id(0x3a29)</p>
     * <p>vtableId(193)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailingAddressStreet", dispId = 0x3a29)
    void setMailingAddressStreet(String param0);
            
    /**
     * <p>id(0x3a4e)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "ManagerName", dispId = 0x3a4e)
    String getManagerName();
            
    /**
     * <p>id(0x3a4e)</p>
     * <p>vtableId(195)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ManagerName", dispId = 0x3a4e)
    void setManagerName(String param0);
            
    /**
     * <p>id(0x3a44)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "MiddleName", dispId = 0x3a44)
    String getMiddleName();
            
    /**
     * <p>id(0x3a44)</p>
     * <p>vtableId(197)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MiddleName", dispId = 0x3a44)
    void setMiddleName(String param0);
            
    /**
     * <p>id(0x3a1c)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "MobileTelephoneNumber", dispId = 0x3a1c)
    String getMobileTelephoneNumber();
            
    /**
     * <p>id(0x3a1c)</p>
     * <p>vtableId(199)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MobileTelephoneNumber", dispId = 0x3a1c)
    void setMobileTelephoneNumber(String param0);
            
    /**
     * <p>id(0x805f)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "NetMeetingAlias", dispId = 0x805f)
    String getNetMeetingAlias();
            
    /**
     * <p>id(0x805f)</p>
     * <p>vtableId(201)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetMeetingAlias", dispId = 0x805f)
    void setNetMeetingAlias(String param0);
            
    /**
     * <p>id(0x8060)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8060)
    String getNetMeetingServer();
            
    /**
     * <p>id(0x8060)</p>
     * <p>vtableId(203)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NetMeetingServer", dispId = 0x8060)
    void setNetMeetingServer(String param0);
            
    /**
     * <p>id(0x3a4f)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "NickName", dispId = 0x3a4f)
    String getNickName();
            
    /**
     * <p>id(0x3a4f)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NickName", dispId = 0x3a4f)
    void setNickName(String param0);
            
    /**
     * <p>id(0x3a19)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "OfficeLocation", dispId = 0x3a19)
    String getOfficeLocation();
            
    /**
     * <p>id(0x3a19)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OfficeLocation", dispId = 0x3a19)
    void setOfficeLocation(String param0);
            
    /**
     * <p>id(0x3a10)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "OrganizationalIDNumber", dispId = 0x3a10)
    String getOrganizationalIDNumber();
            
    /**
     * <p>id(0x3a10)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OrganizationalIDNumber", dispId = 0x3a10)
    void setOrganizationalIDNumber(String param0);
            
    /**
     * <p>id(0x801c)</p>
     * <p>vtableId(210)</p>
     */
    @ComProperty(name = "OtherAddress", dispId = 0x801c)
    String getOtherAddress();
            
    /**
     * <p>id(0x801c)</p>
     * <p>vtableId(211)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddress", dispId = 0x801c)
    void setOtherAddress(String param0);
            
    /**
     * <p>id(0x3a5f)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "OtherAddressCity", dispId = 0x3a5f)
    String getOtherAddressCity();
            
    /**
     * <p>id(0x3a5f)</p>
     * <p>vtableId(213)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressCity", dispId = 0x3a5f)
    void setOtherAddressCity(String param0);
            
    /**
     * <p>id(0x3a60)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "OtherAddressCountry", dispId = 0x3a60)
    String getOtherAddressCountry();
            
    /**
     * <p>id(0x3a60)</p>
     * <p>vtableId(215)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressCountry", dispId = 0x3a60)
    void setOtherAddressCountry(String param0);
            
    /**
     * <p>id(0x3a61)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "OtherAddressPostalCode", dispId = 0x3a61)
    String getOtherAddressPostalCode();
            
    /**
     * <p>id(0x3a61)</p>
     * <p>vtableId(217)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressPostalCode", dispId = 0x3a61)
    void setOtherAddressPostalCode(String param0);
            
    /**
     * <p>id(0x3a64)</p>
     * <p>vtableId(218)</p>
     */
    @ComProperty(name = "OtherAddressPostOfficeBox", dispId = 0x3a64)
    String getOtherAddressPostOfficeBox();
            
    /**
     * <p>id(0x3a64)</p>
     * <p>vtableId(219)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressPostOfficeBox", dispId = 0x3a64)
    void setOtherAddressPostOfficeBox(String param0);
            
    /**
     * <p>id(0x3a62)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "OtherAddressState", dispId = 0x3a62)
    String getOtherAddressState();
            
    /**
     * <p>id(0x3a62)</p>
     * <p>vtableId(221)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressState", dispId = 0x3a62)
    void setOtherAddressState(String param0);
            
    /**
     * <p>id(0x3a63)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "OtherAddressStreet", dispId = 0x3a63)
    String getOtherAddressStreet();
            
    /**
     * <p>id(0x3a63)</p>
     * <p>vtableId(223)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherAddressStreet", dispId = 0x3a63)
    void setOtherAddressStreet(String param0);
            
    /**
     * <p>id(0x3a23)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "OtherFaxNumber", dispId = 0x3a23)
    String getOtherFaxNumber();
            
    /**
     * <p>id(0x3a23)</p>
     * <p>vtableId(225)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherFaxNumber", dispId = 0x3a23)
    void setOtherFaxNumber(String param0);
            
    /**
     * <p>id(0x3a1f)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "OtherTelephoneNumber", dispId = 0x3a1f)
    String getOtherTelephoneNumber();
            
    /**
     * <p>id(0x3a1f)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OtherTelephoneNumber", dispId = 0x3a1f)
    void setOtherTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a21)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "PagerNumber", dispId = 0x3a21)
    String getPagerNumber();
            
    /**
     * <p>id(0x3a21)</p>
     * <p>vtableId(229)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PagerNumber", dispId = 0x3a21)
    void setPagerNumber(String param0);
            
    /**
     * <p>id(0x3a50)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "PersonalHomePage", dispId = 0x3a50)
    String getPersonalHomePage();
            
    /**
     * <p>id(0x3a50)</p>
     * <p>vtableId(231)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PersonalHomePage", dispId = 0x3a50)
    void setPersonalHomePage(String param0);
            
    /**
     * <p>id(0x3a1a)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "PrimaryTelephoneNumber", dispId = 0x3a1a)
    String getPrimaryTelephoneNumber();
            
    /**
     * <p>id(0x3a1a)</p>
     * <p>vtableId(233)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PrimaryTelephoneNumber", dispId = 0x3a1a)
    void setPrimaryTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a46)</p>
     * <p>vtableId(234)</p>
     */
    @ComProperty(name = "Profession", dispId = 0x3a46)
    String getProfession();
            
    /**
     * <p>id(0x3a46)</p>
     * <p>vtableId(235)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Profession", dispId = 0x3a46)
    void setProfession(String param0);
            
    /**
     * <p>id(0x3a1d)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "RadioTelephoneNumber", dispId = 0x3a1d)
    String getRadioTelephoneNumber();
            
    /**
     * <p>id(0x3a1d)</p>
     * <p>vtableId(237)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RadioTelephoneNumber", dispId = 0x3a1d)
    void setRadioTelephoneNumber(String param0);
            
    /**
     * <p>id(0x3a47)</p>
     * <p>vtableId(238)</p>
     */
    @ComProperty(name = "ReferredBy", dispId = 0x3a47)
    String getReferredBy();
            
    /**
     * <p>id(0x3a47)</p>
     * <p>vtableId(239)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReferredBy", dispId = 0x3a47)
    void setReferredBy(String param0);
            
    /**
     * <p>id(0x8022)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "SelectedMailingAddress", dispId = 0x8022)
    OlMailingAddress getSelectedMailingAddress();
            
    /**
     * <p>id(0x8022)</p>
     * <p>vtableId(241)</p>
     * @param param0 [in] {@code OlMailingAddress}
     */
    @ComProperty(name = "SelectedMailingAddress", dispId = 0x8022)
    void setSelectedMailingAddress(OlMailingAddress param0);
            
    /**
     * <p>id(0x3a48)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "Spouse", dispId = 0x3a48)
    String getSpouse();
            
    /**
     * <p>id(0x3a48)</p>
     * <p>vtableId(243)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Spouse", dispId = 0x3a48)
    void setSpouse(String param0);
            
    /**
     * <p>id(0x3a05)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "Suffix", dispId = 0x3a05)
    String getSuffix();
            
    /**
     * <p>id(0x3a05)</p>
     * <p>vtableId(245)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Suffix", dispId = 0x3a05)
    void setSuffix(String param0);
            
    /**
     * <p>id(0x3a2c)</p>
     * <p>vtableId(246)</p>
     */
    @ComProperty(name = "TelexNumber", dispId = 0x3a2c)
    String getTelexNumber();
            
    /**
     * <p>id(0x3a2c)</p>
     * <p>vtableId(247)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TelexNumber", dispId = 0x3a2c)
    void setTelexNumber(String param0);
            
    /**
     * <p>id(0x3a45)</p>
     * <p>vtableId(248)</p>
     */
    @ComProperty(name = "Title", dispId = 0x3a45)
    String getTitle();
            
    /**
     * <p>id(0x3a45)</p>
     * <p>vtableId(249)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x3a45)
    void setTitle(String param0);
            
    /**
     * <p>id(0x3a4b)</p>
     * <p>vtableId(250)</p>
     */
    @ComProperty(name = "TTYTDDTelephoneNumber", dispId = 0x3a4b)
    String getTTYTDDTelephoneNumber();
            
    /**
     * <p>id(0x3a4b)</p>
     * <p>vtableId(251)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TTYTDDTelephoneNumber", dispId = 0x3a4b)
    void setTTYTDDTelephoneNumber(String param0);
            
    /**
     * <p>id(0x804f)</p>
     * <p>vtableId(252)</p>
     */
    @ComProperty(name = "User1", dispId = 0x804f)
    String getUser1();
            
    /**
     * <p>id(0x804f)</p>
     * <p>vtableId(253)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "User1", dispId = 0x804f)
    void setUser1(String param0);
            
    /**
     * <p>id(0x8050)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "User2", dispId = 0x8050)
    String getUser2();
            
    /**
     * <p>id(0x8050)</p>
     * <p>vtableId(255)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "User2", dispId = 0x8050)
    void setUser2(String param0);
            
    /**
     * <p>id(0x8051)</p>
     * <p>vtableId(256)</p>
     */
    @ComProperty(name = "User3", dispId = 0x8051)
    String getUser3();
            
    /**
     * <p>id(0x8051)</p>
     * <p>vtableId(257)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "User3", dispId = 0x8051)
    void setUser3(String param0);
            
    /**
     * <p>id(0x8052)</p>
     * <p>vtableId(258)</p>
     */
    @ComProperty(name = "User4", dispId = 0x8052)
    String getUser4();
            
    /**
     * <p>id(0x8052)</p>
     * <p>vtableId(259)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "User4", dispId = 0x8052)
    void setUser4(String param0);
            
    /**
     * <p>id(0x8016)</p>
     * <p>vtableId(260)</p>
     */
    @ComProperty(name = "UserCertificate", dispId = 0x8016)
    String getUserCertificate();
            
    /**
     * <p>id(0x8016)</p>
     * <p>vtableId(261)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserCertificate", dispId = 0x8016)
    void setUserCertificate(String param0);
            
    /**
     * <p>id(0x802b)</p>
     * <p>vtableId(262)</p>
     */
    @ComProperty(name = "WebPage", dispId = 0x802b)
    String getWebPage();
            
    /**
     * <p>id(0x802b)</p>
     * <p>vtableId(263)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "WebPage", dispId = 0x802b)
    void setWebPage(String param0);
            
    /**
     * <p>id(0x802e)</p>
     * <p>vtableId(264)</p>
     */
    @ComProperty(name = "YomiCompanyName", dispId = 0x802e)
    String getYomiCompanyName();
            
    /**
     * <p>id(0x802e)</p>
     * <p>vtableId(265)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "YomiCompanyName", dispId = 0x802e)
    void setYomiCompanyName(String param0);
            
    /**
     * <p>id(0x802c)</p>
     * <p>vtableId(266)</p>
     */
    @ComProperty(name = "YomiFirstName", dispId = 0x802c)
    String getYomiFirstName();
            
    /**
     * <p>id(0x802c)</p>
     * <p>vtableId(267)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "YomiFirstName", dispId = 0x802c)
    void setYomiFirstName(String param0);
            
    /**
     * <p>id(0x802d)</p>
     * <p>vtableId(268)</p>
     */
    @ComProperty(name = "YomiLastName", dispId = 0x802d)
    String getYomiLastName();
            
    /**
     * <p>id(0x802d)</p>
     * <p>vtableId(269)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "YomiLastName", dispId = 0x802d)
    void setYomiLastName(String param0);
            
    /**
     * <p>id(0xf8a1)</p>
     * <p>vtableId(270)</p>
     */
    @ComMethod(name = "ForwardAsVcard", dispId = 0xf8a1)
    MailItem ForwardAsVcard();
            
    /**
     * <p>id(0xf405)</p>
     * <p>vtableId(271)</p>
     */
    @ComProperty(name = "Links", dispId = 0xf405)
    Links getLinks();
            
    /**
     * <p>id(0xfa09)</p>
     * <p>vtableId(272)</p>
     */
    @ComProperty(name = "ItemProperties", dispId = 0xfa09)
    ItemProperties getItemProperties();
            
    /**
     * <p>id(0x8038)</p>
     * <p>vtableId(273)</p>
     */
    @ComProperty(name = "LastFirstNoSpaceAndSuffix", dispId = 0x8038)
    String getLastFirstNoSpaceAndSuffix();
            
    /**
     * <p>id(0xfa4d)</p>
     * <p>vtableId(274)</p>
     */
    @ComProperty(name = "DownloadState", dispId = 0xfa4d)
    OlDownloadState getDownloadState();
            
    /**
     * <p>id(0xfa0b)</p>
     * <p>vtableId(275)</p>
     */
    @ComMethod(name = "ShowCategoriesDialog", dispId = 0xfa0b)
    void ShowCategoriesDialog();
            
    /**
     * <p>id(0x8062)</p>
     * <p>vtableId(276)</p>
     */
    @ComProperty(name = "IMAddress", dispId = 0x8062)
    String getIMAddress();
            
    /**
     * <p>id(0x8062)</p>
     * <p>vtableId(277)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "IMAddress", dispId = 0x8062)
    void setIMAddress(String param0);
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(278)</p>
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    OlRemoteStatus getMarkForDownload();
            
    /**
     * <p>id(0x8571)</p>
     * <p>vtableId(279)</p>
     * @param param0 [in] {@code OlRemoteStatus}
     */
    @ComProperty(name = "MarkForDownload", dispId = 0x8571)
    void setMarkForDownload(OlRemoteStatus param0);
            
    /**
     * <p>id(0x8080)</p>
     * <p>vtableId(280)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email1DisplayName", dispId = 0x8080)
    void setEmail1DisplayName(String param0);
            
    /**
     * <p>id(0x8090)</p>
     * <p>vtableId(281)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email2DisplayName", dispId = 0x8090)
    void setEmail2DisplayName(String param0);
            
    /**
     * <p>id(0x80a0)</p>
     * <p>vtableId(282)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Email3DisplayName", dispId = 0x80a0)
    void setEmail3DisplayName(String param0);
            
    /**
     * <p>id(0xfaa4)</p>
     * <p>vtableId(283)</p>
     */
    @ComProperty(name = "IsConflict", dispId = 0xfaa4)
    Boolean getIsConflict();
            
    /**
     * <p>id(0xfaba)</p>
     * <p>vtableId(284)</p>
     */
    @ComProperty(name = "AutoResolvedWinner", dispId = 0xfaba)
    Boolean getAutoResolvedWinner();
            
    /**
     * <p>id(0xfabb)</p>
     * <p>vtableId(285)</p>
     */
    @ComProperty(name = "Conflicts", dispId = 0xfabb)
    Conflicts getConflicts();
            
    /**
     * <p>id(0xfabd)</p>
     * <p>vtableId(286)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "AddPicture", dispId = 0xfabd)
    void AddPicture(String Path);
            
    /**
     * <p>id(0xfabe)</p>
     * <p>vtableId(287)</p>
     */
    @ComMethod(name = "RemovePicture", dispId = 0xfabe)
    void RemovePicture();
            
    /**
     * <p>id(0xfabf)</p>
     * <p>vtableId(288)</p>
     */
    @ComProperty(name = "HasPicture", dispId = 0xfabf)
    Boolean getHasPicture();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(289)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfb94)</p>
     * <p>vtableId(290)</p>
     */
    @ComMethod(name = "ForwardAsBusinessCard", dispId = 0xfb94)
    MailItem ForwardAsBusinessCard();
            
    /**
     * <p>id(0xfb95)</p>
     * <p>vtableId(291)</p>
     */
    @ComMethod(name = "ShowBusinessCardEditor", dispId = 0xfb95)
    void ShowBusinessCardEditor();
            
    /**
     * <p>id(0xfb97)</p>
     * <p>vtableId(292)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "SaveBusinessCardImage", dispId = 0xfb97)
    void SaveBusinessCardImage(String Path);
            
    /**
     * <p>id(0xfbd7)</p>
     * <p>vtableId(293)</p>
     * @param PhoneNumber [in] {@code OlContactPhoneNumber}
     */
    @ComMethod(name = "ShowCheckPhoneDialog", dispId = 0xfbd7)
    void ShowCheckPhoneDialog(OlContactPhoneNumber PhoneNumber);
            
    /**
     * <p>id(0xfc1f)</p>
     * <p>vtableId(294)</p>
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    String getTaskSubject();
            
    /**
     * <p>id(0xfc1f)</p>
     * <p>vtableId(295)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TaskSubject", dispId = 0xfc1f)
    void setTaskSubject(String param0);
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(296)</p>
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    java.util.Date getTaskDueDate();
            
    /**
     * <p>id(0x8105)</p>
     * <p>vtableId(297)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskDueDate", dispId = 0x8105)
    void setTaskDueDate(java.util.Date param0);
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(298)</p>
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    java.util.Date getTaskStartDate();
            
    /**
     * <p>id(0x8104)</p>
     * <p>vtableId(299)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskStartDate", dispId = 0x8104)
    void setTaskStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    java.util.Date getTaskCompletedDate();
            
    /**
     * <p>id(0x810f)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TaskCompletedDate", dispId = 0x810f)
    void setTaskCompletedDate(java.util.Date param0);
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    java.util.Date getToDoTaskOrdinal();
            
    /**
     * <p>id(0x85a0)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ToDoTaskOrdinal", dispId = 0x85a0)
    void setToDoTaskOrdinal(java.util.Date param0);
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(304)</p>
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    Boolean getReminderOverrideDefault();
            
    /**
     * <p>id(0x851c)</p>
     * <p>vtableId(305)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderOverrideDefault", dispId = 0x851c)
    void setReminderOverrideDefault(Boolean param0);
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(306)</p>
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    Boolean getReminderPlaySound();
            
    /**
     * <p>id(0x851e)</p>
     * <p>vtableId(307)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderPlaySound", dispId = 0x851e)
    void setReminderPlaySound(Boolean param0);
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(308)</p>
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    Boolean getReminderSet();
            
    /**
     * <p>id(0x8503)</p>
     * <p>vtableId(309)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReminderSet", dispId = 0x8503)
    void setReminderSet(Boolean param0);
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(310)</p>
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    String getReminderSoundFile();
            
    /**
     * <p>id(0x851f)</p>
     * <p>vtableId(311)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReminderSoundFile", dispId = 0x851f)
    void setReminderSoundFile(String param0);
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    java.util.Date getReminderTime();
            
    /**
     * <p>id(0x8502)</p>
     * <p>vtableId(313)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "ReminderTime", dispId = 0x8502)
    void setReminderTime(java.util.Date param0);
            
    /**
     * <p>id(0xfbfe)</p>
     * <p>vtableId(314)</p>
     * @param MarkInterval [in] {@code OlMarkInterval}
     */
    @ComMethod(name = "MarkAsTask", dispId = 0xfbfe)
    void MarkAsTask(OlMarkInterval MarkInterval);
            
    /**
     * <p>id(0xfc09)</p>
     * <p>vtableId(315)</p>
     */
    @ComMethod(name = "ClearTaskFlag", dispId = 0xfc09)
    void ClearTaskFlag();
            
    /**
     * <p>id(0xfc0a)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "IsMarkedAsTask", dispId = 0xfc0a)
    Boolean getIsMarkedAsTask();
            
    /**
     * <p>id(0xfc0d)</p>
     * <p>vtableId(317)</p>
     */
    @ComProperty(name = "BusinessCardLayoutXml", dispId = 0xfc0d)
    String getBusinessCardLayoutXml();
            
    /**
     * <p>id(0xfc0d)</p>
     * <p>vtableId(318)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BusinessCardLayoutXml", dispId = 0xfc0d)
    void setBusinessCardLayoutXml(String param0);
            
    /**
     * <p>id(0xfc0e)</p>
     * <p>vtableId(319)</p>
     */
    @ComMethod(name = "ResetBusinessCard", dispId = 0xfc0e)
    void ResetBusinessCard();
            
    /**
     * <p>id(0xfc0f)</p>
     * <p>vtableId(320)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "AddBusinessCardLogoPicture", dispId = 0xfc0f)
    void AddBusinessCardLogoPicture(String Path);
            
    /**
     * <p>id(0xfc10)</p>
     * <p>vtableId(321)</p>
     */
    @ComProperty(name = "BusinessCardType", dispId = 0xfc10)
    OlBusinessCardType getBusinessCardType();
            
    /**
     * <p>id(0xfc54)</p>
     * <p>vtableId(322)</p>
     */
    @ComMethod(name = "GetConversation", dispId = 0xfc54)
    _Conversation GetConversation();
            
    /**
     * <p>id(0xfc75)</p>
     * <p>vtableId(323)</p>
     */
    @ComProperty(name = "ConversationID", dispId = 0xfc75)
    String getConversationID();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    Object getRTFBody();
            
    /**
     * <p>id(0xfc84)</p>
     * <p>vtableId(325)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "RTFBody", dispId = 0xfc84)
    void setRTFBody(Object param0);
            
    /**
     * <p>id(0xfc91)</p>
     * <p>vtableId(326)</p>
     */
    @ComMethod(name = "ShowCheckFullNameDialog", dispId = 0xfc91)
    void ShowCheckFullNameDialog();
            
    /**
     * <p>id(0xfc90)</p>
     * <p>vtableId(327)</p>
     * @param MailingAddress [in] {@code OlMailingAddress}
     */
    @ComMethod(name = "ShowCheckAddressDialog", dispId = 0xfc90)
    void ShowCheckAddressDialog(OlMailingAddress MailingAddress);
            
    
}