
package com.commercetools.api.models.cart_discount;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines which matching items are to be discounted.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SelectionMode extends JsonEnum {

    /**
    	<p>Select the cheapest items.</p>

    */
    SelectionMode CHEAPEST = SelectionModeEnum.CHEAPEST;
    /**
    	<p>Select the most expensive items.</p>

    */
    SelectionMode MOST_EXPENSIVE = SelectionModeEnum.MOST_EXPENSIVE;

    /**
     * possible values of SelectionMode
     */
    enum SelectionModeEnum implements SelectionMode {
        /**
         * Cheapest
         */
        CHEAPEST("Cheapest"),

        /**
         * MostExpensive
         */
        MOST_EXPENSIVE("MostExpensive");
        private final String jsonName;

        private SelectionModeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of SelectionMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static SelectionMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SelectionMode() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<SelectionMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SelectionMode[] values() {
        return SelectionModeEnum.values();
    }

}
