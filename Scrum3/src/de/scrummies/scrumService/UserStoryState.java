
package de.scrummies.scrumService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStoryState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStoryState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserStoryState", namespace = "http://www.fuldaai.de")
@XmlEnum
public enum UserStoryState {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    UserStoryState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserStoryState fromValue(String v) {
        for (UserStoryState c: UserStoryState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
