
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002085F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002085F-0000-0000-C000-000000000046}")
public interface ToolbarButtons extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Button [in, optional] {@code Object}
     * @param Before [in, optional] {@code Object}
     * @param OnAction [in, optional] {@code Object}
     * @param Pushed [in, optional] {@code Object}
     * @param Enabled [in, optional] {@code Object}
     * @param StatusBar [in, optional] {@code Object}
     * @param HelpFile [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    ToolbarButton Add(Object Button,
            Object Before,
            Object OnAction,
            Object Pushed,
            Object Enabled,
            Object StatusBar,
            Object HelpFile,
            Object HelpContextID);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    ToolbarButton getItem(Integer Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    ToolbarButton get_Default(Integer Index);
            
    
}