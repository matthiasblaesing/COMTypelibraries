
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630C9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630C9-0000-0000-C000-000000000046}")
public interface _ExchangeUser extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3003)</p>
     */
    @ComProperty(name = "Address", dispId = 0x3003)
    String getAddress();
            
    /**
     * <p>id(0x3003)</p>
     */
    @ComProperty(name = "Address", dispId = 0x3003)
    void setAddress(String param0);
            
    /**
     * <p>id(0x3900)</p>
     */
    @ComProperty(name = "DisplayType", dispId = 0x3900)
    OlDisplayType getDisplayType();
            
    /**
     * <p>id(0xf01e)</p>
     */
    @ComProperty(name = "ID", dispId = 0xf01e)
    String getID();
            
    /**
     * <p>id(0x303)</p>
     */
    @ComProperty(name = "Manager", dispId = 0x303)
    AddressEntry getManager();
            
    /**
     * <p>id(0xf100)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    com.sun.jna.platform.win32.COM.util.IUnknown getMAPIOBJECT();
            
    /**
     * <p>id(0xf100)</p>
     */
    @ComProperty(name = "MAPIOBJECT", dispId = 0xf100)
    void setMAPIOBJECT(com.sun.jna.platform.win32.COM.util.IUnknown param0);
            
    /**
     * <p>id(0x304)</p>
     */
    @ComProperty(name = "Members", dispId = 0x304)
    AddressEntries getMembers();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3002)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3002)
    String getType();
            
    /**
     * <p>id(0x3002)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3002)
    void setType(String param0);
            
    /**
     * <p>id(0x302)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x302)
    void Delete();
            
    /**
     * <p>id(0x301)</p>
     */
    @ComMethod(name = "Details", dispId = 0x301)
    void Details(Object HWnd);
            
    /**
     * <p>id(0x306)</p>
     */
    @ComMethod(name = "GetFreeBusy", dispId = 0x306)
    String GetFreeBusy(java.util.Date Start,
            Integer MinPerChar,
            Object CompleteFormat);
            
    /**
     * <p>id(0x300)</p>
     */
    @ComMethod(name = "Update", dispId = 0x300)
    void Update(Object MakePermanent,
            Object Refresh);
            
    /**
     * <p>id(0x307)</p>
     */
    @ComMethod(name = "UpdateFreeBusy", dispId = 0x307)
    void UpdateFreeBusy();
            
    /**
     * <p>id(0xfaf0)</p>
     */
    @ComMethod(name = "GetContact", dispId = 0xfaf0)
    _ContactItem GetContact();
            
    /**
     * <p>id(0xfaf1)</p>
     */
    @ComMethod(name = "GetExchangeUser", dispId = 0xfaf1)
    ExchangeUser GetExchangeUser();
            
    /**
     * <p>id(0xfaf2)</p>
     */
    @ComProperty(name = "AddressEntryUserType", dispId = 0xfaf2)
    OlAddressEntryUserType getAddressEntryUserType();
            
    /**
     * <p>id(0xfaef)</p>
     */
    @ComMethod(name = "GetExchangeDistributionList", dispId = 0xfaef)
    ExchangeDistributionList GetExchangeDistributionList();
            
    /**
     * <p>id(0xfafd)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfaf3)</p>
     */
    @ComMethod(name = "GetDirectReports", dispId = 0xfaf3)
    AddressEntries GetDirectReports();
            
    /**
     * <p>id(0xfaf4)</p>
     */
    @ComMethod(name = "GetMemberOfList", dispId = 0xfaf4)
    AddressEntries GetMemberOfList();
            
    /**
     * <p>id(0x3a00)</p>
     */
    @ComProperty(name = "Alias", dispId = 0x3a00)
    String getAlias();
            
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
     * <p>id(0x3a27)</p>
     */
    @ComProperty(name = "City", dispId = 0x3a27)
    String getCity();
            
    /**
     * <p>id(0x3a27)</p>
     */
    @ComProperty(name = "City", dispId = 0x3a27)
    void setCity(String param0);
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x3004)
    String getComments();
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x3004)
    void setComments(String param0);
            
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
     * <p>id(0x3a2a)</p>
     */
    @ComProperty(name = "PostalCode", dispId = 0x3a2a)
    String getPostalCode();
            
    /**
     * <p>id(0x3a2a)</p>
     */
    @ComProperty(name = "PostalCode", dispId = 0x3a2a)
    void setPostalCode(String param0);
            
    /**
     * <p>id(0xfaf5)</p>
     */
    @ComProperty(name = "PrimarySmtpAddress", dispId = 0xfaf5)
    String getPrimarySmtpAddress();
            
    /**
     * <p>id(0x3a28)</p>
     */
    @ComProperty(name = "StateOrProvince", dispId = 0x3a28)
    String getStateOrProvince();
            
    /**
     * <p>id(0x3a28)</p>
     */
    @ComProperty(name = "StateOrProvince", dispId = 0x3a28)
    void setStateOrProvince(String param0);
            
    /**
     * <p>id(0x3a29)</p>
     */
    @ComProperty(name = "StreetAddress", dispId = 0x3a29)
    String getStreetAddress();
            
    /**
     * <p>id(0x3a29)</p>
     */
    @ComProperty(name = "StreetAddress", dispId = 0x3a29)
    void setStreetAddress(String param0);
            
    /**
     * <p>id(0xfaf9)</p>
     */
    @ComMethod(name = "GetExchangeUserManager", dispId = 0xfaf9)
    ExchangeUser GetExchangeUserManager();
            
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
     * <p>id(0xfbe7)</p>
     */
    @ComProperty(name = "YomiDisplayName", dispId = 0xfbe7)
    String getYomiDisplayName();
            
    /**
     * <p>id(0xfbe7)</p>
     */
    @ComProperty(name = "YomiDisplayName", dispId = 0xfbe7)
    void setYomiDisplayName(String param0);
            
    /**
     * <p>id(0xfbe8)</p>
     */
    @ComProperty(name = "YomiDepartment", dispId = 0xfbe8)
    String getYomiDepartment();
            
    /**
     * <p>id(0xfbe8)</p>
     */
    @ComProperty(name = "YomiDepartment", dispId = 0xfbe8)
    void setYomiDepartment(String param0);
            
    /**
     * <p>id(0xfc77)</p>
     */
    @ComMethod(name = "GetPicture", dispId = 0xfc77)
    eu.doppel_helix.jna.tlb.stdole2.Picture GetPicture();
            
    
}