
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002447D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002447D-0000-0000-C000-000000000046}")
public interface ListDataFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    XlListDataType get_Default();
            
    /**
     * <p>id(0x92c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Choices", dispId = 0x92c)
    Object getChoices();
            
    /**
     * <p>id(0x92d)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DecimalPlaces", dispId = 0x92d)
    Integer getDecimalPlaces();
            
    /**
     * <p>id(0x92e)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DefaultValue", dispId = 0x92e)
    Object getDefaultValue();
            
    /**
     * <p>id(0x92f)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsPercent", dispId = 0x92f)
    Boolean getIsPercent();
            
    /**
     * <p>id(0x930)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "lcid", dispId = 0x930)
    Integer getLcid();
            
    /**
     * <p>id(0x931)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MaxCharacters", dispId = 0x931)
    Integer getMaxCharacters();
            
    /**
     * <p>id(0x932)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "MaxNumber", dispId = 0x932)
    Object getMaxNumber();
            
    /**
     * <p>id(0x933)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "MinNumber", dispId = 0x933)
    Object getMinNumber();
            
    /**
     * <p>id(0x934)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Required", dispId = 0x934)
    Boolean getRequired();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlListDataType getType();
            
    /**
     * <p>id(0x128)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x128)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x935)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "AllowFillIn", dispId = 0x935)
    Boolean getAllowFillIn();
            
    
}