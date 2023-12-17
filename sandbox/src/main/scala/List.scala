// +A: 型パラメータAが共変
// A が B を継承しているときのみ val : ?[B] = ?[A] の代入が許される
sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head,apply(as.tail: _*))
}