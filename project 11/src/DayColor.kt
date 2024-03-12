enum class DayColor { Красный, Оранжевый, Желтый, Зелёный, Синий, Голубой, Фиолетовый;
    fun isWarmColor(): Boolean {
        return this == Красный || this == Оранжевый || this == Желтый
    }
    fun isCoolColor(): Boolean {
        return this == Зелёный || this == Синий || this == Голубой || this == Фиолетовый
    }
    fun getComplementaryColor(): DayColor {
        return when(this) {
            Красный -> Зелёный
            Оранжевый -> Синий
            Желтый -> Голубой
            Зелёный -> Красный
            Синий -> Оранжевый
            Голубой -> Желтый
            Фиолетовый -> Фиолетовый
        }
    }
    fun getColorHexCode(): String {
        return when(this) {
            Красный -> "#FF0000"
            Оранжевый -> "#FFA500"
            Желтый -> "#FFFF00"
            Зелёный -> "#008000"
            Синий -> "#0000FF"
            Голубой -> "#4B0082"
            Фиолетовый -> "#EE82EE"
        }
    }
}