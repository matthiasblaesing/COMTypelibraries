
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D3-0000-0000-C000-000000000046}")
public interface TextConnection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0xc2e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    Boolean getTextFileHeaderRow();
            
    /**
     * <p>id(0xc2e)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    void setTextFileHeaderRow(Boolean param0);
            
    /**
     * <p>id(0x749)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    Object getTextFileColumnDataTypes();
            
    /**
     * <p>id(0x749)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    void setTextFileColumnDataTypes(Object param0);
            
    /**
     * <p>id(0x746)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    Boolean getTextFileCommaDelimiter();
            
    /**
     * <p>id(0x746)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    void setTextFileCommaDelimiter(Boolean param0);
            
    /**
     * <p>id(0x743)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    Boolean getTextFileConsecutiveDelimiter();
            
    /**
     * <p>id(0x743)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    void setTextFileConsecutiveDelimiter(Boolean param0);
            
    /**
     * <p>id(0x74e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    String getTextFileDecimalSeparator();
            
    /**
     * <p>id(0x74e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    void setTextFileDecimalSeparator(String param0);
            
    /**
     * <p>id(0x74a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    Object getTextFileFixedColumnWidths();
            
    /**
     * <p>id(0x74a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    void setTextFileFixedColumnWidths(Object param0);
            
    /**
     * <p>id(0x748)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    String getTextFileOtherDelimiter();
            
    /**
     * <p>id(0x748)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    void setTextFileOtherDelimiter(String param0);
            
    /**
     * <p>id(0x741)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    XlTextParsingType getTextFileParseType();
            
    /**
     * <p>id(0x741)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code XlTextParsingType}
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    void setTextFileParseType(XlTextParsingType param0);
            
    /**
     * <p>id(0x73f)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    XlPlatform getTextFilePlatform();
            
    /**
     * <p>id(0x73f)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code XlPlatform}
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    void setTextFilePlatform(XlPlatform param0);
            
    /**
     * <p>id(0x74d)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    Boolean getTextFilePromptOnRefresh();
            
    /**
     * <p>id(0x74d)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    void setTextFilePromptOnRefresh(Boolean param0);
            
    /**
     * <p>id(0x745)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    Boolean getTextFileSemicolonDelimiter();
            
    /**
     * <p>id(0x745)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    void setTextFileSemicolonDelimiter(Boolean param0);
            
    /**
     * <p>id(0x747)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    Boolean getTextFileSpaceDelimiter();
            
    /**
     * <p>id(0x747)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    void setTextFileSpaceDelimiter(Boolean param0);
            
    /**
     * <p>id(0x740)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    Integer getTextFileStartRow();
            
    /**
     * <p>id(0x740)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    void setTextFileStartRow(Integer param0);
            
    /**
     * <p>id(0x744)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    Boolean getTextFileTabDelimiter();
            
    /**
     * <p>id(0x744)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    void setTextFileTabDelimiter(Boolean param0);
            
    /**
     * <p>id(0x742)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    XlTextQualifier getTextFileTextQualifier();
            
    /**
     * <p>id(0x742)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code XlTextQualifier}
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    void setTextFileTextQualifier(XlTextQualifier param0);
            
    /**
     * <p>id(0x74f)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    String getTextFileThousandsSeparator();
            
    /**
     * <p>id(0x74f)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    void setTextFileThousandsSeparator(String param0);
            
    /**
     * <p>id(0x874)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    Boolean getTextFileTrailingMinusNumbers();
            
    /**
     * <p>id(0x874)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    void setTextFileTrailingMinusNumbers(Boolean param0);
            
    /**
     * <p>id(0x8c5)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    XlTextVisualLayoutType getTextFileVisualLayout();
            
    /**
     * <p>id(0x8c5)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code XlTextVisualLayoutType}
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    void setTextFileVisualLayout(XlTextVisualLayoutType param0);
            
    
}