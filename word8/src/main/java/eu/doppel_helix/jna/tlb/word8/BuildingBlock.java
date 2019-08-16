
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({BFD3FC23-F763-4FF8-826E-1AFBF598A4E7})</p>
 */
@ComInterface(iid="{BFD3FC23-F763-4FF8-826E-1AFBF598A4E7}")
public interface BuildingBlock extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    BuildingBlockType getType();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Description", dispId = 0x4)
    String getDescription();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x4)
    void setDescription(String param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ID", dispId = 0x5)
    String getID();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Category", dispId = 0x6)
    Category getCategory();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    String getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(String param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "InsertOptions", dispId = 0x7)
    Integer getInsertOptions();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "InsertOptions", dispId = 0x7)
    void setInsertOptions(Integer param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(23)</p>
     * @param Where [in] {@code Range}
     * @param RichText [in, optional] {@code Object}
     */
    @ComMethod(name = "Insert", dispId = 0x66)
    Range Insert(Range Where,
            Object RichText);
            
    
}