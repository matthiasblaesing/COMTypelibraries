
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D3-0000-0000-C000-000000000046}")
public interface TextConnection {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0xc2e)</p>
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    Boolean getTextFileHeaderRow();
            
    /**
     * <p>id(0xc2e)</p>
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    void setTextFileHeaderRow(Boolean param0);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    Object getTextFileColumnDataTypes();
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    void setTextFileColumnDataTypes(Object param0);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    Boolean getTextFileCommaDelimiter();
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    void setTextFileCommaDelimiter(Boolean param0);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    Boolean getTextFileConsecutiveDelimiter();
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    void setTextFileConsecutiveDelimiter(Boolean param0);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    String getTextFileDecimalSeparator();
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    void setTextFileDecimalSeparator(String param0);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    Object getTextFileFixedColumnWidths();
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    void setTextFileFixedColumnWidths(Object param0);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    String getTextFileOtherDelimiter();
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    void setTextFileOtherDelimiter(String param0);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    XlTextParsingType getTextFileParseType();
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    void setTextFileParseType(XlTextParsingType param0);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    XlPlatform getTextFilePlatform();
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    void setTextFilePlatform(XlPlatform param0);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    Boolean getTextFilePromptOnRefresh();
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    void setTextFilePromptOnRefresh(Boolean param0);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    Boolean getTextFileSemicolonDelimiter();
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    void setTextFileSemicolonDelimiter(Boolean param0);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    Boolean getTextFileSpaceDelimiter();
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    void setTextFileSpaceDelimiter(Boolean param0);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    Integer getTextFileStartRow();
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    void setTextFileStartRow(Integer param0);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    Boolean getTextFileTabDelimiter();
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    void setTextFileTabDelimiter(Boolean param0);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    XlTextQualifier getTextFileTextQualifier();
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    void setTextFileTextQualifier(XlTextQualifier param0);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    String getTextFileThousandsSeparator();
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    void setTextFileThousandsSeparator(String param0);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    Boolean getTextFileTrailingMinusNumbers();
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    void setTextFileTrailingMinusNumbers(Boolean param0);
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    XlTextVisualLayoutType getTextFileVisualLayout();
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    void setTextFileVisualLayout(XlTextVisualLayoutType param0);
            
    
}