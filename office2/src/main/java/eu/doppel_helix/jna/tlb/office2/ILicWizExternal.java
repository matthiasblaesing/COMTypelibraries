
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4CAC6328-B9B0-11D3-8D59-0050048384E3})</p>
 */
@ComInterface(iid="{4CAC6328-B9B0-11D3-8D59-0050048384E3}")
public interface ILicWizExternal {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "PrintHtmlDocument", dispId = 0x1)
    void PrintHtmlDocument(com.sun.jna.platform.win32.COM.util.IUnknown punkHtmlDoc);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "InvokeDateTimeApplet", dispId = 0x2)
    void InvokeDateTimeApplet();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "FormatDate", dispId = 0x3)
    String FormatDate(java.util.Date date,
            String pFormat);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "ShowHelp", dispId = 0x4)
    void ShowHelp(Object pvarId);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Terminate", dispId = 0x5)
    void Terminate();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "DisableVORWReminder", dispId = 0x6)
    void DisableVORWReminder(Integer BPC);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "SaveReceipt", dispId = 0x7)
    String SaveReceipt(String bstrReceipt);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "OpenInDefaultBrowser", dispId = 0x8)
    void OpenInDefaultBrowser(String bstrUrl);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "MsoAlert", dispId = 0x9)
    Integer MsoAlert(String bstrText,
            String bstrButtons,
            String bstrIcon);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "DepositPidKey", dispId = 0xa)
    Integer DepositPidKey(String bstrKey,
            Integer fMORW);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "WriteLog", dispId = 0xb)
    void WriteLog(String bstrMessage);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "ResignDpc", dispId = 0xc)
    void ResignDpc(String bstrProductCode);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "ResetPID", dispId = 0xd)
    void ResetPID();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "SetDialogSize", dispId = 0xe)
    void SetDialogSize(Integer dx,
            Integer dy);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "VerifyClock", dispId = 0xf)
    Integer VerifyClock(Integer lMode);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "SortSelectOptions", dispId = 0x10)
    void SortSelectOptions(com.sun.jna.platform.win32.COM.util.IDispatch pdispSelect);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "InternetDisconnect", dispId = 0x11)
    void InternetDisconnect();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "GetConnectedState", dispId = 0x12)
    Integer GetConnectedState();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "Context", dispId = 0x14)
    Integer getContext();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Validator", dispId = 0x15)
    com.sun.jna.platform.win32.COM.util.IDispatch getValidator();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "LicAgent", dispId = 0x16)
    com.sun.jna.platform.win32.COM.util.IDispatch getLicAgent();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "CountryInfo", dispId = 0x17)
    String getCountryInfo();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "WizardVisible", dispId = 0x18)
    void setWizardVisible(Integer param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "WizardTitle", dispId = 0x19)
    void setWizardTitle(String param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "AnimationEnabled", dispId = 0x1a)
    Integer getAnimationEnabled();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "CurrentHelpId", dispId = 0x1b)
    void setCurrentHelpId(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "OfficeOnTheWebUrl", dispId = 0x1c)
    String getOfficeOnTheWebUrl();
            
    
}