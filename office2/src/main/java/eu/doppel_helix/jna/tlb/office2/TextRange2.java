
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0397-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0397-0000-0000-C000-000000000046}")
public interface TextRange2 {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    String getText();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    void setText(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Item", dispId = 0x2)
    TextRange2 Item(Object Index);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Paragraphs", dispId = 0x4)
    TextRange2 getParagraphs(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Sentences", dispId = 0x5)
    TextRange2 getSentences(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Words", dispId = 0x6)
    TextRange2 getWords(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x7)
    TextRange2 getCharacters(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Lines", dispId = 0x8)
    TextRange2 getLines(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Runs", dispId = 0x9)
    TextRange2 getRuns(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0xa)
    ParagraphFormat2 getParagraphFormat();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Font", dispId = 0xb)
    Font2 getFont();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Length", dispId = 0xc)
    Integer getLength();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Start", dispId = 0xd)
    Integer getStart();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "BoundLeft", dispId = 0xe)
    Float getBoundLeft();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "BoundTop", dispId = 0xf)
    Float getBoundTop();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "BoundWidth", dispId = 0x10)
    Float getBoundWidth();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "BoundHeight", dispId = 0x11)
    Float getBoundHeight();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "TrimText", dispId = 0x12)
    TextRange2 TrimText();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "InsertAfter", dispId = 0x13)
    TextRange2 InsertAfter(String NewText);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "InsertBefore", dispId = 0x14)
    TextRange2 InsertBefore(String NewText);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "InsertSymbol", dispId = 0x15)
    TextRange2 InsertSymbol(String FontName,
            Integer CharNumber,
            MsoTriState Unicode);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "Select", dispId = 0x16)
    void Select();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x17)
    void Cut();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x18)
    void Copy();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x19)
    void Delete();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x1a)
    TextRange2 Paste();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x1b)
    TextRange2 PasteSpecial(MsoClipboardFormat Format);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComMethod(name = "ChangeCase", dispId = 0x1c)
    void ChangeCase(MsoTextChangeCase Type);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComMethod(name = "AddPeriods", dispId = 0x1d)
    void AddPeriods();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComMethod(name = "RemovePeriods", dispId = 0x1e)
    void RemovePeriods();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComMethod(name = "Find", dispId = 0x1f)
    TextRange2 Find(String FindWhat,
            Integer After,
            MsoTriState MatchCase,
            MsoTriState WholeWords);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComMethod(name = "Replace", dispId = 0x20)
    TextRange2 Replace(String FindWhat,
            String ReplaceWhat,
            Integer After,
            MsoTriState MatchCase,
            MsoTriState WholeWords);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComMethod(name = "RotatedBounds", dispId = 0x21)
    void RotatedBounds(VARIANT X1,
            VARIANT Y1,
            VARIANT X2,
            VARIANT Y2,
            VARIANT X3,
            VARIANT Y3,
            VARIANT x4,
            VARIANT y4);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x22)
    MsoLanguageID getLanguageID();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x22)
    void setLanguageID(MsoLanguageID param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComMethod(name = "RtlRun", dispId = 0x23)
    void RtlRun();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComMethod(name = "LtrRun", dispId = 0x24)
    void LtrRun();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MathZones", dispId = 0x25)
    TextRange2 getMathZones(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComMethod(name = "InsertChartField", dispId = 0x26)
    TextRange2 InsertChartField(MsoChartFieldType ChartFieldType,
            String Formula,
            Integer Position);
            
    
}