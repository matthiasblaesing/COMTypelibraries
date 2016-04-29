
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D3-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D3-0001-0000-C000-000000000046}")
public interface ITextConnection {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0xc2e)</p>
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileHeaderRow(VARIANT RHS);
            
    /**
     * <p>id(0xc2e)</p>
     */
    @ComProperty(name = "TextFileHeaderRow", dispId = 0xc2e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileHeaderRow(Boolean RHS);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileColumnDataTypes(VARIANT RHS);
            
    /**
     * <p>id(0x749)</p>
     */
    @ComProperty(name = "TextFileColumnDataTypes", dispId = 0x749)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileColumnDataTypes(Object RHS);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileCommaDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x746)</p>
     */
    @ComProperty(name = "TextFileCommaDelimiter", dispId = 0x746)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileCommaDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileConsecutiveDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x743)</p>
     */
    @ComProperty(name = "TextFileConsecutiveDelimiter", dispId = 0x743)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileConsecutiveDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileDecimalSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74e)</p>
     */
    @ComProperty(name = "TextFileDecimalSeparator", dispId = 0x74e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileDecimalSeparator(String RHS);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileFixedColumnWidths(VARIANT RHS);
            
    /**
     * <p>id(0x74a)</p>
     */
    @ComProperty(name = "TextFileFixedColumnWidths", dispId = 0x74a)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileFixedColumnWidths(Object RHS);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileOtherDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x748)</p>
     */
    @ComProperty(name = "TextFileOtherDelimiter", dispId = 0x748)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileOtherDelimiter(String RHS);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileParseType(VARIANT RHS);
            
    /**
     * <p>id(0x741)</p>
     */
    @ComProperty(name = "TextFileParseType", dispId = 0x741)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileParseType(XlTextParsingType RHS);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePlatform(VARIANT RHS);
            
    /**
     * <p>id(0x73f)</p>
     */
    @ComProperty(name = "TextFilePlatform", dispId = 0x73f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePlatform(XlPlatform RHS);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFilePromptOnRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x74d)</p>
     */
    @ComProperty(name = "TextFilePromptOnRefresh", dispId = 0x74d)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFilePromptOnRefresh(Boolean RHS);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSemicolonDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x745)</p>
     */
    @ComProperty(name = "TextFileSemicolonDelimiter", dispId = 0x745)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSemicolonDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileSpaceDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x747)</p>
     */
    @ComProperty(name = "TextFileSpaceDelimiter", dispId = 0x747)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileSpaceDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileStartRow(VARIANT RHS);
            
    /**
     * <p>id(0x740)</p>
     */
    @ComProperty(name = "TextFileStartRow", dispId = 0x740)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileStartRow(Integer RHS);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTabDelimiter(VARIANT RHS);
            
    /**
     * <p>id(0x744)</p>
     */
    @ComProperty(name = "TextFileTabDelimiter", dispId = 0x744)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTabDelimiter(Boolean RHS);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTextQualifier(VARIANT RHS);
            
    /**
     * <p>id(0x742)</p>
     */
    @ComProperty(name = "TextFileTextQualifier", dispId = 0x742)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTextQualifier(XlTextQualifier RHS);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileThousandsSeparator(VARIANT RHS);
            
    /**
     * <p>id(0x74f)</p>
     */
    @ComProperty(name = "TextFileThousandsSeparator", dispId = 0x74f)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileThousandsSeparator(String RHS);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileTrailingMinusNumbers(VARIANT RHS);
            
    /**
     * <p>id(0x874)</p>
     */
    @ComProperty(name = "TextFileTrailingMinusNumbers", dispId = 0x874)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileTrailingMinusNumbers(Boolean RHS);
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextFileVisualLayout(VARIANT RHS);
            
    /**
     * <p>id(0x8c5)</p>
     */
    @ComProperty(name = "TextFileVisualLayout", dispId = 0x8c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextFileVisualLayout(XlTextVisualLayoutType RHS);
            
    
}