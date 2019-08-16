
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0362-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0362-0000-0000-C000-000000000046}")
public interface FileDialog extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x60030001)
    FileDialogFilters getFilters();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "FilterIndex", dispId = 0x60030002)
    Integer getFilterIndex();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FilterIndex", dispId = 0x60030002)
    void setFilterIndex(Integer param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Title", dispId = 0x60030004)
    String getTitle();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0x60030004)
    void setTitle(String param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ButtonName", dispId = 0x60030006)
    String getButtonName();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ButtonName", dispId = 0x60030006)
    void setButtonName(String param0);
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "AllowMultiSelect", dispId = 0x60030008)
    Boolean getAllowMultiSelect();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowMultiSelect", dispId = 0x60030008)
    void setAllowMultiSelect(Boolean param0);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "InitialView", dispId = 0x6003000a)
    MsoFileDialogView getInitialView();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code MsoFileDialogView}
     */
    @ComProperty(name = "InitialView", dispId = 0x6003000a)
    void setInitialView(MsoFileDialogView param0);
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "InitialFileName", dispId = 0x6003000c)
    String getInitialFileName();
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InitialFileName", dispId = 0x6003000c)
    void setInitialFileName(String param0);
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "SelectedItems", dispId = 0x6003000e)
    FileDialogSelectedItems getSelectedItems();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DialogType", dispId = 0x6003000f)
    MsoFileDialogType getDialogType();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60030011)
    Integer Show();
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x60030012)
    void Execute();
            
    
}