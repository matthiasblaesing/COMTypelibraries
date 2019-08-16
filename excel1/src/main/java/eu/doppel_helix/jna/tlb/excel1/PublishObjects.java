
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024443-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024443-0000-0000-C000-000000000046}")
public interface PublishObjects extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param SourceType [in] {@code XlSourceType}
     * @param Filename [in] {@code String}
     * @param Sheet [in, optional] {@code Object}
     * @param Source [in, optional] {@code Object}
     * @param HtmlType [in, optional] {@code Object}
     * @param DivID [in, optional] {@code Object}
     * @param Title [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    PublishObject Add(XlSourceType SourceType,
            String Filename,
            Object Sheet,
            Object Source,
            Object HtmlType,
            Object DivID,
            Object Title);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    PublishObject getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    PublishObject get_Default(Object Index);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x767)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Publish", dispId = 0x767)
    void Publish();
            
    
}