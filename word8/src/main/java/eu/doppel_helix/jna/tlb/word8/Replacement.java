
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B1-0000-0000-C000-000000000046}")
public interface Replacement extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Font", dispId = 0xa)
    Font getFont();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0xa)
    void setFont(Font param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0xb)
    ParagraphFormat getParagraphFormat();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code ParagraphFormat}
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0xb)
    void setParagraphFormat(ParagraphFormat param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Style", dispId = 0xc)
    Object getStyle();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Style", dispId = 0xc)
    void setStyle(Object param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Text", dispId = 0xf)
    String getText();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0xf)
    void setText(String param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x10)
    WdLanguageID getLanguageID();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x10)
    void setLanguageID(WdLanguageID param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Highlight", dispId = 0x11)
    Integer getHighlight();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Highlight", dispId = 0x11)
    void setHighlight(Integer param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Frame", dispId = 0x12)
    Frame getFrame();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x13)
    WdLanguageID getLanguageIDFarEast();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code WdLanguageID}
     */
    @ComProperty(name = "LanguageIDFarEast", dispId = 0x13)
    void setLanguageIDFarEast(WdLanguageID param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "ClearFormatting", dispId = 0x14)
    void ClearFormatting();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "NoProofing", dispId = 0x15)
    Integer getNoProofing();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NoProofing", dispId = 0x15)
    void setNoProofing(Integer param0);
            
    
}