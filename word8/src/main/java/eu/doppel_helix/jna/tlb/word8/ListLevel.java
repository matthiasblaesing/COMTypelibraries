
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002098D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002098D-0000-0000-C000-000000000046}")
public interface ListLevel {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0x2)
    String getNumberFormat();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0x2)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "TrailingCharacter", dispId = 0x3)
    WdTrailingCharacter getTrailingCharacter();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "TrailingCharacter", dispId = 0x3)
    void setTrailingCharacter(WdTrailingCharacter param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    WdListNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    void setNumberStyle(WdListNumberStyle param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "NumberPosition", dispId = 0x5)
    Float getNumberPosition();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "NumberPosition", dispId = 0x5)
    void setNumberPosition(Float param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x6)
    WdListLevelAlignment getAlignment();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x6)
    void setAlignment(WdListLevelAlignment param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "TextPosition", dispId = 0x7)
    Float getTextPosition();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "TextPosition", dispId = 0x7)
    void setTextPosition(Float param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "TabPosition", dispId = 0x8)
    Float getTabPosition();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "TabPosition", dispId = 0x8)
    void setTabPosition(Float param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ResetOnHigherOld", dispId = 0x9)
    Boolean getResetOnHigherOld();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ResetOnHigherOld", dispId = 0x9)
    void setResetOnHigherOld(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "StartAt", dispId = 0xa)
    Integer getStartAt();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "StartAt", dispId = 0xa)
    void setStartAt(Integer param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LinkedStyle", dispId = 0xb)
    String getLinkedStyle();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LinkedStyle", dispId = 0xb)
    void setLinkedStyle(String param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Font", dispId = 0xc)
    Font getFont();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Font", dispId = 0xc)
    void setFont(Font param0);
            
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ResetOnHigher", dispId = 0xd)
    Integer getResetOnHigher();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ResetOnHigher", dispId = 0xd)
    void setResetOnHigher(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "PictureBullet", dispId = 0xe)
    InlineShape getPictureBullet();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "ApplyPictureBullet", dispId = 0x0)
    InlineShape ApplyPictureBullet(String FileName);
            
    
}