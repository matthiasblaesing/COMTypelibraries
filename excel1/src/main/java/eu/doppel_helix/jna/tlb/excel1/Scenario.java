
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020897-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020897-0000-0000-C000-000000000046}")
public interface Scenario extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x390)</p>
     * <p>vtableId(10)</p>
     * @param ChangingCells [in] {@code Object}
     * @param Values [in, optional] {@code Object}
     */
    @ComMethod(name = "ChangeScenario", dispId = 0x390)
    Object ChangeScenario(Object ChangingCells,
            Object Values);
            
    /**
     * <p>id(0x38f)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ChangingCells", dispId = 0x38f)
    Range getChangingCells();
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    String getComment();
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    void setComment(String param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Boolean getHidden();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    void setHidden(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    Object Show();
            
    /**
     * <p>id(0xa4)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Values", dispId = 0xa4)
    Object getValues(Object Index);
            
    
}