
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AllowAccentedUppercase", dispId = 0x1)
    Boolean getAllowAccentedUppercase();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowAccentedUppercase", dispId = 0x1)
    void setAllowAccentedUppercase(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "WPHelp", dispId = 0x11)
    Boolean getWPHelp();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WPHelp", dispId = 0x11)
    void setWPHelp(Boolean param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "WPDocNavKeys", dispId = 0x12)
    Boolean getWPDocNavKeys();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WPDocNavKeys", dispId = 0x12)
    void setWPDocNavKeys(Boolean param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Pagination", dispId = 0x13)
    Boolean getPagination();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Pagination", dispId = 0x13)
    void setPagination(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "BlueScreen", dispId = 0x14)
    Boolean getBlueScreen();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BlueScreen", dispId = 0x14)
    void setBlueScreen(Boolean param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "EnableSound", dispId = 0x15)
    Boolean getEnableSound();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableSound", dispId = 0x15)
    void setEnableSound(Boolean param0);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ConfirmConversions", dispId = 0x16)
    Boolean getConfirmConversions();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ConfirmConversions", dispId = 0x16)
    void setConfirmConversions(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "UpdateLinksAtOpen", dispId = 0x17)
    Boolean getUpdateLinksAtOpen();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateLinksAtOpen", dispId = 0x17)
    void setUpdateLinksAtOpen(Boolean param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "SendMailAttach", dispId = 0x18)
    Boolean getSendMailAttach();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SendMailAttach", dispId = 0x18)
    void setSendMailAttach(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x1a)
    WdMeasurementUnits getMeasurementUnit();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code WdMeasurementUnits}
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x1a)
    void setMeasurementUnit(WdMeasurementUnits param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ButtonFieldClicks", dispId = 0x1b)
    Integer getButtonFieldClicks();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ButtonFieldClicks", dispId = 0x1b)
    void setButtonFieldClicks(Integer param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ShortMenuNames", dispId = 0x1c)
    Boolean getShortMenuNames();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShortMenuNames", dispId = 0x1c)
    void setShortMenuNames(Boolean param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "RTFInClipboard", dispId = 0x1d)
    Boolean getRTFInClipboard();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RTFInClipboard", dispId = 0x1d)
    void setRTFInClipboard(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "UpdateFieldsAtPrint", dispId = 0x1e)
    Boolean getUpdateFieldsAtPrint();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateFieldsAtPrint", dispId = 0x1e)
    void setUpdateFieldsAtPrint(Boolean param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "PrintProperties", dispId = 0x1f)
    Boolean getPrintProperties();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintProperties", dispId = 0x1f)
    void setPrintProperties(Boolean param0);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "PrintFieldCodes", dispId = 0x20)
    Boolean getPrintFieldCodes();
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintFieldCodes", dispId = 0x20)
    void setPrintFieldCodes(Boolean param0);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "PrintComments", dispId = 0x21)
    Boolean getPrintComments();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintComments", dispId = 0x21)
    void setPrintComments(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "PrintHiddenText", dispId = 0x22)
    Boolean getPrintHiddenText();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintHiddenText", dispId = 0x22)
    void setPrintHiddenText(Boolean param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "EnvelopeFeederInstalled", dispId = 0x23)
    Boolean getEnvelopeFeederInstalled();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "UpdateLinksAtPrint", dispId = 0x24)
    Boolean getUpdateLinksAtPrint();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateLinksAtPrint", dispId = 0x24)
    void setUpdateLinksAtPrint(Boolean param0);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "PrintBackground", dispId = 0x25)
    Boolean getPrintBackground();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintBackground", dispId = 0x25)
    void setPrintBackground(Boolean param0);
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "PrintDrawingObjects", dispId = 0x26)
    Boolean getPrintDrawingObjects();
            
    /**
     * <p>id(0x26)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintDrawingObjects", dispId = 0x26)
    void setPrintDrawingObjects(Boolean param0);
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "DefaultTray", dispId = 0x27)
    String getDefaultTray();
            
    /**
     * <p>id(0x27)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultTray", dispId = 0x27)
    void setDefaultTray(String param0);
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "DefaultTrayID", dispId = 0x28)
    Integer getDefaultTrayID();
            
    /**
     * <p>id(0x28)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DefaultTrayID", dispId = 0x28)
    void setDefaultTrayID(Integer param0);
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "CreateBackup", dispId = 0x29)
    Boolean getCreateBackup();
            
    /**
     * <p>id(0x29)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CreateBackup", dispId = 0x29)
    void setCreateBackup(Boolean param0);
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "AllowFastSave", dispId = 0x2a)
    Boolean getAllowFastSave();
            
    /**
     * <p>id(0x2a)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowFastSave", dispId = 0x2a)
    void setAllowFastSave(Boolean param0);
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "SavePropertiesPrompt", dispId = 0x2b)
    Boolean getSavePropertiesPrompt();
            
    /**
     * <p>id(0x2b)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SavePropertiesPrompt", dispId = 0x2b)
    void setSavePropertiesPrompt(Boolean param0);
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "SaveNormalPrompt", dispId = 0x2c)
    Boolean getSaveNormalPrompt();
            
    /**
     * <p>id(0x2c)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveNormalPrompt", dispId = 0x2c)
    void setSaveNormalPrompt(Boolean param0);
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "SaveInterval", dispId = 0x2d)
    Integer getSaveInterval();
            
    /**
     * <p>id(0x2d)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SaveInterval", dispId = 0x2d)
    void setSaveInterval(Integer param0);
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "BackgroundSave", dispId = 0x2e)
    Boolean getBackgroundSave();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundSave", dispId = 0x2e)
    void setBackgroundSave(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "InsertedTextMark", dispId = 0x39)
    WdInsertedTextMark getInsertedTextMark();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code WdInsertedTextMark}
     */
    @ComProperty(name = "InsertedTextMark", dispId = 0x39)
    void setInsertedTextMark(WdInsertedTextMark param0);
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "DeletedTextMark", dispId = 0x3a)
    WdDeletedTextMark getDeletedTextMark();
            
    /**
     * <p>id(0x3a)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code WdDeletedTextMark}
     */
    @ComProperty(name = "DeletedTextMark", dispId = 0x3a)
    void setDeletedTextMark(WdDeletedTextMark param0);
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "RevisedLinesMark", dispId = 0x3b)
    WdRevisedLinesMark getRevisedLinesMark();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code WdRevisedLinesMark}
     */
    @ComProperty(name = "RevisedLinesMark", dispId = 0x3b)
    void setRevisedLinesMark(WdRevisedLinesMark param0);
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "InsertedTextColor", dispId = 0x3c)
    WdColorIndex getInsertedTextColor();
            
    /**
     * <p>id(0x3c)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "InsertedTextColor", dispId = 0x3c)
    void setInsertedTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "DeletedTextColor", dispId = 0x3d)
    WdColorIndex getDeletedTextColor();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "DeletedTextColor", dispId = 0x3d)
    void setDeletedTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "RevisedLinesColor", dispId = 0x3e)
    WdColorIndex getRevisedLinesColor();
            
    /**
     * <p>id(0x3e)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "RevisedLinesColor", dispId = 0x3e)
    void setRevisedLinesColor(WdColorIndex param0);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(81)</p>
     * @param Path [in] {@code WdDefaultFilePath}
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x41)
    String getDefaultFilePath(WdDefaultFilePath Path);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(82)</p>
     * @param Path [in] {@code WdDefaultFilePath}
     * @param param1 [in] {@code String}
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x41)
    void setDefaultFilePath(WdDefaultFilePath Path,
            String param1);
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "Overtype", dispId = 0x42)
    Boolean getOvertype();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Overtype", dispId = 0x42)
    void setOvertype(Boolean param0);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "ReplaceSelection", dispId = 0x43)
    Boolean getReplaceSelection();
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(86)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReplaceSelection", dispId = 0x43)
    void setReplaceSelection(Boolean param0);
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(87)</p>
     */
    @ComProperty(name = "AllowDragAndDrop", dispId = 0x44)
    Boolean getAllowDragAndDrop();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(88)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowDragAndDrop", dispId = 0x44)
    void setAllowDragAndDrop(Boolean param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "AutoWordSelection", dispId = 0x45)
    Boolean getAutoWordSelection();
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(90)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoWordSelection", dispId = 0x45)
    void setAutoWordSelection(Boolean param0);
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "INSKeyForPaste", dispId = 0x46)
    Boolean getINSKeyForPaste();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(92)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "INSKeyForPaste", dispId = 0x46)
    void setINSKeyForPaste(Boolean param0);
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "SmartCutPaste", dispId = 0x47)
    Boolean getSmartCutPaste();
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmartCutPaste", dispId = 0x47)
    void setSmartCutPaste(Boolean param0);
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x48)
    Boolean getTabIndentKey();
            
    /**
     * <p>id(0x48)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TabIndentKey", dispId = 0x48)
    void setTabIndentKey(Boolean param0);
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "PictureEditor", dispId = 0x49)
    String getPictureEditor();
            
    /**
     * <p>id(0x49)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PictureEditor", dispId = 0x49)
    void setPictureEditor(String param0);
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "AnimateScreenMovements", dispId = 0x4a)
    Boolean getAnimateScreenMovements();
            
    /**
     * <p>id(0x4a)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AnimateScreenMovements", dispId = 0x4a)
    void setAnimateScreenMovements(Boolean param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(101)</p>
     */
    @ComProperty(name = "VirusProtection", dispId = 0x4b)
    Boolean getVirusProtection();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(102)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "VirusProtection", dispId = 0x4b)
    void setVirusProtection(Boolean param0);
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "RevisedPropertiesMark", dispId = 0x4c)
    WdRevisedPropertiesMark getRevisedPropertiesMark();
            
    /**
     * <p>id(0x4c)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code WdRevisedPropertiesMark}
     */
    @ComProperty(name = "RevisedPropertiesMark", dispId = 0x4c)
    void setRevisedPropertiesMark(WdRevisedPropertiesMark param0);
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "RevisedPropertiesColor", dispId = 0x4d)
    WdColorIndex getRevisedPropertiesColor();
            
    /**
     * <p>id(0x4d)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "RevisedPropertiesColor", dispId = 0x4d)
    void setRevisedPropertiesColor(WdColorIndex param0);
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x4f)
    Boolean getSnapToGrid();
            
    /**
     * <p>id(0x4f)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SnapToGrid", dispId = 0x4f)
    void setSnapToGrid(Boolean param0);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x50)
    Boolean getSnapToShapes();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(110)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SnapToShapes", dispId = 0x50)
    void setSnapToShapes(Boolean param0);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x51)
    Float getGridDistanceHorizontal();
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(112)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridDistanceHorizontal", dispId = 0x51)
    void setGridDistanceHorizontal(Float param0);
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x52)
    Float getGridDistanceVertical();
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridDistanceVertical", dispId = 0x52)
    void setGridDistanceVertical(Float param0);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x53)
    Float getGridOriginHorizontal();
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(116)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridOriginHorizontal", dispId = 0x53)
    void setGridOriginHorizontal(Float param0);
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x54)
    Float getGridOriginVertical();
            
    /**
     * <p>id(0x54)</p>
     * <p>vtableId(118)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GridOriginVertical", dispId = 0x54)
    void setGridOriginVertical(Float param0);
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "InlineConversion", dispId = 0x56)
    Boolean getInlineConversion();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InlineConversion", dispId = 0x56)
    void setInlineConversion(Boolean param0);
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "IMEAutomaticControl", dispId = 0x57)
    Boolean getIMEAutomaticControl();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IMEAutomaticControl", dispId = 0x57)
    void setIMEAutomaticControl(Boolean param0);
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "AutoFormatApplyHeadings", dispId = 0xfa)
    Boolean getAutoFormatApplyHeadings();
            
    /**
     * <p>id(0xfa)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatApplyHeadings", dispId = 0xfa)
    void setAutoFormatApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "AutoFormatApplyLists", dispId = 0xfb)
    Boolean getAutoFormatApplyLists();
            
    /**
     * <p>id(0xfb)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatApplyLists", dispId = 0xfb)
    void setAutoFormatApplyLists(Boolean param0);
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "AutoFormatApplyBulletedLists", dispId = 0xfc)
    Boolean getAutoFormatApplyBulletedLists();
            
    /**
     * <p>id(0xfc)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatApplyBulletedLists", dispId = 0xfc)
    void setAutoFormatApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0xfd)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "AutoFormatApplyOtherParas", dispId = 0xfd)
    Boolean getAutoFormatApplyOtherParas();
            
    /**
     * <p>id(0xfd)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatApplyOtherParas", dispId = 0xfd)
    void setAutoFormatApplyOtherParas(Boolean param0);
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "AutoFormatReplaceQuotes", dispId = 0xfe)
    Boolean getAutoFormatReplaceQuotes();
            
    /**
     * <p>id(0xfe)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceQuotes", dispId = 0xfe)
    void setAutoFormatReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "AutoFormatReplaceSymbols", dispId = 0xff)
    Boolean getAutoFormatReplaceSymbols();
            
    /**
     * <p>id(0xff)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceSymbols", dispId = 0xff)
    void setAutoFormatReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x100)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "AutoFormatReplaceOrdinals", dispId = 0x100)
    Boolean getAutoFormatReplaceOrdinals();
            
    /**
     * <p>id(0x100)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceOrdinals", dispId = 0x100)
    void setAutoFormatReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x101)</p>
     * <p>vtableId(137)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFractions", dispId = 0x101)
    Boolean getAutoFormatReplaceFractions();
            
    /**
     * <p>id(0x101)</p>
     * <p>vtableId(138)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceFractions", dispId = 0x101)
    void setAutoFormatReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "AutoFormatReplacePlainTextEmphasis", dispId = 0x102)
    Boolean getAutoFormatReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplacePlainTextEmphasis", dispId = 0x102)
    void setAutoFormatReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x103)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "AutoFormatPreserveStyles", dispId = 0x103)
    Boolean getAutoFormatPreserveStyles();
            
    /**
     * <p>id(0x103)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatPreserveStyles", dispId = 0x103)
    void setAutoFormatPreserveStyles(Boolean param0);
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    Boolean getAutoFormatAsYouTypeApplyHeadings();
            
    /**
     * <p>id(0x104)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyHeadings", dispId = 0x104)
    void setAutoFormatAsYouTypeApplyHeadings(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    Boolean getAutoFormatAsYouTypeApplyBorders();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBorders", dispId = 0x105)
    void setAutoFormatAsYouTypeApplyBorders(Boolean param0);
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    Boolean getAutoFormatAsYouTypeApplyBulletedLists();
            
    /**
     * <p>id(0x106)</p>
     * <p>vtableId(148)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyBulletedLists", dispId = 0x106)
    void setAutoFormatAsYouTypeApplyBulletedLists(Boolean param0);
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    Boolean getAutoFormatAsYouTypeApplyNumberedLists();
            
    /**
     * <p>id(0x107)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyNumberedLists", dispId = 0x107)
    void setAutoFormatAsYouTypeApplyNumberedLists(Boolean param0);
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(151)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    Boolean getAutoFormatAsYouTypeReplaceQuotes();
            
    /**
     * <p>id(0x108)</p>
     * <p>vtableId(152)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceQuotes", dispId = 0x108)
    void setAutoFormatAsYouTypeReplaceQuotes(Boolean param0);
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    Boolean getAutoFormatAsYouTypeReplaceSymbols();
            
    /**
     * <p>id(0x109)</p>
     * <p>vtableId(154)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceSymbols", dispId = 0x109)
    void setAutoFormatAsYouTypeReplaceSymbols(Boolean param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(155)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    Boolean getAutoFormatAsYouTypeReplaceOrdinals();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(156)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceOrdinals", dispId = 0x10a)
    void setAutoFormatAsYouTypeReplaceOrdinals(Boolean param0);
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    Boolean getAutoFormatAsYouTypeReplaceFractions();
            
    /**
     * <p>id(0x10b)</p>
     * <p>vtableId(158)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFractions", dispId = 0x10b)
    void setAutoFormatAsYouTypeReplaceFractions(Boolean param0);
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    Boolean getAutoFormatAsYouTypeReplacePlainTextEmphasis();
            
    /**
     * <p>id(0x10c)</p>
     * <p>vtableId(160)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplacePlainTextEmphasis", dispId = 0x10c)
    void setAutoFormatAsYouTypeReplacePlainTextEmphasis(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    Boolean getAutoFormatAsYouTypeFormatListItemBeginning();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeFormatListItemBeginning", dispId = 0x10d)
    void setAutoFormatAsYouTypeFormatListItemBeginning(Boolean param0);
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(163)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    Boolean getAutoFormatAsYouTypeDefineStyles();
            
    /**
     * <p>id(0x10e)</p>
     * <p>vtableId(164)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeDefineStyles", dispId = 0x10e)
    void setAutoFormatAsYouTypeDefineStyles(Boolean param0);
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "AutoFormatPlainTextWordMail", dispId = 0x10f)
    Boolean getAutoFormatPlainTextWordMail();
            
    /**
     * <p>id(0x10f)</p>
     * <p>vtableId(166)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatPlainTextWordMail", dispId = 0x10f)
    void setAutoFormatPlainTextWordMail(Boolean param0);
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(167)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    Boolean getAutoFormatAsYouTypeReplaceHyperlinks();
            
    /**
     * <p>id(0x110)</p>
     * <p>vtableId(168)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x110)
    void setAutoFormatAsYouTypeReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(169)</p>
     */
    @ComProperty(name = "AutoFormatReplaceHyperlinks", dispId = 0x111)
    Boolean getAutoFormatReplaceHyperlinks();
            
    /**
     * <p>id(0x111)</p>
     * <p>vtableId(170)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceHyperlinks", dispId = 0x111)
    void setAutoFormatReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "DefaultHighlightColorIndex", dispId = 0x112)
    WdColorIndex getDefaultHighlightColorIndex();
            
    /**
     * <p>id(0x112)</p>
     * <p>vtableId(172)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "DefaultHighlightColorIndex", dispId = 0x112)
    void setDefaultHighlightColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "DefaultBorderLineStyle", dispId = 0x113)
    WdLineStyle getDefaultBorderLineStyle();
            
    /**
     * <p>id(0x113)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code WdLineStyle}
     */
    @ComProperty(name = "DefaultBorderLineStyle", dispId = 0x113)
    void setDefaultBorderLineStyle(WdLineStyle param0);
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "CheckSpellingAsYouType", dispId = 0x114)
    Boolean getCheckSpellingAsYouType();
            
    /**
     * <p>id(0x114)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckSpellingAsYouType", dispId = 0x114)
    void setCheckSpellingAsYouType(Boolean param0);
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "CheckGrammarAsYouType", dispId = 0x115)
    Boolean getCheckGrammarAsYouType();
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(178)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckGrammarAsYouType", dispId = 0x115)
    void setCheckGrammarAsYouType(Boolean param0);
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(179)</p>
     */
    @ComProperty(name = "IgnoreInternetAndFileAddresses", dispId = 0x116)
    Boolean getIgnoreInternetAndFileAddresses();
            
    /**
     * <p>id(0x116)</p>
     * <p>vtableId(180)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreInternetAndFileAddresses", dispId = 0x116)
    void setIgnoreInternetAndFileAddresses(Boolean param0);
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(181)</p>
     */
    @ComProperty(name = "ShowReadabilityStatistics", dispId = 0x117)
    Boolean getShowReadabilityStatistics();
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(182)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowReadabilityStatistics", dispId = 0x117)
    void setShowReadabilityStatistics(Boolean param0);
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "IgnoreUppercase", dispId = 0x118)
    Boolean getIgnoreUppercase();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(184)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreUppercase", dispId = 0x118)
    void setIgnoreUppercase(Boolean param0);
            
    /**
     * <p>id(0x119)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x119)
    Boolean getIgnoreMixedDigits();
            
    /**
     * <p>id(0x119)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x119)
    void setIgnoreMixedDigits(Boolean param0);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "SuggestFromMainDictionaryOnly", dispId = 0x11a)
    Boolean getSuggestFromMainDictionaryOnly();
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(188)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuggestFromMainDictionaryOnly", dispId = 0x11a)
    void setSuggestFromMainDictionaryOnly(Boolean param0);
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "SuggestSpellingCorrections", dispId = 0x11b)
    Boolean getSuggestSpellingCorrections();
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(190)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuggestSpellingCorrections", dispId = 0x11b)
    void setSuggestSpellingCorrections(Boolean param0);
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "DefaultBorderLineWidth", dispId = 0x11c)
    WdLineWidth getDefaultBorderLineWidth();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(192)</p>
     * @param param0 [in] {@code WdLineWidth}
     */
    @ComProperty(name = "DefaultBorderLineWidth", dispId = 0x11c)
    void setDefaultBorderLineWidth(WdLineWidth param0);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(193)</p>
     */
    @ComProperty(name = "CheckGrammarWithSpelling", dispId = 0x11d)
    Boolean getCheckGrammarWithSpelling();
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(194)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckGrammarWithSpelling", dispId = 0x11d)
    void setCheckGrammarWithSpelling(Boolean param0);
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "DefaultOpenFormat", dispId = 0x11e)
    WdOpenFormat getDefaultOpenFormat();
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(196)</p>
     * @param param0 [in] {@code WdOpenFormat}
     */
    @ComProperty(name = "DefaultOpenFormat", dispId = 0x11e)
    void setDefaultOpenFormat(WdOpenFormat param0);
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(197)</p>
     */
    @ComProperty(name = "PrintDraft", dispId = 0x11f)
    Boolean getPrintDraft();
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(198)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintDraft", dispId = 0x11f)
    void setPrintDraft(Boolean param0);
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "PrintReverse", dispId = 0x120)
    Boolean getPrintReverse();
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(200)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintReverse", dispId = 0x120)
    void setPrintReverse(Boolean param0);
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x121)
    Boolean getMapPaperSize();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(202)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x121)
    void setMapPaperSize(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    Boolean getAutoFormatAsYouTypeApplyTables();
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(204)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyTables", dispId = 0x122)
    void setAutoFormatAsYouTypeApplyTables(Boolean param0);
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(205)</p>
     */
    @ComProperty(name = "AutoFormatApplyFirstIndents", dispId = 0x123)
    Boolean getAutoFormatApplyFirstIndents();
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(206)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatApplyFirstIndents", dispId = 0x123)
    void setAutoFormatApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(207)</p>
     */
    @ComProperty(name = "AutoFormatMatchParentheses", dispId = 0x126)
    Boolean getAutoFormatMatchParentheses();
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(208)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatMatchParentheses", dispId = 0x126)
    void setAutoFormatMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x127)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "AutoFormatReplaceFarEastDashes", dispId = 0x127)
    Boolean getAutoFormatReplaceFarEastDashes();
            
    /**
     * <p>id(0x127)</p>
     * <p>vtableId(210)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatReplaceFarEastDashes", dispId = 0x127)
    void setAutoFormatReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x128)</p>
     * <p>vtableId(211)</p>
     */
    @ComProperty(name = "AutoFormatDeleteAutoSpaces", dispId = 0x128)
    Boolean getAutoFormatDeleteAutoSpaces();
            
    /**
     * <p>id(0x128)</p>
     * <p>vtableId(212)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatDeleteAutoSpaces", dispId = 0x128)
    void setAutoFormatDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x129)</p>
     * <p>vtableId(213)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    Boolean getAutoFormatAsYouTypeApplyFirstIndents();
            
    /**
     * <p>id(0x129)</p>
     * <p>vtableId(214)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyFirstIndents", dispId = 0x129)
    void setAutoFormatAsYouTypeApplyFirstIndents(Boolean param0);
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    Boolean getAutoFormatAsYouTypeApplyDates();
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(216)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyDates", dispId = 0x12a)
    void setAutoFormatAsYouTypeApplyDates(Boolean param0);
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(217)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    Boolean getAutoFormatAsYouTypeApplyClosings();
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(218)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeApplyClosings", dispId = 0x12b)
    void setAutoFormatAsYouTypeApplyClosings(Boolean param0);
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(219)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    Boolean getAutoFormatAsYouTypeMatchParentheses();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(220)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeMatchParentheses", dispId = 0x12c)
    void setAutoFormatAsYouTypeMatchParentheses(Boolean param0);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    Boolean getAutoFormatAsYouTypeReplaceFarEastDashes();
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(222)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceFarEastDashes", dispId = 0x12d)
    void setAutoFormatAsYouTypeReplaceFarEastDashes(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(223)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    Boolean getAutoFormatAsYouTypeDeleteAutoSpaces();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(224)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeDeleteAutoSpaces", dispId = 0x12e)
    void setAutoFormatAsYouTypeDeleteAutoSpaces(Boolean param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(225)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    Boolean getAutoFormatAsYouTypeInsertClosings();
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(226)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertClosings", dispId = 0x12f)
    void setAutoFormatAsYouTypeInsertClosings(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(227)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    Boolean getAutoFormatAsYouTypeAutoLetterWizard();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(228)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeAutoLetterWizard", dispId = 0x130)
    void setAutoFormatAsYouTypeAutoLetterWizard(Boolean param0);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(229)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    Boolean getAutoFormatAsYouTypeInsertOvers();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(230)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeInsertOvers", dispId = 0x131)
    void setAutoFormatAsYouTypeInsertOvers(Boolean param0);
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(231)</p>
     */
    @ComProperty(name = "DisplayGridLines", dispId = 0x132)
    Boolean getDisplayGridLines();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(232)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayGridLines", dispId = 0x132)
    void setDisplayGridLines(Boolean param0);
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "MatchFuzzyCase", dispId = 0x135)
    Boolean getMatchFuzzyCase();
            
    /**
     * <p>id(0x135)</p>
     * <p>vtableId(234)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyCase", dispId = 0x135)
    void setMatchFuzzyCase(Boolean param0);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(235)</p>
     */
    @ComProperty(name = "MatchFuzzyByte", dispId = 0x136)
    Boolean getMatchFuzzyByte();
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(236)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyByte", dispId = 0x136)
    void setMatchFuzzyByte(Boolean param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(237)</p>
     */
    @ComProperty(name = "MatchFuzzyHiragana", dispId = 0x137)
    Boolean getMatchFuzzyHiragana();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(238)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyHiragana", dispId = 0x137)
    void setMatchFuzzyHiragana(Boolean param0);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(239)</p>
     */
    @ComProperty(name = "MatchFuzzySmallKana", dispId = 0x138)
    Boolean getMatchFuzzySmallKana();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(240)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzySmallKana", dispId = 0x138)
    void setMatchFuzzySmallKana(Boolean param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(241)</p>
     */
    @ComProperty(name = "MatchFuzzyDash", dispId = 0x139)
    Boolean getMatchFuzzyDash();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(242)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyDash", dispId = 0x139)
    void setMatchFuzzyDash(Boolean param0);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(243)</p>
     */
    @ComProperty(name = "MatchFuzzyIterationMark", dispId = 0x13a)
    Boolean getMatchFuzzyIterationMark();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(244)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyIterationMark", dispId = 0x13a)
    void setMatchFuzzyIterationMark(Boolean param0);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(245)</p>
     */
    @ComProperty(name = "MatchFuzzyKanji", dispId = 0x13b)
    Boolean getMatchFuzzyKanji();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(246)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyKanji", dispId = 0x13b)
    void setMatchFuzzyKanji(Boolean param0);
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(247)</p>
     */
    @ComProperty(name = "MatchFuzzyOldKana", dispId = 0x13c)
    Boolean getMatchFuzzyOldKana();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(248)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyOldKana", dispId = 0x13c)
    void setMatchFuzzyOldKana(Boolean param0);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(249)</p>
     */
    @ComProperty(name = "MatchFuzzyProlongedSoundMark", dispId = 0x13d)
    Boolean getMatchFuzzyProlongedSoundMark();
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(250)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyProlongedSoundMark", dispId = 0x13d)
    void setMatchFuzzyProlongedSoundMark(Boolean param0);
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(251)</p>
     */
    @ComProperty(name = "MatchFuzzyDZ", dispId = 0x13e)
    Boolean getMatchFuzzyDZ();
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(252)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyDZ", dispId = 0x13e)
    void setMatchFuzzyDZ(Boolean param0);
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(253)</p>
     */
    @ComProperty(name = "MatchFuzzyBV", dispId = 0x13f)
    Boolean getMatchFuzzyBV();
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(254)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyBV", dispId = 0x13f)
    void setMatchFuzzyBV(Boolean param0);
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(255)</p>
     */
    @ComProperty(name = "MatchFuzzyTC", dispId = 0x140)
    Boolean getMatchFuzzyTC();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(256)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyTC", dispId = 0x140)
    void setMatchFuzzyTC(Boolean param0);
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(257)</p>
     */
    @ComProperty(name = "MatchFuzzyHF", dispId = 0x141)
    Boolean getMatchFuzzyHF();
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(258)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyHF", dispId = 0x141)
    void setMatchFuzzyHF(Boolean param0);
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(259)</p>
     */
    @ComProperty(name = "MatchFuzzyZJ", dispId = 0x142)
    Boolean getMatchFuzzyZJ();
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(260)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyZJ", dispId = 0x142)
    void setMatchFuzzyZJ(Boolean param0);
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(261)</p>
     */
    @ComProperty(name = "MatchFuzzyAY", dispId = 0x143)
    Boolean getMatchFuzzyAY();
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(262)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyAY", dispId = 0x143)
    void setMatchFuzzyAY(Boolean param0);
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(263)</p>
     */
    @ComProperty(name = "MatchFuzzyKiKu", dispId = 0x144)
    Boolean getMatchFuzzyKiKu();
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(264)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyKiKu", dispId = 0x144)
    void setMatchFuzzyKiKu(Boolean param0);
            
    /**
     * <p>id(0x145)</p>
     * <p>vtableId(265)</p>
     */
    @ComProperty(name = "MatchFuzzyPunctuation", dispId = 0x145)
    Boolean getMatchFuzzyPunctuation();
            
    /**
     * <p>id(0x145)</p>
     * <p>vtableId(266)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzyPunctuation", dispId = 0x145)
    void setMatchFuzzyPunctuation(Boolean param0);
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(267)</p>
     */
    @ComProperty(name = "MatchFuzzySpace", dispId = 0x146)
    Boolean getMatchFuzzySpace();
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(268)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MatchFuzzySpace", dispId = 0x146)
    void setMatchFuzzySpace(Boolean param0);
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(269)</p>
     */
    @ComProperty(name = "ApplyFarEastFontsToAscii", dispId = 0x147)
    Boolean getApplyFarEastFontsToAscii();
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(270)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ApplyFarEastFontsToAscii", dispId = 0x147)
    void setApplyFarEastFontsToAscii(Boolean param0);
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(271)</p>
     */
    @ComProperty(name = "ConvertHighAnsiToFarEast", dispId = 0x148)
    Boolean getConvertHighAnsiToFarEast();
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(272)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ConvertHighAnsiToFarEast", dispId = 0x148)
    void setConvertHighAnsiToFarEast(Boolean param0);
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(273)</p>
     */
    @ComProperty(name = "PrintOddPagesInAscendingOrder", dispId = 0x14a)
    Boolean getPrintOddPagesInAscendingOrder();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(274)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintOddPagesInAscendingOrder", dispId = 0x14a)
    void setPrintOddPagesInAscendingOrder(Boolean param0);
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(275)</p>
     */
    @ComProperty(name = "PrintEvenPagesInAscendingOrder", dispId = 0x14b)
    Boolean getPrintEvenPagesInAscendingOrder();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(276)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintEvenPagesInAscendingOrder", dispId = 0x14b)
    void setPrintEvenPagesInAscendingOrder(Boolean param0);
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(277)</p>
     */
    @ComProperty(name = "DefaultBorderColorIndex", dispId = 0x151)
    WdColorIndex getDefaultBorderColorIndex();
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(278)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "DefaultBorderColorIndex", dispId = 0x151)
    void setDefaultBorderColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(279)</p>
     */
    @ComProperty(name = "EnableMisusedWordsDictionary", dispId = 0x152)
    Boolean getEnableMisusedWordsDictionary();
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(280)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableMisusedWordsDictionary", dispId = 0x152)
    void setEnableMisusedWordsDictionary(Boolean param0);
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(281)</p>
     */
    @ComProperty(name = "AllowCombinedAuxiliaryForms", dispId = 0x153)
    Boolean getAllowCombinedAuxiliaryForms();
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(282)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowCombinedAuxiliaryForms", dispId = 0x153)
    void setAllowCombinedAuxiliaryForms(Boolean param0);
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(283)</p>
     */
    @ComProperty(name = "HangulHanjaFastConversion", dispId = 0x154)
    Boolean getHangulHanjaFastConversion();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(284)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HangulHanjaFastConversion", dispId = 0x154)
    void setHangulHanjaFastConversion(Boolean param0);
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(285)</p>
     */
    @ComProperty(name = "CheckHangulEndings", dispId = 0x155)
    Boolean getCheckHangulEndings();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(286)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckHangulEndings", dispId = 0x155)
    void setCheckHangulEndings(Boolean param0);
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(287)</p>
     */
    @ComProperty(name = "EnableHangulHanjaRecentOrdering", dispId = 0x156)
    Boolean getEnableHangulHanjaRecentOrdering();
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(288)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableHangulHanjaRecentOrdering", dispId = 0x156)
    void setEnableHangulHanjaRecentOrdering(Boolean param0);
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(289)</p>
     */
    @ComProperty(name = "MultipleWordConversionsMode", dispId = 0x157)
    WdMultipleWordConversionsMode getMultipleWordConversionsMode();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(290)</p>
     * @param param0 [in] {@code WdMultipleWordConversionsMode}
     */
    @ComProperty(name = "MultipleWordConversionsMode", dispId = 0x157)
    void setMultipleWordConversionsMode(WdMultipleWordConversionsMode param0);
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(291)</p>
     * @param CommandKeyHelp [in, optional] {@code Object}
     * @param DocNavigationKeys [in, optional] {@code Object}
     * @param MouseSimulation [in, optional] {@code Object}
     * @param DemoGuidance [in, optional] {@code Object}
     * @param DemoSpeed [in, optional] {@code Object}
     * @param HelpType [in, optional] {@code Object}
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
     * <p>vtableId(292)</p>
     */
    @ComProperty(name = "DefaultBorderColor", dispId = 0x158)
    WdColor getDefaultBorderColor();
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(293)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "DefaultBorderColor", dispId = 0x158)
    void setDefaultBorderColor(WdColor param0);
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(294)</p>
     */
    @ComProperty(name = "AllowPixelUnits", dispId = 0x159)
    Boolean getAllowPixelUnits();
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(295)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowPixelUnits", dispId = 0x159)
    void setAllowPixelUnits(Boolean param0);
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(296)</p>
     */
    @ComProperty(name = "UseCharacterUnit", dispId = 0x15a)
    Boolean getUseCharacterUnit();
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(297)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseCharacterUnit", dispId = 0x15a)
    void setUseCharacterUnit(Boolean param0);
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(298)</p>
     */
    @ComProperty(name = "AllowCompoundNounProcessing", dispId = 0x15b)
    Boolean getAllowCompoundNounProcessing();
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(299)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowCompoundNounProcessing", dispId = 0x15b)
    void setAllowCompoundNounProcessing(Boolean param0);
            
    /**
     * <p>id(0x18f)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "AutoKeyboardSwitching", dispId = 0x18f)
    Boolean getAutoKeyboardSwitching();
            
    /**
     * <p>id(0x18f)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoKeyboardSwitching", dispId = 0x18f)
    void setAutoKeyboardSwitching(Boolean param0);
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "DocumentViewDirection", dispId = 0x190)
    WdDocumentViewDirection getDocumentViewDirection();
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code WdDocumentViewDirection}
     */
    @ComProperty(name = "DocumentViewDirection", dispId = 0x190)
    void setDocumentViewDirection(WdDocumentViewDirection param0);
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(304)</p>
     */
    @ComProperty(name = "ArabicNumeral", dispId = 0x191)
    WdArabicNumeral getArabicNumeral();
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(305)</p>
     * @param param0 [in] {@code WdArabicNumeral}
     */
    @ComProperty(name = "ArabicNumeral", dispId = 0x191)
    void setArabicNumeral(WdArabicNumeral param0);
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(306)</p>
     */
    @ComProperty(name = "MonthNames", dispId = 0x192)
    WdMonthNames getMonthNames();
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(307)</p>
     * @param param0 [in] {@code WdMonthNames}
     */
    @ComProperty(name = "MonthNames", dispId = 0x192)
    void setMonthNames(WdMonthNames param0);
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(308)</p>
     */
    @ComProperty(name = "CursorMovement", dispId = 0x193)
    WdCursorMovement getCursorMovement();
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(309)</p>
     * @param param0 [in] {@code WdCursorMovement}
     */
    @ComProperty(name = "CursorMovement", dispId = 0x193)
    void setCursorMovement(WdCursorMovement param0);
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(310)</p>
     */
    @ComProperty(name = "VisualSelection", dispId = 0x194)
    WdVisualSelection getVisualSelection();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(311)</p>
     * @param param0 [in] {@code WdVisualSelection}
     */
    @ComProperty(name = "VisualSelection", dispId = 0x194)
    void setVisualSelection(WdVisualSelection param0);
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "ShowDiacritics", dispId = 0x195)
    Boolean getShowDiacritics();
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(313)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDiacritics", dispId = 0x195)
    void setShowDiacritics(Boolean param0);
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(314)</p>
     */
    @ComProperty(name = "ShowControlCharacters", dispId = 0x196)
    Boolean getShowControlCharacters();
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(315)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowControlCharacters", dispId = 0x196)
    void setShowControlCharacters(Boolean param0);
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "AddControlCharacters", dispId = 0x197)
    Boolean getAddControlCharacters();
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(317)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddControlCharacters", dispId = 0x197)
    void setAddControlCharacters(Boolean param0);
            
    /**
     * <p>id(0x198)</p>
     * <p>vtableId(318)</p>
     */
    @ComProperty(name = "AddBiDirectionalMarksWhenSavingTextFile", dispId = 0x198)
    Boolean getAddBiDirectionalMarksWhenSavingTextFile();
            
    /**
     * <p>id(0x198)</p>
     * <p>vtableId(319)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddBiDirectionalMarksWhenSavingTextFile", dispId = 0x198)
    void setAddBiDirectionalMarksWhenSavingTextFile(Boolean param0);
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(320)</p>
     */
    @ComProperty(name = "StrictInitialAlefHamza", dispId = 0x199)
    Boolean getStrictInitialAlefHamza();
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(321)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StrictInitialAlefHamza", dispId = 0x199)
    void setStrictInitialAlefHamza(Boolean param0);
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(322)</p>
     */
    @ComProperty(name = "StrictFinalYaa", dispId = 0x19a)
    Boolean getStrictFinalYaa();
            
    /**
     * <p>id(0x19a)</p>
     * <p>vtableId(323)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StrictFinalYaa", dispId = 0x19a)
    void setStrictFinalYaa(Boolean param0);
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "HebrewMode", dispId = 0x19b)
    WdHebSpellStart getHebrewMode();
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(325)</p>
     * @param param0 [in] {@code WdHebSpellStart}
     */
    @ComProperty(name = "HebrewMode", dispId = 0x19b)
    void setHebrewMode(WdHebSpellStart param0);
            
    /**
     * <p>id(0x19c)</p>
     * <p>vtableId(326)</p>
     */
    @ComProperty(name = "ArabicMode", dispId = 0x19c)
    WdAraSpeller getArabicMode();
            
    /**
     * <p>id(0x19c)</p>
     * <p>vtableId(327)</p>
     * @param param0 [in] {@code WdAraSpeller}
     */
    @ComProperty(name = "ArabicMode", dispId = 0x19c)
    void setArabicMode(WdAraSpeller param0);
            
    /**
     * <p>id(0x19d)</p>
     * <p>vtableId(328)</p>
     */
    @ComProperty(name = "AllowClickAndTypeMouse", dispId = 0x19d)
    Boolean getAllowClickAndTypeMouse();
            
    /**
     * <p>id(0x19d)</p>
     * <p>vtableId(329)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowClickAndTypeMouse", dispId = 0x19d)
    void setAllowClickAndTypeMouse(Boolean param0);
            
    /**
     * <p>id(0x19f)</p>
     * <p>vtableId(330)</p>
     */
    @ComProperty(name = "UseGermanSpellingReform", dispId = 0x19f)
    Boolean getUseGermanSpellingReform();
            
    /**
     * <p>id(0x19f)</p>
     * <p>vtableId(331)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseGermanSpellingReform", dispId = 0x19f)
    void setUseGermanSpellingReform(Boolean param0);
            
    /**
     * <p>id(0x1a2)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "InterpretHighAnsi", dispId = 0x1a2)
    WdHighAnsiText getInterpretHighAnsi();
            
    /**
     * <p>id(0x1a2)</p>
     * <p>vtableId(333)</p>
     * @param param0 [in] {@code WdHighAnsiText}
     */
    @ComProperty(name = "InterpretHighAnsi", dispId = 0x1a2)
    void setInterpretHighAnsi(WdHighAnsiText param0);
            
    /**
     * <p>id(0x1a3)</p>
     * <p>vtableId(334)</p>
     */
    @ComProperty(name = "AddHebDoubleQuote", dispId = 0x1a3)
    Boolean getAddHebDoubleQuote();
            
    /**
     * <p>id(0x1a3)</p>
     * <p>vtableId(335)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AddHebDoubleQuote", dispId = 0x1a3)
    void setAddHebDoubleQuote(Boolean param0);
            
    /**
     * <p>id(0x1a4)</p>
     * <p>vtableId(336)</p>
     */
    @ComProperty(name = "UseDiffDiacColor", dispId = 0x1a4)
    Boolean getUseDiffDiacColor();
            
    /**
     * <p>id(0x1a4)</p>
     * <p>vtableId(337)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseDiffDiacColor", dispId = 0x1a4)
    void setUseDiffDiacColor(Boolean param0);
            
    /**
     * <p>id(0x1a5)</p>
     * <p>vtableId(338)</p>
     */
    @ComProperty(name = "DiacriticColorVal", dispId = 0x1a5)
    WdColor getDiacriticColorVal();
            
    /**
     * <p>id(0x1a5)</p>
     * <p>vtableId(339)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "DiacriticColorVal", dispId = 0x1a5)
    void setDiacriticColorVal(WdColor param0);
            
    /**
     * <p>id(0x1a7)</p>
     * <p>vtableId(340)</p>
     */
    @ComProperty(name = "OptimizeForWord97byDefault", dispId = 0x1a7)
    Boolean getOptimizeForWord97byDefault();
            
    /**
     * <p>id(0x1a7)</p>
     * <p>vtableId(341)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OptimizeForWord97byDefault", dispId = 0x1a7)
    void setOptimizeForWord97byDefault(Boolean param0);
            
    /**
     * <p>id(0x1a8)</p>
     * <p>vtableId(342)</p>
     */
    @ComProperty(name = "LocalNetworkFile", dispId = 0x1a8)
    Boolean getLocalNetworkFile();
            
    /**
     * <p>id(0x1a8)</p>
     * <p>vtableId(343)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LocalNetworkFile", dispId = 0x1a8)
    void setLocalNetworkFile(Boolean param0);
            
    /**
     * <p>id(0x1a9)</p>
     * <p>vtableId(344)</p>
     */
    @ComProperty(name = "TypeNReplace", dispId = 0x1a9)
    Boolean getTypeNReplace();
            
    /**
     * <p>id(0x1a9)</p>
     * <p>vtableId(345)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TypeNReplace", dispId = 0x1a9)
    void setTypeNReplace(Boolean param0);
            
    /**
     * <p>id(0x1aa)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "SequenceCheck", dispId = 0x1aa)
    Boolean getSequenceCheck();
            
    /**
     * <p>id(0x1aa)</p>
     * <p>vtableId(347)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SequenceCheck", dispId = 0x1aa)
    void setSequenceCheck(Boolean param0);
            
    /**
     * <p>id(0x1ab)</p>
     * <p>vtableId(348)</p>
     */
    @ComProperty(name = "BackgroundOpen", dispId = 0x1ab)
    Boolean getBackgroundOpen();
            
    /**
     * <p>id(0x1ab)</p>
     * <p>vtableId(349)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundOpen", dispId = 0x1ab)
    void setBackgroundOpen(Boolean param0);
            
    /**
     * <p>id(0x1ac)</p>
     * <p>vtableId(350)</p>
     */
    @ComProperty(name = "DisableFeaturesbyDefault", dispId = 0x1ac)
    Boolean getDisableFeaturesbyDefault();
            
    /**
     * <p>id(0x1ac)</p>
     * <p>vtableId(351)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisableFeaturesbyDefault", dispId = 0x1ac)
    void setDisableFeaturesbyDefault(Boolean param0);
            
    /**
     * <p>id(0x1ad)</p>
     * <p>vtableId(352)</p>
     */
    @ComProperty(name = "PasteAdjustWordSpacing", dispId = 0x1ad)
    Boolean getPasteAdjustWordSpacing();
            
    /**
     * <p>id(0x1ad)</p>
     * <p>vtableId(353)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteAdjustWordSpacing", dispId = 0x1ad)
    void setPasteAdjustWordSpacing(Boolean param0);
            
    /**
     * <p>id(0x1ae)</p>
     * <p>vtableId(354)</p>
     */
    @ComProperty(name = "PasteAdjustParagraphSpacing", dispId = 0x1ae)
    Boolean getPasteAdjustParagraphSpacing();
            
    /**
     * <p>id(0x1ae)</p>
     * <p>vtableId(355)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteAdjustParagraphSpacing", dispId = 0x1ae)
    void setPasteAdjustParagraphSpacing(Boolean param0);
            
    /**
     * <p>id(0x1af)</p>
     * <p>vtableId(356)</p>
     */
    @ComProperty(name = "PasteAdjustTableFormatting", dispId = 0x1af)
    Boolean getPasteAdjustTableFormatting();
            
    /**
     * <p>id(0x1af)</p>
     * <p>vtableId(357)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteAdjustTableFormatting", dispId = 0x1af)
    void setPasteAdjustTableFormatting(Boolean param0);
            
    /**
     * <p>id(0x1b0)</p>
     * <p>vtableId(358)</p>
     */
    @ComProperty(name = "PasteSmartStyleBehavior", dispId = 0x1b0)
    Boolean getPasteSmartStyleBehavior();
            
    /**
     * <p>id(0x1b0)</p>
     * <p>vtableId(359)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteSmartStyleBehavior", dispId = 0x1b0)
    void setPasteSmartStyleBehavior(Boolean param0);
            
    /**
     * <p>id(0x1b1)</p>
     * <p>vtableId(360)</p>
     */
    @ComProperty(name = "PasteMergeFromPPT", dispId = 0x1b1)
    Boolean getPasteMergeFromPPT();
            
    /**
     * <p>id(0x1b1)</p>
     * <p>vtableId(361)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteMergeFromPPT", dispId = 0x1b1)
    void setPasteMergeFromPPT(Boolean param0);
            
    /**
     * <p>id(0x1b2)</p>
     * <p>vtableId(362)</p>
     */
    @ComProperty(name = "PasteMergeFromXL", dispId = 0x1b2)
    Boolean getPasteMergeFromXL();
            
    /**
     * <p>id(0x1b2)</p>
     * <p>vtableId(363)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteMergeFromXL", dispId = 0x1b2)
    void setPasteMergeFromXL(Boolean param0);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(364)</p>
     */
    @ComProperty(name = "CtrlClickHyperlinkToOpen", dispId = 0x1b3)
    Boolean getCtrlClickHyperlinkToOpen();
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(365)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CtrlClickHyperlinkToOpen", dispId = 0x1b3)
    void setCtrlClickHyperlinkToOpen(Boolean param0);
            
    /**
     * <p>id(0x1b4)</p>
     * <p>vtableId(366)</p>
     */
    @ComProperty(name = "PictureWrapType", dispId = 0x1b4)
    WdWrapTypeMerged getPictureWrapType();
            
    /**
     * <p>id(0x1b4)</p>
     * <p>vtableId(367)</p>
     * @param param0 [in] {@code WdWrapTypeMerged}
     */
    @ComProperty(name = "PictureWrapType", dispId = 0x1b4)
    void setPictureWrapType(WdWrapTypeMerged param0);
            
    /**
     * <p>id(0x1b5)</p>
     * <p>vtableId(368)</p>
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfterbyDefault", dispId = 0x1b5)
    WdDisableFeaturesIntroducedAfter getDisableFeaturesIntroducedAfterbyDefault();
            
    /**
     * <p>id(0x1b5)</p>
     * <p>vtableId(369)</p>
     * @param param0 [in] {@code WdDisableFeaturesIntroducedAfter}
     */
    @ComProperty(name = "DisableFeaturesIntroducedAfterbyDefault", dispId = 0x1b5)
    void setDisableFeaturesIntroducedAfterbyDefault(WdDisableFeaturesIntroducedAfter param0);
            
    /**
     * <p>id(0x1b6)</p>
     * <p>vtableId(370)</p>
     */
    @ComProperty(name = "PasteSmartCutPaste", dispId = 0x1b6)
    Boolean getPasteSmartCutPaste();
            
    /**
     * <p>id(0x1b6)</p>
     * <p>vtableId(371)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteSmartCutPaste", dispId = 0x1b6)
    void setPasteSmartCutPaste(Boolean param0);
            
    /**
     * <p>id(0x1b7)</p>
     * <p>vtableId(372)</p>
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x1b7)
    Boolean getDisplayPasteOptions();
            
    /**
     * <p>id(0x1b7)</p>
     * <p>vtableId(373)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x1b7)
    void setDisplayPasteOptions(Boolean param0);
            
    /**
     * <p>id(0x1b9)</p>
     * <p>vtableId(374)</p>
     */
    @ComProperty(name = "PromptUpdateStyle", dispId = 0x1b9)
    Boolean getPromptUpdateStyle();
            
    /**
     * <p>id(0x1b9)</p>
     * <p>vtableId(375)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PromptUpdateStyle", dispId = 0x1b9)
    void setPromptUpdateStyle(Boolean param0);
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(376)</p>
     */
    @ComProperty(name = "DefaultEPostageApp", dispId = 0x1ba)
    String getDefaultEPostageApp();
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(377)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultEPostageApp", dispId = 0x1ba)
    void setDefaultEPostageApp(String param0);
            
    /**
     * <p>id(0x1bb)</p>
     * <p>vtableId(378)</p>
     */
    @ComProperty(name = "DefaultTextEncoding", dispId = 0x1bb)
    eu.doppel_helix.jna.tlb.office2.MsoEncoding getDefaultTextEncoding();
            
    /**
     * <p>id(0x1bb)</p>
     * <p>vtableId(379)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComProperty(name = "DefaultTextEncoding", dispId = 0x1bb)
    void setDefaultTextEncoding(eu.doppel_helix.jna.tlb.office2.MsoEncoding param0);
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(380)</p>
     */
    @ComProperty(name = "LabelSmartTags", dispId = 0x1bc)
    Boolean getLabelSmartTags();
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(381)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LabelSmartTags", dispId = 0x1bc)
    void setLabelSmartTags(Boolean param0);
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(382)</p>
     */
    @ComProperty(name = "DisplaySmartTagButtons", dispId = 0x1bd)
    Boolean getDisplaySmartTagButtons();
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(383)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplaySmartTagButtons", dispId = 0x1bd)
    void setDisplaySmartTagButtons(Boolean param0);
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(384)</p>
     */
    @ComProperty(name = "WarnBeforeSavingPrintingSendingMarkup", dispId = 0x1be)
    Boolean getWarnBeforeSavingPrintingSendingMarkup();
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(385)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WarnBeforeSavingPrintingSendingMarkup", dispId = 0x1be)
    void setWarnBeforeSavingPrintingSendingMarkup(Boolean param0);
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(386)</p>
     */
    @ComProperty(name = "StoreRSIDOnSave", dispId = 0x1bf)
    Boolean getStoreRSIDOnSave();
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(387)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StoreRSIDOnSave", dispId = 0x1bf)
    void setStoreRSIDOnSave(Boolean param0);
            
    /**
     * <p>id(0x1c0)</p>
     * <p>vtableId(388)</p>
     */
    @ComProperty(name = "ShowFormatError", dispId = 0x1c0)
    Boolean getShowFormatError();
            
    /**
     * <p>id(0x1c0)</p>
     * <p>vtableId(389)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowFormatError", dispId = 0x1c0)
    void setShowFormatError(Boolean param0);
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(390)</p>
     */
    @ComProperty(name = "FormatScanning", dispId = 0x1c1)
    Boolean getFormatScanning();
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(391)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FormatScanning", dispId = 0x1c1)
    void setFormatScanning(Boolean param0);
            
    /**
     * <p>id(0x1c2)</p>
     * <p>vtableId(392)</p>
     */
    @ComProperty(name = "PasteMergeLists", dispId = 0x1c2)
    Boolean getPasteMergeLists();
            
    /**
     * <p>id(0x1c2)</p>
     * <p>vtableId(393)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteMergeLists", dispId = 0x1c2)
    void setPasteMergeLists(Boolean param0);
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(394)</p>
     */
    @ComProperty(name = "AutoCreateNewDrawings", dispId = 0x1c3)
    Boolean getAutoCreateNewDrawings();
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(395)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoCreateNewDrawings", dispId = 0x1c3)
    void setAutoCreateNewDrawings(Boolean param0);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(396)</p>
     */
    @ComProperty(name = "SmartParaSelection", dispId = 0x1c4)
    Boolean getSmartParaSelection();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(397)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmartParaSelection", dispId = 0x1c4)
    void setSmartParaSelection(Boolean param0);
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(398)</p>
     */
    @ComProperty(name = "RevisionsBalloonPrintOrientation", dispId = 0x1c5)
    WdRevisionsBalloonPrintOrientation getRevisionsBalloonPrintOrientation();
            
    /**
     * <p>id(0x1c5)</p>
     * <p>vtableId(399)</p>
     * @param param0 [in] {@code WdRevisionsBalloonPrintOrientation}
     */
    @ComProperty(name = "RevisionsBalloonPrintOrientation", dispId = 0x1c5)
    void setRevisionsBalloonPrintOrientation(WdRevisionsBalloonPrintOrientation param0);
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(400)</p>
     */
    @ComProperty(name = "CommentsColor", dispId = 0x1c6)
    WdColorIndex getCommentsColor();
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(401)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "CommentsColor", dispId = 0x1c6)
    void setCommentsColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(402)</p>
     */
    @ComProperty(name = "PrintXMLTag", dispId = 0x1c7)
    Boolean getPrintXMLTag();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(403)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintXMLTag", dispId = 0x1c7)
    void setPrintXMLTag(Boolean param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(404)</p>
     */
    @ComProperty(name = "PrintBackgrounds", dispId = 0x1c8)
    Boolean getPrintBackgrounds();
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(405)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintBackgrounds", dispId = 0x1c8)
    void setPrintBackgrounds(Boolean param0);
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(406)</p>
     */
    @ComProperty(name = "AllowReadingMode", dispId = 0x1c9)
    Boolean getAllowReadingMode();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(407)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowReadingMode", dispId = 0x1c9)
    void setAllowReadingMode(Boolean param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(408)</p>
     */
    @ComProperty(name = "ShowMarkupOpenSave", dispId = 0x1ca)
    Boolean getShowMarkupOpenSave();
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(409)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowMarkupOpenSave", dispId = 0x1ca)
    void setShowMarkupOpenSave(Boolean param0);
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(410)</p>
     */
    @ComProperty(name = "SmartCursoring", dispId = 0x1cb)
    Boolean getSmartCursoring();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(411)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SmartCursoring", dispId = 0x1cb)
    void setSmartCursoring(Boolean param0);
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(412)</p>
     */
    @ComProperty(name = "MoveToTextMark", dispId = 0x1cc)
    WdMoveToTextMark getMoveToTextMark();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(413)</p>
     * @param param0 [in] {@code WdMoveToTextMark}
     */
    @ComProperty(name = "MoveToTextMark", dispId = 0x1cc)
    void setMoveToTextMark(WdMoveToTextMark param0);
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(414)</p>
     */
    @ComProperty(name = "MoveFromTextMark", dispId = 0x1cd)
    WdMoveFromTextMark getMoveFromTextMark();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(415)</p>
     * @param param0 [in] {@code WdMoveFromTextMark}
     */
    @ComProperty(name = "MoveFromTextMark", dispId = 0x1cd)
    void setMoveFromTextMark(WdMoveFromTextMark param0);
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(416)</p>
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x1ce)
    String getBibliographyStyle();
            
    /**
     * <p>id(0x1ce)</p>
     * <p>vtableId(417)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x1ce)
    void setBibliographyStyle(String param0);
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(418)</p>
     */
    @ComProperty(name = "BibliographySort", dispId = 0x1cf)
    String getBibliographySort();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(419)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BibliographySort", dispId = 0x1cf)
    void setBibliographySort(String param0);
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(420)</p>
     */
    @ComProperty(name = "InsertedCellColor", dispId = 0x1d0)
    WdCellColor getInsertedCellColor();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(421)</p>
     * @param param0 [in] {@code WdCellColor}
     */
    @ComProperty(name = "InsertedCellColor", dispId = 0x1d0)
    void setInsertedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(422)</p>
     */
    @ComProperty(name = "DeletedCellColor", dispId = 0x1d1)
    WdCellColor getDeletedCellColor();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(423)</p>
     * @param param0 [in] {@code WdCellColor}
     */
    @ComProperty(name = "DeletedCellColor", dispId = 0x1d1)
    void setDeletedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(424)</p>
     */
    @ComProperty(name = "MergedCellColor", dispId = 0x1d2)
    WdCellColor getMergedCellColor();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(425)</p>
     * @param param0 [in] {@code WdCellColor}
     */
    @ComProperty(name = "MergedCellColor", dispId = 0x1d2)
    void setMergedCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d3)</p>
     * <p>vtableId(426)</p>
     */
    @ComProperty(name = "SplitCellColor", dispId = 0x1d3)
    WdCellColor getSplitCellColor();
            
    /**
     * <p>id(0x1d3)</p>
     * <p>vtableId(427)</p>
     * @param param0 [in] {@code WdCellColor}
     */
    @ComProperty(name = "SplitCellColor", dispId = 0x1d3)
    void setSplitCellColor(WdCellColor param0);
            
    /**
     * <p>id(0x1d4)</p>
     * <p>vtableId(428)</p>
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x1d4)
    Boolean getShowSelectionFloaties();
            
    /**
     * <p>id(0x1d4)</p>
     * <p>vtableId(429)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x1d4)
    void setShowSelectionFloaties(Boolean param0);
            
    /**
     * <p>id(0x1d5)</p>
     * <p>vtableId(430)</p>
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x1d5)
    Boolean getShowMenuFloaties();
            
    /**
     * <p>id(0x1d5)</p>
     * <p>vtableId(431)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x1d5)
    void setShowMenuFloaties(Boolean param0);
            
    /**
     * <p>id(0x1d6)</p>
     * <p>vtableId(432)</p>
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x1d6)
    Boolean getShowDevTools();
            
    /**
     * <p>id(0x1d6)</p>
     * <p>vtableId(433)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x1d6)
    void setShowDevTools(Boolean param0);
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(434)</p>
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x1d8)
    Boolean getEnableLivePreview();
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(435)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x1d8)
    void setEnableLivePreview(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(436)</p>
     */
    @ComProperty(name = "OMathAutoBuildUp", dispId = 0x1da)
    Boolean getOMathAutoBuildUp();
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(437)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OMathAutoBuildUp", dispId = 0x1da)
    void setOMathAutoBuildUp(Boolean param0);
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(438)</p>
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x1dc)
    Boolean getAlwaysUseClearType();
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(439)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x1dc)
    void setAlwaysUseClearType(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(440)</p>
     */
    @ComProperty(name = "PasteFormatWithinDocument", dispId = 0x1dd)
    WdPasteOptions getPasteFormatWithinDocument();
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(441)</p>
     * @param param0 [in] {@code WdPasteOptions}
     */
    @ComProperty(name = "PasteFormatWithinDocument", dispId = 0x1dd)
    void setPasteFormatWithinDocument(WdPasteOptions param0);
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(442)</p>
     */
    @ComProperty(name = "PasteFormatBetweenDocuments", dispId = 0x1de)
    WdPasteOptions getPasteFormatBetweenDocuments();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(443)</p>
     * @param param0 [in] {@code WdPasteOptions}
     */
    @ComProperty(name = "PasteFormatBetweenDocuments", dispId = 0x1de)
    void setPasteFormatBetweenDocuments(WdPasteOptions param0);
            
    /**
     * <p>id(0x1df)</p>
     * <p>vtableId(444)</p>
     */
    @ComProperty(name = "PasteFormatBetweenStyledDocuments", dispId = 0x1df)
    WdPasteOptions getPasteFormatBetweenStyledDocuments();
            
    /**
     * <p>id(0x1df)</p>
     * <p>vtableId(445)</p>
     * @param param0 [in] {@code WdPasteOptions}
     */
    @ComProperty(name = "PasteFormatBetweenStyledDocuments", dispId = 0x1df)
    void setPasteFormatBetweenStyledDocuments(WdPasteOptions param0);
            
    /**
     * <p>id(0x1e0)</p>
     * <p>vtableId(446)</p>
     */
    @ComProperty(name = "PasteFormatFromExternalSource", dispId = 0x1e0)
    WdPasteOptions getPasteFormatFromExternalSource();
            
    /**
     * <p>id(0x1e0)</p>
     * <p>vtableId(447)</p>
     * @param param0 [in] {@code WdPasteOptions}
     */
    @ComProperty(name = "PasteFormatFromExternalSource", dispId = 0x1e0)
    void setPasteFormatFromExternalSource(WdPasteOptions param0);
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(448)</p>
     */
    @ComProperty(name = "PasteOptionKeepBulletsAndNumbers", dispId = 0x1e1)
    Boolean getPasteOptionKeepBulletsAndNumbers();
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(449)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PasteOptionKeepBulletsAndNumbers", dispId = 0x1e1)
    void setPasteOptionKeepBulletsAndNumbers(Boolean param0);
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(450)</p>
     */
    @ComProperty(name = "INSKeyForOvertype", dispId = 0x1e2)
    Boolean getINSKeyForOvertype();
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(451)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "INSKeyForOvertype", dispId = 0x1e2)
    void setINSKeyForOvertype(Boolean param0);
            
    /**
     * <p>id(0x1e3)</p>
     * <p>vtableId(452)</p>
     */
    @ComProperty(name = "RepeatWord", dispId = 0x1e3)
    Boolean getRepeatWord();
            
    /**
     * <p>id(0x1e3)</p>
     * <p>vtableId(453)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RepeatWord", dispId = 0x1e3)
    void setRepeatWord(Boolean param0);
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(454)</p>
     */
    @ComProperty(name = "FrenchReform", dispId = 0x1e4)
    WdFrenchSpeller getFrenchReform();
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(455)</p>
     * @param param0 [in] {@code WdFrenchSpeller}
     */
    @ComProperty(name = "FrenchReform", dispId = 0x1e4)
    void setFrenchReform(WdFrenchSpeller param0);
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(456)</p>
     */
    @ComProperty(name = "ContextualSpeller", dispId = 0x1e5)
    Boolean getContextualSpeller();
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(457)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ContextualSpeller", dispId = 0x1e5)
    void setContextualSpeller(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(458)</p>
     */
    @ComProperty(name = "MoveToTextColor", dispId = 0x1e6)
    WdColorIndex getMoveToTextColor();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(459)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "MoveToTextColor", dispId = 0x1e6)
    void setMoveToTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(460)</p>
     */
    @ComProperty(name = "MoveFromTextColor", dispId = 0x1e7)
    WdColorIndex getMoveFromTextColor();
            
    /**
     * <p>id(0x1e7)</p>
     * <p>vtableId(461)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "MoveFromTextColor", dispId = 0x1e7)
    void setMoveFromTextColor(WdColorIndex param0);
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(462)</p>
     */
    @ComProperty(name = "OMathCopyLF", dispId = 0x1e8)
    Boolean getOMathCopyLF();
            
    /**
     * <p>id(0x1e8)</p>
     * <p>vtableId(463)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OMathCopyLF", dispId = 0x1e8)
    void setOMathCopyLF(Boolean param0);
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(464)</p>
     */
    @ComProperty(name = "UseNormalStyleForList", dispId = 0x1e9)
    Boolean getUseNormalStyleForList();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(465)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseNormalStyleForList", dispId = 0x1e9)
    void setUseNormalStyleForList(Boolean param0);
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(466)</p>
     */
    @ComProperty(name = "AllowOpenInDraftView", dispId = 0x1ea)
    Boolean getAllowOpenInDraftView();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(467)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowOpenInDraftView", dispId = 0x1ea)
    void setAllowOpenInDraftView(Boolean param0);
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(468)</p>
     */
    @ComProperty(name = "EnableLegacyIMEMode", dispId = 0x1ec)
    Boolean getEnableLegacyIMEMode();
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(469)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableLegacyIMEMode", dispId = 0x1ec)
    void setEnableLegacyIMEMode(Boolean param0);
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(470)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x1ed)
    Boolean getDoNotPromptForConvert();
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(471)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x1ed)
    void setDoNotPromptForConvert(Boolean param0);
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(472)</p>
     */
    @ComProperty(name = "PrecisePositioning", dispId = 0x1ee)
    Boolean getPrecisePositioning();
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(473)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrecisePositioning", dispId = 0x1ee)
    void setPrecisePositioning(Boolean param0);
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(474)</p>
     */
    @ComProperty(name = "UpdateStyleListBehavior", dispId = 0x1ef)
    WdUpdateStyleListBehavior getUpdateStyleListBehavior();
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(475)</p>
     * @param param0 [in] {@code WdUpdateStyleListBehavior}
     */
    @ComProperty(name = "UpdateStyleListBehavior", dispId = 0x1ef)
    void setUpdateStyleListBehavior(WdUpdateStyleListBehavior param0);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(476)</p>
     */
    @ComProperty(name = "StrictTaaMarboota", dispId = 0x1f0)
    Boolean getStrictTaaMarboota();
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(477)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StrictTaaMarboota", dispId = 0x1f0)
    void setStrictTaaMarboota(Boolean param0);
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(478)</p>
     */
    @ComProperty(name = "StrictRussianE", dispId = 0x1f1)
    Boolean getStrictRussianE();
            
    /**
     * <p>id(0x1f1)</p>
     * <p>vtableId(479)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StrictRussianE", dispId = 0x1f1)
    void setStrictRussianE(Boolean param0);
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(480)</p>
     */
    @ComProperty(name = "SpanishMode", dispId = 0x1f2)
    WdSpanishSpeller getSpanishMode();
            
    /**
     * <p>id(0x1f2)</p>
     * <p>vtableId(481)</p>
     * @param param0 [in] {@code WdSpanishSpeller}
     */
    @ComProperty(name = "SpanishMode", dispId = 0x1f2)
    void setSpanishMode(WdSpanishSpeller param0);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(482)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0x1f5)
    WdPortugueseReform getPortugalReform();
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(483)</p>
     * @param param0 [in] {@code WdPortugueseReform}
     */
    @ComProperty(name = "PortugalReform", dispId = 0x1f5)
    void setPortugalReform(WdPortugueseReform param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(484)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0x1f6)
    WdPortugueseReform getBrazilReform();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(485)</p>
     * @param param0 [in] {@code WdPortugueseReform}
     */
    @ComProperty(name = "BrazilReform", dispId = 0x1f6)
    void setBrazilReform(WdPortugueseReform param0);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(486)</p>
     */
    @ComProperty(name = "UpdateFieldsWithTrackedChangesAtPrint", dispId = 0x1f7)
    Boolean getUpdateFieldsWithTrackedChangesAtPrint();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(487)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateFieldsWithTrackedChangesAtPrint", dispId = 0x1f7)
    void setUpdateFieldsWithTrackedChangesAtPrint(Boolean param0);
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(488)</p>
     */
    @ComProperty(name = "DisplayAlignmentGuides", dispId = 0x1f8)
    Boolean getDisplayAlignmentGuides();
            
    /**
     * <p>id(0x1f8)</p>
     * <p>vtableId(489)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAlignmentGuides", dispId = 0x1f8)
    void setDisplayAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(490)</p>
     */
    @ComProperty(name = "PageAlignmentGuides", dispId = 0x1f9)
    Boolean getPageAlignmentGuides();
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(491)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PageAlignmentGuides", dispId = 0x1f9)
    void setPageAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(492)</p>
     */
    @ComProperty(name = "MarginAlignmentGuides", dispId = 0x1fa)
    Boolean getMarginAlignmentGuides();
            
    /**
     * <p>id(0x1fa)</p>
     * <p>vtableId(493)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MarginAlignmentGuides", dispId = 0x1fa)
    void setMarginAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fb)</p>
     * <p>vtableId(494)</p>
     */
    @ComProperty(name = "ParagraphAlignmentGuides", dispId = 0x1fb)
    Boolean getParagraphAlignmentGuides();
            
    /**
     * <p>id(0x1fb)</p>
     * <p>vtableId(495)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ParagraphAlignmentGuides", dispId = 0x1fb)
    void setParagraphAlignmentGuides(Boolean param0);
            
    /**
     * <p>id(0x1fc)</p>
     * <p>vtableId(496)</p>
     */
    @ComProperty(name = "EnableLiveDrag", dispId = 0x1fc)
    Boolean getEnableLiveDrag();
            
    /**
     * <p>id(0x1fc)</p>
     * <p>vtableId(497)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableLiveDrag", dispId = 0x1fc)
    void setEnableLiveDrag(Boolean param0);
            
    /**
     * <p>id(0x1fd)</p>
     * <p>vtableId(498)</p>
     */
    @ComProperty(name = "UseSubPixelPositioning", dispId = 0x1fd)
    Boolean getUseSubPixelPositioning();
            
    /**
     * <p>id(0x1fd)</p>
     * <p>vtableId(499)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseSubPixelPositioning", dispId = 0x1fd)
    void setUseSubPixelPositioning(Boolean param0);
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(500)</p>
     */
    @ComProperty(name = "AlertIfNotDefault", dispId = 0x1fe)
    Boolean getAlertIfNotDefault();
            
    /**
     * <p>id(0x1fe)</p>
     * <p>vtableId(501)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlertIfNotDefault", dispId = 0x1fe)
    void setAlertIfNotDefault(Boolean param0);
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(502)</p>
     */
    @ComProperty(name = "EnableProofingToolsAdvertisement", dispId = 0x1ff)
    Boolean getEnableProofingToolsAdvertisement();
            
    /**
     * <p>id(0x1ff)</p>
     * <p>vtableId(503)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableProofingToolsAdvertisement", dispId = 0x1ff)
    void setEnableProofingToolsAdvertisement(Boolean param0);
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(504)</p>
     */
    @ComProperty(name = "PreferCloudSaveLocations", dispId = 0x200)
    Boolean getPreferCloudSaveLocations();
            
    /**
     * <p>id(0x200)</p>
     * <p>vtableId(505)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PreferCloudSaveLocations", dispId = 0x200)
    void setPreferCloudSaveLocations(Boolean param0);
            
    /**
     * <p>id(0x201)</p>
     * <p>vtableId(506)</p>
     */
    @ComProperty(name = "SkyDriveSignInOption", dispId = 0x201)
    Boolean getSkyDriveSignInOption();
            
    /**
     * <p>id(0x201)</p>
     * <p>vtableId(507)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SkyDriveSignInOption", dispId = 0x201)
    void setSkyDriveSignInOption(Boolean param0);
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(508)</p>
     */
    @ComProperty(name = "ExpandHeadingsOnOpen", dispId = 0x202)
    Boolean getExpandHeadingsOnOpen();
            
    /**
     * <p>id(0x202)</p>
     * <p>vtableId(509)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ExpandHeadingsOnOpen", dispId = 0x202)
    void setExpandHeadingsOnOpen(Boolean param0);
            
    /**
     * <p>id(0x203)</p>
     * <p>vtableId(510)</p>
     */
    @ComProperty(name = "UseLocalUserInfo", dispId = 0x203)
    Boolean getUseLocalUserInfo();
            
    /**
     * <p>id(0x203)</p>
     * <p>vtableId(511)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseLocalUserInfo", dispId = 0x203)
    void setUseLocalUserInfo(Boolean param0);
            
    
}