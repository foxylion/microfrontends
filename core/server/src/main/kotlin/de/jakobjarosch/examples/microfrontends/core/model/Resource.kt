package de.jakobjarosch.examples.microfrontends.core.model

import java.util.*

data class Resource(val id: UUID, val firstname: String, val lastname: String, val skills: Set<String>)