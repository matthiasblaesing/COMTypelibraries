
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002098D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002098D-0000-0000-C000-000000000046}")
public interface ListLevel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0x2)
    String getNumberFormat();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NumberFormat", dispId = 0x2)
    void setNumberFormat(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "TrailingCharacter", dispId = 0x3)
    WdTrailingCharacter getTrailingCharacter();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdTrailingCharacter}
     */
    @ComProperty(name = "TrailingCharacter", dispId = 0x3)
    void setTrailingCharacter(WdTrailingCharacter param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    WdListNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdListNumberStyle}
     */
    @ComProperty(name = "NumberStyle", dispId = 0x4)
    void setNumberStyle(WdListNumberStyle param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "NumberPosition", dispId = 0x5)
    Float getNumberPosition();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "NumberPosition", dispId = 0x5)
    void setNumberPosition(Float param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x6)
    WdListLevelAlignment getAlignment();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code WdListLevelAlignment}
     */
    @ComProperty(name = "Alignment", dispId = 0x6)
    void setAlignment(WdListLevelAlignment param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "TextPosition", dispId = 0x7)
    Float getTextPosition();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TextPosition", dispId = 0x7)
    void setTextPosition(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "TabPosition", dispId = 0x8)
    Float getTabPosition();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TabPosition", dispId = 0x8)
    void setTabPosition(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ResetOnHigherOld", dispId = 0x9)
    Boolean getResetOnHigherOld();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ResetOnHigherOld", dispId = 0x9)
    void setResetOnHigherOld(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "StartAt", dispId = 0xa)
    Integer getStartAt();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StartAt", dispId = 0xa)
    void setStartAt(Integer param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "LinkedStyle", dispId = 0xb)
    String getLinkedStyle();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LinkedStyle", dispId = 0xb)
    void setLinkedStyle(String param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Font", dispId = 0xc)
    Font getFont();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0xc)
    void setFont(Font param0);
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ResetOnHigher", dispId = 0xd)
    Integer getResetOnHigher();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ResetOnHigher", dispId = 0xd)
    void setResetOnHigher(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "PictureBullet", dispId = 0xe)
    InlineShape getPictureBullet();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(36)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "ApplyPictureBullet", dispId = 0x0)
    InlineShape ApplyPictureBullet(String FileName);
            
    
}