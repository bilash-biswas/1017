import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextInt()
    var b = read.nextInt()
    println("%.3f".format((b / 12.0) * a))
}
