
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({09760240-0B89-49F7-A79D-479F24723F56})</p>
 */
@ComInterface(iid="{09760240-0B89-49F7-A79D-479F24723F56}")
public interface XMLNode {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "BaseName", dispId = 0x0)
    String getBaseName();
            
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
    @ComProperty(name = "Range", dispId = 0x1)
    Range getRange();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Text", dispId = 0x2)
    String getText();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Text", dispId = 0x2)
    void setText(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x4)
    String getNamespaceURI();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "XML", dispId = 0x5)
    String getXML(Boolean DataOnly);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "NextSibling", dispId = 0x6)
    XMLNode getNextSibling();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "PreviousSibling", dispId = 0x7)
    XMLNode getPreviousSibling();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ParentNode", dispId = 0x8)
    XMLNode getParentNode();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "FirstChild", dispId = 0x9)
    XMLNode getFirstChild();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "LastChild", dispId = 0xa)
    XMLNode getLastChild();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "OwnerDocument", dispId = 0xb)
    Document getOwnerDocument();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "NodeType", dispId = 0xc)
    WdXMLNodeType getNodeType();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ChildNodes", dispId = 0xd)
    XMLNodes getChildNodes();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0xf)
    XMLNodes getAttributes();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "NodeValue", dispId = 0x10)
    String getNodeValue();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "NodeValue", dispId = 0x10)
    void setNodeValue(String param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "HasChildNodes", dispId = 0x11)
    Boolean getHasChildNodes();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "SelectSingleNode", dispId = 0x12)
    XMLNode SelectSingleNode(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "SelectNodes", dispId = 0x13)
    XMLNodes SelectNodes(String XPath,
            String PrefixMapping,
            Boolean FastSearchSkippingTextNodes);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "ChildNodeSuggestions", dispId = 0x14)
    XMLChildNodeSuggestions getChildNodeSuggestions();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "Level", dispId = 0x15)
    WdXMLNodeLevel getLevel();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "ValidationStatus", dispId = 0x16)
    WdXMLValidationStatus getValidationStatus();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "SmartTag", dispId = 0x17)
    SmartTag getSmartTag();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "ValidationErrorText", dispId = 0x18)
    String getValidationErrorText(Boolean Advanced);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "PlaceholderText", dispId = 0x19)
    String getPlaceholderText();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "PlaceholderText", dispId = 0x19)
    void setPlaceholderText(String param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x65)
    void Copy();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "RemoveChild", dispId = 0x66)
    void RemoveChild(XMLNode ChildElement);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x67)
    void Cut();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Validate", dispId = 0x68)
    void Validate();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "SetValidationError", dispId = 0x69)
    void SetValidationError(WdXMLValidationStatus Status,
            Object ErrorText,
            Boolean ClearedAutomatically);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "WordOpenXML", dispId = 0x6a)
    String getWordOpenXML();
            
    
}