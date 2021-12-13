fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)
    // переменной базового класса
    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(4, 4, 4)
    val f3: Figure = Square(1, 4, 4)
    println("Площадь прямоугольника: ${f.area()}")
    println("Площадь круга: ${f2.area()}")
    println("Площадь квадрата: ${f3.area()}")
    val transforming: Transforming = Rect(0,0,1,1)
    println("Перед разворотом: ${transforming}")
    transforming.rotate(direction = RotateDirection.CounterClockwise, centerX = 3, centerY = 4)
    println("После: ${transforming}")
    transforming.resize(5)
    println("После увеличения в 5 раз: ${transforming}")
    println()
}