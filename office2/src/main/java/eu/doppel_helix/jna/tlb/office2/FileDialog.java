
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0362-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0362-0000-0000-C000-000000000046}")
public interface FileDialog {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x60030001)
    FileDialogFilters getFilters();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "FilterIndex", dispId = 0x60030002)
    Integer getFilterIndex();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "FilterIndex", dispId = 0x60030002)
    void setFilterIndex(Integer param0);
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "Title", dispId = 0x60030004)
    String getTitle();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "Title", dispId = 0x60030004)
    void setTitle(String param0);
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComProperty(name = "ButtonName", dispId = 0x60030006)
    String getButtonName();
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComProperty(name = "ButtonName", dispId = 0x60030006)
    void setButtonName(String param0);
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComProperty(name = "AllowMultiSelect", dispId = 0x60030008)
    Boolean getAllowMultiSelect();
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComProperty(name = "AllowMultiSelect", dispId = 0x60030008)
    void setAllowMultiSelect(Boolean param0);
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComProperty(name = "InitialView", dispId = 0x6003000a)
    MsoFileDialogView getInitialView();
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComProperty(name = "InitialView", dispId = 0x6003000a)
    void setInitialView(MsoFileDialogView param0);
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "InitialFileName", dispId = 0x6003000c)
    String getInitialFileName();
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComProperty(name = "InitialFileName", dispId = 0x6003000c)
    void setInitialFileName(String param0);
            
    /**
     * <p>id(0x6003000e)</p>
     */
    @ComProperty(name = "SelectedItems", dispId = 0x6003000e)
    FileDialogSelectedItems getSelectedItems();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "DialogType", dispId = 0x6003000f)
    MsoFileDialogType getDialogType();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem();
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComMethod(name = "Show", dispId = 0x60030011)
    Integer Show();
            
    /**
     * <p>id(0x60030012)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x60030012)
    void Execute();
            
    
}