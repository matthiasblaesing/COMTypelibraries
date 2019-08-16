
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4CAC6328-B9B0-11D3-8D59-0050048384E3})</p>
 */
@ComInterface(iid="{4CAC6328-B9B0-11D3-8D59-0050048384E3}")
public interface ILicWizExternal extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param punkHtmlDoc [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "PrintHtmlDocument", dispId = 0x1)
    void PrintHtmlDocument(com.sun.jna.platform.win32.COM.util.IUnknown punkHtmlDoc);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "InvokeDateTimeApplet", dispId = 0x2)
    void InvokeDateTimeApplet();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param date [in] {@code java.util.Date}
     * @param pFormat [in, optional] {@code String}
     */
    @ComMethod(name = "FormatDate", dispId = 0x3)
    String FormatDate(java.util.Date date,
            String pFormat);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param pvarId [in, optional] {@code Object}
     */
    @ComMethod(name = "ShowHelp", dispId = 0x4)
    void ShowHelp(Object pvarId);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Terminate", dispId = 0x5)
    void Terminate();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param BPC [in] {@code Integer}
     */
    @ComMethod(name = "DisableVORWReminder", dispId = 0x6)
    void DisableVORWReminder(Integer BPC);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param bstrReceipt [in] {@code String}
     */
    @ComMethod(name = "SaveReceipt", dispId = 0x7)
    String SaveReceipt(String bstrReceipt);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param bstrUrl [in] {@code String}
     */
    @ComMethod(name = "OpenInDefaultBrowser", dispId = 0x8)
    void OpenInDefaultBrowser(String bstrUrl);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param bstrText [in] {@code String}
     * @param bstrButtons [in] {@code String}
     * @param bstrIcon [in] {@code String}
     */
    @ComMethod(name = "MsoAlert", dispId = 0x9)
    Integer MsoAlert(String bstrText,
            String bstrButtons,
            String bstrIcon);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param bstrKey [in] {@code String}
     * @param fMORW [in] {@code Integer}
     */
    @ComMethod(name = "DepositPidKey", dispId = 0xa)
    Integer DepositPidKey(String bstrKey,
            Integer fMORW);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param bstrMessage [in] {@code String}
     */
    @ComMethod(name = "WriteLog", dispId = 0xb)
    void WriteLog(String bstrMessage);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param bstrProductCode [in] {@code String}
     */
    @ComMethod(name = "ResignDpc", dispId = 0xc)
    void ResignDpc(String bstrProductCode);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ResetPID", dispId = 0xd)
    void ResetPID();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
     * @param dx [in] {@code Integer}
     * @param dy [in] {@code Integer}
     */
    @ComMethod(name = "SetDialogSize", dispId = 0xe)
    void SetDialogSize(Integer dx,
            Integer dy);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(21)</p>
     * @param lMode [in] {@code Integer}
     */
    @ComMethod(name = "VerifyClock", dispId = 0xf)
    Integer VerifyClock(Integer lMode);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(22)</p>
     * @param pdispSelect [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SortSelectOptions", dispId = 0x10)
    void SortSelectOptions(com.sun.jna.platform.win32.COM.util.IDispatch pdispSelect);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "InternetDisconnect", dispId = 0x11)
    void InternetDisconnect();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "GetConnectedState", dispId = 0x12)
    Integer GetConnectedState();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Context", dispId = 0x14)
    Integer getContext();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Validator", dispId = 0x15)
    com.sun.jna.platform.win32.COM.util.IDispatch getValidator();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "LicAgent", dispId = 0x16)
    com.sun.jna.platform.win32.COM.util.IDispatch getLicAgent();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "CountryInfo", dispId = 0x17)
    String getCountryInfo();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WizardVisible", dispId = 0x18)
    void setWizardVisible(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "WizardTitle", dispId = 0x19)
    void setWizardTitle(String param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "AnimationEnabled", dispId = 0x1a)
    Integer getAnimationEnabled();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CurrentHelpId", dispId = 0x1b)
    void setCurrentHelpId(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "OfficeOnTheWebUrl", dispId = 0x1c)
    String getOfficeOnTheWebUrl();
            
    
}