
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03B9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03B9-0000-0000-C000-000000000046}")
public interface BulletFormat2 {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Character", dispId = 0x2)
    Integer getCharacter();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Character", dispId = 0x2)
    void setCharacter(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Font", dispId = 0x3)
    Font2 getFont();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Number", dispId = 0x4)
    Integer getNumber();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Picture", dispId = 0x5)
    void Picture(String FileName);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RelativeSize", dispId = 0x6)
    Float getRelativeSize();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RelativeSize", dispId = 0x6)
    void setRelativeSize(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StartValue", dispId = 0x7)
    Integer getStartValue();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StartValue", dispId = 0x7)
    void setStartValue(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    MsoNumberedBulletStyle getStyle();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Style", dispId = 0x8)
    void setStyle(MsoNumberedBulletStyle param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Type", dispId = 0x9)
    MsoBulletType getType();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Type", dispId = 0x9)
    void setType(MsoBulletType param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "UseTextColor", dispId = 0xa)
    MsoTriState getUseTextColor();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "UseTextColor", dispId = 0xa)
    void setUseTextColor(MsoTriState param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UseTextFont", dispId = 0xb)
    MsoTriState getUseTextFont();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "UseTextFont", dispId = 0xb)
    void setUseTextFont(MsoTriState param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xc)
    MsoTriState getVisible();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Visible", dispId = 0xc)
    void setVisible(MsoTriState param0);
            
    
}