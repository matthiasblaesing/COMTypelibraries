
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B7-0000-0000-C000-000000000046}")
public interface Options extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AllowAccentedUppercase", dispId = 0x1)
    Boolean getAllowAccentedUppercase();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AllowAccentedUppercase", dispId = 0x1)
    void setAllowAccentedUppercase(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "WPHelp", dispId = 0x11)
    Boolean getWPHelp();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "WPHelp", dispId = 0x11)
    void setWPHelp(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "WPDocNavKeys", dispId = 0x12)
    Boolean getWPDocNavKeys();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "WPDocNavKeys", dispId = 0x12)
    void setWPDocNavKeys(Boolean param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Pagination", dispId = 0x13)
    Boolean getPagination();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Pagination", dispId = 0x13)
    void setPagination(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "BlueScreen", dispId = 0x14)
    Boolean getBlueScreen();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "BlueScreen", dispId = 0x14)
    void setBlueScreen(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "EnableSound", dispId = 0x15)
    Boolean getEnableSound();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "EnableSound", dispId = 0x15)
    void setEnableSound(Boolean param0);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "ConfirmConversions", dispId = 0x16)
    Boolean getConfirmConversions();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "ConfirmConversions", dispId = 0x16)
    void setConfirmConversions(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "UpdateLinksAtOpen", dispId = 0x17)
    Boolean getUpdateLinksAtOpen();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "UpdateLinksAtOpen", dispId = 0x17)
    void setUpdateLinksAtOpen(Boolean param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "SendMailAttach", dispId = 0x18)
    Boolean getSendMailAttach();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "SendMailAttach", dispId = 0x18)
    void setSendMailAttach(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x1a)
    WdMeasurementUnits getMeasurementUnit();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x1a)
    void setMeasurementUnit(WdMeasurementUnits param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "ButtonFieldClicks", dispId = 0x1b)
    Integer getButtonFieldClicks();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "ButtonFieldClicks", dispId = 0x1b)
    void setButtonFieldClicks(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "ShortMenuNames", dispId = 0x1c)
    Boolean getShortMenuNames();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "ShortMenuNames", dispId = 0x1c)
    void setShortMenuNames(Boolean param0);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "RTFInClipboard", dispId = 0x1d)
    Boolean getRTFInClipboard();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "RTFInClipboard", dispId = 0x1d)
    void setRTFInClipboard(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "UpdateFieldsAtPrint", dispId = 0x1e)
    Boolean getUpdateFieldsAtPrint();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "UpdateFieldsAtPrint", dispId = 0x1e)
    void setUpdateFieldsAtPrint(Boolean param0);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "PrintProperties", dispId = 0x1f)
    Boolean getPrintProperties();
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComProperty(name = "PrintProperties", dispId = 0x1f)
    void setPrintProperties(Boolean param0);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "PrintFieldCodes", dispId = 0x20)
    Boolean getPrintFieldCodes();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "PrintFieldCodes", dispId = 0x20)
    void setPrintFieldCodes(Boolean param0);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x21)
    Boolean getPrintComments();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x21)
    void setPrintComments(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "PrintHiddenText", dispId = 0x22)
    Boolean getPrintHiddenText();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "PrintHiddenText", dispId = 0x22)
    void setPrintHiddenText(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComProperty(name = "EnvelopeFeederInstalled", dispId = 0x23)
    Boolean getEnvelopeFeederInstalled();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "UpdateLinksAtPrint", dispId = 0x24)
    Boolean getUpdateLinksAtPrint();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "UpdateLinksAtPrint", dispId = 0x24)
    void setUpdateLinksAtPrint(Boolean param0);
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "PrintBackground", dispId = 0x25)
    Boolean getPrintBackground();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "PrintBackground", dispId = 0x25)
    void setPrintBackground(Boolean param0);
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "PrintDrawingObjects", dispId = 0x26)
    Boolean getPrintDrawingObjects();
            
    /**
     * <p>id(0x26)</p>
     */
    @ComProperty(name = "PrintDrawingObjects", dispId = 0x26)
    void setPrintDrawingObjects(Boolean param0);
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "DefaultTray", dispId = 0x27)
    String getDefaultTray();
            
    /**
     * <p>id(0x27)</p>
     */
    @ComProperty(name = "DefaultTray", dispId = 0x27)
    void setDefaultTray(String param0);
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "DefaultTrayID", dispId = 0x28)
    Integer getDefaultTrayID();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "DefaultTrayID", dispId = 0x28)
    void setDefaultTrayID(Integer param0);
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "CreateBackup", dispId = 0x29)
    Boolean getCreateBackup();
            
    /**
     * <p>id(0x29)</p>
     */
    @ComProperty(name = "CreateBackup", dispId = 0x29)
    void setCreateBackup(Boolean param0);
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "AllowFastSave", dispId = 0x2a)
    Boolean getAllowFastSave();
            
    /**
     * <p>id(0x2a)</p>
     */
    @ComProperty(name = "AllowFastSave", dispId = 0x2a)
    void setAllowFastSave(Boolean param0);
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "SavePropertiesPrompt", dispId = 0x2b)
    Boolean getSavePropertiesPrompt();
            
    /**
     * <p>id(0x2b)</p>
     */
    @ComProperty(name = "SavePropertiesPrompt", dispId = 0x2b)
    void setSavePropertiesPrompt(Boolean param0);
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "SaveNormalPrompt", dispId = 0x2c)
    Boolean getSaveNormalPrompt();
            
    /**
     * <p>id(0x2c)</p>
     */
    @ComProperty(name = "SaveNormalPrompt", dispId = 0x2c)
    void setSaveNormalPrompt(Boolean param0);
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "SaveInterval", dispId = 0x2d)
    Integer getSaveInterval();
            
    /**
     * <p>id(0x2d)</p>
     */
    @ComProperty(name = "SaveInterval", dispId = 0x2d)
    void setSaveInterval(Integer param0);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "BackgroundSave", dispId = 0x2e)
    Boolean getBackgroundSave();
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "BackgroundSave", dispId = 0x2e)
    void setBackgroundSave(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "InsertedTextMark", dispId = 0x39)
    WdInsertedTextMark getInsertedTextMark();
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "InsertedTextMark", dispId = 0x39)
    void setInsertedTextMark(WdInsertedTextMark param0);
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "DeletedTextMark", dispId = 0x3a)
    WdDeletedTextMark getDeletedTextMark();
            
    /**
     * <p>id(0x3a)</p>
     */
    @ComProperty(name = "DeletedTextMark", dispId = 0x3a)
    void setDeletedTextMark(WdDeletedTextMark param0);
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "RevisedLinesMark", dispId = 0x3b)
    WdRevisedLinesMark getRevisedLinesMark();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "RevisedLinesMark", dispId = 0x3b)
    void setRevisedLinesMark(WdRevisedLinesMark param0);
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "InsertedTextColor", dispId = 0x3c)
    WdColorIndex getInsertedTextColor();
            
    /**
     * <p>id(0x3c)</p>
     */
    @ComProperty(name = "InsertedTextColor", dispId = 0x3c)
    void setInsertedTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "DeletedTextColor", dispId = 0x3d)
    WdColorIndex getDeletedTextColor();
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "DeletedTextColor", dispId = 0x3d)
    void setDeletedTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "RevisedLinesColor", dispId = 0x3e)
    WdColorIndex getRevisedLinesColor();
            
    /**
     * <p>id(0x3e)</p>
     */
    @ComProperty(name = "RevisedLinesColor", dispId = 0x3e)
    void setRevisedLinesColor(WdColorIndex param0);
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x41)
    String getDefaultFilePath(WdDefaultFilePath Path);
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x41)
    void setDefaultFilePath(WdDefaultFilePath Path,
            String param1);
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "Overtype", dispId = 0x42)
    Boolean getOvertype();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "Overtype", dispId = 0x42)
    void setOvertype(Boolean param0);
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "ReplaceSelection", dispId = 0x43)
    Boolean getReplaceSelection();
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "ReplaceSelection", dispId = 0x43)
    void setReplaceSelection(Boolean param0);
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "AllowDragAndDrop", dispId = 0x44)
    Boolean getAllowDragAndDrop();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "AllowDragAndDrop", dispId = 0x44)
    void setAllowDragAndDrop(Boolean param0);
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "AutoWordSelection", dispId = 0x45)
    Boolean getAutoWordSelection();
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "AutoWordSelection", dispId = 0x45)
    void setAutoWordSelection(Boolean param0);
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "INSKeyForPaste", dispId = 0x46)
    Boolean getINSKeyForPaste();
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "INSKeyForPaste", dispId = 0x46)
    void setINSKeyForPaste(Boolean param0);
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "SmartCutPaste", dispId = 0x47)
    Boolean getSmartCutPaste();
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "SmartCutPaste", dispId = 0x47)
    void setSmartCutPaste(Boolean param0);
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x48)
    Boolean getTabIndentKey();
            
    /**
     * <p>id(0x48)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x48)
    void setTabIndentKey(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "PictureEditor", dispId = 0x49)
    String getPictureEditor();
            
    /**
     * <p>id(0x49)</p>
     */
    @ComProperty(name = "PictureEditor", dispId = 0x49)
    void setPictureEditor(String param0);
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "AnimateScreenMovements", dispId = 0x4a)
    Boolean getAnimateScreenMovements();
            
    /**
     * <p>id(0x4a)</p>
     */
    @ComProperty(name = "AnimateScreenMovements", dispId = 0x4a)
    void setAnimateScreenMovements(Boolean param0);
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "VirusProtection", dispId = 0x4b)
    Boolean getVirusProtection();
            
    /**
     * <p>id(0x4b)</p>
     */
    @ComProperty(name = "VirusProtection", dispId = 0x4b)
    void setVirusProtection(Boolean param0);
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "RevisedPropertiesMark", dispId = 0x4c)
    WdRevisedPropertiesMark getRevisedPropertiesMark();
            
    /**
     * <p>id(0x4c)</p>
     */
    @ComProperty(name = "RevisedPropertiesMark", dispId = 0x4c)
    void setRevisedPropertiesMark(WdRevisedPropertiesMark param0);
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "RevisedPropertiesColor", dispId = 0x4d)
    WdColorIndex getRevisedPropertiesColor();
            
    /**
     * <p>id(0x4d)</p>
     */
    @ComProperty(name = "RevisedPropertiesColor", dispId = 0x4d)
    void setRevisedPropertiesColor(WdColorIndex param0);
            
    /**
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x4f)
    Boolean getSnapToGrid();
            
    /**
     * <p>id(0x4f)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x4f)
    void setSnapToGrid(Boolean param0);
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x50)
    Boolean getSnapToShapes();
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x50)
    void setSnapToShapes(Boolean param0);
            
    /**
     * <p>id(0x51)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x51)
    Float getGridDistanceHorizontal();
            
    /**
     * <p>id(0x51)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x51)
    void setGridDistanceHorizontal(Float param0);
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x52)
    Float getGridDistanceVertical();
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x52)
    void setGridDistanceVertical(Float param0);
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x53)
    Float getGridOriginHorizontal();
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x53)
    void setGridOriginHorizontal(Float param0);
            
    /**
     * <p>id(0x54)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x54)
    Float getGridOriginVertical();
            
    /**
     * <p>id(0x54)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x54)
    void setGridOriginVertical(Float param0);
            
    /**
     * <p>id(0x56)</p>
     */
    @ComProperty(name = "InlineConversion", dispId = 0x56)
    Boolean getInlineConversion();
            
    /**
     * <p>id(0x56)</p>
     */
    @ComProperty(name = "InlineConversion", dispId = 0x56)
    void setInlineConversion(Boolean param0);
            
    /**
     * <p>id(0x57)</p>
     */
    @ComProperty(name = "IMEAutomaticControl", dispId = 0x57)
    Boolean getIMEAutomaticControl();
            
    /**
     * <p>id(0x57)</p>
     */
    @ComProperty(name = "IMEAutomaticControl", dispId = 0x57)
    void setIMEAutomaticControl(Boolean param0);
            
    /**
     * <p>id(0xfa)</p>
     */
    @ComProperty(name = "AutoFormatApplyHeadings", dispId = 0xfa)
    Boolean getAutoFormatApplyHeadings();
            
    /**
     * <p>id(0xfa)</p>
     */
    @ComProperty(name = "AutoFormatApplyHeadings", dispId = 0xfa)
    void setAutoFormatApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0xfb)</p>
     */
    @ComProperty(name = "AutoFormatApplyLists", dispId = 0xfb)
    Boolean getAutoFormatApplyLists();
            
    /**
     * <p>id(0xfb)</p>
     */
    @ComProperty(name = "AutoFormatApplyLists", dispId = 0xfb)
    void setAutoFormatApplyLists(Boolean param0);
            
    /**
     * <p>id(0xfc)</p>
     */
    @ComProperty(name = "AutoFormatApplyBulletedLists", dispId = 0xfc)
    Boolean getAutoFormatApplyBulletedLists();
            
    /**
     * <p>id(0xfc)</p>
     */
    @ComProperty(name = "AutoFormatApplyBulletedLists", dispId = 0xfc)
    void setAutoFormatApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0xfd)</p>
     */
    @ComProperty(name = "AutoFormatApplyOtherParas", dispId = 0xfd)
    Boolean getAutoFormatApplyOtherParas();
            
    /**
     * <p>id(0xfd)</p>
     */
    @ComProperty(name = "AutoFormatApplyOtherParas", dispId = 0xfd)
    void setAutoFormatApplyOtherParas(Boolean param0);
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "AutoFormatReplaceQuotes", dispId = 0xfe)
    Boolean getAutoFormatReplaceQuotes();
            
    /**
     * <p>id(0xfe)</p>
     */
    @ComProperty(name = "AutoFormatReplaceQuotes", dispId = 0xfe)
    void setAutoFormatReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "AutoFormatReplaceSymbols", dispId = 0xff)
    Boolean getAutoFormatReplaceSymbols();
            
    /**
     * <p>id(0xff)</p>
     */
    @ComProperty(name = "AutoFormatReplaceSymbols", dispId = 0xff)
    void setAutoFormatReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x100)</p>
     */
    @ComProperty(name = "AutoFormatReplaceOrdinals", dispId = 0x100)
    Boolean getAutoFormatReplaceOrdinals();
            
    /**
     * <p>id(0x100)</p>
     */
    @ComProperty(name = "AutoFormatReplaceOrdinals", dispId = 0x100)
    void setAutoFormatReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x101)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFractions", dispId = 0x101)
    Boolean getAutoFormatReplaceFractions();
            
    /**
     * <p>id(0x101)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFractions", dispId = 0x101)
    void setAutoFormatReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "AutoFormatReplacePlainTextEmphasis", dispId = 0x102)
    Boolean getAutoFormatReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "AutoFormatReplacePlainTextEmphasis", dispId = 0x102)
    void setAutoFormatReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x103)</p>
     */
    @ComProperty(name = "AutoFormatPreserveStyles", dispId = 0x103)
    Boolean getAutoFormatPreserveStyles();
            
    /**
     * <p>id(0x103)</p>
     */
    @ComProperty(name = "AutoFormatPreserveStyles", dispId = 0x103)
    void setAutoFormatPreserveStyles(Boolean param0);
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    Boolean getAutoFormatAsYouTypeApplyHeadings();
            
    /**
     * <p>id(0x104)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    void setAutoFormatAsYouTypeApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    Boolean getAutoFormatAsYouTypeApplyBorders();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    void setAutoFormatAsYouTypeApplyBorders(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    Boolean getAutoFormatAsYouTypeApplyBulletedLists();
            
    /**
     * <p>id(0x106)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    void setAutoFormatAsYouTypeApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    Boolean getAutoFormatAsYouTypeApplyNumberedLists();
            
    /**
     * <p>id(0x107)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    void setAutoFormatAsYouTypeApplyNumberedLists(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    Boolean getAutoFormatAsYouTypeReplaceQuotes();
            
    /**
     * <p>id(0x108)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    void setAutoFormatAsYouTypeReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    Boolean getAutoFormatAsYouTypeReplaceSymbols();
            
    /**
     * <p>id(0x109)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    void setAutoFormatAsYouTypeReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    Boolean getAutoFormatAsYouTypeReplaceOrdinals();
            
    /**
     * <p>id(0x10a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    void setAutoFormatAsYouTypeReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    Boolean getAutoFormatAsYouTypeReplaceFractions();
            
    /**
     * <p>id(0x10b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    void setAutoFormatAsYouTypeReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    Boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    void setAutoFormatAsYouTypeReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    Boolean getAutoFormatAsYouTypeFormatListItemBeginning();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    void setAutoFormatAsYouTypeFormatListItemBeginning(Boolean param0);
            
    /**
     * <p>id(0x10e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    Boolean getAutoFormatAsYouTypeDefineStyles();
            
    /**
     * <p>id(0x10e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    void setAutoFormatAsYouTypeDefineStyles(Boolean param0);
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "AutoFormatPlainTextWordMail", dispId = 0x10f)
    Boolean getAutoFormatPlainTextWordMail();
            
    /**
     * <p>id(0x10f)</p>
     */
    @ComProperty(name = "AutoFormatPlainTextWordMail", dispId = 0x10f)
    void setAutoFormatPlainTextWordMail(Boolean param0);
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    Boolean getAutoFormatAsYouTypeReplaceHyperlinks();
            
    /**
     * <p>id(0x110)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    void setAutoFormatAsYouTypeReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "AutoFormatReplaceHyperlinks", dispId = 0x111)
    Boolean getAutoFormatReplaceHyperlinks();
            
    /**
     * <p>id(0x111)</p>
     */
    @ComProperty(name = "AutoFormatReplaceHyperlinks", dispId = 0x111)
    void setAutoFormatReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "DefaultHighlightColorIndex", dispId = 0x112)
    WdColorIndex getDefaultHighlightColorIndex();
            
    /**
     * <p>id(0x112)</p>
     */
    @ComProperty(name = "DefaultHighlightColorIndex", dispId = 0x112)
    void setDefaultHighlightColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "DefaultBorderLineStyle", dispId = 0x113)
    WdLineStyle getDefaultBorderLineStyle();
            
    /**
     * <p>id(0x113)</p>
     */
    @ComProperty(name = "DefaultBorderLineStyle", dispId = 0x113)
    void setDefaultBorderLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "CheckSpellingAsYouType", dispId = 0x114)
    Boolean getCheckSpellingAsYouType();
            
    /**
     * <p>id(0x114)</p>
     */
    @ComProperty(name = "CheckSpellingAsYouType", dispId = 0x114)
    void setCheckSpellingAsYouType(Boolean param0);
            
    /**
     * <p>id(0x115)</p>
     */
    @ComProperty(name = "CheckGrammarAsYouType", dispId = 0x115)
    Boolean getCheckGrammarAsYouType();
            
    /**
     * <p>id(0x115)</p>
     */
    @ComProperty(name = "CheckGrammarAsYouType", dispId = 0x115)
    void setCheckGrammarAsYouType(Boolean param0);
            
    /**
     * <p>id(0x116)</p>
     */
    @ComProperty(name = "IgnoreInternetAndFileAddresses", dispId = 0x116)
    Boolean getIgnoreInternetAndFileAddresses();
            
    /**
     * <p>id(0x116)</p>
     */
    @ComProperty(name = "IgnoreInternetAndFileAddresses", dispId = 0x116)
    void setIgnoreInternetAndFileAddresses(Boolean param0);
            
    /**
     * <p>id(0x117)</p>
     */
    @ComProperty(name = "ShowReadabilityStatistics", dispId = 0x117)
    Boolean getShowReadabilityStatistics();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComProperty(name = "ShowReadabilityStatistics", dispId = 0x117)
    void setShowReadabilityStatistics(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     */
    @ComProperty(name = "IgnoreUppercase", dispId = 0x118)
    Boolean getIgnoreUppercase();
            
    /**
     * <p>id(0x118)</p>
     */
    @ComProperty(name = "IgnoreUppercase", dispId = 0x118)
    void setIgnoreUppercase(Boolean param0);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x119)
    Boolean getIgnoreMixedDigits();
            
    /**
     * <p>id(0x119)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x119)
    void setIgnoreMixedDigits(Boolean param0);
            
    /**
     * <p>id(0x11a)</p>
     */
    @ComProperty(name = "SuggestFromMainDictionaryOnly", dispId = 0x11a)
    Boolean getSuggestFromMainDictionaryOnly();
            
    /**
     * <p>id(0x11a)</p>
     */
    @ComProperty(name = "SuggestFromMainDictionaryOnly", dispId = 0x11a)
    void setSuggestFromMainDictionaryOnly(Boolean param0);
            
    /**
     * <p>id(0x11b)</p>
     */
    @ComProperty(name = "SuggestSpellingCorrections", dispId = 0x11b)
    Boolean getSuggestSpellingCorrections();
            
    /**
     * <p>id(0x11b)</p>
     */
    @ComProperty(name = "SuggestSpellingCorrections", dispId = 0x11b)
    void setSuggestSpellingCorrections(Boolean param0);
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComProperty(name = "DefaultBorderLineWidth", dispId = 0x11c)
    WdLineWidth getDefaultBorderLineWidth();
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComProperty(name = "DefaultBorderLineWidth", dispId = 0x11c)
    void setDefaultBorderLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComProperty(name = "CheckGrammarWithSpelling", dispId = 0x11d)
    Boolean getCheckGrammarWithSpelling();
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComProperty(name = "CheckGrammarWithSpelling", dispId = 0x11d)
    void setCheckGrammarWithSpelling(Boolean param0);
            
    /**
     * <p>id(0x11e)</p>
     */
    @ComProperty(name = "DefaultOpenFormat", dispId = 0x11e)
    WdOpenFormat getDefaultOpenFormat();
            
    /**
     * <p>id(0x11e)</p>
     */
    @ComProperty(name = "DefaultOpenFormat", dispId = 0x11e)
    void setDefaultOpenFormat(WdOpenFormat param0);
            
    /**
     * <p>id(0x11f)</p>
     */
    @ComProperty(name = "PrintDraft", dispId = 0x11f)
    Boolean getPrintDraft();
            
    /**
     * <p>id(0x11f)</p>
     */
    @ComProperty(name = "PrintDraft", dispId = 0x11f)
    void setPrintDraft(Boolean param0);
            
    /**
     * <p>id(0x120)</p>
     */
    @ComProperty(name = "PrintReverse", dispId = 0x120)
    Boolean getPrintReverse();
            
    /**
     * <p>id(0x120)</p>
     */
    @ComProperty(name = "PrintReverse", dispId = 0x120)
    void setPrintReverse(Boolean param0);
            
    /**
     * <p>id(0x121)</p>
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x121)
    Boolean getMapPaperSize();
            
    /**
     * <p>id(0x121)</p>
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x121)
    void setMapPaperSize(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    Boolean getAutoFormatAsYouTypeApplyTables();
            
    /**
     * <p>id(0x122)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    void setAutoFormatAsYouTypeApplyTables(Boolean param0);
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "AutoFormatApplyFirstIndents", dispId = 0x123)
    Boolean getAutoFormatApplyFirstIndents();
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "AutoFormatApplyFirstIndents", dispId = 0x123)
    void setAutoFormatApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x126)</p>
     */
    @ComProperty(name = "AutoFormatMatchParentheses", dispId = 0x126)
    Boolean getAutoFormatMatchParentheses();
            
    /**
     * <p>id(0x126)</p>
     */
    @ComProperty(name = "AutoFormatMatchParentheses", dispId = 0x126)
    void setAutoFormatMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x127)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFarEastDashes", dispId = 0x127)
    Boolean getAutoFormatReplaceFarEastDashes();
            
    /**
     * <p>id(0x127)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFarEastDashes", dispId = 0x127)
    void setAutoFormatReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x128)</p>
     */
    @ComProperty(name = "AutoFormatDeleteAutoSpaces", dispId = 0x128)
    Boolean getAutoFormatDeleteAutoSpaces();
            
    /**
     * <p>id(0x128)</p>
     */
    @ComProperty(name = "AutoFormatDeleteAutoSpaces", dispId = 0x128)
    void setAutoFormatDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x129)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    Boolean getAutoFormatAsYouTypeApplyFirstIndents();
            
    /**
     * <p>id(0x129)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    void setAutoFormatAsYouTypeApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    Boolean getAutoFormatAsYouTypeApplyDates();
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    void setAutoFormatAsYouTypeApplyDates(Boolean param0);
            
    /**
     * <p>id(0x12b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    Boolean getAutoFormatAsYouTypeApplyClosings();
            
    /**
     * <p>id(0x12b)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    void setAutoFormatAsYouTypeApplyClosings(Boolean param0);
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    Boolean getAutoFormatAsYouTypeMatchParentheses();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    void setAutoFormatAsYouTypeMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    Boolean getAutoFormatAsYouTypeReplaceFarEastDashes();
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    void setAutoFormatAsYouTypeReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    Boolean getAutoFormatAsYouTypeDeleteAutoSpaces();
            
    /**
     * <p>id(0x12e)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    void setAutoFormatAsYouTypeDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    Boolean getAutoFormatAsYouTypeInsertClosings();
            
    /**
     * <p>id(0x12f)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    void setAutoFormatAsYouTypeInsertClosings(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    Boolean getAutoFormatAsYouTypeAutoLetterWizard();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    void setAutoFormatAsYouTypeAutoLetterWizard(Boolean param0);
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    Boolean getAutoFormatAsYouTypeInsertOvers();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    void setAutoFormatAsYouTypeInsertOvers(Boolean param0);
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "DisplayGridLines", dispId = 0x132)
    Boolean getDisplayGridLines();
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "DisplayGridLines", dispId = 0x132)
    void setDisplayGridLines(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "MatchFuzzyCase", dispId = 0x135)
    Boolean getMatchFuzzyCase();
            
    /**
     * <p>id(0x135)</p>
     */
    @ComProperty(name = "MatchFuzzyCase", dispId = 0x135)
    void setMatchFuzzyCase(Boolean param0);
            
    /**
     * <p>id(0x136)</p>
     */
    @ComProperty(name = "MatchFuzzyByte", dispId = 0x136)
    Boolean getMatchFuzzyByte();
            
    /**
     * <p>id(0x136)</p>
     */
    @ComProperty(name = "MatchFuzzyByte", dispId = 0x136)
    void setMatchFuzzyByte(Boolean param0);
            
    /**
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "MatchFuzzyHiragana", dispId = 0x137)
    Boolean getMatchFuzzyHiragana();
            
    /**
     * <p>id(0x137)</p>
     */
    @ComProperty(name = "MatchFuzzyHiragana", dispId = 0x137)
    void setMatchFuzzyHiragana(Boolean param0);
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "MatchFuzzySmallKana", dispId = 0x138)
    Boolean getMatchFuzzySmallKana();
            
    /**
     * <p>id(0x138)</p>
     */
    @ComProperty(name = "MatchFuzzySmallKana", dispId = 0x138)
    void setMatchFuzzySmallKana(Boolean param0);
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "MatchFuzzyDash", dispId = 0x139)
    Boolean getMatchFuzzyDash();
            
    /**
     * <p>id(0x139)</p>
     */
    @ComProperty(name = "MatchFuzzyDash", dispId = 0x139)
    void setMatchFuzzyDash(Boolean param0);
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "MatchFuzzyIterationMark", dispId = 0x13a)
    Boolean getMatchFuzzyIterationMark();
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComProperty(name = "MatchFuzzyIterationMark", dispId = 0x13a)
    void setMatchFuzzyIterationMark(Boolean param0);
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "MatchFuzzyKanji", dispId = 0x13b)
    Boolean getMatchFuzzyKanji();
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComProperty(name = "MatchFuzzyKanji", dispId = 0x13b)
    void setMatchFuzzyKanji(Boolean param0);
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "MatchFuzzyOldKana", dispId = 0x13c)
    Boolean getMatchFuzzyOldKana();
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComProperty(name = "MatchFuzzyOldKana", dispId = 0x13c)
    void setMatchFuzzyOldKana(Boolean param0);
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComProperty(name = "MatchFuzzyProlongedSoundMark", dispId = 0x13d)
    Boolean getMatchFuzzyProlongedSoundMark();
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComProperty(name = "MatchFuzzyProlongedSoundMark", dispId = 0x13d)
    void setMatchFuzzyProlongedSoundMark(Boolean param0);
            
    /**
     * <p>id(0x13e)</p>
     */
    @ComProperty(name = "MatchFuzzyDZ", dispId = 0x13e)
    Boolean getMatchFuzzyDZ();
            
    /**
     * <p>id(0x13e)</p>
     */
    @ComProperty(name = "MatchFuzzyDZ", dispId = 0x13e)
    void setMatchFuzzyDZ(Boolean param0);
            
    /**
     * <p>id(0x13f)</p>
     */
    @ComProperty(name = "MatchFuzzyBV", dispId = 0x13f)
    Boolean getMatchFuzzyBV();
            
    /**
     * <p>id(0x13f)</p>
     */
    @ComProperty(name = "MatchFuzzyBV", dispId = 0x13f)
    void setMatchFuzzyBV(Boolean param0);
            
    /**
     * <p>id(0x140)</p>
     */
    @ComProperty(name = "MatchFuzzyTC", dispId = 0x140)
    Boolean getMatchFuzzyTC();
            
    /**
     * <p>id(0x140)</p>
     */
    @ComProperty(name = "MatchFuzzyTC", dispId = 0x140)
    void setMatchFuzzyTC(Boolean param0);
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "MatchFuzzyHF", dispId = 0x141)
    Boolean getMatchFuzzyHF();
            
    /**
     * <p>id(0x141)</p>
     */
    @ComProperty(name = "MatchFuzzyHF", dispId = 0x141)
    void setMatchFuzzyHF(Boolean param0);
            
    /**
     * <p>id(0x142)</p>
     */
    @ComProperty(name = "MatchFuzzyZJ", dispId = 0x142)
    Boolean getMatchFuzzyZJ();
            
    /**
     * <p>id(0x142)</p>
     */
    @ComProperty(name = "MatchFuzzyZJ", dispId = 0x142)
    void setMatchFuzzyZJ(Boolean param0);
            
    /**
     * <p>id(0x143)</p>
     */
    @ComProperty(name = "MatchFuzzyAY", dispId = 0x143)
    Boolean getMatchFuzzyAY();
            
    /**
     * <p>id(0x143)</p>
     */
    @ComProperty(name = "MatchFuzzyAY", dispId = 0x143)
    void setMatchFuzzyAY(Boolean param0);
            
    /**
     * <p>id(0x144)</p>
     */
    @ComProperty(name = "MatchFuzzyKiKu", dispId = 0x144)
    Boolean getMatchFuzzyKiKu();
            
    /**
     * <p>id(0x144)</p>
     */
    @ComProperty(name = "MatchFuzzyKiKu", dispId = 0x144)
    void setMatchFuzzyKiKu(Boolean param0);
            
    /**
     * <p>id(0x145)</p>
     */
    @ComProperty(name = "MatchFuzzyPunctuation", dispId = 0x145)
    Boolean getMatchFuzzyPunctuation();
            
    /**
     * <p>id(0x145)</p>
     */
    @ComProperty(name = "MatchFuzzyPunctuation", dispId = 0x145)
    void setMatchFuzzyPunctuation(Boolean param0);
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "MatchFuzzySpace", dispId = 0x146)
    Boolean getMatchFuzzySpace();
            
    /**
     * <p>id(0x146)</p>
     */
    @ComProperty(name = "MatchFuzzySpace", dispId = 0x146)
    void setMatchFuzzySpace(Boolean param0);
            
    /**
     * <p>id(0x147)</p>
     */
    @ComProperty(name = "ApplyFarEastFontsToAscii", dispId = 0x147)
    Boolean getApplyFarEastFontsToAscii();
            
    /**
     * <p>id(0x147)</p>
     */
    @ComProperty(name = "ApplyFarEastFontsToAscii", dispId = 0x147)
    void setApplyFarEastFontsToAscii(Boolean param0);
            
    /**
     * <p>id(0x148)</p>
     */
    @ComProperty(name = "ConvertHighAnsiToFarEast", dispId = 0x148)
    Boolean getConvertHighAnsiToFarEast();
            
    /**
     * <p>id(0x148)</p>
     */
    @ComProperty(name = "ConvertHighAnsiToFarEast", dispId = 0x148)
    void setConvertHighAnsiToFarEast(Boolean param0);
            
    /**
     * <p>id(0x14a)</p>
     */
    @ComProperty(name = "PrintOddPagesInAscendingOrder", dispId = 0x14a)
    Boolean getPrintOddPagesInAscendingOrder();
            
    /**
     * <p>id(0x14a)</p>
     */
    @ComProperty(name = "PrintOddPagesInAscendingOrder", dispId = 0x14a)
    void setPrintOddPagesInAscendingOrder(Boolean param0);
            
    /**
     * <p>id(0x14b)</p>
     */
    @ComProperty(name = "PrintEvenPagesInAscendingOrder", dispId = 0x14b)
    Boolean getPrintEvenPagesInAscendingOrder();
            
    /**
     * <p>id(0x14b)</p>
     */
    @ComProperty(name = "PrintEvenPagesInAscendingOrder", dispId = 0x14b)
    void setPrintEvenPagesInAscendingOrder(Boolean param0);
            
    /**
     * <p>id(0x151)</p>
     */
    @ComProperty(name = "DefaultBorderColorIndex", dispId = 0x151)
    WdColorIndex getDefaultBorderColorIndex();
            
    /**
     * <p>id(0x151)</p>
     */
    @ComProperty(name = "DefaultBorderColorIndex", dispId = 0x151)
    void setDefaultBorderColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x152)</p>
     */
    @ComProperty(name = "EnableMisusedWordsDictionary", dispId = 0x152)
    Boolean getEnableMisusedWordsDictionary();
            
    /**
     * <p>id(0x152)</p>
     */
    @ComProperty(name = "EnableMisusedWordsDictionary", dispId = 0x152)
    void setEnableMisusedWordsDictionary(Boolean param0);
            
    /**
     * <p>id(0x153)</p>
     */
    @ComProperty(name = "AllowCombinedAuxiliaryForms", dispId = 0x153)
    Boolean getAllowCombinedAuxiliaryForms();
            
    /**
     * <p>id(0x153)</p>
     */
    @ComProperty(name = "AllowCombinedAuxiliaryForms", dispId = 0x153)
    void setAllowCombinedAuxiliaryForms(Boolean param0);
            
    /**
     * <p>id(0x154)</p>
     */
    @ComProperty(name = "HangulHanjaFastConversion", dispId = 0x154)
    Boolean getHangulHanjaFastConversion();
            
    /**
     * <p>id(0x154)</p>
     */
    @ComProperty(name = "HangulHanjaFastConversion", dispId = 0x154)
    void setHangulHanjaFastConversion(Boolean param0);
            
    /**
     * <p>id(0x155)</p>
     */
    @ComProperty(name = "CheckHangulEndings", dispId = 0x155)
    Boolean getCheckHangulEndings();
            
    /**
     * <p>id(0x155)</p>
     */
    @ComProperty(name = "CheckHangulEndings", dispId = 0x155)
    void setCheckHangulEndings(Boolean param0);
            
    /**
     * <p>id(0x156)</p>
     */
    @ComProperty(name = "EnableHangulHanjaRecentOrdering", dispId = 0x156)
    Boolean getEnableHangulHanjaRecentOrdering();
            
    /**
     * <p>id(0x156)</p>
     */
    @ComProperty(name = "EnableHangulHanjaRecentOrdering", dispId = 0x156)
    void setEnableHangulHanjaRecentOrdering(Boolean param0);
            
    /**
     * <p>id(0x157)</p>
     */
    @ComProperty(name = "MultipleWordConversionsMode", dispId = 0x157)
    WdMultipleWordConversionsMode getMultipleWordConversionsMode();
            
    /**
     * <p>id(0x157)</p>
     */
    @ComProperty(name = "MultipleWordConversionsMode", dispId = 0x157)
    void setMultipleWordConversionsMode(WdMultipleWordConversionsMode param0);
            
    /**
     * <p>id(0x14d)</p>
     */
    @ComMethod(name = "SetWPHelpOptions", dispId = 0x14d)
    void SetWPHelpOptions(Object CommandKeyHelp,
            Object DocNavigationKeys,
            Object MouseSimulation,
            Object DemoGuidance,
            Object DemoSpeed,
            Object HelpType);
            
    /**
     * <p>id(0x158)</p>
     */
    @ComProperty(name = "DefaultBorderColor", dispId = 0x158)
    WdColor getDefaultBorderColor();
            
    /**
     * <p>id(0x158)</p>
     */
    @ComProperty(name = "DefaultBorderColor", dispId = 0x158)
    void setDefaultBorderColor(WdColor param0);
            
    /**
     * <p>id(0x159)</p>
     */
    @ComProperty(name = "AllowPixelUnits", dispId = 0x159)
    Boolean getAllowPixelUnits();
            
    /**
     * <p>id(0x159)</p>
     */
    @ComProperty(name = "AllowPixelUnits", dispId = 0x159)
    void setAllowPixelUnits(Boolean param0);
            
    /**
     * <p>id(0x15a)</p>
     */
    @ComProperty(name = "UseCharacterUnit", dispId = 0x15a)
    Boolean getUseCharacterUnit();
            
    /**
     * <p>id(0x15a)</p>
     */
    @ComProperty(name = "UseCharacterUnit", dispId = 0x15a)
    void setUseCharacterUnit(Boolean param0);
            
    /**
     * <p>id(0x15b)</p>
     */
    @ComProperty(name = "AllowCompoundNounProcessing", dispId = 0x15b)
    Boolean getAllowCompoundNounProcessing();
            
    /**
     * <p>id(0x15b)</p>
     */
    @ComProperty(name = "AllowCompoundNounProcessing", dispId = 0x15b)
    void setAllowCompoundNounProcessing(Boolean param0);
            
    /**
     * <p>id(0x18f)</p>
     */
    @ComProperty(name = "AutoKeyboardSwitching", dispId = 0x18f)
    Boolean getAutoKeyboardSwitching();
            
    /**
     * <p>id(0x18f)</p>
     */
    @ComProperty(name = "AutoKeyboardSwitching", dispId = 0x18f)
    void setAutoKeyboardSwitching(Boolean param0);
            
    /**
     * <p>id(0x190)</p>
     */
    @ComProperty(name = "DocumentViewDirection", dispId = 0x190)
    WdDocumentViewDirection getDocumentViewDirection();
            
    /**
     * <p>id(0x190)</p>
     */
    @ComProperty(name = "DocumentViewDirection", dispId = 0x190)
    void setDocumentViewDirection(WdDocumentViewDirection param0);
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "ArabicNumeral", dispId = 0x191)
    WdArabicNumeral getArabicNumeral();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "ArabicNumeral", dispId = 0x191)
    void setArabicNumeral(WdArabicNumeral param0);
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "MonthNames", dispId = 0x192)
    WdMonthNames getMonthNames();
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "MonthNames", dispId = 0x192)
    void setMonthNames(WdMonthNames param0);
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "CursorMovement", dispId = 0x193)
    WdCursorMovement getCursorMovement();
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "CursorMovement", dispId = 0x193)
    void setCursorMovement(WdCursorMovement param0);
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "VisualSelection", dispId = 0x194)
    WdVisualSelection getVisualSelection();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "VisualSelection", dispId = 0x194)
    void setVisualSelection(WdVisualSelection param0);
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "ShowDiacritics", dispId = 0x195)
    Boolean getShowDiacritics();
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "ShowDiacritics", dispId = 0x195)
    void setShowDiacritics(Boolean param0);
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "ShowControlCharacters", dispId = 0x196)
    Boolean getShowControlCharacters();
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "ShowControlCharacters", dispId = 0x196)
    void setShowControlCharacters(Boolean param0);
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "AddControlCharacters", dispId = 0x197)
    Boolean getAddControlCharacters();
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "AddControlCharacters", dispId = 0x197)
    void setAddControlCharacters(Boolean param0);
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "AddBiDirectionalMarksWhenSavingTextFile", dispId = 0x198)
    Boolean getAddBiDirectionalMarksWhenSavingTextFile();
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "AddBiDirectionalMarksWhenSavingTextFile", dispId = 0x198)
    void setAddBiDirectionalMarksWhenSavingTextFile(Boolean param0);
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "StrictInitialAlefHamza", dispId = 0x199)
    Boolean getStrictInitialAlefHamza();
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "StrictInitialAlefHamza", dispId = 0x199)
    void setStrictInitialAlefHamza(Boolean param0);
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComProperty(name = "StrictFinalYaa", dispId = 0x19a)
    Boolean getStrictFinalYaa();
            
    /**
     * <p>id(0x19a)</p>
     */
    @ComProperty(name = "StrictFinalYaa", dispId = 0x19a)
    void setStrictFinalYaa(Boolean param0);
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "HebrewMode", dispId = 0x19b)
    WdHebSpellStart getHebrewMode();
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "HebrewMode", dispId = 0x19b)
    void setHebrewMode(WdHebSpellStart param0);
            
    /**
     * <p>id(0x19c)</p>
     */
    @ComProperty(name = "ArabicMode", dispId = 0x19c)
    WdAraSpeller getArabicMode();
            
    /**
     * <p>id(0x19c)</p>
     */
    @ComProperty(name = "ArabicMode", dispId = 0x19c)
    void setArabicMode(WdAraSpeller param0);
            
    /**
     * <p>id(0x19d)</p>
     */
    @ComProperty(name = "AllowClickAndTypeMouse", dispId = 0x19d)
    Boolean getAllowClickAndTypeMouse();
            
    /**
     * <p>id(0x19d)</p>
     */
    @ComProperty(name = "AllowClickAndTypeMouse", dispId = 0x19d)
    void setAllowClickAndTypeMouse(Boolean param0);
            
    /**
     * <p>id(0x19f)</p>
     */
    @ComProperty(name = "UseGermanSpellingReform", dispId = 0x19f)
    Boolean getUseGermanSpellingReform();
            
    /**
     * <p>id(0x19f)</p>
     */
    @ComProperty(name = "UseGermanSpellingReform", dispId = 0x19f)
    void setUseGermanSpellingReform(Boolean param0);
            
    /**
     * <p>id(0x1a2)</p>
     */
    @ComProperty(name = "InterpretHighAnsi", dispId = 0x1a2)
    WdHighAnsiText getInterpretHighAnsi();
            
    /**
     * <p>id(0x1a2)</p>
     */
    @ComProperty(name = "InterpretHighAnsi", dispId = 0x1a2)
    void setInterpretHighAnsi(WdHighAnsiText param0);
            
    /**
     * <p>id(0x1a3)</p>
     */
    @ComProperty(name = "AddHebDoubleQuote", dispId = 0x1a3)
    Boolean getAddHebDoubleQuote();
            
    /**
     * <p>id(0x1a3)</p>
     */
    @ComProperty(name = "AddHebDoubleQuote", dispId = 0x1a3)
    void setAddHebDoubleQuote(Boolean param0);
            
    /**
     * <p>id(0x1a4)</p>
     */
    @ComProperty(name = "UseDiffDiacColor", dispId = 0x1a4)
    Boolean getUseDiffDiacColor();
            
    /**
     * <p>id(0x1a4)</p>
     */
    @ComProperty(name = "UseDiffDiacColor", dispId = 0x1a4)
    void setUseDiffDiacColor(Boolean param0);
            
    /**
     * <p>id(0x1a5)</p>
     */
    @ComProperty(name = "DiacriticColorVal", dispId = 0x1a5)
    WdColor getDiacriticColorVal();
            
    /**
     * <p>id(0x1a5)</p>
     */
    @ComProperty(name = "DiacriticColorVal", dispId = 0x1a5)
    void setDiacriticColorVal(WdColor param0);
            
    /**
     * <p>id(0x1a7)</p>
     */
    @ComProperty(name = "OptimizeForWord97byDefault", dispId = 0x1a7)
    Boolean getOptimizeForWord97byDefault();
            
    /**
     * <p>id(0x1a7)</p>
     */
    @ComProperty(name = "OptimizeForWord97byDefault", dispId = 0x1a7)
    void setOptimizeForWord97byDefault(Boolean param0);
            
    /**
     * <p>id(0x1a8)</p>
     */
    @ComProperty(name = "LocalNetworkFile", dispId = 0x1a8)
    Boolean getLocalNetworkFile();
            
    /**
     * <p>id(0x1a8)</p>
     */
    @ComProperty(name = "LocalNetworkFile", dispId = 0x1a8)
    void setLocalNetworkFile(Boolean param0);
            
    /**
     * <p>id(0x1a9)</p>
     */
    @ComProperty(name = "TypeNReplace", dispId = 0x1a9)
    Boolean getTypeNReplace();
            
    /**
     * <p>id(0x1a9)</p>
     */
    @ComProperty(name = "TypeNReplace", dispId = 0x1a9)
    void setTypeNReplace(Boolean param0);
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "SequenceCheck", dispId = 0x1aa)
    Boolean getSequenceCheck();
            
    /**
     * <p>id(0x1aa)</p>
     */
    @ComProperty(name = "SequenceCheck", dispId = 0x1aa)
    void setSequenceCheck(Boolean param0);
            
    /**
     * <p>id(0x1ab)</p>
     */
    @ComProperty(name = "BackgroundOpen", dispId = 0x1ab)
    Boolean getBackgroundOpen();
            
    /**
     * <p>id(0x1ab)</p>
     */
    @ComProperty(name = "BackgroundOpen", dispId = 0x1ab)
    void setBackgroundOpen(Boolean param0);
            
    /**
     * <p>id(0x1ac)</p>
     */
    @ComProperty(name = "DisableFeaturesbyDefault", dispId = 0x1ac)
    Boolean getDisableFeaturesbyDefault();
            
    /**
     * <p>id(0x1ac)</p>
     */
    @ComProperty(name = "DisableFeaturesbyDefault", dispId = 0x1ac)
    void setDisableFeaturesbyDefault(Boolean param0);
            
    /**
     * <p>id(0x1ad)</p>
     */
    @ComProperty(name = "PasteAdjustWordSpacing", dispId = 0x1ad)
    Boolean getPasteAdjustWordSpacing();
            
    /**
     * <p>id(0x1ad)</p>
     */
    @ComProperty(name = "PasteAdjustWordSpacing", dispId = 0x1ad)
    void setPasteAdjustWordSpacing(Boolean param0);
            
    /**
     * <p>id(0x1ae)</p>
     */
    @ComProperty(name = "PasteAdjustParagraphSpacing", dispId = 0x1ae)
    Boolean getPasteAdjustParagraphSpacing();
            
    /**
     * <p>id(0x1ae)</p>
     */
    @ComProperty(name = "PasteAdjustParagraphSpacing", dispId = 0x1ae)
    void setPasteAdjustParagraphSpacing(Boolean param0);
            
    /**
     * <p>id(0x1af)</p>
     */
    @ComProperty(name = "PasteAdjustTableFormatting", dispId = 0x1af)
    Boolean getPasteAdjustTableFormatting();
            
    /**
     * <p>id(0x1af)</p>
     */
    @ComProperty(name = "PasteAdjustTableFormatting", dispId = 0x1af)
    void setPasteAdjustTableFormatting(Boolean param0);
            
    /**
     * <p>id(0x1b0)</p>
     */
    @ComProperty(name = "PasteSmartStyleBehavior", dispId = 0x1b0)
    Boolean getPasteSmartStyleBehavior();
            
    /**
     * <p>id(0x1b0)</p>
     */
    @ComProperty(name = "PasteSmartStyleBehavior", dispId = 0x1b0)
    void setPasteSmartStyleBehavior(Boolean param0);
            
    /**
     * <p>id(0x1b1)</p>
     */
    @ComProperty(name = "PasteMergeFromPPT", dispId = 0x1b1)
    Boolean getPasteMergeFromPPT();
            
    /**
     * <p>id(0x1b1)</p>
     */
    @ComProperty(name = "PasteMergeFromPPT", dispId = 0x1b1)
    void setPasteMergeFromPPT(Boolean param0);
            
    /**
     * <p>id(0x1b2)</p>
     */
    @ComProperty(name = "PasteMergeFromXL", dispId = 0x1b2)
    Boolean getPasteMergeFromXL();
            
    /**
     * <p>id(0x1b2)</p>
     */
    @ComProperty(name = "PasteMergeFromXL", dispId = 0x1b2)
    void setPasteMergeFromXL(Boolean param0);
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "CtrlClickHyperlinkToOpen", dispId = 0x1b3)
    Boolean getCtrlClickHyperlinkToOpen();
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "CtrlClickHyperlinkToOpen", dispId = 0x1b3)
    void setCtrlClickHyperlinkToOpen(Boolean param0);
            
    /**
     * <p>id(0x1b4)</p>
     */
    @ComProperty(name = "PictureWrapType", dispId = 0x1b4)
    WdWrapTypeMerged getPictureWrapType();
            
    /**
     * <p>id(0x1b4)</p>
     */
    @ComProperty(name = "PictureWrapType", dispId = 0x1b4)
    void setPictureWrapType(WdWrapTypeMerged param0);
            
    /**
     * <p>id(0x1b5)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfterbyDefault", dispId = 0x1b5)
    WdDisableFeaturesIntroducedAfter getDisableFeaturesIntroducedAfterbyDefault();
            
    /**
     * <p>id(0x1b5)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfterbyDefault", dispId = 0x1b5)
    void setDisableFeaturesIntroducedAfterbyDefault(WdDisableFeaturesIntroducedAfter param0);
            
    /**
     * <p>id(0x1b6)</p>
     */
    @ComProperty(name = "PasteSmartCutPaste", dispId = 0x1b6)
    Boolean getPasteSmartCutPaste();
            
    /**
     * <p>id(0x1b6)</p>
     */
    @ComProperty(name = "PasteSmartCutPaste", dispId = 0x1b6)
    void setPasteSmartCutPaste(Boolean param0);
            
    /**
     * <p>id(0x1b7)</p>
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x1b7)
    Boolean getDisplayPasteOptions();
            
    /**
     * <p>id(0x1b7)</p>
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x1b7)
    void setDisplayPasteOptions(Boolean param0);
            
    /**
     * <p>id(0x1b9)</p>
     */
    @ComProperty(name = "PromptUpdateStyle", dispId = 0x1b9)
    Boolean getPromptUpdateStyle();
            
    /**
     * <p>id(0x1b9)</p>
     */
    @ComProperty(name = "PromptUpdateStyle", dispId = 0x1b9)
    void setPromptUpdateStyle(Boolean param0);
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "DefaultEPostageApp", dispId = 0x1ba)
    String getDefaultEPostageApp();
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "DefaultEPostageApp", dispId = 0x1ba)
    void setDefaultEPostageApp(String param0);
            
    /**
     * <p>id(0x1bb)</p>
     */
    @ComProperty(name = "DefaultTextEncoding", dispId = 0x1bb)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getDefaultTextEncoding();
            
    /**
     * <p>id(0x1bb)</p>
     */
    @ComProperty(name = "DefaultTextEncoding", dispId = 0x1bb)
    void setDefaultTextEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x1bc)</p>
     */
    @ComProperty(name = "LabelSmartTags", dispId = 0x1bc)
    Boolean getLabelSmartTags();
            
    /**
     * <p>id(0x1bc)</p>
     */
    @ComProperty(name = "LabelSmartTags", dispId = 0x1bc)
    void setLabelSmartTags(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
     */
    @ComProperty(name = "DisplaySmartTagButtons", dispId = 0x1bd)
    Boolean getDisplaySmartTagButtons();
            
    /**
     * <p>id(0x1bd)</p>
     */
    @ComProperty(name = "DisplaySmartTagButtons", dispId = 0x1bd)
    void setDisplaySmartTagButtons(Boolean param0);
            
    /**
     * <p>id(0x1be)</p>
     */
    @ComProperty(name = "WarnBeforeSavingPrintingSendingMarkup", dispId = 0x1be)
    Boolean getWarnBeforeSavingPrintingSendingMarkup();
            
    /**
     * <p>id(0x1be)</p>
     */
    @ComProperty(name = "WarnBeforeSavingPrintingSendingMarkup", dispId = 0x1be)
    void setWarnBeforeSavingPrintingSendingMarkup(Boolean param0);
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComProperty(name = "StoreRSIDOnSave", dispId = 0x1bf)
    Boolean getStoreRSIDOnSave();
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComProperty(name = "StoreRSIDOnSave", dispId = 0x1bf)
    void setStoreRSIDOnSave(Boolean param0);
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComProperty(name = "ShowFormatError", dispId = 0x1c0)
    Boolean getShowFormatError();
            
    /**
     * <p>id(0x1c0)</p>
     */
    @ComProperty(name = "ShowFormatError", dispId = 0x1c0)
    void setShowFormatError(Boolean param0);
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComProperty(name = "FormatScanning", dispId = 0x1c1)
    Boolean getFormatScanning();
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComProperty(name = "FormatScanning", dispId = 0x1c1)
    void setFormatScanning(Boolean param0);
            
    /**
     * <p>id(0x1c2)</p>
     */
    @ComProperty(name = "PasteMergeLists", dispId = 0x1c2)
    Boolean getPasteMergeLists();
            
    /**
     * <p>id(0x1c2)</p>
     */
    @ComProperty(name = "PasteMergeLists", dispId = 0x1c2)
    void setPasteMergeLists(Boolean param0);
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "AutoCreateNewDrawings", dispId = 0x1c3)
    Boolean getAutoCreateNewDrawings();
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "AutoCreateNewDrawings", dispId = 0x1c3)
    void setAutoCreateNewDrawings(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "SmartParaSelection", dispId = 0x1c4)
    Boolean getSmartParaSelection();
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "SmartParaSelection", dispId = 0x1c4)
    void setSmartParaSelection(Boolean param0);
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "RevisionsBalloonPrintOrientation", dispId = 0x1c5)
    WdRevisionsBalloonPrintOrientation getRevisionsBalloonPrintOrientation();
            
    /**
     * <p>id(0x1c5)</p>
     */
    @ComProperty(name = "RevisionsBalloonPrintOrientation", dispId = 0x1c5)
    void setRevisionsBalloonPrintOrientation(WdRevisionsBalloonPrintOrientation param0);
            
    /**
     * <p>id(0x1c6)</p>
     */
    @ComProperty(name = "CommentsColor", dispId = 0x1c6)
    WdColorIndex getCommentsColor();
            
    /**
     * <p>id(0x1c6)</p>
     */
    @ComProperty(name = "CommentsColor", dispId = 0x1c6)
    void setCommentsColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1c7)</p>
     */
    @ComProperty(name = "PrintXMLTag", dispId = 0x1c7)
    Boolean getPrintXMLTag();
            
    /**
     * <p>id(0x1c7)</p>
     */
    @ComProperty(name = "PrintXMLTag", dispId = 0x1c7)
    void setPrintXMLTag(Boolean param0);
            
    /**
     * <p>id(0x1c8)</p>
     */
    @ComProperty(name = "PrintBackgrounds", dispId = 0x1c8)
    Boolean getPrintBackgrounds();
            
    /**
     * <p>id(0x1c8)</p>
     */
    @ComProperty(name = "PrintBackgrounds", dispId = 0x1c8)
    void setPrintBackgrounds(Boolean param0);
            
    /**
     * <p>id(0x1c9)</p>
     */
    @ComProperty(name = "AllowReadingMode", dispId = 0x1c9)
    Boolean getAllowReadingMode();
            
    /**
     * <p>id(0x1c9)</p>
     */
    @ComProperty(name = "AllowReadingMode", dispId = 0x1c9)
    void setAllowReadingMode(Boolean param0);
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComProperty(name = "ShowMarkupOpenSave", dispId = 0x1ca)
    Boolean getShowMarkupOpenSave();
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComProperty(name = "ShowMarkupOpenSave", dispId = 0x1ca)
    void setShowMarkupOpenSave(Boolean param0);
            
    /**
     * <p>id(0x1cb)</p>
     */
    @ComProperty(name = "SmartCursoring", dispId = 0x1cb)
    Boolean getSmartCursoring();
            
    /**
     * <p>id(0x1cb)</p>
     */
    @ComProperty(name = "SmartCursoring", dispId = 0x1cb)
    void setSmartCursoring(Boolean param0);
            
    /**
     * <p>id(0x1cc)</p>
     */
    @ComProperty(name = "MoveToTextMark", dispId = 0x1cc)
    WdMoveToTextMark getMoveToTextMark();
            
    /**
     * <p>id(0x1cc)</p>
     */
    @ComProperty(name = "MoveToTextMark", dispId = 0x1cc)
    void setMoveToTextMark(WdMoveToTextMark param0);
            
    /**
     * <p>id(0x1cd)</p>
     */
    @ComProperty(name = "MoveFromTextMark", dispId = 0x1cd)
    WdMoveFromTextMark getMoveFromTextMark();
            
    /**
     * <p>id(0x1cd)</p>
     */
    @ComProperty(name = "MoveFromTextMark", dispId = 0x1cd)
    void setMoveFromTextMark(WdMoveFromTextMark param0);
            
    /**
     * <p>id(0x1ce)</p>
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x1ce)
    String getBibliographyStyle();
            
    /**
     * <p>id(0x1ce)</p>
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x1ce)
    void setBibliographyStyle(String param0);
            
    /**
     * <p>id(0x1cf)</p>
     */
    @ComProperty(name = "BibliographySort", dispId = 0x1cf)
    String getBibliographySort();
            
    /**
     * <p>id(0x1cf)</p>
     */
    @ComProperty(name = "BibliographySort", dispId = 0x1cf)
    void setBibliographySort(String param0);
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComProperty(name = "InsertedCellColor", dispId = 0x1d0)
    WdCellColor getInsertedCellColor();
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComProperty(name = "InsertedCellColor", dispId = 0x1d0)
    void setInsertedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d1)</p>
     */
    @ComProperty(name = "DeletedCellColor", dispId = 0x1d1)
    WdCellColor getDeletedCellColor();
            
    /**
     * <p>id(0x1d1)</p>
     */
    @ComProperty(name = "DeletedCellColor", dispId = 0x1d1)
    void setDeletedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d2)</p>
     */
    @ComProperty(name = "MergedCellColor", dispId = 0x1d2)
    WdCellColor getMergedCellColor();
            
    /**
     * <p>id(0x1d2)</p>
     */
    @ComProperty(name = "MergedCellColor", dispId = 0x1d2)
    void setMergedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d3)</p>
     */
    @ComProperty(name = "SplitCellColor", dispId = 0x1d3)
    WdCellColor getSplitCellColor();
            
    /**
     * <p>id(0x1d3)</p>
     */
    @ComProperty(name = "SplitCellColor", dispId = 0x1d3)
    void setSplitCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d4)</p>
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x1d4)
    Boolean getShowSelectionFloaties();
            
    /**
     * <p>id(0x1d4)</p>
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x1d4)
    void setShowSelectionFloaties(Boolean param0);
            
    /**
     * <p>id(0x1d5)</p>
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x1d5)
    Boolean getShowMenuFloaties();
            
    /**
     * <p>id(0x1d5)</p>
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x1d5)
    void setShowMenuFloaties(Boolean param0);
            
    /**
     * <p>id(0x1d6)</p>
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x1d6)
    Boolean getShowDevTools();
            
    /**
     * <p>id(0x1d6)</p>
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x1d6)
    void setShowDevTools(Boolean param0);
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x1d8)
    Boolean getEnableLivePreview();
            
    /**
     * <p>id(0x1d8)</p>
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x1d8)
    void setEnableLivePreview(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "OMathAutoBuildUp", dispId = 0x1da)
    Boolean getOMathAutoBuildUp();
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "OMathAutoBuildUp", dispId = 0x1da)
    void setOMathAutoBuildUp(Boolean param0);
            
    /**
     * <p>id(0x1dc)</p>
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x1dc)
    Boolean getAlwaysUseClearType();
            
    /**
     * <p>id(0x1dc)</p>
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x1dc)
    void setAlwaysUseClearType(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComProperty(name = "PasteFormatWithinDocument", dispId = 0x1dd)
    WdPasteOptions getPasteFormatWithinDocument();
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComProperty(name = "PasteFormatWithinDocument", dispId = 0x1dd)
    void setPasteFormatWithinDocument(WdPasteOptions param0);
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "PasteFormatBetweenDocuments", dispId = 0x1de)
    WdPasteOptions getPasteFormatBetweenDocuments();
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "PasteFormatBetweenDocuments", dispId = 0x1de)
    void setPasteFormatBetweenDocuments(WdPasteOptions param0);
            
    /**
     * <p>id(0x1df)</p>
     */
    @ComProperty(name = "PasteFormatBetweenStyledDocuments", dispId = 0x1df)
    WdPasteOptions getPasteFormatBetweenStyledDocuments();
            
    /**
     * <p>id(0x1df)</p>
     */
    @ComProperty(name = "PasteFormatBetweenStyledDocuments", dispId = 0x1df)
    void setPasteFormatBetweenStyledDocuments(WdPasteOptions param0);
            
    /**
     * <p>id(0x1e0)</p>
     */
    @ComProperty(name = "PasteFormatFromExternalSource", dispId = 0x1e0)
    WdPasteOptions getPasteFormatFromExternalSource();
            
    /**
     * <p>id(0x1e0)</p>
     */
    @ComProperty(name = "PasteFormatFromExternalSource", dispId = 0x1e0)
    void setPasteFormatFromExternalSource(WdPasteOptions param0);
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComProperty(name = "PasteOptionKeepBulletsAndNumbers", dispId = 0x1e1)
    Boolean getPasteOptionKeepBulletsAndNumbers();
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComProperty(name = "PasteOptionKeepBulletsAndNumbers", dispId = 0x1e1)
    void setPasteOptionKeepBulletsAndNumbers(Boolean param0);
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComProperty(name = "INSKeyForOvertype", dispId = 0x1e2)
    Boolean getINSKeyForOvertype();
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComProperty(name = "INSKeyForOvertype", dispId = 0x1e2)
    void setINSKeyForOvertype(Boolean param0);
            
    /**
     * <p>id(0x1e3)</p>
     */
    @ComProperty(name = "RepeatWord", dispId = 0x1e3)
    Boolean getRepeatWord();
            
    /**
     * <p>id(0x1e3)</p>
     */
    @ComProperty(name = "RepeatWord", dispId = 0x1e3)
    void setRepeatWord(Boolean param0);
            
    /**
     * <p>id(0x1e4)</p>
     */
    @ComProperty(name = "FrenchReform", dispId = 0x1e4)
    WdFrenchSpeller getFrenchReform();
            
    /**
     * <p>id(0x1e4)</p>
     */
    @ComProperty(name = "FrenchReform", dispId = 0x1e4)
    void setFrenchReform(WdFrenchSpeller param0);
            
    /**
     * <p>id(0x1e5)</p>
     */
    @ComProperty(name = "ContextualSpeller", dispId = 0x1e5)
    Boolean getContextualSpeller();
            
    /**
     * <p>id(0x1e5)</p>
     */
    @ComProperty(name = "ContextualSpeller", dispId = 0x1e5)
    void setContextualSpeller(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "MoveToTextColor", dispId = 0x1e6)
    WdColorIndex getMoveToTextColor();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "MoveToTextColor", dispId = 0x1e6)
    void setMoveToTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1e7)</p>
     */
    @ComProperty(name = "MoveFromTextColor", dispId = 0x1e7)
    WdColorIndex getMoveFromTextColor();
            
    /**
     * <p>id(0x1e7)</p>
     */
    @ComProperty(name = "MoveFromTextColor", dispId = 0x1e7)
    void setMoveFromTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1e8)</p>
     */
    @ComProperty(name = "OMathCopyLF", dispId = 0x1e8)
    Boolean getOMathCopyLF();
            
    /**
     * <p>id(0x1e8)</p>
     */
    @ComProperty(name = "OMathCopyLF", dispId = 0x1e8)
    void setOMathCopyLF(Boolean param0);
            
    /**
     * <p>id(0x1e9)</p>
     */
    @ComProperty(name = "UseNormalStyleForList", dispId = 0x1e9)
    Boolean getUseNormalStyleForList();
            
    /**
     * <p>id(0x1e9)</p>
     */
    @ComProperty(name = "UseNormalStyleForList", dispId = 0x1e9)
    void setUseNormalStyleForList(Boolean param0);
            
    /**
     * <p>id(0x1ea)</p>
     */
    @ComProperty(name = "AllowOpenInDraftView", dispId = 0x1ea)
    Boolean getAllowOpenInDraftView();
            
    /**
     * <p>id(0x1ea)</p>
     */
    @ComProperty(name = "AllowOpenInDraftView", dispId = 0x1ea)
    void setAllowOpenInDraftView(Boolean param0);
            
    /**
     * <p>id(0x1ec)</p>
     */
    @ComProperty(name = "EnableLegacyIMEMode", dispId = 0x1ec)
    Boolean getEnableLegacyIMEMode();
            
    /**
     * <p>id(0x1ec)</p>
     */
    @ComProperty(name = "EnableLegacyIMEMode", dispId = 0x1ec)
    void setEnableLegacyIMEMode(Boolean param0);
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x1ed)
    Boolean getDoNotPromptForConvert();
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x1ed)
    void setDoNotPromptForConvert(Boolean param0);
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "PrecisePositioning", dispId = 0x1ee)
    Boolean getPrecisePositioning();
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "PrecisePositioning", dispId = 0x1ee)
    void setPrecisePositioning(Boolean param0);
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComProperty(name = "UpdateStyleListBehavior", dispId = 0x1ef)
    WdUpdateStyleListBehavior getUpdateStyleListBehavior();
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComProperty(name = "UpdateStyleListBehavior", dispId = 0x1ef)
    void setUpdateStyleListBehavior(WdUpdateStyleListBehavior param0);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComProperty(name = "StrictTaaMarboota", dispId = 0x1f0)
    Boolean getStrictTaaMarboota();
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComProperty(name = "StrictTaaMarboota", dispId = 0x1f0)
    void setStrictTaaMarboota(Boolean param0);
            
    /**
     * <p>id(0x1f1)</p>
     */
    @ComProperty(name = "StrictRussianE", dispId = 0x1f1)
    Boolean getStrictRussianE();
            
    /**
     * <p>id(0x1f1)</p>
     */
    @ComProperty(name = "StrictRussianE", dispId = 0x1f1)
    void setStrictRussianE(Boolean param0);
            
    /**
     * <p>id(0x1f2)</p>
     */
    @ComProperty(name = "SpanishMode", dispId = 0x1f2)
    WdSpanishSpeller getSpanishMode();
            
    /**
     * <p>id(0x1f2)</p>
     */
    @ComProperty(name = "SpanishMode", dispId = 0x1f2)
    void setSpanishMode(WdSpanishSpeller param0);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0x1f5)
    WdPortugueseReform getPortugalReform();
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0x1f5)
    void setPortugalReform(WdPortugueseReform param0);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0x1f6)
    WdPortugueseReform getBrazilReform();
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0x1f6)
    void setBrazilReform(WdPortugueseReform param0);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "UpdateFieldsWithTrackedChangesAtPrint", dispId = 0x1f7)
    Boolean getUpdateFieldsWithTrackedChangesAtPrint();
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "UpdateFieldsWithTrackedChangesAtPrint", dispId = 0x1f7)
    void setUpdateFieldsWithTrackedChangesAtPrint(Boolean param0);
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "DisplayAlignmentGuides", dispId = 0x1f8)
    Boolean getDisplayAlignmentGuides();
            
    /**
     * <p>id(0x1f8)</p>
     */
    @ComProperty(name = "DisplayAlignmentGuides", dispId = 0x1f8)
    void setDisplayAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComProperty(name = "PageAlignmentGuides", dispId = 0x1f9)
    Boolean getPageAlignmentGuides();
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComProperty(name = "PageAlignmentGuides", dispId = 0x1f9)
    void setPageAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fa)</p>
     */
    @ComProperty(name = "MarginAlignmentGuides", dispId = 0x1fa)
    Boolean getMarginAlignmentGuides();
            
    /**
     * <p>id(0x1fa)</p>
     */
    @ComProperty(name = "MarginAlignmentGuides", dispId = 0x1fa)
    void setMarginAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fb)</p>
     */
    @ComProperty(name = "ParagraphAlignmentGuides", dispId = 0x1fb)
    Boolean getParagraphAlignmentGuides();
            
    /**
     * <p>id(0x1fb)</p>
     */
    @ComProperty(name = "ParagraphAlignmentGuides", dispId = 0x1fb)
    void setParagraphAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fc)</p>
     */
    @ComProperty(name = "EnableLiveDrag", dispId = 0x1fc)
    Boolean getEnableLiveDrag();
            
    /**
     * <p>id(0x1fc)</p>
     */
    @ComProperty(name = "EnableLiveDrag", dispId = 0x1fc)
    void setEnableLiveDrag(Boolean param0);
            
    /**
     * <p>id(0x1fd)</p>
     */
    @ComProperty(name = "UseSubPixelPositioning", dispId = 0x1fd)
    Boolean getUseSubPixelPositioning();
            
    /**
     * <p>id(0x1fd)</p>
     */
    @ComProperty(name = "UseSubPixelPositioning", dispId = 0x1fd)
    void setUseSubPixelPositioning(Boolean param0);
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComProperty(name = "AlertIfNotDefault", dispId = 0x1fe)
    Boolean getAlertIfNotDefault();
            
    /**
     * <p>id(0x1fe)</p>
     */
    @ComProperty(name = "AlertIfNotDefault", dispId = 0x1fe)
    void setAlertIfNotDefault(Boolean param0);
            
    /**
     * <p>id(0x1ff)</p>
     */
    @ComProperty(name = "EnableProofingToolsAdvertisement", dispId = 0x1ff)
    Boolean getEnableProofingToolsAdvertisement();
            
    /**
     * <p>id(0x1ff)</p>
     */
    @ComProperty(name = "EnableProofingToolsAdvertisement", dispId = 0x1ff)
    void setEnableProofingToolsAdvertisement(Boolean param0);
            
    /**
     * <p>id(0x200)</p>
     */
    @ComProperty(name = "PreferCloudSaveLocations", dispId = 0x200)
    Boolean getPreferCloudSaveLocations();
            
    /**
     * <p>id(0x200)</p>
     */
    @ComProperty(name = "PreferCloudSaveLocations", dispId = 0x200)
    void setPreferCloudSaveLocations(Boolean param0);
            
    /**
     * <p>id(0x201)</p>
     */
    @ComProperty(name = "SkyDriveSignInOption", dispId = 0x201)
    Boolean getSkyDriveSignInOption();
            
    /**
     * <p>id(0x201)</p>
     */
    @ComProperty(name = "SkyDriveSignInOption", dispId = 0x201)
    void setSkyDriveSignInOption(Boolean param0);
            
    /**
     * <p>id(0x202)</p>
     */
    @ComProperty(name = "ExpandHeadingsOnOpen", dispId = 0x202)
    Boolean getExpandHeadingsOnOpen();
            
    /**
     * <p>id(0x202)</p>
     */
    @ComProperty(name = "ExpandHeadingsOnOpen", dispId = 0x202)
    void setExpandHeadingsOnOpen(Boolean param0);
            
    /**
     * <p>id(0x203)</p>
     */
    @ComProperty(name = "UseLocalUserInfo", dispId = 0x203)
    Boolean getUseLocalUserInfo();
            
    /**
     * <p>id(0x203)</p>
     */
    @ComProperty(name = "UseLocalUserInfo", dispId = 0x203)
    void setUseLocalUserInfo(Boolean param0);
            
    
}