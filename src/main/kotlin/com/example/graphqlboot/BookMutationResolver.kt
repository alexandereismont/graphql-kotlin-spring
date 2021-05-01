package com.example.graphqlboot

import com.example.graphqlboot.dto.Book
import com.example.graphqlboot.dto.InputBook
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component

@Component
class BookMutationResolver : GraphQLMutationResolver {

	fun addBook(book: InputBook) = Book(Math.random().toInt(), book.name)

}