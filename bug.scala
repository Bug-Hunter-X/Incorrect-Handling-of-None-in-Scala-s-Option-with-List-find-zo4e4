```scala
import scala.util.Try

case class User(id: Int, name: String)

object Main extends App {
  val users = List(User(1, "Alice"), User(2, "Bob"))
  val userId = "3"
  
  val user = Try(users.find(_.id == userId.toInt)).getOrElse(None)
  println(user) // Output: None
  
  val user2 = users.find(user => user.id == userId.toInt)
  println(user2) //Output: None

  //Correct way
  val user3 = users.find(user => user.id == userId.toInt).orElse(Some(User(0, "default")))
  println(user3) // Output: Some(User(0,default))
}
```