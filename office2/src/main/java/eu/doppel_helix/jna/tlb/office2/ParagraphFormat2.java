
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0399-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0399-0000-0000-C000-000000000046}")
public interface ParagraphFormat2 {
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
    @ComProperty(name = "Alignment", dispId = 0x2)
    MsoParagraphAlignment getAlignment();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x2)
    void setAlignment(MsoParagraphAlignment param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "BaselineAlignment", dispId = 0x3)
    MsoBaselineAlignment getBaselineAlignment();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "BaselineAlignment", dispId = 0x3)
    void setBaselineAlignment(MsoBaselineAlignment param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Bullet", dispId = 0x4)
    BulletFormat2 getBullet();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x5)
    MsoTriState getFarEastLineBreakLevel();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "FarEastLineBreakLevel", dispId = 0x5)
    void setFarEastLineBreakLevel(MsoTriState param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6)
    Float getFirstLineIndent();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "FirstLineIndent", dispId = 0x6)
    void setFirstLineIndent(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x7)
    MsoTriState getHangingPunctuation();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "HangingPunctuation", dispId = 0x7)
    void setHangingPunctuation(MsoTriState param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0x8)
    Integer getIndentLevel();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "IndentLevel", dispId = 0x8)
    void setIndentLevel(Integer param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    Float getLeftIndent();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LeftIndent", dispId = 0x9)
    void setLeftIndent(Float param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "LineRuleAfter", dispId = 0xa)
    MsoTriState getLineRuleAfter();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "LineRuleAfter", dispId = 0xa)
    void setLineRuleAfter(MsoTriState param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LineRuleBefore", dispId = 0xb)
    MsoTriState getLineRuleBefore();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "LineRuleBefore", dispId = 0xb)
    void setLineRuleBefore(MsoTriState param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LineRuleWithin", dispId = 0xc)
    MsoTriState getLineRuleWithin();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LineRuleWithin", dispId = 0xc)
    void setLineRuleWithin(MsoTriState param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0xd)
    Float getRightIndent();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "RightIndent", dispId = 0xd)
    void setRightIndent(Float param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0xe)
    Float getSpaceAfter();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "SpaceAfter", dispId = 0xe)
    void setSpaceAfter(Float param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0xf)
    Float getSpaceBefore();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "SpaceBefore", dispId = 0xf)
    void setSpaceBefore(Float param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "SpaceWithin", dispId = 0x10)
    Float getSpaceWithin();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "SpaceWithin", dispId = 0x10)
    void setSpaceWithin(Float param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "TabStops", dispId = 0x11)
    TabStops2 getTabStops();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "TextDirection", dispId = 0x12)
    MsoTextDirection getTextDirection();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "TextDirection", dispId = 0x12)
    void setTextDirection(MsoTextDirection param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x13)
    MsoTriState getWordWrap();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0x13)
    void setWordWrap(MsoTriState param0);
            
    
}