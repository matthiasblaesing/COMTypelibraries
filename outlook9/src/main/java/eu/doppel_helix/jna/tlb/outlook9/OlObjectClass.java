
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlObjectClass implements IComEnum {
    
    /**
     * (0)
     */
    olApplication(0),
    
    /**
     * (1)
     */
    olNamespace(1),
    
    /**
     * (2)
     */
    olFolder(2),
    
    /**
     * (4)
     */
    olRecipient(4),
    
    /**
     * (5)
     */
    olAttachment(5),
    
    /**
     * (7)
     */
    olAddressList(7),
    
    /**
     * (8)
     */
    olAddressEntry(8),
    
    /**
     * (15)
     */
    olFolders(15),
    
    /**
     * (16)
     */
    olItems(16),
    
    /**
     * (17)
     */
    olRecipients(17),
    
    /**
     * (18)
     */
    olAttachments(18),
    
    /**
     * (20)
     */
    olAddressLists(20),
    
    /**
     * (21)
     */
    olAddressEntries(21),
    
    /**
     * (26)
     */
    olAppointment(26),
    
    /**
     * (53)
     */
    olMeetingRequest(53),
    
    /**
     * (54)
     */
    olMeetingCancellation(54),
    
    /**
     * (55)
     */
    olMeetingResponseNegative(55),
    
    /**
     * (56)
     */
    olMeetingResponsePositive(56),
    
    /**
     * (57)
     */
    olMeetingResponseTentative(57),
    
    /**
     * (28)
     */
    olRecurrencePattern(28),
    
    /**
     * (29)
     */
    olExceptions(29),
    
    /**
     * (30)
     */
    olException(30),
    
    /**
     * (32)
     */
    olAction(32),
    
    /**
     * (33)
     */
    olActions(33),
    
    /**
     * (34)
     */
    olExplorer(34),
    
    /**
     * (35)
     */
    olInspector(35),
    
    /**
     * (36)
     */
    olPages(36),
    
    /**
     * (37)
     */
    olFormDescription(37),
    
    /**
     * (38)
     */
    olUserProperties(38),
    
    /**
     * (39)
     */
    olUserProperty(39),
    
    /**
     * (40)
     */
    olContact(40),
    
    /**
     * (41)
     */
    olDocument(41),
    
    /**
     * (42)
     */
    olJournal(42),
    
    /**
     * (43)
     */
    olMail(43),
    
    /**
     * (44)
     */
    olNote(44),
    
    /**
     * (45)
     */
    olPost(45),
    
    /**
     * (46)
     */
    olReport(46),
    
    /**
     * (47)
     */
    olRemote(47),
    
    /**
     * (48)
     */
    olTask(48),
    
    /**
     * (49)
     */
    olTaskRequest(49),
    
    /**
     * (50)
     */
    olTaskRequestUpdate(50),
    
    /**
     * (51)
     */
    olTaskRequestAccept(51),
    
    /**
     * (52)
     */
    olTaskRequestDecline(52),
    
    /**
     * (60)
     */
    olExplorers(60),
    
    /**
     * (61)
     */
    olInspectors(61),
    
    /**
     * (62)
     */
    olPanes(62),
    
    /**
     * (63)
     */
    olOutlookBarPane(63),
    
    /**
     * (64)
     */
    olOutlookBarStorage(64),
    
    /**
     * (65)
     */
    olOutlookBarGroups(65),
    
    /**
     * (66)
     */
    olOutlookBarGroup(66),
    
    /**
     * (67)
     */
    olOutlookBarShortcuts(67),
    
    /**
     * (68)
     */
    olOutlookBarShortcut(68),
    
    /**
     * (69)
     */
    olDistributionList(69),
    
    /**
     * (70)
     */
    olPropertyPageSite(70),
    
    /**
     * (71)
     */
    olPropertyPages(71),
    
    /**
     * (72)
     */
    olSyncObject(72),
    
    /**
     * (73)
     */
    olSyncObjects(73),
    
    /**
     * (74)
     */
    olSelection(74),
    
    /**
     * (75)
     */
    olLink(75),
    
    /**
     * (76)
     */
    olLinks(76),
    
    /**
     * (77)
     */
    olSearch(77),
    
    /**
     * (78)
     */
    olResults(78),
    
    /**
     * (79)
     */
    olViews(79),
    
    /**
     * (80)
     */
    olView(80),
    
    /**
     * (98)
     */
    olItemProperties(98),
    
    /**
     * (99)
     */
    olItemProperty(99),
    
    /**
     * (100)
     */
    olReminders(100),
    
    /**
     * (101)
     */
    olReminder(101),
    
    /**
     * (102)
     */
    olConflict(102),
    
    /**
     * (103)
     */
    olConflicts(103),
    
    /**
     * (104)
     */
    olSharing(104),
    
    /**
     * (105)
     */
    olAccount(105),
    
    /**
     * (106)
     */
    olAccounts(106),
    
    /**
     * (107)
     */
    olStore(107),
    
    /**
     * (108)
     */
    olStores(108),
    
    /**
     * (109)
     */
    olSelectNamesDialog(109),
    
    /**
     * (110)
     */
    olExchangeUser(110),
    
    /**
     * (111)
     */
    olExchangeDistributionList(111),
    
    /**
     * (112)
     */
    olPropertyAccessor(112),
    
    /**
     * (113)
     */
    olStorageItem(113),
    
    /**
     * (114)
     */
    olRules(114),
    
    /**
     * (115)
     */
    olRule(115),
    
    /**
     * (116)
     */
    olRuleActions(116),
    
    /**
     * (117)
     */
    olRuleAction(117),
    
    /**
     * (118)
     */
    olMoveOrCopyRuleAction(118),
    
    /**
     * (119)
     */
    olSendRuleAction(119),
    
    /**
     * (120)
     */
    olTable(120),
    
    /**
     * (121)
     */
    olRow(121),
    
    /**
     * (122)
     */
    olAssignToCategoryRuleAction(122),
    
    /**
     * (123)
     */
    olPlaySoundRuleAction(123),
    
    /**
     * (124)
     */
    olMarkAsTaskRuleAction(124),
    
    /**
     * (125)
     */
    olNewItemAlertRuleAction(125),
    
    /**
     * (126)
     */
    olRuleConditions(126),
    
    /**
     * (127)
     */
    olRuleCondition(127),
    
    /**
     * (128)
     */
    olImportanceRuleCondition(128),
    
    /**
     * (129)
     */
    olFormRegion(129),
    
    /**
     * (130)
     */
    olCategoryRuleCondition(130),
    
    /**
     * (131)
     */
    olFormNameRuleCondition(131),
    
    /**
     * (132)
     */
    olFromRuleCondition(132),
    
    /**
     * (133)
     */
    olSenderInAddressListRuleCondition(133),
    
    /**
     * (134)
     */
    olTextRuleCondition(134),
    
    /**
     * (135)
     */
    olAccountRuleCondition(135),
    
    /**
     * (136)
     */
    olClassTableView(136),
    
    /**
     * (137)
     */
    olClassIconView(137),
    
    /**
     * (138)
     */
    olClassCardView(138),
    
    /**
     * (139)
     */
    olClassCalendarView(139),
    
    /**
     * (140)
     */
    olClassTimeLineView(140),
    
    /**
     * (141)
     */
    olViewFields(141),
    
    /**
     * (142)
     */
    olViewField(142),
    
    /**
     * (144)
     */
    olOrderField(144),
    
    /**
     * (145)
     */
    olOrderFields(145),
    
    /**
     * (146)
     */
    olViewFont(146),
    
    /**
     * (147)
     */
    olAutoFormatRule(147),
    
    /**
     * (148)
     */
    olAutoFormatRules(148),
    
    /**
     * (149)
     */
    olColumnFormat(149),
    
    /**
     * (150)
     */
    olColumns(150),
    
    /**
     * (151)
     */
    olCalendarSharing(151),
    
    /**
     * (152)
     */
    olCategory(152),
    
    /**
     * (153)
     */
    olCategories(153),
    
    /**
     * (154)
     */
    olColumn(154),
    
    /**
     * (155)
     */
    olClassNavigationPane(155),
    
    /**
     * (156)
     */
    olNavigationModules(156),
    
    /**
     * (157)
     */
    olNavigationModule(157),
    
    /**
     * (158)
     */
    olMailModule(158),
    
    /**
     * (159)
     */
    olCalendarModule(159),
    
    /**
     * (160)
     */
    olContactsModule(160),
    
    /**
     * (161)
     */
    olTasksModule(161),
    
    /**
     * (162)
     */
    olJournalModule(162),
    
    /**
     * (163)
     */
    olNotesModule(163),
    
    /**
     * (164)
     */
    olNavigationGroups(164),
    
    /**
     * (165)
     */
    olNavigationGroup(165),
    
    /**
     * (166)
     */
    olNavigationFolders(166),
    
    /**
     * (167)
     */
    olNavigationFolder(167),
    
    /**
     * (168)
     */
    olClassBusinessCardView(168),
    
    /**
     * (169)
     */
    olAttachmentSelection(169),
    
    /**
     * (170)
     */
    olAddressRuleCondition(170),
    
    /**
     * (171)
     */
    olUserDefinedProperty(171),
    
    /**
     * (172)
     */
    olUserDefinedProperties(172),
    
    /**
     * (173)
     */
    olFromRssFeedRuleCondition(173),
    
    /**
     * (174)
     */
    olClassTimeZone(174),
    
    /**
     * (175)
     */
    olClassTimeZones(175),
    
    /**
     * (176)
     */
    olMobile(176),
    
    /**
     * (177)
     */
    olSolutionsModule(177),
    
    /**
     * (178)
     */
    olConversation(178),
    
    /**
     * (179)
     */
    olSimpleItems(179),
    
    /**
     * (180)
     */
    olOutspace(180),
    
    /**
     * (181)
     */
    olMeetingForwardNotification(181),
    
    /**
     * (182)
     */
    olConversationHeader(182),
    
    /**
     * (183)
     */
    olClassPeopleView(183),
    ;

    private OlObjectClass(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}