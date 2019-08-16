
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0397-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0397-0000-0000-C000-000000000046}")
public interface TextRange2 extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Text", dispId = 0x0)
    String getText();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x0)
    void setText(String param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x2)
    TextRange2 Item(Object Index);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Paragraphs", dispId = 0x4)
    TextRange2 getParagraphs(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Sentences", dispId = 0x5)
    TextRange2 getSentences(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Words", dispId = 0x6)
    TextRange2 getWords(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Characters", dispId = 0x7)
    TextRange2 getCharacters(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Lines", dispId = 0x8)
    TextRange2 getLines(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(20)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "Runs", dispId = 0x9)
    TextRange2 getRuns(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ParagraphFormat", dispId = 0xa)
    ParagraphFormat2 getParagraphFormat();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Font", dispId = 0xb)
    Font2 getFont();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Length", dispId = 0xc)
    Integer getLength();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Start", dispId = 0xd)
    Integer getStart();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "BoundLeft", dispId = 0xe)
    Float getBoundLeft();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "BoundTop", dispId = 0xf)
    Float getBoundTop();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "BoundWidth", dispId = 0x10)
    Float getBoundWidth();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "BoundHeight", dispId = 0x11)
    Float getBoundHeight();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "TrimText", dispId = 0x12)
    TextRange2 TrimText();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(30)</p>
     * @param NewText [in, optional] {@code String}
     */
    @ComMethod(name = "InsertAfter", dispId = 0x13)
    TextRange2 InsertAfter(String NewText);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(31)</p>
     * @param NewText [in, optional] {@code String}
     */
    @ComMethod(name = "InsertBefore", dispId = 0x14)
    TextRange2 InsertBefore(String NewText);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(32)</p>
     * @param FontName [in] {@code String}
     * @param CharNumber [in] {@code Integer}
     * @param Unicode [in, optional] {@code MsoTriState}
     */
    @ComMethod(name = "InsertSymbol", dispId = 0x15)
    TextRange2 InsertSymbol(String FontName,
            Integer CharNumber,
            MsoTriState Unicode);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Select", dispId = 0x16)
    void Select();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x17)
    void Cut();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x18)
    void Copy();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x19)
    void Delete();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "Paste", dispId = 0x1a)
    TextRange2 Paste();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(38)</p>
     * @param Format [in] {@code MsoClipboardFormat}
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x1b)
    TextRange2 PasteSpecial(MsoClipboardFormat Format);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(39)</p>
     * @param Type [in] {@code MsoTextChangeCase}
     */
    @ComMethod(name = "ChangeCase", dispId = 0x1c)
    void ChangeCase(MsoTextChangeCase Type);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "AddPeriods", dispId = 0x1d)
    void AddPeriods();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(41)</p>
     */
    @ComMethod(name = "RemovePeriods", dispId = 0x1e)
    void RemovePeriods();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(42)</p>
     * @param FindWhat [in] {@code String}
     * @param After [in, optional] {@code Integer}
     * @param MatchCase [in, optional] {@code MsoTriState}
     * @param WholeWords [in, optional] {@code MsoTriState}
     */
    @ComMethod(name = "Find", dispId = 0x1f)
    TextRange2 Find(String FindWhat,
            Integer After,
            MsoTriState MatchCase,
            MsoTriState WholeWords);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(43)</p>
     * @param FindWhat [in] {@code String}
     * @param ReplaceWhat [in] {@code String}
     * @param After [in, optional] {@code Integer}
     * @param MatchCase [in, optional] {@code MsoTriState}
     * @param WholeWords [in, optional] {@code MsoTriState}
     */
    @ComMethod(name = "Replace", dispId = 0x20)
    TextRange2 Replace(String FindWhat,
            String ReplaceWhat,
            Integer After,
            MsoTriState MatchCase,
            MsoTriState WholeWords);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(44)</p>
     * @param X1 [out] {@code Float}
     * @param Y1 [out] {@code Float}
     * @param X2 [out] {@code Float}
     * @param Y2 [out] {@code Float}
     * @param X3 [out] {@code Float}
     * @param Y3 [out] {@code Float}
     * @param x4 [out] {@code Float}
     * @param y4 [out] {@code Float}
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
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "LanguageID", dispId = 0x22)
    MsoLanguageID getLanguageID();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code MsoLanguageID}
     */
    @ComProperty(name = "LanguageID", dispId = 0x22)
    void setLanguageID(MsoLanguageID param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "RtlRun", dispId = 0x23)
    void RtlRun();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(48)</p>
     */
    @ComMethod(name = "LtrRun", dispId = 0x24)
    void LtrRun();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(49)</p>
     * @param Start [in, optional] {@code Integer}
     * @param Length [in, optional] {@code Integer}
     */
    @ComProperty(name = "MathZones", dispId = 0x25)
    TextRange2 getMathZones(Integer Start,
            Integer Length);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(50)</p>
     * @param ChartFieldType [in] {@code MsoChartFieldType}
     * @param Formula [in, optional] {@code String}
     * @param Position [in, optional] {@code Integer}
     */
    @ComMethod(name = "InsertChartField", dispId = 0x26)
    TextRange2 InsertChartField(MsoChartFieldType ChartFieldType,
            String Formula,
            Integer Position);
            
    
}