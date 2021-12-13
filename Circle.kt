
// TODO: дополнить определение класса размерами и позицией
class Circle (var x:Int,var y:Int,val R:Int,val Pi = 3.14): Figure(0), Movable, Transforming {
    // TODO: реализовать интерфейс Transforming
    override fun area(): Float
    {
        return  Pi*R^2.toFloat();
    }

    override fun move(dx: Int,dy: Int)
    {
        x+=dx
        y+=dy
    }

    override fun resize(zoom: Int)
    {
        TODO("Not yet implemented")
        R*zoom
    }

    override fun rotate(centerX: Int, centerY: Int, direction: RotateDirection, ) {
        when (direction) {
            RotateDirection.Clockwise ->
            {
                x = centerX - (y - centerY)
                y = centerY + (x - centerX)
            }
            RotateDirection.CounterClockwise ->
            {
                x = centerX - (y - centerY)
                y = centerY + (x - centerX)
            }
        }
    }
}