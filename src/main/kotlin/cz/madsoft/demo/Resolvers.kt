package cz.madsoft.demo

import org.springframework.stereotype.Component
import com.coxautodev.graphql.tools.GraphQLQueryResolver

@Component
class Resolvers() : GraphQLQueryResolver {
	fun hello(): String {
		return "Hello world!!"
	}

	fun people(): List<Person> {
		val person1 = Person(1, "Michal")
		val person2 = Person(2, "Pepa")
		val person3 = Person(3, "Kryštof")
		return listOf(person1, person2, person3)
	}
}