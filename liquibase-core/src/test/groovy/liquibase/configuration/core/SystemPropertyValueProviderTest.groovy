package liquibase.configuration.core

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

class SystemPropertyValueProviderTest extends Specification {

    @Unroll
    @Ignore
    def "getProvidedValue"() {
        expect:
        new SystemPropertyValueProvider().getProvidedValue("USER.NAME").getValue() == System.getProperty("user.name")
    }
}
