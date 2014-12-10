
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
 *         &lt;element name="UserStoryFindAllResult" type="{http://www.fuldaai.de}ArrayOfUserStory" minOccurs="0"/>
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
    "userStoryFindAllResult"
})
@XmlRootElement(name = "UserStoryFindAllResponse")
public class UserStoryFindAllResponse {

    @XmlElementRef(name = "UserStoryFindAllResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserStory> userStoryFindAllResult;

    /**
     * Gets the value of the userStoryFindAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserStory> getUserStoryFindAllResult() {
        return userStoryFindAllResult;
    }

    /**
     * Sets the value of the userStoryFindAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}
     *     
     */
    public void setUserStoryFindAllResult(JAXBElement<ArrayOfUserStory> value) {
        this.userStoryFindAllResult = value;
    }

}
