package net.kakudake.yahoo.domain.annotation

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention
annotation class Param(
    val value: String
)
