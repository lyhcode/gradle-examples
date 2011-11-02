import spock.lang.Specification
import com.example.Hello

class HelloSpec extends Specification {

	def "say hello to everyone"() {
		expect:
		new Hello().sayHello(name) == words

		where:
		name	| words
		'John'	| 'Hello, John'
		'Joe'	| 'Hello, Joe'
		'Mary'	| 'Hello, Mary'
	}
}
