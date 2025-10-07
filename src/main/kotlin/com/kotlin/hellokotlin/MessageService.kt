package com.kotlin.hellokotlin

import org.springframework.data.repository.findByIdOrNull
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MessageService(private val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()


    fun save(message: Message) : Message = db.save(message)


    fun findMessageById(id: String): Message? = db.findByIdOrNull(id)

}