package com.example.graphqlboot

import graphql.kickstart.tools.SchemaParser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GraphqlConfiguration {

	@Bean
	fun schemaParser() : SchemaParser = SchemaParser.newParser()
			.file("schema.graphql")
			.resolvers(BookQueryResolver())
			.build()

}