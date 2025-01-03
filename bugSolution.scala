```scala
import scala.util.Try

case class User(id: Int, name: String)

object Main extends App {
  val users = List(User(1, "Alice"), User(2, "Bob"))
  val userId = "3"
  
  //Correct way using match
  val user = users.find(_.id == userId.toInt) match {
    case Some(user) => user
    case None => User(0, "default") // or handle it as appropriate
  }
  println(user) // Output: User(0,default)
  
  //Correct way using orElse
  val user2 = users.find(_.id == userId.toInt).getOrElse(User(0, "default"))
  println(user2) // Output: User(0,default)
}
```