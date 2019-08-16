
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024444-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024444-0000-0000-C000-000000000046}")
public interface PublishObject extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x767)</p>
     * <p>vtableId(11)</p>
     * @param Create [in, optional] {@code Object}
     */
    @ComMethod(name = "Publish", dispId = 0x767)
    void Publish(Object Create);
            
    /**
     * <p>id(0x766)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DivID", dispId = 0x766)
    String getDivID();
            
    /**
     * <p>id(0x2ef)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Sheet", dispId = 0x2ef)
    String getSheet();
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlSourceType getSourceType();
            
    /**
     * <p>id(0xde)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Source", dispId = 0xde)
    String getSource();
            
    /**
     * <p>id(0x765)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HtmlType", dispId = 0x765)
    XlHtmlType getHtmlType();
            
    /**
     * <p>id(0x765)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code XlHtmlType}
     */
    @ComProperty(name = "HtmlType", dispId = 0x765)
    void setHtmlType(XlHtmlType param0);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    void setTitle(String param0);
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    String getFilename();
            
    /**
     * <p>id(0x587)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filename", dispId = 0x587)
    void setFilename(String param0);
            
    /**
     * <p>id(0x882)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "AutoRepublish", dispId = 0x882)
    Boolean getAutoRepublish();
            
    /**
     * <p>id(0x882)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoRepublish", dispId = 0x882)
    void setAutoRepublish(Boolean param0);
            
    
}