package grails3.hibernatemixin
import grails.test.mixin.TestMixin
import grails.test.mixin.gorm.Domain
import grails.test.mixin.hibernate.HibernateTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@Domain(Person)
@TestMixin(HibernateTestMixin)
class PersonSpec extends Specification {

  void "Test count people"() {
    expect: "Test execute Hibernate count query"
    Person.count() == 0
    sessionFactory != null
    transactionManager != null
    hibernateSession != null
  }
}
