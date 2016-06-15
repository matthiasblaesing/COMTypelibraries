
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({BEF6E003-A874-101A-8BBA-00AA00300CAB})</p>
 */
@ComInterface(iid="{BEF6E003-A874-101A-8BBA-00AA00300CAB}")
public interface IFontDisp extends IUnknown, IRawDispatchHandle, IDispatch {
    
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();

    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String value);

    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Size", dispId = 0x2)
    com.sun.jna.platform.win32.OaIdl.CURRENCY getSize();

    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Size", dispId = 0x2)
    void setSize(com.sun.jna.platform.win32.OaIdl.CURRENCY value);

    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x3)
    Boolean getBold();

    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x3)
    void setBold(Boolean value);

    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x4)
    Boolean getItalic();

    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x4)
    void setItalic(Boolean value);

    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x5)
    Boolean getUnderline();

    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x5)
    void setUnderline(Boolean value);

    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0x6)
    Boolean getStrikethrough();

    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0x6)
    void setStrikethrough(Boolean value);

    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x7)
    Short getWeight();

    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x7)
    void setWeight(Short value);

    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Charset", dispId = 0x8)
    Short getCharset();

    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Charset", dispId = 0x8)
    void setCharset(Short value);

}