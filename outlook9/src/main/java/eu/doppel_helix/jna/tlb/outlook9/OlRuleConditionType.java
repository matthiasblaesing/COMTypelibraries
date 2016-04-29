
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRuleConditionType implements IComEnum {
    
    /**
     * (0)
     */
    olConditionUnknown(0),
    
    /**
     * (1)
     */
    olConditionFrom(1),
    
    /**
     * (2)
     */
    olConditionSubject(2),
    
    /**
     * (3)
     */
    olConditionAccount(3),
    
    /**
     * (4)
     */
    olConditionOnlyToMe(4),
    
    /**
     * (5)
     */
    olConditionTo(5),
    
    /**
     * (6)
     */
    olConditionImportance(6),
    
    /**
     * (7)
     */
    olConditionSensitivity(7),
    
    /**
     * (8)
     */
    olConditionFlaggedForAction(8),
    
    /**
     * (9)
     */
    olConditionCc(9),
    
    /**
     * (10)
     */
    olConditionToOrCc(10),
    
    /**
     * (11)
     */
    olConditionNotTo(11),
    
    /**
     * (12)
     */
    olConditionSentTo(12),
    
    /**
     * (13)
     */
    olConditionBody(13),
    
    /**
     * (14)
     */
    olConditionBodyOrSubject(14),
    
    /**
     * (15)
     */
    olConditionMessageHeader(15),
    
    /**
     * (16)
     */
    olConditionRecipientAddress(16),
    
    /**
     * (17)
     */
    olConditionSenderAddress(17),
    
    /**
     * (18)
     */
    olConditionCategory(18),
    
    /**
     * (19)
     */
    olConditionOOF(19),
    
    /**
     * (20)
     */
    olConditionHasAttachment(20),
    
    /**
     * (21)
     */
    olConditionSizeRange(21),
    
    /**
     * (22)
     */
    olConditionDateRange(22),
    
    /**
     * (23)
     */
    olConditionFormName(23),
    
    /**
     * (24)
     */
    olConditionProperty(24),
    
    /**
     * (25)
     */
    olConditionSenderInAddressBook(25),
    
    /**
     * (26)
     */
    olConditionMeetingInviteOrUpdate(26),
    
    /**
     * (27)
     */
    olConditionLocalMachineOnly(27),
    
    /**
     * (28)
     */
    olConditionOtherMachine(28),
    
    /**
     * (29)
     */
    olConditionAnyCategory(29),
    
    /**
     * (30)
     */
    olConditionFromRssFeed(30),
    
    /**
     * (31)
     */
    olConditionFromAnyRssFeed(31),
    ;

    private OlRuleConditionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}