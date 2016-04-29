
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A5-0000-0000-C000-000000000046}")
public interface View {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdViewType getType();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    void setType(WdViewType param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "FullScreen", dispId = 0x1)
    Boolean getFullScreen();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "FullScreen", dispId = 0x1)
    void setFullScreen(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x2)
    Boolean getDraft();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Draft", dispId = 0x2)
    void setDraft(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ShowAll", dispId = 0x3)
    Boolean getShowAll();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ShowAll", dispId = 0x3)
    void setShowAll(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ShowFieldCodes", dispId = 0x4)
    Boolean getShowFieldCodes();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ShowFieldCodes", dispId = 0x4)
    void setShowFieldCodes(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "MailMergeDataView", dispId = 0x5)
    Boolean getMailMergeDataView();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "MailMergeDataView", dispId = 0x5)
    void setMailMergeDataView(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Magnifier", dispId = 0x7)
    Boolean getMagnifier();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Magnifier", dispId = 0x7)
    void setMagnifier(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ShowFirstLineOnly", dispId = 0x8)
    Boolean getShowFirstLineOnly();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ShowFirstLineOnly", dispId = 0x8)
    void setShowFirstLineOnly(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowFormat", dispId = 0x9)
    Boolean getShowFormat();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowFormat", dispId = 0x9)
    void setShowFormat(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Zoom", dispId = 0xa)
    Zoom getZoom();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ShowObjectAnchors", dispId = 0xb)
    Boolean getShowObjectAnchors();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ShowObjectAnchors", dispId = 0xb)
    void setShowObjectAnchors(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "ShowTextBoundaries", dispId = 0xc)
    Boolean getShowTextBoundaries();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "ShowTextBoundaries", dispId = 0xc)
    void setShowTextBoundaries(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ShowHighlight", dispId = 0xd)
    Boolean getShowHighlight();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ShowHighlight", dispId = 0xd)
    void setShowHighlight(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ShowDrawings", dispId = 0xe)
    Boolean getShowDrawings();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "ShowDrawings", dispId = 0xe)
    void setShowDrawings(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ShowTabs", dispId = 0xf)
    Boolean getShowTabs();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ShowTabs", dispId = 0xf)
    void setShowTabs(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "ShowSpaces", dispId = 0x10)
    Boolean getShowSpaces();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "ShowSpaces", dispId = 0x10)
    void setShowSpaces(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "ShowParagraphs", dispId = 0x11)
    Boolean getShowParagraphs();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "ShowParagraphs", dispId = 0x11)
    void setShowParagraphs(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ShowHyphens", dispId = 0x12)
    Boolean getShowHyphens();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ShowHyphens", dispId = 0x12)
    void setShowHyphens(Boolean param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "ShowHiddenText", dispId = 0x13)
    Boolean getShowHiddenText();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "ShowHiddenText", dispId = 0x13)
    void setShowHiddenText(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "WrapToWindow", dispId = 0x14)
    Boolean getWrapToWindow();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "WrapToWindow", dispId = 0x14)
    void setWrapToWindow(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "ShowPicturePlaceHolders", dispId = 0x15)
    Boolean getShowPicturePlaceHolders();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "ShowPicturePlaceHolders", dispId = 0x15)
    void setShowPicturePlaceHolders(Boolean param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "ShowBookmarks", dispId = 0x16)
    Boolean getShowBookmarks();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "ShowBookmarks", dispId = 0x16)
    void setShowBookmarks(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "FieldShading", dispId = 0x17)
    WdFieldShading getFieldShading();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "FieldShading", dispId = 0x17)
    void setFieldShading(WdFieldShading param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x18)
    Boolean getShowAnimation();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x18)
    void setShowAnimation(Boolean param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "TableGridlines", dispId = 0x19)
    Boolean getTableGridlines();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "TableGridlines", dispId = 0x19)
    void setTableGridlines(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "EnlargeFontsLessThan", dispId = 0x1a)
    Integer getEnlargeFontsLessThan();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "EnlargeFontsLessThan", dispId = 0x1a)
    void setEnlargeFontsLessThan(Integer param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "ShowMainTextLayer", dispId = 0x1b)
    Boolean getShowMainTextLayer();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "ShowMainTextLayer", dispId = 0x1b)
    void setShowMainTextLayer(Boolean param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "SeekView", dispId = 0x1c)
    WdSeekView getSeekView();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "SeekView", dispId = 0x1c)
    void setSeekView(WdSeekView param0);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "SplitSpecial", dispId = 0x1d)
    WdSpecialPane getSplitSpecial();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "SplitSpecial", dispId = 0x1d)
    void setSplitSpecial(WdSpecialPane param0);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x1e)
    Integer getBrowseToWindow();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x1e)
    void setBrowseToWindow(Integer param0);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "ShowOptionalBreaks", dispId = 0x1f)
    Boolean getShowOptionalBreaks();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "ShowOptionalBreaks", dispId = 0x1f)
    void setShowOptionalBreaks(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "CollapseOutline", dispId = 0x65)
    void CollapseOutline(Object Range);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "ExpandOutline", dispId = 0x66)
    void ExpandOutline(Object Range);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "ShowAllHeadings", dispId = 0x67)
    void ShowAllHeadings();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "ShowHeading", dispId = 0x68)
    void ShowHeading(Integer Level);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "PreviousHeaderFooter", dispId = 0x69)
    void PreviousHeaderFooter();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "NextHeaderFooter", dispId = 0x6a)
    void NextHeaderFooter();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "DisplayPageBoundaries", dispId = 0x20)
    Boolean getDisplayPageBoundaries();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "DisplayPageBoundaries", dispId = 0x20)
    void setDisplayPageBoundaries(Boolean param0);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "DisplaySmartTags", dispId = 0x21)
    Boolean getDisplaySmartTags();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "DisplaySmartTags", dispId = 0x21)
    void setDisplaySmartTags(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "ShowRevisionsAndComments", dispId = 0x22)
    Boolean getShowRevisionsAndComments();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "ShowRevisionsAndComments", dispId = 0x22)
    void setShowRevisionsAndComments(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "ShowComments", dispId = 0x23)
    Boolean getShowComments();
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "ShowComments", dispId = 0x23)
    void setShowComments(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "ShowInsertionsAndDeletions", dispId = 0x24)
    Boolean getShowInsertionsAndDeletions();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "ShowInsertionsAndDeletions", dispId = 0x24)
    void setShowInsertionsAndDeletions(Boolean param0);
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "ShowFormatChanges", dispId = 0x25)
    Boolean getShowFormatChanges();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "ShowFormatChanges", dispId = 0x25)
    void setShowFormatChanges(Boolean param0);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "RevisionsView", dispId = 0x26)
    WdRevisionsView getRevisionsView();
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "RevisionsView", dispId = 0x26)
    void setRevisionsView(WdRevisionsView param0);
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "RevisionsMode", dispId = 0x27)
    WdRevisionsMode getRevisionsMode();
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "RevisionsMode", dispId = 0x27)
    void setRevisionsMode(WdRevisionsMode param0);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "RevisionsBalloonWidth", dispId = 0x28)
    Float getRevisionsBalloonWidth();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "RevisionsBalloonWidth", dispId = 0x28)
    void setRevisionsBalloonWidth(Float param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "RevisionsBalloonWidthType", dispId = 0x29)
    WdRevisionsBalloonWidthType getRevisionsBalloonWidthType();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "RevisionsBalloonWidthType", dispId = 0x29)
    void setRevisionsBalloonWidthType(WdRevisionsBalloonWidthType param0);
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "RevisionsBalloonSide", dispId = 0x2a)
    WdRevisionsBalloonMargin getRevisionsBalloonSide();
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "RevisionsBalloonSide", dispId = 0x2a)
    void setRevisionsBalloonSide(WdRevisionsBalloonMargin param0);
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "Reviewers", dispId = 0x2b)
    Reviewers getReviewers();
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "RevisionsBalloonShowConnectingLines", dispId = 0x2c)
    Boolean getRevisionsBalloonShowConnectingLines();
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "RevisionsBalloonShowConnectingLines", dispId = 0x2c)
    void setRevisionsBalloonShowConnectingLines(Boolean param0);
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "ReadingLayout", dispId = 0x2d)
    Boolean getReadingLayout();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "ReadingLayout", dispId = 0x2d)
    void setReadingLayout(Boolean param0);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "ShowXMLMarkup", dispId = 0x2e)
    Integer getShowXMLMarkup();
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "ShowXMLMarkup", dispId = 0x2e)
    void setShowXMLMarkup(Integer param0);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "ShadeEditableRanges", dispId = 0x2f)
    Integer getShadeEditableRanges();
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "ShadeEditableRanges", dispId = 0x2f)
    void setShadeEditableRanges(Integer param0);
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "ShowInkAnnotations", dispId = 0x30)
    Boolean getShowInkAnnotations();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "ShowInkAnnotations", dispId = 0x30)
    void setShowInkAnnotations(Boolean param0);
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "DisplayBackgrounds", dispId = 0x31)
    Boolean getDisplayBackgrounds();
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "DisplayBackgrounds", dispId = 0x31)
    void setDisplayBackgrounds(Boolean param0);
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "ReadingLayoutActualView", dispId = 0x32)
    Boolean getReadingLayoutActualView();
            
    /**
     * <p>id(0x32)</p>
     */
    @ComProperty(name = "ReadingLayoutActualView", dispId = 0x32)
    void setReadingLayoutActualView(Boolean param0);
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "ReadingLayoutAllowMultiplePages", dispId = 0x33)
    Boolean getReadingLayoutAllowMultiplePages();
            
    /**
     * <p>id(0x33)</p>
     */
    @ComProperty(name = "ReadingLayoutAllowMultiplePages", dispId = 0x33)
    void setReadingLayoutAllowMultiplePages(Boolean param0);
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "ReadingLayoutAllowEditing", dispId = 0x35)
    Boolean getReadingLayoutAllowEditing();
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "ReadingLayoutAllowEditing", dispId = 0x35)
    void setReadingLayoutAllowEditing(Boolean param0);
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "ReadingLayoutTruncateMargins", dispId = 0x36)
    WdReadingLayoutMargin getReadingLayoutTruncateMargins();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "ReadingLayoutTruncateMargins", dispId = 0x36)
    void setReadingLayoutTruncateMargins(WdReadingLayoutMargin param0);
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "ShowMarkupAreaHighlight", dispId = 0x34)
    Boolean getShowMarkupAreaHighlight();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "ShowMarkupAreaHighlight", dispId = 0x34)
    void setShowMarkupAreaHighlight(Boolean param0);
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Panning", dispId = 0x37)
    Boolean getPanning();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "Panning", dispId = 0x37)
    void setPanning(Boolean param0);
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "ShowCropMarks", dispId = 0x38)
    Boolean getShowCropMarks();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "ShowCropMarks", dispId = 0x38)
    void setShowCropMarks(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "MarkupMode", dispId = 0x39)
    WdRevisionsMode getMarkupMode();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "MarkupMode", dispId = 0x39)
    void setMarkupMode(WdRevisionsMode param0);
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "ConflictMode", dispId = 0x3a)
    Boolean getConflictMode();
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "ConflictMode", dispId = 0x3a)
    void setConflictMode(Boolean param0);
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "ShowOtherAuthors", dispId = 0x3b)
    Boolean getShowOtherAuthors();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "ShowOtherAuthors", dispId = 0x3b)
    void setShowOtherAuthors(Boolean param0);
            
    /**
     * <p>id(0x453)</p>
     */
    @ComMethod(name = "ExpandAllHeadings", dispId = 0x453)
    void ExpandAllHeadings();
            
    /**
     * <p>id(0x454)</p>
     */
    @ComMethod(name = "CollapseAllHeadings", dispId = 0x454)
    void CollapseAllHeadings();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "RevisionsFilter", dispId = 0x3e)
    RevisionsFilter getRevisionsFilter();
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "PageColor", dispId = 0x3f)
    WdPageColor getPageColor();
            
    /**
     * <p>id(0x3f)</p>
     */
    @ComProperty(name = "PageColor", dispId = 0x3f)
    void setPageColor(WdPageColor param0);
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0x40)
    WdColumnWidth getColumnWidth();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "ColumnWidth", dispId = 0x40)
    void setColumnWidth(WdColumnWidth param0);
            
    
}