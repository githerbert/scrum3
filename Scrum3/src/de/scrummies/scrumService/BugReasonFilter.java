
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugReasonFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugReasonFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugFilter">
 *       &lt;sequence>
 *         &lt;element name="BugReasons" type="{http://www.fuldaai.de}ArrayOfBugReason" minOccurs="0"/>
 *         &lt;element name="BugReasonsExclude" type="{http://www.fuldaai.de}ArrayOfBugReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugReasonFilter", namespace = "http://www.fuldaai.de", propOrder = {
    "bugReasons",
    "bugReasonsExclude"
})
public class BugReasonFilter
    extends BugFilter
{

    @XmlElementRef(name = "BugReasons", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBugReason> bugReasons;
    @XmlElementRef(name = "BugReasonsExclude", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBugReason> bugReasonsExclude;

    /**
     * Gets the value of the bugReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBugReason> getBugReasons() {
        return bugReasons;
    }

    /**
     * Sets the value of the bugReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}
     *     
     */
    public void setBugReasons(JAXBElement<ArrayOfBugReason> value) {
        this.bugReasons = value;
    }

    /**
     * Gets the value of the bugReasonsExclude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBugReason> getBugReasonsExclude() {
        return bugReasonsExclude;
    }

    /**
     * Sets the value of the bugReasonsExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugReason }{@code >}
     *     
     */
    public void setBugReasonsExclude(JAXBElement<ArrayOfBugReason> value) {
        this.bugReasonsExclude = value;
    }

}
