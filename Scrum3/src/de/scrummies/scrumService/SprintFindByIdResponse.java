
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SprintFindByIdResult" type="{http://www.fuldaai.de}Sprint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sprintFindByIdResult"
})
@XmlRootElement(name = "SprintFindByIdResponse")
public class SprintFindByIdResponse {

    @XmlElementRef(name = "SprintFindByIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Sprint> sprintFindByIdResult;

    /**
     * Gets the value of the sprintFindByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Sprint }{@code >}
     *     
     */
    public JAXBElement<Sprint> getSprintFindByIdResult() {
        return sprintFindByIdResult;
    }

    /**
     * Sets the value of the sprintFindByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Sprint }{@code >}
     *     
     */
    public void setSprintFindByIdResult(JAXBElement<Sprint> value) {
        this.sprintFindByIdResult = value;
    }

}
