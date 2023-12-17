object Main extends App {
  println("Hello, World!")

  val id = Id("Hello, ").flatMap(a => Id("monad!").flatMap(b => Id(a + b)))
  println(id)

  val list = List(1,2,3)
  println(list)
  val nil = Nil
  println(nil)
}