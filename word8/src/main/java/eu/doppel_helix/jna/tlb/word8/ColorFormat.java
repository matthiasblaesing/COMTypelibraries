
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209C6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209C6-0000-0000-C000-000000000046}")
public interface ColorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    Integer getRGB();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    void setRGB(Integer param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x64)
    Integer getSchemeColor();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SchemeColor", dispId = 0x64)
    void setSchemeColor(Integer param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Type", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoColorType getType();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Name", dispId = 0x66)
    String getName();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x66)
    void setName(String param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x67)
    Float getTintAndShade();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x67)
    void setTintAndShade(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "OverPrint", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getOverPrint();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "OverPrint", dispId = 0x68)
    void setOverPrint(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Ink", dispId = 0x69)
    Float getInk(Integer Index);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(22)</p>
     * @param Index [in] {@code Integer}
     * @param param1 [in] {@code Float}
     */
    @ComProperty(name = "Ink", dispId = 0x69)
    void setInk(Integer Index,
            Float param1);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Cyan", dispId = 0x6a)
    Integer getCyan();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Cyan", dispId = 0x6a)
    void setCyan(Integer param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Magenta", dispId = 0x6b)
    Integer getMagenta();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Magenta", dispId = 0x6b)
    void setMagenta(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Yellow", dispId = 0x6c)
    Integer getYellow();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Yellow", dispId = 0x6c)
    void setYellow(Integer param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Black", dispId = 0x6d)
    Integer getBlack();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Black", dispId = 0x6d)
    void setBlack(Integer param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     * @param Cyan [in] {@code Integer}
     * @param Magenta [in] {@code Integer}
     * @param Yellow [in] {@code Integer}
     * @param Black [in] {@code Integer}
     */
    @ComMethod(name = "SetCMYK", dispId = 0x6e)
    void SetCMYK(Integer Cyan,
            Integer Magenta,
            Integer Yellow,
            Integer Black);
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ObjectThemeColor", dispId = 0xc8)
    WdThemeColorIndex getObjectThemeColor();
            
    /**
     * <p>id(0xc8)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code WdThemeColorIndex}
     */
    @ComProperty(name = "ObjectThemeColor", dispId = 0xc8)
    void setObjectThemeColor(WdThemeColorIndex param0);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0xc9)
    Float getBrightness();
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Brightness", dispId = 0xc9)
    void setBrightness(Float param0);
            
    
}