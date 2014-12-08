
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugExtention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugExtention">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}AbstractExtentions">
 *       &lt;sequence>
 *         &lt;element name="Bug" type="{http://www.fuldaai.de}Bug" minOccurs="0"/>
 *         &lt;element name="BugId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugExtention", namespace = "http://www.fuldaai.de", propOrder = {
    "bug",
    "bugId"
})
public class BugExtention
    extends AbstractExtentions
{

    @XmlElementRef(name = "Bug", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<Bug> bug;
    @XmlElement(name = "BugId")
    protected String bugId;

    /**
     * Gets the value of the bug property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bug }{@code >}
     *     
     */
    public JAXBElement<Bug> getBug() {
        return bug;
    }

    /**
     * Sets the value of the bug property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bug }{@code >}
     *     
     */
    public void setBug(JAXBElement<Bug> value) {
        this.bug = value;
    }

    /**
     * Gets the value of the bugId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugId() {
        return bugId;
    }

    /**
     * Sets the value of the bugId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugId(String value) {
        this.bugId = value;
    }

}
