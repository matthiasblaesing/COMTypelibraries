
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IQuickFilingUI Interface
 *
 * <p>uuid({1D12BD3F-89B6-4077-AA2C-C9DC2BCA42F9})</p>
 */
@ComInterface(iid="{1D12BD3F-89B6-4077-AA2C-C9DC2BCA42F9}")
public interface IQuickFilingDialog extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Title", dispId = 0x0)
    String getTitle();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x0)
    void setTitle(String param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Description", dispId = 0x1)
    String getDescription();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x1)
    void setDescription(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CheckboxText", dispId = 0x2)
    String getCheckboxText();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CheckboxText", dispId = 0x2)
    void setCheckboxText(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CheckboxState", dispId = 0x3)
    Boolean getCheckboxState();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckboxState", dispId = 0x3)
    void setCheckboxState(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "WindowHandle", dispId = 0x4)
    Long getWindowHandle();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "TreeDepth", dispId = 0x5)
    HierarchyElement getTreeDepth();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code HierarchyElement}
     */
    @ComProperty(name = "TreeDepth", dispId = 0x5)
    void setTreeDepth(HierarchyElement param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ParentWindowHandle", dispId = 0x6)
    Long getParentWindowHandle();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Long}
     */
    @ComProperty(name = "ParentWindowHandle", dispId = 0x6)
    void setParentWindowHandle(Long param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     * @param recentResults [in] {@code RecentResultType}
     * @param fShowCurrentSection [in] {@code Boolean}
     * @param fShowCurrentPage [in] {@code Boolean}
     * @param fShowUnfiledNotes [in] {@code Boolean}
     */
    @ComMethod(name = "SetRecentResults", dispId = 0x8)
    void SetRecentResults(RecentResultType recentResults,
            Boolean fShowCurrentSection,
            Boolean fShowCurrentPage,
            Boolean fShowUnfiledNotes);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     * @param bstrText [in] {@code String}
     * @param allowedElements [in] {@code HierarchyElement}
     * @param allowedReadOnlyElements [in] {@code HierarchyElement}
     * @param fDefault [in] {@code Boolean}
     */
    @ComMethod(name = "AddButton", dispId = 0xa)
    void AddButton(String bstrText,
            HierarchyElement allowedElements,
            HierarchyElement allowedReadOnlyElements,
            Boolean fDefault);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     * @param piCallback [in] {@code IQuickFilingDialogCallback}
     */
    @ComMethod(name = "Run", dispId = 0xb)
    void Run(IQuickFilingDialogCallback piCallback);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "SelectedItem", dispId = 0xc)
    String getSelectedItem();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "PressedButton", dispId = 0xd)
    Integer getPressedButton();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code TreeCollapsedStateType}
     */
    @ComProperty(name = "TreeCollapsedState", dispId = 0xe)
    void setTreeCollapsedState(TreeCollapsedStateType param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code NotebookFilterOutType}
     */
    @ComProperty(name = "NotebookFilterOut", dispId = 0xf)
    void setNotebookFilterOut(NotebookFilterOutType param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "ShowCreateNewNotebook", dispId = 0x10)
    void ShowCreateNewNotebook();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(30)</p>
     * @param initialEditor [] {@code String}
     */
    @ComMethod(name = "AddInitialEditor", dispId = 0x11)
    void AddInitialEditor(String initialEditor);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "ClearInitialEditors", dispId = 0x12)
    void ClearInitialEditors();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "ShowSharingHyperlink", dispId = 0x13)
    void ShowSharingHyperlink();
            
    
}