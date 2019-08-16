
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03B9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03B9-0000-0000-C000-000000000046}")
public interface BulletFormat2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Character", dispId = 0x2)
    Integer getCharacter();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Character", dispId = 0x2)
    void setCharacter(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Font", dispId = 0x3)
    Font2 getFont();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Number", dispId = 0x4)
    Integer getNumber();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Picture", dispId = 0x5)
    void Picture(String FileName);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "RelativeSize", dispId = 0x6)
    Float getRelativeSize();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RelativeSize", dispId = 0x6)
    void setRelativeSize(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "StartValue", dispId = 0x7)
    Integer getStartValue();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StartValue", dispId = 0x7)
    void setStartValue(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    MsoNumberedBulletStyle getStyle();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code MsoNumberedBulletStyle}
     */
    @ComProperty(name = "Style", dispId = 0x8)
    void setStyle(MsoNumberedBulletStyle param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Type", dispId = 0x9)
    MsoBulletType getType();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code MsoBulletType}
     */
    @ComProperty(name = "Type", dispId = 0x9)
    void setType(MsoBulletType param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "UseTextColor", dispId = 0xa)
    MsoTriState getUseTextColor();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "UseTextColor", dispId = 0xa)
    void setUseTextColor(MsoTriState param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "UseTextFont", dispId = 0xb)
    MsoTriState getUseTextFont();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "UseTextFont", dispId = 0xb)
    void setUseTextFont(MsoTriState param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xc)
    MsoTriState getVisible();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0xc)
    void setVisible(MsoTriState param0);
            
    
}