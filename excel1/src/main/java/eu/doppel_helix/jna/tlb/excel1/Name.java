
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B9-0000-0000-C000-000000000046}")
public interface Name extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x3a6)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    String getCategory();
            
    /**
     * <p>id(0x3a6)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    void setCategory(String param0);
            
    /**
     * <p>id(0x3a7)</p>
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    String getCategoryLocal();
            
    /**
     * <p>id(0x3a7)</p>
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    void setCategoryLocal(String param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x3a8)</p>
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    XlXLMMacroType getMacroType();
            
    /**
     * <p>id(0x3a8)</p>
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    void setMacroType(XlXLMMacroType param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x3aa)</p>
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    Object getRefersTo();
            
    /**
     * <p>id(0x3aa)</p>
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    void setRefersTo(Object param0);
            
    /**
     * <p>id(0x255)</p>
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    String getShortcutKey();
            
    /**
     * <p>id(0x255)</p>
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    void setShortcutKey(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(String param0);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    String getNameLocal();
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    void setNameLocal(String param0);
            
    /**
     * <p>id(0x3ab)</p>
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    Object getRefersToLocal();
            
    /**
     * <p>id(0x3ab)</p>
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    void setRefersToLocal(Object param0);
            
    /**
     * <p>id(0x3ac)</p>
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    Object getRefersToR1C1();
            
    /**
     * <p>id(0x3ac)</p>
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    void setRefersToR1C1(Object param0);
            
    /**
     * <p>id(0x3ad)</p>
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    Object getRefersToR1C1Local();
            
    /**
     * <p>id(0x3ad)</p>
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    void setRefersToR1C1Local(Object param0);
            
    /**
     * <p>id(0x488)</p>
     */
    @ComProperty(name = "RefersToRange", dispId = 0x488)
    Range getRefersToRange();
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    String getComment();
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    void setComment(String param0);
            
    /**
     * <p>id(0xa2f)</p>
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    Boolean getWorkbookParameter();
            
    /**
     * <p>id(0xa2f)</p>
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    void setWorkbookParameter(Boolean param0);
            
    /**
     * <p>id(0xa30)</p>
     */
    @ComProperty(name = "ValidWorkbookParameter", dispId = 0xa30)
    Boolean getValidWorkbookParameter();
            
    
}