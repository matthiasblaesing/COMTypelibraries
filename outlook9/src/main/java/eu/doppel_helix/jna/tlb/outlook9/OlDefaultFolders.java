
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDefaultFolders implements IComEnum {
    
    /**
     * (3)
     */
    olFolderDeletedItems(3),
    
    /**
     * (4)
     */
    olFolderOutbox(4),
    
    /**
     * (5)
     */
    olFolderSentMail(5),
    
    /**
     * (6)
     */
    olFolderInbox(6),
    
    /**
     * (9)
     */
    olFolderCalendar(9),
    
    /**
     * (10)
     */
    olFolderContacts(10),
    
    /**
     * (11)
     */
    olFolderJournal(11),
    
    /**
     * (12)
     */
    olFolderNotes(12),
    
    /**
     * (13)
     */
    olFolderTasks(13),
    
    /**
     * (16)
     */
    olFolderDrafts(16),
    
    /**
     * (18)
     */
    olPublicFoldersAllPublicFolders(18),
    
    /**
     * (19)
     */
    olFolderConflicts(19),
    
    /**
     * (20)
     */
    olFolderSyncIssues(20),
    
    /**
     * (21)
     */
    olFolderLocalFailures(21),
    
    /**
     * (22)
     */
    olFolderServerFailures(22),
    
    /**
     * (23)
     */
    olFolderJunk(23),
    
    /**
     * (25)
     */
    olFolderRssFeeds(25),
    
    /**
     * (28)
     */
    olFolderToDo(28),
    
    /**
     * (29)
     */
    olFolderManagedEmail(29),
    
    /**
     * (30)
     */
    olFolderSuggestedContacts(30),
    ;

    private OlDefaultFolders(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}