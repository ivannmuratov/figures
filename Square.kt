// TODO: дополнить определение класса размерами и позицией
class Square(var x:Int, var y:Int, val width:Int):Figure(0), Movable, Transforming{
    // TODO: унаследовать от Figure, реализовать area()
    // TODO: реализовать интерфейс Transforming
    override fun area(): Float
    {
        return width*width.toFloat()
    }
    override fun move(dx: Int,dy: Int)
    {
        x+=dx
        y+=dy
    }
    override fun resize(zoom: Int)
    {
        width*zoom
    }

    override fun rotate(centerX: Int, centerY: Int, direction: RotateDirection, ) {
        when (direction) {
            RotateDirection.Clockwise ->
            {
                x = centerX -(y - centerY)
                y = centerY +(x - centerX)
            }
            RotateDirection.CounterClockwise ->
            {
                x = centerX -(y - centerY)
                y = centerY +(x - centerX)
            }
        }
    }
}