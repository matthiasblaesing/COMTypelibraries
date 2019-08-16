
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ILicAgent Interface
 *
 * <p>uuid({00194002-D9C3-11D3-8D59-0050048384E3})</p>
 */
@ComInterface(iid="{00194002-D9C3-11D3-8D59-0050048384E3}")
public interface ILicAgent extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * method Initialize
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param dwBPC [in] {@code Integer}
     * @param dwMode [in] {@code Integer}
     * @param bstrLicSource [in] {@code String}
     */
    @ComMethod(name = "Initialize", dispId = 0x1)
    Integer Initialize(Integer dwBPC,
            Integer dwMode,
            String bstrLicSource);
            
    /**
     * method GetFirstName
     *
     * <p>id(0x3)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "GetFirstName", dispId = 0x3)
    String GetFirstName();
            
    /**
     * method SetFirstName
     *
     * <p>id(0x4)</p>
     * <p>vtableId(9)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetFirstName", dispId = 0x4)
    void SetFirstName(String bstrNewVal);
            
    /**
     * method GetLastName
     *
     * <p>id(0x5)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "GetLastName", dispId = 0x5)
    String GetLastName();
            
    /**
     * method SetLastName
     *
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetLastName", dispId = 0x6)
    void SetLastName(String bstrNewVal);
            
    /**
     * method GetOrgName
     *
     * <p>id(0x7)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "GetOrgName", dispId = 0x7)
    String GetOrgName();
            
    /**
     * method SetOrgName
     *
     * <p>id(0x8)</p>
     * <p>vtableId(13)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetOrgName", dispId = 0x8)
    void SetOrgName(String bstrNewVal);
            
    /**
     * method GetEmail
     *
     * <p>id(0x9)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "GetEmail", dispId = 0x9)
    String GetEmail();
            
    /**
     * method SetEmail
     *
     * <p>id(0xa)</p>
     * <p>vtableId(15)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetEmail", dispId = 0xa)
    void SetEmail(String bstrNewVal);
            
    /**
     * method GetPhone
     *
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GetPhone", dispId = 0xb)
    String GetPhone();
            
    /**
     * method SetPhone
     *
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetPhone", dispId = 0xc)
    void SetPhone(String bstrNewVal);
            
    /**
     * method GetAddress1
     *
     * <p>id(0xd)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "GetAddress1", dispId = 0xd)
    String GetAddress1();
            
    /**
     * method SetAddress1
     *
     * <p>id(0xe)</p>
     * <p>vtableId(19)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetAddress1", dispId = 0xe)
    void SetAddress1(String bstrNewVal);
            
    /**
     * method GetCity
     *
     * <p>id(0xf)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "GetCity", dispId = 0xf)
    String GetCity();
            
    /**
     * method SetCity
     *
     * <p>id(0x10)</p>
     * <p>vtableId(21)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetCity", dispId = 0x10)
    void SetCity(String bstrNewVal);
            
    /**
     * method GetState
     *
     * <p>id(0x11)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "GetState", dispId = 0x11)
    String GetState();
            
    /**
     * method SetState
     *
     * <p>id(0x12)</p>
     * <p>vtableId(23)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetState", dispId = 0x12)
    void SetState(String bstrNewVal);
            
    /**
     * method GetCountryCode
     *
     * <p>id(0x13)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "GetCountryCode", dispId = 0x13)
    String GetCountryCode();
            
    /**
     * method SetCountryCode
     *
     * <p>id(0x14)</p>
     * <p>vtableId(25)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetCountryCode", dispId = 0x14)
    void SetCountryCode(String bstrNewVal);
            
    /**
     * method GetCountryDesc
     *
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "GetCountryDesc", dispId = 0x15)
    String GetCountryDesc();
            
    /**
     * method SetCountryDesc
     *
     * <p>id(0x16)</p>
     * <p>vtableId(27)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetCountryDesc", dispId = 0x16)
    void SetCountryDesc(String bstrNewVal);
            
    /**
     * method GetZip
     *
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "GetZip", dispId = 0x17)
    String GetZip();
            
    /**
     * method SetZip
     *
     * <p>id(0x18)</p>
     * <p>vtableId(29)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetZip", dispId = 0x18)
    void SetZip(String bstrNewVal);
            
    /**
     * method GetIsoLanguage
     *
     * <p>id(0x19)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "GetIsoLanguage", dispId = 0x19)
    Integer GetIsoLanguage();
            
    /**
     * method SetIsoLanguage
     *
     * <p>id(0x1a)</p>
     * <p>vtableId(31)</p>
     * @param dwNewVal [in] {@code Integer}
     */
    @ComMethod(name = "SetIsoLanguage", dispId = 0x1a)
    void SetIsoLanguage(Integer dwNewVal);
            
    /**
     * method GetMSUpdate
     *
     * <p>id(0x20)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "GetMSUpdate", dispId = 0x20)
    String GetMSUpdate();
            
    /**
     * method SetMSUpdate
     *
     * <p>id(0x21)</p>
     * <p>vtableId(33)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetMSUpdate", dispId = 0x21)
    void SetMSUpdate(String bstrNewVal);
            
    /**
     * method GetMSOffer
     *
     * <p>id(0x22)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "GetMSOffer", dispId = 0x22)
    String GetMSOffer();
            
    /**
     * method SetMSOffer
     *
     * <p>id(0x23)</p>
     * <p>vtableId(35)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetMSOffer", dispId = 0x23)
    void SetMSOffer(String bstrNewVal);
            
    /**
     * method GetOtherOffer
     *
     * <p>id(0x24)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "GetOtherOffer", dispId = 0x24)
    String GetOtherOffer();
            
    /**
     * method SetOtherOffer
     *
     * <p>id(0x25)</p>
     * <p>vtableId(37)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetOtherOffer", dispId = 0x25)
    void SetOtherOffer(String bstrNewVal);
            
    /**
     * method GetAddress2
     *
     * <p>id(0x26)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "GetAddress2", dispId = 0x26)
    String GetAddress2();
            
    /**
     * method SetAddress2
     *
     * <p>id(0x27)</p>
     * <p>vtableId(39)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetAddress2", dispId = 0x27)
    void SetAddress2(String bstrNewVal);
            
    /**
     * method CheckSystemClock
     *
     * <p>id(0x28)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "CheckSystemClock", dispId = 0x28)
    Integer CheckSystemClock();
            
    /**
     * method GetExistingExpiryDate
     *
     * <p>id(0x29)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "GetExistingExpiryDate", dispId = 0x29)
    java.util.Date GetExistingExpiryDate();
            
    /**
     * method GetNewExpiryDate
     *
     * <p>id(0x2a)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "GetNewExpiryDate", dispId = 0x2a)
    java.util.Date GetNewExpiryDate();
            
    /**
     * method GetBillingFirstName
     *
     * <p>id(0x2b)</p>
     * <p>vtableId(43)</p>
     */
    @ComMethod(name = "GetBillingFirstName", dispId = 0x2b)
    String GetBillingFirstName();
            
    /**
     * method SetBillingFirstName
     *
     * <p>id(0x2c)</p>
     * <p>vtableId(44)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingFirstName", dispId = 0x2c)
    void SetBillingFirstName(String bstrNewVal);
            
    /**
     * method GetBillingLastName
     *
     * <p>id(0x2d)</p>
     * <p>vtableId(45)</p>
     */
    @ComMethod(name = "GetBillingLastName", dispId = 0x2d)
    String GetBillingLastName();
            
    /**
     * method SetBillingLastName
     *
     * <p>id(0x2e)</p>
     * <p>vtableId(46)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingLastName", dispId = 0x2e)
    void SetBillingLastName(String bstrNewVal);
            
    /**
     * method GetBillingPhone
     *
     * <p>id(0x2f)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "GetBillingPhone", dispId = 0x2f)
    String GetBillingPhone();
            
    /**
     * method SetBillingPhone
     *
     * <p>id(0x30)</p>
     * <p>vtableId(48)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingPhone", dispId = 0x30)
    void SetBillingPhone(String bstrNewVal);
            
    /**
     * method GetBillingAddress1
     *
     * <p>id(0x31)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "GetBillingAddress1", dispId = 0x31)
    String GetBillingAddress1();
            
    /**
     * method SetBillingAddress1
     *
     * <p>id(0x32)</p>
     * <p>vtableId(50)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingAddress1", dispId = 0x32)
    void SetBillingAddress1(String bstrNewVal);
            
    /**
     * method GetBillingAddress2
     *
     * <p>id(0x33)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "GetBillingAddress2", dispId = 0x33)
    String GetBillingAddress2();
            
    /**
     * method SetBillingAddress2
     *
     * <p>id(0x34)</p>
     * <p>vtableId(52)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingAddress2", dispId = 0x34)
    void SetBillingAddress2(String bstrNewVal);
            
    /**
     * method GetBillingCity
     *
     * <p>id(0x35)</p>
     * <p>vtableId(53)</p>
     */
    @ComMethod(name = "GetBillingCity", dispId = 0x35)
    String GetBillingCity();
            
    /**
     * method SetBillingCity
     *
     * <p>id(0x36)</p>
     * <p>vtableId(54)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingCity", dispId = 0x36)
    void SetBillingCity(String bstrNewVal);
            
    /**
     * method GetBillingState
     *
     * <p>id(0x37)</p>
     * <p>vtableId(55)</p>
     */
    @ComMethod(name = "GetBillingState", dispId = 0x37)
    String GetBillingState();
            
    /**
     * method SetBillingState
     *
     * <p>id(0x38)</p>
     * <p>vtableId(56)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingState", dispId = 0x38)
    void SetBillingState(String bstrNewVal);
            
    /**
     * method GetBillingCountryCode
     *
     * <p>id(0x39)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "GetBillingCountryCode", dispId = 0x39)
    String GetBillingCountryCode();
            
    /**
     * method SetBillingCountryCode
     *
     * <p>id(0x3a)</p>
     * <p>vtableId(58)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingCountryCode", dispId = 0x3a)
    void SetBillingCountryCode(String bstrNewVal);
            
    /**
     * method GetBillingZip
     *
     * <p>id(0x3b)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "GetBillingZip", dispId = 0x3b)
    String GetBillingZip();
            
    /**
     * method SetBillingZip
     *
     * <p>id(0x3c)</p>
     * <p>vtableId(60)</p>
     * @param bstrNewVal [in] {@code String}
     */
    @ComMethod(name = "SetBillingZip", dispId = 0x3c)
    void SetBillingZip(String bstrNewVal);
            
    /**
     * method SaveBillingInfo
     *
     * <p>id(0x3d)</p>
     * <p>vtableId(61)</p>
     * @param bSave [in] {@code Integer}
     */
    @ComMethod(name = "SaveBillingInfo", dispId = 0x3d)
    Integer SaveBillingInfo(Integer bSave);
            
    /**
     * method IsCCRenewalCountry
     *
     * <p>id(0x40)</p>
     * <p>vtableId(62)</p>
     * @param bstrCountryCode [in] {@code String}
     */
    @ComMethod(name = "IsCCRenewalCountry", dispId = 0x40)
    Integer IsCCRenewalCountry(String bstrCountryCode);
            
    /**
     * method GetVATLabel
     *
     * <p>id(0x41)</p>
     * <p>vtableId(63)</p>
     * @param bstrCountryCode [in] {@code String}
     */
    @ComMethod(name = "GetVATLabel", dispId = 0x41)
    String GetVATLabel(String bstrCountryCode);
            
    /**
     * method GetCCRenewalExpiryDate
     *
     * <p>id(0x42)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "GetCCRenewalExpiryDate", dispId = 0x42)
    java.util.Date GetCCRenewalExpiryDate();
            
    /**
     * method SetVATNumber
     *
     * <p>id(0x43)</p>
     * <p>vtableId(65)</p>
     * @param bstrVATNumber [in] {@code String}
     */
    @ComMethod(name = "SetVATNumber", dispId = 0x43)
    void SetVATNumber(String bstrVATNumber);
            
    /**
     * method SetCreditCardType
     *
     * <p>id(0x44)</p>
     * <p>vtableId(66)</p>
     * @param bstrCCCode [in] {@code String}
     */
    @ComMethod(name = "SetCreditCardType", dispId = 0x44)
    void SetCreditCardType(String bstrCCCode);
            
    /**
     * method SetCreditCardNumber
     *
     * <p>id(0x45)</p>
     * <p>vtableId(67)</p>
     * @param bstrCCNumber [in] {@code String}
     */
    @ComMethod(name = "SetCreditCardNumber", dispId = 0x45)
    void SetCreditCardNumber(String bstrCCNumber);
            
    /**
     * method SetCreditCardExpiryYear
     *
     * <p>id(0x46)</p>
     * <p>vtableId(68)</p>
     * @param dwCCYear [in] {@code Integer}
     */
    @ComMethod(name = "SetCreditCardExpiryYear", dispId = 0x46)
    void SetCreditCardExpiryYear(Integer dwCCYear);
            
    /**
     * method SetCreditCardExpiryMonth
     *
     * <p>id(0x47)</p>
     * <p>vtableId(69)</p>
     * @param dwCCMonth [in] {@code Integer}
     */
    @ComMethod(name = "SetCreditCardExpiryMonth", dispId = 0x47)
    void SetCreditCardExpiryMonth(Integer dwCCMonth);
            
    /**
     * method GetCreditCardCount
     *
     * <p>id(0x48)</p>
     * <p>vtableId(70)</p>
     */
    @ComMethod(name = "GetCreditCardCount", dispId = 0x48)
    Integer GetCreditCardCount();
            
    /**
     * method GetCreditCardCode
     *
     * <p>id(0x49)</p>
     * <p>vtableId(71)</p>
     * @param dwIndex [in] {@code Integer}
     */
    @ComMethod(name = "GetCreditCardCode", dispId = 0x49)
    String GetCreditCardCode(Integer dwIndex);
            
    /**
     * method GetCreditCardName
     *
     * <p>id(0x4a)</p>
     * <p>vtableId(72)</p>
     * @param dwIndex [in] {@code Integer}
     */
    @ComMethod(name = "GetCreditCardName", dispId = 0x4a)
    String GetCreditCardName(Integer dwIndex);
            
    /**
     * method GetVATNumber
     *
     * <p>id(0x4b)</p>
     * <p>vtableId(73)</p>
     */
    @ComMethod(name = "GetVATNumber", dispId = 0x4b)
    String GetVATNumber();
            
    /**
     * method GetCreditCardType
     *
     * <p>id(0x4c)</p>
     * <p>vtableId(74)</p>
     */
    @ComMethod(name = "GetCreditCardType", dispId = 0x4c)
    String GetCreditCardType();
            
    /**
     * method GetCreditCardNumber
     *
     * <p>id(0x4d)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "GetCreditCardNumber", dispId = 0x4d)
    String GetCreditCardNumber();
            
    /**
     * method GetCreditCardExpiryYear
     *
     * <p>id(0x4e)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "GetCreditCardExpiryYear", dispId = 0x4e)
    Integer GetCreditCardExpiryYear();
            
    /**
     * method GetCreditCardExpiryMonth
     *
     * <p>id(0x4f)</p>
     * <p>vtableId(77)</p>
     */
    @ComMethod(name = "GetCreditCardExpiryMonth", dispId = 0x4f)
    Integer GetCreditCardExpiryMonth();
            
    /**
     * method GetDisconnectOption
     *
     * <p>id(0x50)</p>
     * <p>vtableId(78)</p>
     */
    @ComMethod(name = "GetDisconnectOption", dispId = 0x50)
    Integer GetDisconnectOption();
            
    /**
     * method SetDisconnectOption
     *
     * <p>id(0x51)</p>
     * <p>vtableId(79)</p>
     * @param bNewVal [in] {@code Integer}
     */
    @ComMethod(name = "SetDisconnectOption", dispId = 0x51)
    void SetDisconnectOption(Integer bNewVal);
            
    /**
     * method AsyncProcessHandshakeRequest
     *
     * <p>id(0x52)</p>
     * <p>vtableId(80)</p>
     * @param bReviseCustInfo [in] {@code Integer}
     */
    @ComMethod(name = "AsyncProcessHandshakeRequest", dispId = 0x52)
    void AsyncProcessHandshakeRequest(Integer bReviseCustInfo);
            
    /**
     * method AsyncProcessNewLicenseRequest
     *
     * <p>id(0x53)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "AsyncProcessNewLicenseRequest", dispId = 0x53)
    void AsyncProcessNewLicenseRequest();
            
    /**
     * method AsyncProcessReissueLicenseRequest
     *
     * <p>id(0x54)</p>
     * <p>vtableId(82)</p>
     */
    @ComMethod(name = "AsyncProcessReissueLicenseRequest", dispId = 0x54)
    void AsyncProcessReissueLicenseRequest();
            
    /**
     * method AsyncProcessRetailRenewalLicenseRequest
     *
     * <p>id(0x55)</p>
     * <p>vtableId(83)</p>
     */
    @ComMethod(name = "AsyncProcessRetailRenewalLicenseRequest", dispId = 0x55)
    void AsyncProcessRetailRenewalLicenseRequest();
            
    /**
     * method AsyncProcessReviseCustInfoRequest
     *
     * <p>id(0x56)</p>
     * <p>vtableId(84)</p>
     */
    @ComMethod(name = "AsyncProcessReviseCustInfoRequest", dispId = 0x56)
    void AsyncProcessReviseCustInfoRequest();
            
    /**
     * method AsyncProcessCCRenewalPriceRequest
     *
     * <p>id(0x57)</p>
     * <p>vtableId(85)</p>
     */
    @ComMethod(name = "AsyncProcessCCRenewalPriceRequest", dispId = 0x57)
    void AsyncProcessCCRenewalPriceRequest();
            
    /**
     * method AsyncProcessCCRenewalLicenseRequest
     *
     * <p>id(0x58)</p>
     * <p>vtableId(86)</p>
     */
    @ComMethod(name = "AsyncProcessCCRenewalLicenseRequest", dispId = 0x58)
    void AsyncProcessCCRenewalLicenseRequest();
            
    /**
     * method GetAsyncProcessReturnCode
     *
     * <p>id(0x5a)</p>
     * <p>vtableId(87)</p>
     */
    @ComMethod(name = "GetAsyncProcessReturnCode", dispId = 0x5a)
    Integer GetAsyncProcessReturnCode();
            
    /**
     * method IsUpgradeAvailable
     *
     * <p>id(0x5b)</p>
     * <p>vtableId(88)</p>
     */
    @ComMethod(name = "IsUpgradeAvailable", dispId = 0x5b)
    Integer IsUpgradeAvailable();
            
    /**
     * method WantUpgrade
     *
     * <p>id(0x5c)</p>
     * <p>vtableId(89)</p>
     * @param bWantUpgrade [in] {@code Integer}
     */
    @ComMethod(name = "WantUpgrade", dispId = 0x5c)
    void WantUpgrade(Integer bWantUpgrade);
            
    /**
     * method AsyncProcessDroppedLicenseRequest
     *
     * <p>id(0x5d)</p>
     * <p>vtableId(90)</p>
     */
    @ComMethod(name = "AsyncProcessDroppedLicenseRequest", dispId = 0x5d)
    void AsyncProcessDroppedLicenseRequest();
            
    /**
     * method GenerateInstallationId
     *
     * <p>id(0x5e)</p>
     * <p>vtableId(91)</p>
     */
    @ComMethod(name = "GenerateInstallationId", dispId = 0x5e)
    String GenerateInstallationId();
            
    /**
     * method DepositConfirmationId
     *
     * <p>id(0x5f)</p>
     * <p>vtableId(92)</p>
     * @param bstrVal [in] {@code String}
     */
    @ComMethod(name = "DepositConfirmationId", dispId = 0x5f)
    Integer DepositConfirmationId(String bstrVal);
            
    /**
     * method VerifyCheckDigits
     *
     * <p>id(0x60)</p>
     * <p>vtableId(93)</p>
     * @param bstrCIDIID [in] {@code String}
     */
    @ComMethod(name = "VerifyCheckDigits", dispId = 0x60)
    Integer VerifyCheckDigits(String bstrCIDIID);
            
    /**
     * method GetCurrentExpiryDate
     *
     * <p>id(0x61)</p>
     * <p>vtableId(94)</p>
     */
    @ComMethod(name = "GetCurrentExpiryDate", dispId = 0x61)
    java.util.Date GetCurrentExpiryDate();
            
    /**
     * method CancelAsyncProcessRequest
     *
     * <p>id(0x62)</p>
     * <p>vtableId(95)</p>
     * @param bIsLicenseRequest [in] {@code Integer}
     */
    @ComMethod(name = "CancelAsyncProcessRequest", dispId = 0x62)
    void CancelAsyncProcessRequest(Integer bIsLicenseRequest);
            
    /**
     * method GetCurrencyDescription
     *
     * <p>id(0x64)</p>
     * <p>vtableId(96)</p>
     * @param dwCurrencyIndex [in] {@code Integer}
     */
    @ComMethod(name = "GetCurrencyDescription", dispId = 0x64)
    String GetCurrencyDescription(Integer dwCurrencyIndex);
            
    /**
     * method GetPriceItemCount
     *
     * <p>id(0x65)</p>
     * <p>vtableId(97)</p>
     */
    @ComMethod(name = "GetPriceItemCount", dispId = 0x65)
    Integer GetPriceItemCount();
            
    /**
     * method GetPriceItemLabel
     *
     * <p>id(0x66)</p>
     * <p>vtableId(98)</p>
     * @param dwIndex [in] {@code Integer}
     */
    @ComMethod(name = "GetPriceItemLabel", dispId = 0x66)
    String GetPriceItemLabel(Integer dwIndex);
            
    /**
     * method GetPriceItemValue
     *
     * <p>id(0x67)</p>
     * <p>vtableId(99)</p>
     * @param dwCurrencyIndex [in] {@code Integer}
     * @param dwIndex [in] {@code Integer}
     */
    @ComMethod(name = "GetPriceItemValue", dispId = 0x67)
    String GetPriceItemValue(Integer dwCurrencyIndex,
            Integer dwIndex);
            
    /**
     * method GetInvoiceText
     *
     * <p>id(0x68)</p>
     * <p>vtableId(100)</p>
     */
    @ComMethod(name = "GetInvoiceText", dispId = 0x68)
    String GetInvoiceText();
            
    /**
     * method GetBackendErrorMsg
     *
     * <p>id(0x69)</p>
     * <p>vtableId(101)</p>
     */
    @ComMethod(name = "GetBackendErrorMsg", dispId = 0x69)
    String GetBackendErrorMsg();
            
    /**
     * method GetCurrencyOption
     *
     * <p>id(0x6a)</p>
     * <p>vtableId(102)</p>
     */
    @ComMethod(name = "GetCurrencyOption", dispId = 0x6a)
    Integer GetCurrencyOption();
            
    /**
     * method SetCurrencyOption
     *
     * <p>id(0x6b)</p>
     * <p>vtableId(103)</p>
     * @param dwCurrencyOption [in] {@code Integer}
     */
    @ComMethod(name = "SetCurrencyOption", dispId = 0x6b)
    void SetCurrencyOption(Integer dwCurrencyOption);
            
    /**
     * method GetEndOfLifeHtmlText
     *
     * <p>id(0x6c)</p>
     * <p>vtableId(104)</p>
     */
    @ComMethod(name = "GetEndOfLifeHtmlText", dispId = 0x6c)
    String GetEndOfLifeHtmlText();
            
    /**
     * method DisplaySSLCert
     *
     * <p>id(0x6d)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "DisplaySSLCert", dispId = 0x6d)
    Integer DisplaySSLCert();
            
    
}