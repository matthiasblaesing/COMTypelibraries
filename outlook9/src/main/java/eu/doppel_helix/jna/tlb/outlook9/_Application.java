
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063001-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063001-0000-0000-C000-000000000046}")
public interface _Application extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x114)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0x114)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Version", dispId = 0x116)
    String getVersion();
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "ActiveExplorer", dispId = 0x111)
    _Explorer ActiveExplorer();
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ActiveInspector", dispId = 0x112)
    _Inspector ActiveInspector();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(16)</p>
     * @param ItemType [in] {@code OlItemType}
     */
    @ComMethod(name = "CreateItem", dispId = 0x10a)
    com.sun.jna.platform.win32.COM.util.IDispatch CreateItem(OlItemType ItemType);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(17)</p>
     * @param TemplatePath [in] {@code String}
     * @param InFolder [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateItemFromTemplate", dispId = 0x10b)
    com.sun.jna.platform.win32.COM.util.IDispatch CreateItemFromTemplate(String TemplatePath,
            Object InFolder);
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(18)</p>
     * @param ObjectName [in] {@code String}
     */
    @ComMethod(name = "CreateObject", dispId = 0x115)
    com.sun.jna.platform.win32.COM.util.IDispatch CreateObject(String ObjectName);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(19)</p>
     * @param Type [in] {@code String}
     */
    @ComMethod(name = "GetNamespace", dispId = 0x110)
    _NameSpace GetNamespace(String Type);
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x113)
    void Quit();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x118)
    eu.doppel_helix.jna.tlb.office2.COMAddIns getCOMAddIns();
            
    /**
     * <p>id(0x119)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Explorers", dispId = 0x119)
    _Explorers getExplorers();
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Inspectors", dispId = 0x11a)
    _Inspectors getInspectors();
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x11b)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ProductCode", dispId = 0x11c)
    String getProductCode();
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x11d)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x11e)
    eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall getFeatureInstall();
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall}
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x11e)
    void setFeatureInstall(eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall param0);
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "ActiveWindow", dispId = 0x11f)
    com.sun.jna.platform.win32.COM.util.IDispatch ActiveWindow();
            
    /**
     * <p>id(0xfa62)</p>
     * <p>vtableId(30)</p>
     * @param FilePath [in] {@code String}
     * @param DestFolderPath [in] {@code String}
     */
    @ComMethod(name = "CopyFile", dispId = 0xfa62)
    com.sun.jna.platform.win32.COM.util.IDispatch CopyFile(String FilePath,
            String DestFolderPath);
            
    /**
     * <p>id(0xfa65)</p>
     * <p>vtableId(31)</p>
     * @param Scope [in] {@code String}
     * @param Filter [in, optional] {@code Object}
     * @param SearchSubFolders [in, optional] {@code Object}
     * @param Tag [in, optional] {@code Object}
     */
    @ComMethod(name = "AdvancedSearch", dispId = 0xfa65)
    Search AdvancedSearch(String Scope,
            Object Filter,
            Object SearchSubFolders,
            Object Tag);
            
    /**
     * <p>id(0xfa6c)</p>
     * <p>vtableId(32)</p>
     * @param LookInFolders [in] {@code String}
     */
    @ComMethod(name = "IsSearchSynchronous", dispId = 0xfa6c)
    Boolean IsSearchSynchronous(String LookInFolders);
            
    /**
     * <p>id(0xfa48)</p>
     * <p>vtableId(33)</p>
     * @param pvar [in] {@code Object}
     */
    @ComMethod(name = "GetNewNickNames", dispId = 0xfa48)
    void GetNewNickNames(Object pvar);
            
    /**
     * <p>id(0xfa99)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Reminders", dispId = 0xfa99)
    _Reminders getReminders();
            
    /**
     * <p>id(0xfad6)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "DefaultProfileName", dispId = 0xfad6)
    String getDefaultProfileName();
            
    /**
     * <p>id(0xfbf3)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "IsTrusted", dispId = 0xfbf3)
    Boolean getIsTrusted();
            
    /**
     * <p>id(0xfbd6)</p>
     * <p>vtableId(37)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param ReferenceType [in] {@code OlReferenceType}
     */
    @ComMethod(name = "GetObjectReference", dispId = 0xfbd6)
    com.sun.jna.platform.win32.COM.util.IDispatch GetObjectReference(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            OlReferenceType ReferenceType);
            
    /**
     * <p>id(0xfc08)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Assistance", dispId = 0xfc08)
    eu.doppel_helix.jna.tlb.office2.IAssistance getAssistance();
            
    /**
     * <p>id(0xfc29)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "TimeZones", dispId = 0xfc29)
    TimeZones getTimeZones();
            
    /**
     * <p>id(0xfc65)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "PickerDialog", dispId = 0xfc65)
    eu.doppel_helix.jna.tlb.office2.PickerDialog getPickerDialog();
            
    /**
     * <p>id(0xfc7f)</p>
     * <p>vtableId(41)</p>
     * @param RegionName [in] {@code String}
     */
    @ComMethod(name = "RefreshFormRegionDefinition", dispId = 0xfc7f)
    void RefreshFormRegionDefinition(String RegionName);
            
    
}