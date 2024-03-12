fun main(){
    val day = DayWeek.Среда
    val day2 =DayWeek.Понедельник
    println("$day2 выходной день: ${day.isWeekend()}")
    println("$day будний день: ${day.isWeekday()}")
    println("Послезавтра будет ${day.getDayAfterTomorrow()}")
    val otherDay = DayWeek.Суббота
    println("$day2 такой же как $otherDay: ${day.isSameAs(otherDay)}")

    val color = DayColor.Синий
    val color2 = DayColor.Зелёный
    val color3 = DayColor.Голубой
    println("$color3 теплый оттенок: ${color.isWarmColor()}")
    println("$color холодный оттенок: ${color.isCoolColor()}")
    println("Универсальный оттенок ${color.getComplementaryColor()}")
    println("Код $color ${color.getColorHexCode()}")
}