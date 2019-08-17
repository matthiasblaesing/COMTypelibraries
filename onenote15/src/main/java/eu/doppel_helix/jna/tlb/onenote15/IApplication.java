
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IApplication Interface
 *
 * <p>uuid({452AC71A-B655-4967-A208-A4CC39DD7949})</p>
 */
@ComInterface(iid="{452AC71A-B655-4967-A208-A4CC39DD7949}")
public interface IApplication extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param bstrStartNodeID [in] {@code String}
     * @param hsScope [in] {@code HierarchyScope}
     * @param pbstrHierarchyXmlOut [out] {@code String}
     * @param xsSchema [in, optional] {@code XMLSchema}
     */
    @ComMethod(name = "GetHierarchy", dispId = 0x60020000)
    void GetHierarchy(String bstrStartNodeID,
            HierarchyScope hsScope,
            VARIANT pbstrHierarchyXmlOut,
            XMLSchema xsSchema);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param bstrChangesXmlIn [in] {@code String}
     * @param xsSchema [in, optional] {@code XMLSchema}
     */
    @ComMethod(name = "UpdateHierarchy", dispId = 0x60020001)
    void UpdateHierarchy(String bstrChangesXmlIn,
            XMLSchema xsSchema);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param bstrPath [in] {@code String}
     * @param bstrRelativeToObjectID [in] {@code String}
     * @param pbstrObjectID [out] {@code String}
     * @param cftIfNotExist [in, optional] {@code CreateFileType}
     */
    @ComMethod(name = "OpenHierarchy", dispId = 0x60020002)
    void OpenHierarchy(String bstrPath,
            String bstrRelativeToObjectID,
            VARIANT pbstrObjectID,
            CreateFileType cftIfNotExist);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param bstrObjectID [in] {@code String}
     * @param dateExpectedLastModified [in, optional] {@code java.util.Date}
     * @param deletePermanently [in, optional] {@code Boolean}
     */
    @ComMethod(name = "DeleteHierarchy", dispId = 0x60020003)
    void DeleteHierarchy(String bstrObjectID,
            java.util.Date dateExpectedLastModified,
            Boolean deletePermanently);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param bstrSectionID [in] {@code String}
     * @param pbstrPageID [out] {@code String}
     * @param npsNewPageStyle [in, optional] {@code NewPageStyle}
     */
    @ComMethod(name = "CreateNewPage", dispId = 0x60020004)
    void CreateNewPage(String bstrSectionID,
            VARIANT pbstrPageID,
            NewPageStyle npsNewPageStyle);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param bstrNotebookID [in] {@code String}
     * @param force [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CloseNotebook", dispId = 0x60020005)
    void CloseNotebook(String bstrNotebookID,
            Boolean force);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param bstrObjectID [in] {@code String}
     * @param pbstrParentID [out] {@code String}
     */
    @ComMethod(name = "GetHierarchyParent", dispId = 0x60020006)
    void GetHierarchyParent(String bstrObjectID,
            VARIANT pbstrParentID);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param bstrPageID [in] {@code String}
     * @param pbstrPageXmlOut [out] {@code String}
     * @param pageInfoToExport [in, optional] {@code PageInfo}
     * @param xsSchema [in, optional] {@code XMLSchema}
     */
    @ComMethod(name = "GetPageContent", dispId = 0x60020007)
    void GetPageContent(String bstrPageID,
            VARIANT pbstrPageXmlOut,
            PageInfo pageInfoToExport,
            XMLSchema xsSchema);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param bstrPageChangesXmlIn [in] {@code String}
     * @param dateExpectedLastModified [in, optional] {@code java.util.Date}
     * @param xsSchema [in, optional] {@code XMLSchema}
     * @param force [in, optional] {@code Boolean}
     */
    @ComMethod(name = "UpdatePageContent", dispId = 0x60020008)
    void UpdatePageContent(String bstrPageChangesXmlIn,
            java.util.Date dateExpectedLastModified,
            XMLSchema xsSchema,
            Boolean force);
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     * @param bstrPageID [in] {@code String}
     * @param bstrCallbackID [in] {@code String}
     * @param pbstrBinaryObjectB64Out [out] {@code String}
     */
    @ComMethod(name = "GetBinaryPageContent", dispId = 0x60020009)
    void GetBinaryPageContent(String bstrPageID,
            String bstrCallbackID,
            VARIANT pbstrBinaryObjectB64Out);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param bstrPageID [in] {@code String}
     * @param bstrObjectID [in] {@code String}
     * @param dateExpectedLastModified [in, optional] {@code java.util.Date}
     * @param force [in, optional] {@code Boolean}
     */
    @ComMethod(name = "DeletePageContent", dispId = 0x6002000a)
    void DeletePageContent(String bstrPageID,
            String bstrObjectID,
            java.util.Date dateExpectedLastModified,
            Boolean force);
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     * @param bstrHierarchyObjectID [in] {@code String}
     * @param bstrObjectID [in, optional] {@code String}
     * @param fNewWindow [in, optional] {@code Boolean}
     */
    @ComMethod(name = "NavigateTo", dispId = 0x6002000b)
    void NavigateTo(String bstrHierarchyObjectID,
            String bstrObjectID,
            Boolean fNewWindow);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param bstrUrl [in] {@code String}
     * @param fNewWindow [in, optional] {@code Boolean}
     */
    @ComMethod(name = "NavigateToUrl", dispId = 0x6002000c)
    void NavigateToUrl(String bstrUrl,
            Boolean fNewWindow);
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     * @param bstrHierarchyID [in] {@code String}
     * @param bstrTargetFilePath [in] {@code String}
     * @param pfPublishFormat [in, optional] {@code PublishFormat}
     * @param bstrCLSIDofExporter [in, optional] {@code String}
     */
    @ComMethod(name = "Publish", dispId = 0x6002000d)
    void Publish(String bstrHierarchyID,
            String bstrTargetFilePath,
            PublishFormat pfPublishFormat,
            String bstrCLSIDofExporter);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param bstrPathPackage [in] {@code String}
     * @param bstrPathDest [in] {@code String}
     * @param pbstrPathOut [out] {@code String}
     */
    @ComMethod(name = "OpenPackage", dispId = 0x6002000e)
    void OpenPackage(String bstrPathPackage,
            String bstrPathDest,
            VARIANT pbstrPathOut);
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     * @param bstrHierarchyID [in] {@code String}
     * @param bstrPageContentObjectID [in] {@code String}
     * @param pbstrHyperlinkOut [out] {@code String}
     */
    @ComMethod(name = "GetHyperlinkToObject", dispId = 0x6002000f)
    void GetHyperlinkToObject(String bstrHierarchyID,
            String bstrPageContentObjectID,
            VARIANT pbstrHyperlinkOut);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     * @param bstrStartNodeID [in] {@code String}
     * @param bstrSearchString [in] {@code String}
     * @param pbstrHierarchyXmlOut [out] {@code String}
     * @param fIncludeUnindexedPages [in, optional] {@code Boolean}
     * @param fDisplay [in, optional] {@code Boolean}
     * @param xsSchema [in, optional] {@code XMLSchema}
     */
    @ComMethod(name = "FindPages", dispId = 0x60020010)
    void FindPages(String bstrStartNodeID,
            String bstrSearchString,
            VARIANT pbstrHierarchyXmlOut,
            Boolean fIncludeUnindexedPages,
            Boolean fDisplay,
            XMLSchema xsSchema);
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     * @param bstrStartNodeID [in] {@code String}
     * @param bstrSearchStringName [in] {@code String}
     * @param pbstrHierarchyXmlOut [out] {@code String}
     * @param fIncludeUnindexedPages [in, optional] {@code Boolean}
     * @param xsSchema [in, optional] {@code XMLSchema}
     */
    @ComMethod(name = "FindMeta", dispId = 0x60020011)
    void FindMeta(String bstrStartNodeID,
            String bstrSearchStringName,
            VARIANT pbstrHierarchyXmlOut,
            Boolean fIncludeUnindexedPages,
            XMLSchema xsSchema);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     * @param slToGet [in] {@code SpecialLocation}
     * @param pbstrSpecialLocationPath [out] {@code String}
     */
    @ComMethod(name = "GetSpecialLocation", dispId = 0x60020012)
    void GetSpecialLocation(SpecialLocation slToGet,
            VARIANT pbstrSpecialLocationPath);
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     * @param bstrBaseFile [in] {@code String}
     * @param bstrClientFile [in] {@code String}
     * @param bstrServerFile [in] {@code String}
     * @param bstrTargetFile [in] {@code String}
     */
    @ComMethod(name = "MergeFiles", dispId = 0x60020013)
    void MergeFiles(String bstrBaseFile,
            String bstrClientFile,
            String bstrServerFile,
            String bstrTargetFile);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "QuickFiling", dispId = 0x60020014)
    IQuickFilingDialog QuickFiling();
            
    /**
     * <p>id(0x60020015)</p>
     * <p>vtableId(28)</p>
     * @param bstrHierarchyID [in] {@code String}
     */
    @ComMethod(name = "SyncHierarchy", dispId = 0x60020015)
    void SyncHierarchy(String bstrHierarchyID);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     * @param flToSet [in] {@code FilingLocation}
     * @param fltToSet [in] {@code FilingLocationType}
     * @param bstrFilingSectionID [in] {@code String}
     */
    @ComMethod(name = "SetFilingLocation", dispId = 0x60020016)
    void SetFilingLocation(FilingLocation flToSet,
            FilingLocationType fltToSet,
            String bstrFilingSectionID);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x64)
    Windows getWindows();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x66)
    Boolean getDummy1();
            
    /**
     * <p>id(0x60020019)</p>
     * <p>vtableId(32)</p>
     * @param bstrSectionSourceId [in] {@code String}
     * @param bstrSectionDestinationId [in] {@code String}
     */
    @ComMethod(name = "MergeSections", dispId = 0x60020019)
    void MergeSections(String bstrSectionSourceId,
            String bstrSectionDestinationId);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x68)
    com.sun.jna.platform.win32.COM.util.IDispatch getCOMAddIns();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x69)
    com.sun.jna.platform.win32.COM.util.IDispatch getLanguageSettings();
            
    /**
     * <p>id(0x6002001c)</p>
     * <p>vtableId(35)</p>
     * @param bstrHierarchyID [in] {@code String}
     * @param bstrPageContentObjectID [in] {@code String}
     * @param pbstrHyperlinkOut [out] {@code String}
     */
    @ComMethod(name = "GetWebHyperlinkToObject", dispId = 0x6002001c)
    void GetWebHyperlinkToObject(String bstrHierarchyID,
            String bstrPageContentObjectID,
            VARIANT pbstrHyperlinkOut);
            
    
}