
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugSeverityFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugSeverityFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugFilter">
 *       &lt;sequence>
 *         &lt;element name="BugSeverity" type="{http://www.fuldaai.de}ArrayOfSeverity" minOccurs="0"/>
 *         &lt;element name="BugSeverityExclude" type="{http://www.fuldaai.de}ArrayOfSeverity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugSeverityFilter", namespace = "http://www.fuldaai.de", propOrder = {
    "bugSeverity",
    "bugSeverityExclude"
})
public class BugSeverityFilter
    extends BugFilter
{

    @XmlElementRef(name = "BugSeverity", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeverity> bugSeverity;
    @XmlElementRef(name = "BugSeverityExclude", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeverity> bugSeverityExclude;

    /**
     * Gets the value of the bugSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeverity> getBugSeverity() {
        return bugSeverity;
    }

    /**
     * Sets the value of the bugSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}
     *     
     */
    public void setBugSeverity(JAXBElement<ArrayOfSeverity> value) {
        this.bugSeverity = value;
    }

    /**
     * Gets the value of the bugSeverityExclude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeverity> getBugSeverityExclude() {
        return bugSeverityExclude;
    }

    /**
     * Sets the value of the bugSeverityExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeverity }{@code >}
     *     
     */
    public void setBugSeverityExclude(JAXBElement<ArrayOfSeverity> value) {
        this.bugSeverityExclude = value;
    }

}
