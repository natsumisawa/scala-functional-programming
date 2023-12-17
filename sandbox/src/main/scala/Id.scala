// A: 型パラメータ https://scala-text.github.io/scala_text/type-parameter.html
// さまざまな型Aでインスタンス化することが可能な多相関数
case class Id[A](value: A) {
  def map[B](f: A => B): Id[B] =
    Id(f(value))

  def flatMap[B](f: A => Id[B]): Id[B] =
    f(value)
}