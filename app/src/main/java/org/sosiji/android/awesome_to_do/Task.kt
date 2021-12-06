package org.sosiji.android.awesome_to_do

import java.util.*

data class Task(val id: UUID = UUID.randomUUID(),
                var title: String = "",
                var date: Date = Date(),
                var isDone: Boolean = false)