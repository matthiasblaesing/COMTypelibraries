
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AB7EDE63-D9C9-3D21-98B0-8DCC19D5BD63})</p>
 */
public enum WdFieldType implements IComEnum {
    
    /**
     * (-1)
     */
    wdFieldEmpty(-1),
    
    /**
     * (3)
     */
    wdFieldRef(3),
    
    /**
     * (4)
     */
    wdFieldIndexEntry(4),
    
    /**
     * (5)
     */
    wdFieldFootnoteRef(5),
    
    /**
     * (6)
     */
    wdFieldSet(6),
    
    /**
     * (7)
     */
    wdFieldIf(7),
    
    /**
     * (8)
     */
    wdFieldIndex(8),
    
    /**
     * (9)
     */
    wdFieldTOCEntry(9),
    
    /**
     * (10)
     */
    wdFieldStyleRef(10),
    
    /**
     * (11)
     */
    wdFieldRefDoc(11),
    
    /**
     * (12)
     */
    wdFieldSequence(12),
    
    /**
     * (13)
     */
    wdFieldTOC(13),
    
    /**
     * (14)
     */
    wdFieldInfo(14),
    
    /**
     * (15)
     */
    wdFieldTitle(15),
    
    /**
     * (16)
     */
    wdFieldSubject(16),
    
    /**
     * (17)
     */
    wdFieldAuthor(17),
    
    /**
     * (18)
     */
    wdFieldKeyWord(18),
    
    /**
     * (19)
     */
    wdFieldComments(19),
    
    /**
     * (20)
     */
    wdFieldLastSavedBy(20),
    
    /**
     * (21)
     */
    wdFieldCreateDate(21),
    
    /**
     * (22)
     */
    wdFieldSaveDate(22),
    
    /**
     * (23)
     */
    wdFieldPrintDate(23),
    
    /**
     * (24)
     */
    wdFieldRevisionNum(24),
    
    /**
     * (25)
     */
    wdFieldEditTime(25),
    
    /**
     * (26)
     */
    wdFieldNumPages(26),
    
    /**
     * (27)
     */
    wdFieldNumWords(27),
    
    /**
     * (28)
     */
    wdFieldNumChars(28),
    
    /**
     * (29)
     */
    wdFieldFileName(29),
    
    /**
     * (30)
     */
    wdFieldTemplate(30),
    
    /**
     * (31)
     */
    wdFieldDate(31),
    
    /**
     * (32)
     */
    wdFieldTime(32),
    
    /**
     * (33)
     */
    wdFieldPage(33),
    
    /**
     * (34)
     */
    wdFieldExpression(34),
    
    /**
     * (35)
     */
    wdFieldQuote(35),
    
    /**
     * (36)
     */
    wdFieldInclude(36),
    
    /**
     * (37)
     */
    wdFieldPageRef(37),
    
    /**
     * (38)
     */
    wdFieldAsk(38),
    
    /**
     * (39)
     */
    wdFieldFillIn(39),
    
    /**
     * (40)
     */
    wdFieldData(40),
    
    /**
     * (41)
     */
    wdFieldNext(41),
    
    /**
     * (42)
     */
    wdFieldNextIf(42),
    
    /**
     * (43)
     */
    wdFieldSkipIf(43),
    
    /**
     * (44)
     */
    wdFieldMergeRec(44),
    
    /**
     * (45)
     */
    wdFieldDDE(45),
    
    /**
     * (46)
     */
    wdFieldDDEAuto(46),
    
    /**
     * (47)
     */
    wdFieldGlossary(47),
    
    /**
     * (48)
     */
    wdFieldPrint(48),
    
    /**
     * (49)
     */
    wdFieldFormula(49),
    
    /**
     * (50)
     */
    wdFieldGoToButton(50),
    
    /**
     * (51)
     */
    wdFieldMacroButton(51),
    
    /**
     * (52)
     */
    wdFieldAutoNumOutline(52),
    
    /**
     * (53)
     */
    wdFieldAutoNumLegal(53),
    
    /**
     * (54)
     */
    wdFieldAutoNum(54),
    
    /**
     * (55)
     */
    wdFieldImport(55),
    
    /**
     * (56)
     */
    wdFieldLink(56),
    
    /**
     * (57)
     */
    wdFieldSymbol(57),
    
    /**
     * (58)
     */
    wdFieldEmbed(58),
    
    /**
     * (59)
     */
    wdFieldMergeField(59),
    
    /**
     * (60)
     */
    wdFieldUserName(60),
    
    /**
     * (61)
     */
    wdFieldUserInitials(61),
    
    /**
     * (62)
     */
    wdFieldUserAddress(62),
    
    /**
     * (63)
     */
    wdFieldBarCode(63),
    
    /**
     * (64)
     */
    wdFieldDocVariable(64),
    
    /**
     * (65)
     */
    wdFieldSection(65),
    
    /**
     * (66)
     */
    wdFieldSectionPages(66),
    
    /**
     * (67)
     */
    wdFieldIncludePicture(67),
    
    /**
     * (68)
     */
    wdFieldIncludeText(68),
    
    /**
     * (69)
     */
    wdFieldFileSize(69),
    
    /**
     * (70)
     */
    wdFieldFormTextInput(70),
    
    /**
     * (71)
     */
    wdFieldFormCheckBox(71),
    
    /**
     * (72)
     */
    wdFieldNoteRef(72),
    
    /**
     * (73)
     */
    wdFieldTOA(73),
    
    /**
     * (74)
     */
    wdFieldTOAEntry(74),
    
    /**
     * (75)
     */
    wdFieldMergeSeq(75),
    
    /**
     * (77)
     */
    wdFieldPrivate(77),
    
    /**
     * (78)
     */
    wdFieldDatabase(78),
    
    /**
     * (79)
     */
    wdFieldAutoText(79),
    
    /**
     * (80)
     */
    wdFieldCompare(80),
    
    /**
     * (81)
     */
    wdFieldAddin(81),
    
    /**
     * (82)
     */
    wdFieldSubscriber(82),
    
    /**
     * (83)
     */
    wdFieldFormDropDown(83),
    
    /**
     * (84)
     */
    wdFieldAdvance(84),
    
    /**
     * (85)
     */
    wdFieldDocProperty(85),
    
    /**
     * (87)
     */
    wdFieldOCX(87),
    
    /**
     * (88)
     */
    wdFieldHyperlink(88),
    
    /**
     * (89)
     */
    wdFieldAutoTextList(89),
    
    /**
     * (90)
     */
    wdFieldListNum(90),
    
    /**
     * (91)
     */
    wdFieldHTMLActiveX(91),
    
    /**
     * (92)
     */
    wdFieldBidiOutline(92),
    
    /**
     * (93)
     */
    wdFieldAddressBlock(93),
    
    /**
     * (94)
     */
    wdFieldGreetingLine(94),
    
    /**
     * (95)
     */
    wdFieldShape(95),
    
    /**
     * (96)
     */
    wdFieldCitation(96),
    
    /**
     * (97)
     */
    wdFieldBibliography(97),
    
    /**
     * (98)
     */
    wdFieldMergeBarcode(98),
    
    /**
     * (99)
     */
    wdFieldDisplayBarcode(99),
    ;

    private WdFieldType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}