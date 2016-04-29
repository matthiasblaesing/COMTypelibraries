
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8B0DD4CD-D15D-3290-81BA-A73BC181E06F})</p>
 */
public enum WdCompatibility implements IComEnum {
    
    /**
     * (1)
     */
    wdNoTabHangIndent(1),
    
    /**
     * (2)
     */
    wdNoSpaceRaiseLower(2),
    
    /**
     * (3)
     */
    wdPrintColBlack(3),
    
    /**
     * (4)
     */
    wdWrapTrailSpaces(4),
    
    /**
     * (5)
     */
    wdNoColumnBalance(5),
    
    /**
     * (6)
     */
    wdConvMailMergeEsc(6),
    
    /**
     * (7)
     */
    wdSuppressSpBfAfterPgBrk(7),
    
    /**
     * (8)
     */
    wdSuppressTopSpacing(8),
    
    /**
     * (9)
     */
    wdOrigWordTableRules(9),
    
    /**
     * (10)
     */
    wdTransparentMetafiles(10),
    
    /**
     * (11)
     */
    wdShowBreaksInFrames(11),
    
    /**
     * (12)
     */
    wdSwapBordersFacingPages(12),
    
    /**
     * (13)
     */
    wdLeaveBackslashAlone(13),
    
    /**
     * (14)
     */
    wdExpandShiftReturn(14),
    
    /**
     * (15)
     */
    wdDontULTrailSpace(15),
    
    /**
     * (16)
     */
    wdDontBalanceSingleByteDoubleByteWidth(16),
    
    /**
     * (17)
     */
    wdSuppressTopSpacingMac5(17),
    
    /**
     * (18)
     */
    wdSpacingInWholePoints(18),
    
    /**
     * (19)
     */
    wdPrintBodyTextBeforeHeader(19),
    
    /**
     * (20)
     */
    wdNoLeading(20),
    
    /**
     * (21)
     */
    wdNoSpaceForUL(21),
    
    /**
     * (22)
     */
    wdMWSmallCaps(22),
    
    /**
     * (23)
     */
    wdNoExtraLineSpacing(23),
    
    /**
     * (24)
     */
    wdTruncateFontHeight(24),
    
    /**
     * (25)
     */
    wdSubFontBySize(25),
    
    /**
     * (26)
     */
    wdUsePrinterMetrics(26),
    
    /**
     * (27)
     */
    wdWW6BorderRules(27),
    
    /**
     * (28)
     */
    wdExactOnTop(28),
    
    /**
     * (29)
     */
    wdSuppressBottomSpacing(29),
    
    /**
     * (30)
     */
    wdWPSpaceWidth(30),
    
    /**
     * (31)
     */
    wdWPJustification(31),
    
    /**
     * (32)
     */
    wdLineWrapLikeWord6(32),
    
    /**
     * (33)
     */
    wdShapeLayoutLikeWW8(33),
    
    /**
     * (34)
     */
    wdFootnoteLayoutLikeWW8(34),
    
    /**
     * (35)
     */
    wdDontUseHTMLParagraphAutoSpacing(35),
    
    /**
     * (36)
     */
    wdDontAdjustLineHeightInTable(36),
    
    /**
     * (37)
     */
    wdForgetLastTabAlignment(37),
    
    /**
     * (38)
     */
    wdAutospaceLikeWW7(38),
    
    /**
     * (39)
     */
    wdAlignTablesRowByRow(39),
    
    /**
     * (40)
     */
    wdLayoutRawTableWidth(40),
    
    /**
     * (41)
     */
    wdLayoutTableRowsApart(41),
    
    /**
     * (42)
     */
    wdUseWord97LineBreakingRules(42),
    
    /**
     * (43)
     */
    wdDontBreakWrappedTables(43),
    
    /**
     * (44)
     */
    wdDontSnapTextToGridInTableWithObjects(44),
    
    /**
     * (45)
     */
    wdSelectFieldWithFirstOrLastCharacter(45),
    
    /**
     * (46)
     */
    wdApplyBreakingRules(46),
    
    /**
     * (47)
     */
    wdDontWrapTextWithPunctuation(47),
    
    /**
     * (48)
     */
    wdDontUseAsianBreakRulesInGrid(48),
    
    /**
     * (49)
     */
    wdUseWord2002TableStyleRules(49),
    
    /**
     * (50)
     */
    wdGrowAutofit(50),
    
    /**
     * (51)
     */
    wdUseNormalStyleForList(51),
    
    /**
     * (52)
     */
    wdDontUseIndentAsNumberingTabStop(52),
    
    /**
     * (53)
     */
    wdFELineBreak11(53),
    
    /**
     * (54)
     */
    wdAllowSpaceOfSameStyleInTable(54),
    
    /**
     * (55)
     */
    wdWW11IndentRules(55),
    
    /**
     * (56)
     */
    wdDontAutofitConstrainedTables(56),
    
    /**
     * (57)
     */
    wdAutofitLikeWW11(57),
    
    /**
     * (58)
     */
    wdUnderlineTabInNumList(58),
    
    /**
     * (59)
     */
    wdHangulWidthLikeWW11(59),
    
    /**
     * (60)
     */
    wdSplitPgBreakAndParaMark(60),
    
    /**
     * (61)
     */
    wdDontVertAlignCellWithShape(61),
    
    /**
     * (62)
     */
    wdDontBreakConstrainedForcedTables(62),
    
    /**
     * (63)
     */
    wdDontVertAlignInTextbox(63),
    
    /**
     * (64)
     */
    wdWord11KerningPairs(64),
    
    /**
     * (65)
     */
    wdCachedColBalance(65),
    
    /**
     * (66)
     */
    wdDisableOTKerning(66),
    
    /**
     * (67)
     */
    wdFlipMirrorIndents(67),
    
    /**
     * (68)
     */
    wdDontOverrideTableStyleFontSzAndJustification(68),
    
    /**
     * (69)
     */
    wdUseWord2010TableStyleRules(69),
    ;

    private WdCompatibility(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}