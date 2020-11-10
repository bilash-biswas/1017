object Main {
  def main(args:Array[String]){
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()

    var c = (b / 12.0) * a
    println("%.3f".format(c))

  }
}
