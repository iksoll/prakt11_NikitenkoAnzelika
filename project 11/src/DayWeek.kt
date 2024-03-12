enum class DayWeek { Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье;
    fun isWeekend(): Boolean {
        return this == Суббота || this == Воскресенье
    }
    fun isWeekday(): Boolean {
        return !isWeekend()
    }
    fun getDayAfterTomorrow(): DayWeek {
        val ordinalAfterTomorrow = (this.ordinal + 2) % 7
        return values()[ordinalAfterTomorrow]
    }
    fun isSameAs(otherDay: DayWeek): Boolean {
        return this == otherDay
    }
}