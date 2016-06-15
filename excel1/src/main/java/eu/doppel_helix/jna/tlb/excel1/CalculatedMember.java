
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024455-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024455-0000-0000-C000-000000000046}")
public interface CalculatedMember extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x2d1)</p>
     */
    @ComProperty(name = "SourceName", dispId = 0x2d1)
    String getSourceName();
            
    /**
     * <p>id(0x88b)</p>
     */
    @ComProperty(name = "SolveOrder", dispId = 0x88b)
    Integer getSolveOrder();
            
    /**
     * <p>id(0x88c)</p>
     */
    @ComProperty(name = "IsValid", dispId = 0x88c)
    Boolean getIsValid();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlCalculatedMemberType getType();
            
    /**
     * <p>id(0xb6e)</p>
     */
    @ComProperty(name = "Dynamic", dispId = 0xb6e)
    Boolean getDynamic();
            
    /**
     * <p>id(0xb6f)</p>
     */
    @ComProperty(name = "DisplayFolder", dispId = 0xb6f)
    String getDisplayFolder();
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    Boolean getHierarchizeDistinct();
            
    /**
     * <p>id(0xb6d)</p>
     */
    @ComProperty(name = "HierarchizeDistinct", dispId = 0xb6d)
    void setHierarchizeDistinct(Boolean param0);
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    Boolean getFlattenHierarchies();
            
    /**
     * <p>id(0xb6c)</p>
     */
    @ComProperty(name = "FlattenHierarchies", dispId = 0xb6c)
    void setFlattenHierarchies(Boolean param0);
            
    /**
     * <p>id(0xc14)</p>
     */
    @ComProperty(name = "MeasureGroup", dispId = 0xc14)
    String getMeasureGroup();
            
    /**
     * <p>id(0xc15)</p>
     */
    @ComProperty(name = "ParentHierarchy", dispId = 0xc15)
    String getParentHierarchy();
            
    /**
     * <p>id(0xc16)</p>
     */
    @ComProperty(name = "ParentMember", dispId = 0xc16)
    String getParentMember();
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    XlCalcMemNumberFormatType getNumberFormat();
            
    
}