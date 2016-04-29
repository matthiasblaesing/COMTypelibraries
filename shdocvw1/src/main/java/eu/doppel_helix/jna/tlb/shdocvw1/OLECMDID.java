
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OLECMDID implements IComEnum {
    
    /**
     * (1)
     */
    OLECMDID_OPEN(1),
    
    /**
     * (2)
     */
    OLECMDID_NEW(2),
    
    /**
     * (3)
     */
    OLECMDID_SAVE(3),
    
    /**
     * (4)
     */
    OLECMDID_SAVEAS(4),
    
    /**
     * (5)
     */
    OLECMDID_SAVECOPYAS(5),
    
    /**
     * (6)
     */
    OLECMDID_PRINT(6),
    
    /**
     * (7)
     */
    OLECMDID_PRINTPREVIEW(7),
    
    /**
     * (8)
     */
    OLECMDID_PAGESETUP(8),
    
    /**
     * (9)
     */
    OLECMDID_SPELL(9),
    
    /**
     * (10)
     */
    OLECMDID_PROPERTIES(10),
    
    /**
     * (11)
     */
    OLECMDID_CUT(11),
    
    /**
     * (12)
     */
    OLECMDID_COPY(12),
    
    /**
     * (13)
     */
    OLECMDID_PASTE(13),
    
    /**
     * (14)
     */
    OLECMDID_PASTESPECIAL(14),
    
    /**
     * (15)
     */
    OLECMDID_UNDO(15),
    
    /**
     * (16)
     */
    OLECMDID_REDO(16),
    
    /**
     * (17)
     */
    OLECMDID_SELECTALL(17),
    
    /**
     * (18)
     */
    OLECMDID_CLEARSELECTION(18),
    
    /**
     * (19)
     */
    OLECMDID_ZOOM(19),
    
    /**
     * (20)
     */
    OLECMDID_GETZOOMRANGE(20),
    
    /**
     * (21)
     */
    OLECMDID_UPDATECOMMANDS(21),
    
    /**
     * (22)
     */
    OLECMDID_REFRESH(22),
    
    /**
     * (23)
     */
    OLECMDID_STOP(23),
    
    /**
     * (24)
     */
    OLECMDID_HIDETOOLBARS(24),
    
    /**
     * (25)
     */
    OLECMDID_SETPROGRESSMAX(25),
    
    /**
     * (26)
     */
    OLECMDID_SETPROGRESSPOS(26),
    
    /**
     * (27)
     */
    OLECMDID_SETPROGRESSTEXT(27),
    
    /**
     * (28)
     */
    OLECMDID_SETTITLE(28),
    
    /**
     * (29)
     */
    OLECMDID_SETDOWNLOADSTATE(29),
    
    /**
     * (30)
     */
    OLECMDID_STOPDOWNLOAD(30),
    
    /**
     * (31)
     */
    OLECMDID_ONTOOLBARACTIVATED(31),
    
    /**
     * (32)
     */
    OLECMDID_FIND(32),
    
    /**
     * (33)
     */
    OLECMDID_DELETE(33),
    
    /**
     * (34)
     */
    OLECMDID_HTTPEQUIV(34),
    
    /**
     * (35)
     */
    OLECMDID_HTTPEQUIV_DONE(35),
    
    /**
     * (36)
     */
    OLECMDID_ENABLE_INTERACTION(36),
    
    /**
     * (37)
     */
    OLECMDID_ONUNLOAD(37),
    
    /**
     * (38)
     */
    OLECMDID_PROPERTYBAG2(38),
    
    /**
     * (39)
     */
    OLECMDID_PREREFRESH(39),
    
    /**
     * (40)
     */
    OLECMDID_SHOWSCRIPTERROR(40),
    
    /**
     * (41)
     */
    OLECMDID_SHOWMESSAGE(41),
    
    /**
     * (42)
     */
    OLECMDID_SHOWFIND(42),
    
    /**
     * (43)
     */
    OLECMDID_SHOWPAGESETUP(43),
    
    /**
     * (44)
     */
    OLECMDID_SHOWPRINT(44),
    
    /**
     * (45)
     */
    OLECMDID_CLOSE(45),
    
    /**
     * (46)
     */
    OLECMDID_ALLOWUILESSSAVEAS(46),
    
    /**
     * (47)
     */
    OLECMDID_DONTDOWNLOADCSS(47),
    
    /**
     * (48)
     */
    OLECMDID_UPDATEPAGESTATUS(48),
    
    /**
     * (49)
     */
    OLECMDID_PRINT2(49),
    
    /**
     * (50)
     */
    OLECMDID_PRINTPREVIEW2(50),
    
    /**
     * (51)
     */
    OLECMDID_SETPRINTTEMPLATE(51),
    
    /**
     * (52)
     */
    OLECMDID_GETPRINTTEMPLATE(52),
    
    /**
     * (55)
     */
    OLECMDID_PAGEACTIONBLOCKED(55),
    
    /**
     * (56)
     */
    OLECMDID_PAGEACTIONUIQUERY(56),
    
    /**
     * (57)
     */
    OLECMDID_FOCUSVIEWCONTROLS(57),
    
    /**
     * (58)
     */
    OLECMDID_FOCUSVIEWCONTROLSQUERY(58),
    
    /**
     * (59)
     */
    OLECMDID_SHOWPAGEACTIONMENU(59),
    
    /**
     * (60)
     */
    OLECMDID_ADDTRAVELENTRY(60),
    
    /**
     * (61)
     */
    OLECMDID_UPDATETRAVELENTRY(61),
    
    /**
     * (62)
     */
    OLECMDID_UPDATEBACKFORWARDSTATE(62),
    
    /**
     * (63)
     */
    OLECMDID_OPTICAL_ZOOM(63),
    
    /**
     * (64)
     */
    OLECMDID_OPTICAL_GETZOOMRANGE(64),
    
    /**
     * (65)
     */
    OLECMDID_WINDOWSTATECHANGED(65),
    
    /**
     * (66)
     */
    OLECMDID_ACTIVEXINSTALLSCOPE(66),
    
    /**
     * (67)
     */
    OLECMDID_UPDATETRAVELENTRY_DATARECOVERY(67),
    
    /**
     * (68)
     */
    OLECMDID_SHOWTASKDLG(68),
    
    /**
     * (69)
     */
    OLECMDID_POPSTATEEVENT(69),
    
    /**
     * (70)
     */
    OLECMDID_VIEWPORT_MODE(70),
    
    /**
     * (71)
     */
    OLECMDID_LAYOUT_VIEWPORT_WIDTH(71),
    
    /**
     * (72)
     */
    OLECMDID_VISUAL_VIEWPORT_EXCLUDE_BOTTOM(72),
    
    /**
     * (73)
     */
    OLECMDID_USER_OPTICAL_ZOOM(73),
    
    /**
     * (74)
     */
    OLECMDID_PAGEAVAILABLE(74),
    
    /**
     * (75)
     */
    OLECMDID_GETUSERSCALABLE(75),
    
    /**
     * (76)
     */
    OLECMDID_UPDATE_CARET(76),
    
    /**
     * (77)
     */
    OLECMDID_ENABLE_VISIBILITY(77),
    
    /**
     * (78)
     */
    OLECMDID_MEDIA_PLAYBACK(78),
    
    /**
     * (79)
     */
    OLECMDID_SETFAVICON(79),
    
    /**
     * (80)
     */
    OLECMDID_SET_HOST_FULLSCREENMODE(80),
    
    /**
     * (81)
     */
    OLECMDID_EXITFULLSCREEN(81),
    
    /**
     * (82)
     */
    OLECMDID_SCROLLCOMPLETE(82),
    
    /**
     * (83)
     */
    OLECMDID_ONBEFOREUNLOAD(83),
    ;

    private OLECMDID(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}