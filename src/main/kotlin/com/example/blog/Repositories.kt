package com.example.blog

import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
    fun findByAddedAt(addedAt: LocalDateTime): Article?
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}