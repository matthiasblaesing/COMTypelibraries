
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020870-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020870-0000-0000-C000-000000000046}")
public interface Interior extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x63)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    Object getColor();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    void setColor(Object param0);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    Object getColorIndex();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    Object getInvertIfNegative();
            
    /**
     * <p>id(0x84)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    void setInvertIfNegative(Object param0);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    Object getPattern();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    void setPattern(Object param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "PatternColor", dispId = 0x64)
    Object getPatternColor();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternColor", dispId = 0x64)
    void setPatternColor(Object param0);
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x62)
    Object getPatternColorIndex();
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x62)
    void setPatternColorIndex(Object param0);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    Object getThemeColor();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    void setThemeColor(Object param0);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    Object getTintAndShade();
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    void setTintAndShade(Object param0);
            
    /**
     * <p>id(0xa53)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "PatternThemeColor", dispId = 0xa53)
    Object getPatternThemeColor();
            
    /**
     * <p>id(0xa53)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternThemeColor", dispId = 0xa53)
    void setPatternThemeColor(Object param0);
            
    /**
     * <p>id(0xa54)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "PatternTintAndShade", dispId = 0xa54)
    Object getPatternTintAndShade();
            
    /**
     * <p>id(0xa54)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternTintAndShade", dispId = 0xa54)
    void setPatternTintAndShade(Object param0);
            
    /**
     * <p>id(0xa55)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Gradient", dispId = 0xa55)
    com.sun.jna.platform.win32.COM.util.IDispatch getGradient();
            
    
}