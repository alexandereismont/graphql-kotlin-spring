package com.example.graphqlboot

import com.example.graphqlboot.dto.Book
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookQueryResolver : GraphQLQueryResolver {

	fun getBookById() = Book(1, "Name")
}